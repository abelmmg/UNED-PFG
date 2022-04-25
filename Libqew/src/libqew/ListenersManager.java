/*
 * 2022 - Abel Matas
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package libqew;

import java.awt.Component;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 * Gestor de listeners, se encarga de pasar mensajes entre objetos.
 * @author Abel Matas
 */
public final class ListenersManager {
    private static ListenersManager instance;
    HashMap<Component, ArrayList<Component>> listernersList = new HashMap<>();

    /**
     * Provoca que listenerComponent (observa) escuche a listenedComponent (observado)
     * @param listenerComponent Componente observador
     * @param listenedComponent Compomente observado.
     */
    public void addListerner(Component listenerComponent, Component listenedComponent) {
        
        if (listenedComponent instanceof JTextField) {
            
            ((JTextField)listenedComponent).getDocument().addDocumentListener(new DocumentListener() {
                public void changedUpdate(DocumentEvent e) {
                   ListenersManager.getInstance().notifyListerners(listenedComponent);
                }
                public void removeUpdate(DocumentEvent e) {
                   ListenersManager.getInstance().notifyListerners(listenedComponent);
                }
                public void insertUpdate(DocumentEvent e) {
                   ListenersManager.getInstance().notifyListerners(listenedComponent);
                }   
            });
        }      
        
        if (listenedComponent instanceof JSlider) {
            ((JSlider)listenedComponent).addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    ListenersManager.getInstance().notifyListerners(listenedComponent);
                }
            });
        }
        
        if (listenedComponent instanceof JSpinner) {
            ((JSpinner)listenedComponent).addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    ListenersManager.getInstance().notifyListerners(listenedComponent);
                }
            });
        }        
        
        // Se agregan los componententes en la lista.
        ArrayList<Component> listenedList = new ArrayList<>();
        if (listernersList.get(listenerComponent) != null)
            listenedList = listernersList.get(listenerComponent);
        listenedList.add(listenedComponent);
        listernersList.put(listenerComponent, listenedList);
        
    }
    
    /**
     * Metodos para eliminar un osbservador de todos los objetos observados.
     */
    public void removeListener(Component component) {
        listernersList.remove(component);
    }
    
    /**
     * El componente observado notifica a sus observadore (listeners)
     * el cambio realizado.
     * @param listenedComponent Componente observado
     */
    public void notifyListerners(Component listenedComponent){
        for (HashMap.Entry<Component, ArrayList<Component>> entry : listernersList.entrySet()) {
            Component componenteObservador = entry.getKey();
            ArrayList<Component> listaObservados = entry.getValue();
            
            for (Iterator<Component> iterator = listaObservados.iterator(); iterator.hasNext();) {
                Component cmpObservado;
                cmpObservado = iterator.next();
                
                if (listenedComponent == cmpObservado) {
                    if(componenteObservador instanceof JTextField) {
                         JTextField obvador = (JTextField) componenteObservador;
                         
                        if (cmpObservado instanceof JTextField) {
                            JTextField t = (JTextField) cmpObservado;
                            obvador.setText(t.getText());
                        } else if (cmpObservado instanceof JLabel) {
                            JTextField l = (JTextField) cmpObservado;
                            obvador.setText(l.getText());
                        }                            
                    }
                    if(componenteObservador instanceof JLabel) {
                        JLabel obvador = (JLabel) componenteObservador;
                        
                        if (cmpObservado instanceof JTextField) {
                            JTextField t = (JTextField) cmpObservado;
                            obvador.setText(t.getText());
                        } else if (cmpObservado instanceof JLabel) {
                            JLabel l = (JLabel) cmpObservado;
                            obvador.setText(l.getText());
                        }
                    }
                   
                    if(componenteObservador instanceof JSlider) {
                        JSlider obvador = (JSlider) componenteObservador;
                        
                        if (cmpObservado instanceof JSpinner) {
                            JSpinner obvado = (JSpinner) cmpObservado;
                            obvador.setValue((Integer)obvado.getValue());
                        } else if (cmpObservado instanceof JSlider) {
                            JSlider s = (JSlider) cmpObservado;
                            obvador.setValue((Integer)s.getValue());
                        }
                    }
                    
                    if(componenteObservador instanceof JSpinner) {
                        JSpinner l = (JSpinner) componenteObservador;

                        if (cmpObservado instanceof JSpinner) {
                            JSpinner s = (JSpinner) cmpObservado;
                            l.setValue((Integer)s.getValue());
                        } else if (cmpObservado instanceof JSlider) {
                            JSlider s = (JSlider) cmpObservado;
                            l.setValue((Integer)s.getValue());
                        }
                    }                    
            }
                
            }
        }
    }   
    
     /**
      * Retorna la instancia estática de ListenerManagers
      * @return 
      */
    public static synchronized ListenersManager getInstance() {
        if (instance == null) {
            instance = new ListenersManager();
        }
        return instance;
    }
}

