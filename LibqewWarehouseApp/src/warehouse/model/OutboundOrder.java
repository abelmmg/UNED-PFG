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
 * Clase para el pedido de preparación de mercancia.
 * @author Abel
 */
public class OutboundOrder extends Order {
    
    /**
     * Dirección para entregar el pedido.
     */
    private String address;
    /**
     * Código postal donde entregar del pedido.
     */
    private int postalCode;
    /**
     * Ciudad donde entregar del pedido.
     */
    private String city;
    /**
     * Provincia donde entregar del pedido.
     */
    private String province;
    /**
     * Pais donde entregar del pedido.
     */
    private String country;
    /**
     * Peso del pedido.
     */
    private Double weight;

    /**
     * Retorna la dirección
     * @return 
     */
    public String getAddress() {
        return address;
    }

    /**
     * Asigna la dirección
     * @param address 
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Retorna el código Postal
     * @return 
     */
    public int getPostalCode() {
        return postalCode;
    }

    /**
     * Asigna el código Postal
     * @param postalCode 
     */
    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * Retorna la ciudad.
     * @return 
     */
    public String getCity() {
        return city;
    }

    /**
     * Asigna la ciudad.
     * @param city 
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Retorna la provincia
     * @return 
     */
    public String getProvince() {
        return province;
    }

    /**
     * Asigna la provincia.
     * @param province 
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * Retorna el pais.
     * @return 
     */
    public String getCountry() {
        return country;
    }

    /**
     * Asigna el pais.
     * @param country 
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Retorna el peso del pedido.
     * @return 
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * Asigna el peso del pedido.
     * @param weight 
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }
    
    
            
}
