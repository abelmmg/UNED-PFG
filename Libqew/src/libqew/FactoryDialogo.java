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
 *
 * @author Abel
 */
public class FactoryDialogo {
    
    public Dialogo construirDialogo(TipoDialogo tipoDialogo) {
      
        switch (tipoDialogo) {
            case SIMPLE:
                return new DialogoSimple();

            case TAB:
                return new DialogoTab();

            case ARBOL:
                return new DialogoArbol();
                
            default:
                return null;
        }  
        //TODO: Control de errores, que pasa si retorna null, mejor con trow?
    }
    
    
    
}
