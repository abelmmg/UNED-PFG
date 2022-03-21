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

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author Abel
 */
public class DialogoTab  extends DialogoExtensible {

    private final JTabbedPane tabs;
    
    public DialogoTab() {
        super();

        tabs = new JTabbedPane();
        this.agregarComponente(tabs);
        CardLayout layout = new CardLayout();
        super.setLayout(layout);
        
    }
    
    public void addTab(String tabName){
        //int t = tabs.getComponents().length + 1;
        JPanel j = new JPanel();
        j.setName(tabName);
        tabs.addTab(tabName, j); 
        
    }
    
    public void agregarComponenteTab(Component componente, String tab) {    
        for (Component compo : tabs.getComponents()) {     
            String componentName = compo.getName();
            System.out.println(componentName);
            if (componentName.equals(tab)) {
                ((JPanel)compo).add(componente);
            }
        }
    }
    
}
