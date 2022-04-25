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
package warehouse.model;

/**
 * Clase que representa un domento de entrada de mercancía.
 * @author Abel
 */
public class InboundOrder extends Order {
    
    /**
     * Matricula del camión.
     */
    private String truckLicence;
    /**
     * Nombre del transportista.
     */
    private String driverName;

    /**
     * Retorna la matricula del camión.
     * @return 
     */
    public String getTruckLicence() {
        return truckLicence;
    }

    /**
     * Asigna matricula de camión al documento de entrada.
     * @param truckLicence 
     */
    public void setTruckLicence(String truckLicence) {
        this.truckLicence = truckLicence;
    }

    /**
     * Retorna el nombre del transportista.
     * @return 
     */
    public String getDriverName() {
        return driverName;
    }

    /**
     * Asigna el nombre del transportista al documento de entrada.
     * @param driverName 
     */
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
    
}
