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

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Clase de almacén.
 * @author Abel
 */
public class Warehouse {
    private String idWarehouse;
    private String description;
    private String sector;
    private Double squareMeters;
    private Integer totalStock;
    private Integer maxStock;
    
    private OutboundOrder outboundOrder;
    private InboundOrder inboundOrder;
    private ArrayList<Location> layoutList;

    public String getIdWarehouse() {
        return idWarehouse;
    }

    public void setIdWarehouse(String idWarehouse) {
        this.idWarehouse = idWarehouse;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Double getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(Double squareMeters) {
        this.squareMeters = squareMeters;
    }

    public Integer getTotalStock() {
        return totalStock;
    }

    public void setTotalStock(Integer totalStock) {
        this.totalStock = totalStock;
    }

    public Integer getMaxStock() {
        return maxStock;
    }

    public void setMaxStock(Integer maxStock) {
        this.maxStock = maxStock;
    }

    public OutboundOrder getOutboundOrder() {
        return outboundOrder;
    }

    public void setOutboundOrder(OutboundOrder outboundOrder) {
        this.outboundOrder = outboundOrder;
    }

    public InboundOrder getInboundOrder() {
        return inboundOrder;
    }

    public void setInboundOrder(InboundOrder inboundOrder) {
        this.inboundOrder = inboundOrder;
    }

    public ArrayList<Location> getLayoutList() {
        return layoutList;
    }

    public void setLayoutList(ArrayList<Location> layoutList) {
        this.layoutList = layoutList;
    }

    public ArrayList<Inventory> getInventoryList() {
        
        ArrayList<Inventory> ret = new ArrayList<>();
        for (Iterator<Location> iterator = layoutList.iterator(); iterator.hasNext();) {
            Location next = iterator.next();
            
            for (Iterator<Inventory> iterator1 = next.getInventoryList().iterator(); iterator1.hasNext();) {
                Inventory stk = iterator1.next();
                ret.add(stk);
            }
        }
        return ret;
    }
    
}
