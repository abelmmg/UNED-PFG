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
 * Enumeración para indicar el tipo de Diálogo.
 * @author Abel Matas
 */
public enum DialogType {
    SIMPLE(0),
    TAB(1),
    TREE(2);
    
    private static int counterSIMPLE=1;
    private static int counterTAB=1;
    private static int counterTREE=1;
    
    private final int dialogType;
    private DialogType(int dialogType) {
        this.dialogType = dialogType;
    }
    
    public static int nextValue(DialogType dt) {
        int i = 0;
        switch (dt) {
            case SIMPLE:
                counterSIMPLE++;
                return counterSIMPLE;
            case TAB:
                counterTAB++;
                return counterTAB;
             case TREE:
                counterTREE++;
                return counterTREE;   
        }
        return i;
    }
}
