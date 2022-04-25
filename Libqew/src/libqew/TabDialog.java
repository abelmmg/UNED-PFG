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

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.Window;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * Diálogo de tipo Tab
 * @author Abel Matas
 */
public class TabDialog extends Dialog {

    private JTabbedPane tabs;
    private final PropertyChangeListener nameListener;
    
    /**
     * Constructor TabDialog que crea un JTabbedPane vacio.
     */
    public TabDialog() {
        super();
        
        //TODO quitar definitivo por que molesta para el NetBeans
        //if (this.getName()==null) this.setName("TabDialog" + DialogType.nextValue(DialogType.TAB));
        
        tabs = new JTabbedPane();
        tabs.setName("TABS");
        //this.addComponent(tabs);
        
        CardLayout layout = new CardLayout();
        super.setLayout(layout);
        
        
         // TODO Review: Avisa a la ventana para que se compacte al cambiar de pestaña
        tabs.getModel().addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                invalidate();
                //pack();
                System.out.println("packing ..... .stateChanged()");
                Window window = SwingUtilities.getWindowAncestor(TabDialog.this);
                if (window != null) {
                    window.pack();
                }
            }
        });

//        // Conecta el título de cada pestaña con el nombre de su contenido
//        nameListener = new PropertyChangeListener() { 
//            @Override
//            public void propertyChange(PropertyChangeEvent evt) {
//                int idx = tabs.indexOfComponent(((Component) evt.getSource()).getParent());
//                if (idx > -1) {
//                    tabs.setTitleAt(idx, evt.getNewValue().toString());
//                }
//            }
//        };
        nameListener= null;
    }
    
    public TabDialog(Component component) {
        this();
        addComponent(component);
        pack();
        //TODO Quitar setName(component.getName());
        
        // Conecta el nombre con el del componente
//        component.addPropertyChangeListener("name", new PropertyChangeListener() { 
//                                      @Override
//                                      public void propertyChange(PropertyChangeEvent evt) {
//                                          setName(evt.getNewValue().toString());
//                                      }
//                                  });
    }
    
    /**
     * Agrega una pestaña en el Tab
     * @param tabName Nombre de la pestaña.
     */
    public void addTab(String tabName){
        JPanel j = new JPanel();
        j.setName(tabName);
        tabs.addTab(tabName, j); 
    }
    
    
    /**
     * Agrega un componente en TabDialog desde la paleta de NetBeans.
     * @param component Componente
     * @param constraints Restriciones
     * @param index Índice
     */
    @Override
    protected void addImpl(Component component, Object constraints, int index) {
        if (tabs.getComponentCount() == 0) { 
            super.addImpl(tabs, null, -1);
        } 
        
        JPanel j = new JPanel();
        System.out.println(component.getName());
        j.setName(component.getName());
        j.setLayout(new BorderLayout());
        j.add(component);
        
        //tabs.addTab(component.getName(), j); 
        tabs.insertTab(component.getName(), null, j, null,
                       index == -1 ? tabs.getTabCount() : index);
        
        //component.addPropertyChangeListener("name", nameListener);

    }
    
    /**
     * Agrega un Componente en el TabDialog desde el código.
     * @param component Componente
     * @param tabName Nombre del component.
     */
    public void addTabComponent(Component component, String tabName) {    
        for (Component compo : tabs.getComponents()) {     
            String componentName = compo.getName();
            System.out.println(componentName);
            if (componentName.equals(tabName)) {
                ((JPanel)compo).add(component);
            }
        }
    }

    /**
     * Se sobre-escribre setLayout para que no se pueda modificar.
     * @param mgr LayoutManager
     */
    @Override
    public final void setLayout(LayoutManager mgr) {
    }
    
    /**
     * Elimina un componente
     * @param component Componente a eliminar
     */
    @Override
    public void remove(Component component) {
        tabs.remove(component.getParent());
        //component.removePropertyChangeListener("name", nameListener);
        removeSuper();
    }
    
    /**
     * Elimina el componente padre si no hay mas tabs.
     */
    private void removeSuper() {
        if (tabs.getComponentCount() == 0) {
            super.remove(0);
        }
    }
}
