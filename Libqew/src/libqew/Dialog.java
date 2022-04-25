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
import java.awt.Window;
import java.util.Collection;
import javax.swing.SwingUtilities;

/**
 * Clase abstracta que define un Diálogo, de esta extenderan sus diálogos derivados. 
 * Define los comportamientos generales de cualquier dialogo.
 * @author Abel Matas
 */
public abstract class Dialog extends javax.swing.JPanel implements InterfaceDialog, ValidatorListener {

    /**
     * Constructor de Dialog.
     */
    public Dialog() {
        super();
    }

    /**
     * Método del interface InterfaceDialog
     * Agrega un componte al diálogo.
     * @param component Componente a agregar.
     */
    @Override
    public void addComponent(Component component) {
        this.add(component);
    }
    
    @Override
    public void addComponentList(Collection<Component> collectionList) {
        for (Component component : collectionList) {
            addComponent(component);
        }
    }   

    /**
     * Método del interface ValidatorListener
     * Valida los datos de los diálogos.
     * @return 
     */
    @Override
    public boolean validateThis() {
        return true;
    }
    
    /**
     * Método del interface ValidatorListener
     * Guarda los datos de los diálogos.
     */
    @Override
    public void saveThis() {
    }
    
    /**
     * Método del interface ValidatorListener
     * Limpia los datos de los diálogos.
     */
    @Override
    public void cleanThis() {
    }
    
    /**
     * Método para indicar que un componente observan a otro componente.
     * @param listenerComponent Componente que observa
     * @param listenedComponent Componente observado.
     */
    public void addListernerComponents(Component listenerComponent, Component listenedComponent) {
        ListenersManager.getInstance().addListerner(listenerComponent, listenedComponent);
    }
    
    /**
     * Ejecuta pack() para la ventana.
     */
    public void pack() {
        Window window = (Window) SwingUtilities.getWindowAncestor(this);
        if (window != null) {
            window.pack();
        }
    }  
}
