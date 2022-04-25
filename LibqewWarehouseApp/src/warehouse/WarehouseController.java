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
package warehouse;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import warehouse.model.InboundOrder;
import warehouse.model.Inventory;
import warehouse.model.Location;
import warehouse.model.OutboundOrder;
import warehouse.model.Warehouse;
import warehouse.view.WarehouseFrame;

/**
 * Clase que controla la interacción entre el modelo de datos y la vista/GUI de los mismos.
 * @author Abel
 */
public class WarehouseController {
    // Clases View
    WarehouseFrame warehouseFrame;

    // Clases Model
    Warehouse warehouse;
    InboundOrder inboundOrder;
    OutboundOrder outboundOrder;
    
    public WarehouseController()  {
        getDataModel();
        createView();
        refreshData();
           
//        List<Component> listComponets = warehouseFrame.getAllComponents(warehouseFrame, true);
//        List<Component> resulta = listComponets.stream()
//                .filter(compo -> compo.getName() == "txtOrderId")
//                .collect(Collectors.toList());
//        resulta.forEach(compo -> System.out.println(compo.getClass().getName() + ":" +  compo.getName()));
        

    }

    private void createView() {
        warehouseFrame = new WarehouseFrame();
        warehouseFrame.setVisible(true);
    }

    private void getDataModel() {
        warehouse = new Warehouse();
        warehouse.setIdWarehouse("WHS_1");
        warehouse.setDescription("UNED Warehouse");
        warehouse.setMaxStock(Integer.MAX_VALUE);
        warehouse.setSector("Technology");
        warehouse.setTotalStock(10000);
        warehouse.setSquareMeters(0.5);
        
        inboundOrder = new InboundOrder();
        inboundOrder.setOrderId("Inbound 1");
        inboundOrder.setOrderType(0);
        inboundOrder.setRemmark("Arraival at 20:00 CEST");
        inboundOrder.setOrderDate(new Date(2022, 4, 17));
        HashMap<Integer, String> orderComments = new HashMap<>();
        orderComments.put(1, "Comment 1");
        orderComments.put(2, "Comment 2");
        orderComments.put(3, "Comment 3");
        inboundOrder.setOrderNotes(orderComments);
        
        warehouse.setInboundOrder(inboundOrder);
        
        outboundOrder = new OutboundOrder();
        outboundOrder.setOrderId("Order 2");
        outboundOrder.setOrderType(1);
        outboundOrder.setRemmark("Deliver at 21:00 CEST");
        outboundOrder.setOrderDate(new Date(2022, 4, 17));
        outboundOrder.setCloseDate(new Date(2022, 5, 10));
        outboundOrder.setAddress("Adress 1, 1A, XXXXX");
        outboundOrder.setPostalCode(28054);
        
                
        HashMap<Integer, String> orderComments2 = new HashMap<>();
        orderComments2.put(1, "Comment 1");
        orderComments2.put(2, "Comment 2");
        orderComments2.put(3, "Comment 3");
        outboundOrder.setOrderNotes(orderComments);        
        
        warehouse.setOutboundOrder(outboundOrder);
        
        Location location1 = new Location();
        location1.setIdLayout("LOC 1");
        location1.setAisle("AISLE A");
        location1.setArea("Area B");
        location1.setZone("ZONE Z");
        
        Location location2 = new Location();
        location2.setIdLayout("LOC 2");
        location2.setAisle("AISLE B");
        location2.setArea("Area B");
        location2.setZone("ZONE Z");
        
        // Se agregan las ubicaciones al layout y al almacen.
        ArrayList<Location> layoutList = new ArrayList<>();
        layoutList.add(location1);
        layoutList.add(location2);
        warehouse.setLayoutList(layoutList);
        
        ArrayList<Inventory> inventoryList1 = new ArrayList<>();
        Inventory inventory1 = new Inventory();
        inventory1.setItem("ITEM 1");
        inventory1.setQuantity(1000);
        inventory1.setEANcode(222222);
        inventoryList1.add(inventory1);
        location1.setInventoryList(inventoryList1);
        
        ArrayList<Inventory> inventoryList2 = new ArrayList<>();
        Inventory inventory2 = new Inventory();
        inventory2.setItem("ITEM 2");
        inventory2.setQuantity(25000);
        inventory2.setEANcode(222222);
        inventoryList2.add(inventory2);
        location2.setInventoryList(inventoryList2);
        
        Inventory inventory3 = new Inventory();
        inventory3.setItem("ITEM 3");
        inventory3.setQuantity(35000);
        inventory3.setEANcode(33333333);
        inventoryList2.add(inventory3);
        location2.setInventoryList(inventoryList2);

    }

    private void refreshData() {

      
        // Refresca datos de Pedidos de salida.
        warehouseFrame.getOutboundOrderDialog().getOrderHeader().setOrderId(outboundOrder.getOrderId());
        warehouseFrame.getOutboundOrderDialog().getOrderHeader().setOrderType(outboundOrder.getOrderType().toString());
        warehouseFrame.getOutboundOrderDialog().getOrderHeader().setOrderDate(outboundOrder.getOrderDate().toString());
        warehouseFrame.getOutboundOrderDialog().getOrderHeader().setCloseDate(outboundOrder.getCloseDate().toString());
        warehouseFrame.getOutboundOrderDialog().getOrderHeader().setRemarks(outboundOrder.getRemmark());
        warehouseFrame.getOutboundOrderDialog().getOrderDetails().setOrderId(outboundOrder.getOrderId());
        
        warehouseFrame.setModelValues(warehouse);
    }

}
