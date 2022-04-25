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

import java.util.Date;
import java.util.HashMap;

/**
 * Clase que define un documento de tipo pedido/orden.
 * @author Abel
 */
public class Order {
    
    private String orderId;
    private Integer orderType;
    private HashMap<Integer,String> orderNotes = new HashMap<>();
    private Date orderDate;
    private Date orderCloseDate;
    private String remmark;

    /**
     * Retorna el identificado del pedido/documento.
     * @return 
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Asigna el identificador del pedido.
     * @param orderId 
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    
    /**
     * Retorna el tipo de pedido.
     * @return 
     */
    public Integer getOrderType() {
        return orderType;
    }

    /**
     * Asigna el tipo de pedido en la orden.
     * @param orderType 
     */
    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    /**
     * Retorna la lista de notas asociadas al pedido.
     * @return 
     */
    public HashMap<Integer,String> getOrderNotes() {
        return orderNotes;
    }

    /**
     * Asigna una lista de notas a un pedido.
     * @param orderNotes 
     */
    public void setOrderNotes(HashMap<Integer,String> orderNotes) {
        this.orderNotes = orderNotes;
    }

    /**
     * Retorna la fecha del pedido.
     * @return 
     */
    public Date getOrderDate() {
        return orderDate;
    }

    /**
     * Asigna la fecha del pedido.
     * @param orderDate 
     */
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * Retorna la fecha de cierre del pedido.
     * @return 
     */
    public Date getCloseDate() {
        return orderCloseDate;
    }

    /**
     * Asigna la fecha de cierre del pedido.
     * @param orderCloseDate 
     */
    public void setCloseDate(Date orderCloseDate) {
        this.orderCloseDate = orderCloseDate;
    }

    /**
     * Retorna el comentario
     * @return 
     */
    public String getRemmark() {
        return remmark;
    }

    /**
     * Asigna comentario al pedido.
     * @param remmark 
     */
    public void setRemmark(String remmark) {
        this.remmark = remmark;
    }
    
}
