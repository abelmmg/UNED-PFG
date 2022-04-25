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
import java.awt.LayoutManager;
import javax.swing.BoxLayout;

/**
 * Clase para crear Diálogos Simples.
 * @author Abel Matas
 */
public class SimpleDialog extends Dialog  {

    public SimpleDialog() {
        super();
        
        //if (this.getName()==null) this.setName("SimpleDialog" + DialogType.nextValue(DialogType.SIMPLE));
        
        BoxLayout layout;
        layout = new BoxLayout(this, BoxLayout.Y_AXIS);
        super.setLayout(layout);
    }
    
    public SimpleDialog(Component component) {
        this();
        addComponent(component);
        //TODO Quitar setName(component.getName());
    }
    
    /**
     * Varialbe interna para controlar el total de Dialgos.
     */
    private int totalDialog = 0;
    /**
     * Método del interface InterfaceDialog
     * Agrega un componte al diálogo.
     * Si es de tipo SimpleDialog, se sobre-escribe el metido de Dialog para
     * controlaqu no existan más de dos componentes Dialog en este SimpleDialog.
     * @param component Componente a agregar
     */
    @Override
    public void addComponent(Component component) {
        
        if (component instanceof Dialog) {
            setTotalDialog(getTotalDialog() + 1);
            if (getTotalDialog() > 2) {
                System.out.println("ERROR -> No está permitido más de dos objetos Dialog en este SimpleDialog");
            } else {
                this.add(component);
            }
            
        }
        else this.add(component);
    }
    
    /**
     * Retorna el valor de los Dialogos agregados en el SimpleDialog.
     * @return Valor de de los Dialogos agregados en el SimpleDialog.
     */
    private int getTotalDialog() {
        return totalDialog;
    }

    /**
     * Asigna el valor de Dialogos agregados en el SimpleDialog.
     * @param totalDialog Valor a asignar.
     */
    private void setTotalDialog(int totalDialog) {
        this.totalDialog = totalDialog;
    }
    
    /**
     * Se sobre-escribre setLayout para que no se pueda modificar.
     * @param mgr LayoutManager
     */
    @Override
    public final void setLayout(LayoutManager mgr) {
    }    
}
