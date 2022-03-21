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

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Ventana prinicipal que contiene a los dialogos.
 * @author Abel
 */
public class Frame extends javax.swing.JFrame implements ActionListener {
    private PanelBotones panelBotones;
    private javax.swing.JSplitPane jSplitPane1;
    
            
    public Frame(Dialogo d) {  
     
        super();
        initComponents(d);
        
        panelBotones.setFrame(this);
        panelBotones.nuevoActionListener(this);

    }
                           
    private void initComponents(Dialogo dialog) {
        
        jSplitPane1 = new javax.swing.JSplitPane();
        panelBotones = new PanelBotones();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Frame");
        jSplitPane1.setBorder(null);
        jSplitPane1.setDividerLocation(200);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jSplitPane1.setTopComponent((Component) dialog);
        jSplitPane1.setRightComponent(panelBotones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
        );
        
        // El sistema operativo se encarga de la posición.
        setLocationByPlatform(true);
        pack();
    }                          

    @Override
    public void actionPerformed(ActionEvent evt) {
               System.out.println("Botón pulsado: " + evt.getActionCommand());
		if(evt.getActionCommand().equals("Aceptar")) {
			
		}
		else if(evt.getActionCommand().equals("Cancelar")) {
                    this.dispose();
		}
		System.out.println("");
    }
    
}
