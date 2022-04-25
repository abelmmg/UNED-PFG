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
 * Interface para validación del dialogo
 * @author Abel Matas
 */
public interface ValidatorListener {
    
    /**
     * Validación de los campos del diálogo.
     * @return Si devuelve verdadero se continual con saveThis() y cleanThis().
     */
    public boolean validateThis();
    /**
     * Actualiza los campos de la clase editada desde los del dialogo.
     */
    public void saveThis();
    /**
     * Realiza las tareas de finalización, cierre de ficheros, ...
     */
    public void cleanThis();
    
}
