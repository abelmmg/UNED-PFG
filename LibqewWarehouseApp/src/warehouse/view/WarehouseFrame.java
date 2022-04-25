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
package warehouse.view;


import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.tree.DefaultMutableTreeNode;
import libqew.MainFrame;
import warehouse.model.OutboundOrder;
import warehouse.model.Warehouse;

/**
 * Ventana que muestra el almacén.
 * @author Abel
 */
public class WarehouseFrame  extends MainFrame {

    /**
     * Creates new form WarehouseWindow
     */
    public WarehouseFrame() {
        initComponents();  
        this.setTitle("Warehouse APP");
        initTree();
        initComponentsListeners();
        treeDialog1.pack();
    }

    private void initTree() {
        this.setDialog(treeDialog1);
        treeDialog1.addComponent(warehouseDialog1);
        warehouseDialog1.setName("Warehouse");
        
        treeDialog1.addComponent(outboundOrderDialog1);
        outboundOrderDialog1.setName("Outbound Orders");
        
        treeDialog1.addComponent(layoutDialog1);
        layoutDialog1.setName("Layout");
        
        treeDialog1.addComponent(inventoryDialog1);
        inventoryDialog1.setName("Stock");
    }
    
    private void initComponentsListeners() {
        JSlider jsl1 = warehouseDialog1.getJslMaxStock();
        JSpinner jsp2 = layoutDialog1.getJspMaxStock();
        this.addListernerComponents(jsp2,jsl1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        outboundOrderDialog1 = new warehouse.view.OutboundOrderDialog();
        layoutDialog1 = new warehouse.view.LayoutDialog();
        inventoryDialog1 = new warehouse.view.InventoryDialog();
        warehouseDialog1 = new warehouse.view.WarehouseDialog();
        treeDialog1 = new libqew.TreeDialog();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().add(treeDialog1, java.awt.BorderLayout.CENTER);
        treeDialog1.createRootTreeNode("Warehouse");

        treeDialog1.addNodeToRoot("Inbound Orders");
        treeDialog1.addNodeToRoot("Outbound Orders");
        DefaultMutableTreeNode treeNodeInventory = new DefaultMutableTreeNode("Layout");
        treeDialog1.addNode("Stock", treeNodeInventory);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private warehouse.view.InventoryDialog inventoryDialog1;
    private warehouse.view.LayoutDialog layoutDialog1;
    private warehouse.view.OutboundOrderDialog outboundOrderDialog1;
    public libqew.TreeDialog treeDialog1;
    private warehouse.view.WarehouseDialog warehouseDialog1;
    // End of variables declaration//GEN-END:variables

    public WarehouseDialog getWarehouseDialog() {
        return warehouseDialog1;
    }

    public OutboundOrderDialog getOutboundOrderDialog() {
         return outboundOrderDialog1;
    }

    Warehouse warehouse;
    public void setModelValues(Warehouse warehouse) {
        this.warehouse = warehouse;
        
        warehouseDialog1.setWarehouseId(warehouse.getIdWarehouse());
        warehouseDialog1.setWarehouseId(warehouse.getIdWarehouse());
        warehouseDialog1.setDescription(warehouse.getDescription());
        warehouseDialog1.setSector(warehouse.getSector());
        warehouseDialog1.setSquareMeters((warehouse.getSquareMeters().toString()));
        warehouseDialog1.setTotalStock(warehouse.getTotalStock());
        warehouseDialog1.setMaxStock(warehouse.getMaxStock());
        
        
        layoutDialog1.setModelValues(warehouse.getMaxStock(), warehouse.getLayoutList());
        inventoryDialog1.setModelValues(warehouse.getInventoryList());
        outboundOrderDialog1.setModelValues(warehouse.getOutboundOrder());
    }

}
