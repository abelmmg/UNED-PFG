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
import libqew.SimpleDialog;

/**
 * Muestra el diálogo del almacén.
 * @author Abel
 */
public class WarehouseDialog extends SimpleDialog {

    /**
     * Creates new form WarehouseDialog2
     */
    public WarehouseDialog() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblDescription = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        txtWarehouseId = new javax.swing.JTextField();
        lblSector = new javax.swing.JLabel();
        lblWarhouseId = new javax.swing.JLabel();
        lblSquareMeters = new javax.swing.JLabel();
        txtSquareMeters = new javax.swing.JTextField();
        jspTotalStock = new javax.swing.JSpinner();
        jspMaxStock = new javax.swing.JSpinner();
        txtSector = new javax.swing.JTextField();
        lblTotalStock1 = new javax.swing.JLabel();
        lblMaxStock = new javax.swing.JLabel();
        jslMaxStock = new javax.swing.JSlider();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Warehouse"));

        lblDescription.setText("Description");

        lblSector.setText("Sector");

        lblWarhouseId.setText("Warehouse Id");

        lblSquareMeters.setText("Square Meters");

        jspMaxStock.setName(""); // NOI18N
        jspMaxStock.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jspMaxStockStateChanged(evt);
            }
        });

        lblTotalStock1.setText("Total Stock");

        lblMaxStock.setText("Max Stock");

        jslMaxStock.setMaximum(2000000);
        jslMaxStock.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jslMaxStockStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblWarhouseId, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(txtWarehouseId, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblSquareMeters, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(txtSquareMeters, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblSector, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(txtSector, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTotalStock1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jspTotalStock, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblMaxStock, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jspMaxStock, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jslMaxStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblWarhouseId))
                    .addComponent(txtWarehouseId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblDescription))
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSector)
                    .addComponent(txtSector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSquareMeters)
                    .addComponent(txtSquareMeters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotalStock1)
                    .addComponent(jspTotalStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMaxStock)
                    .addComponent(jspMaxStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jslMaxStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jspMaxStockStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jspMaxStockStateChanged
        jslMaxStock.setValue((int) jspMaxStock.getValue());
    }//GEN-LAST:event_jspMaxStockStateChanged

    private void jslMaxStockStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jslMaxStockStateChanged
        jspMaxStock.setValue(jslMaxStock.getValue());
    }//GEN-LAST:event_jslMaxStockStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jslMaxStock;
    private javax.swing.JSpinner jspMaxStock;
    private javax.swing.JSpinner jspTotalStock;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblMaxStock;
    private javax.swing.JLabel lblSector;
    private javax.swing.JLabel lblSquareMeters;
    private javax.swing.JLabel lblTotalStock1;
    private javax.swing.JLabel lblWarhouseId;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtSector;
    private javax.swing.JTextField txtSquareMeters;
    private javax.swing.JTextField txtWarehouseId;
    // End of variables declaration//GEN-END:variables

       public String getWarehouseId() {
        return txtWarehouseId.getText();
    }

    public void setWarehouseId(String txt) {
        this.txtWarehouseId.setText(txt);
    }

    public String getDescription() {
        return txtDescription.getText();
    }

    public void setDescription(String txt) {
        this.txtDescription.setText(txt);
    }

    public Integer getMaxStock() {
        return (Integer) jspMaxStock.getValue();
    }

    public void setMaxStock(Integer maxStock) {
        this.jspMaxStock.setValue(maxStock);
        jspMaxStock.setValue(maxStock);
    }
    
    public Integer getTotalStock() {
        return (Integer) jspTotalStock.getValue();
    }

    public void setTotalStock(Integer totalStock) {
        this.jspTotalStock.setValue(totalStock);
    }
    

    public String getSector() {
        return txtSector.getText();
    }

    public void setSector(String sector) {
        this.txtSector.setText(sector);
    }

    public String getSquareMeters() {
        return txtSquareMeters.getText();
    }

    public void setSquareMeters(String squareMeters) {
        this.txtSquareMeters.setText(squareMeters);
    }

    public JSlider getJslMaxStock() {
        return jslMaxStock;
    }
    
    
    @Override
    public boolean validateThis() {
        
        if (  txtSector.getText().equals("Technology") ||
              txtSector.getText().equals("Consumer")   ||
              txtSector.getText().equals("Retail")
            ) {
            return true;
        } else {
            System.out.println("VALIDATION ERROR: No valid Sector -> " + txtSector.getText());
            return false;
        }
    }
}