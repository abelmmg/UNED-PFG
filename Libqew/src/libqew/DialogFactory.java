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

/**
 * Clase factoría de dialogos.
 * @author Abel Matas
 */
public class DialogFactory {
    
    /**
     * Crea un objeto InterfaceDialog segun el tipo DialogType indicado.
     * @param dialogType Tipo de diálogo a construir
     * @return Retorna un InterfaceDialog
     */
    public InterfaceDialog createDialog(DialogType dialogType) {
      
        switch (dialogType) {
            case SIMPLE:
                SimpleDialog ds = new SimpleDialog();
                return ds;

            case TAB:
                TabDialog dt = new TabDialog();
                return dt;

            case TREE:
                TreeDialog da = new TreeDialog();
                return da;                
                
            default:
                return null;
        }  
    }
    
}
