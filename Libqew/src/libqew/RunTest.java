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

import javax.swing.JPanel;

/**
 *
 * @author Abel
 */
public class RunTest {
    FactoryDialogo creadorDialogo = new FactoryDialogo();
    public RunTest() {
    
        //new Frame(testDialogoSimple()).setVisible(true);
        //new Frame(testDialogoTab()).setVisible(true);
        new Frame(testDialogoArbol()).setVisible(true);
    }
    
    private Dialogo testDialogoArbol() {
        Dialogo d = creadorDialogo.construirDialogo(TipoDialogo.ARBOL);
        
        javax.swing.JButton b1 = new javax.swing.JButton("BOTON1");
        JPanel panel1 = new JPanel();
        panel1.setName("Hola1");
        panel1.add(b1);
        d.agregarComponente(panel1);
        
        //((DialogoTab)d).agregarComponenteTab(b1,"Hola1");
        
        javax.swing.JButton b2 = new javax.swing.JButton("BOTON2");
        JPanel panel2 = new JPanel();
        panel2.setName("Hola2");
        panel2.add(b2);
        d.agregarComponente(panel2);
        //((DialogoTab)d).agregarComponenteTab(b1,"Hola2");
        
        //((DialogoArbol)d).agregarArbol(b1,"Hola1");
        
        return d;
    }
    
    private Dialogo testDialogoTab() {
        Dialogo d = creadorDialogo.construirDialogo(TipoDialogo.TAB);
        ((DialogoTab)d).addTab("Hola1");
        ((DialogoTab)d).addTab("Hola2");
        
        javax.swing.JButton b1 = new javax.swing.JButton("BOTON1");
        JPanel panel1 = new JPanel();
        panel1.add(b1);
        //d.agregarComponente(panel1);
        
        ((DialogoTab)d).agregarComponenteTab(panel1,"Hola1");
        
        javax.swing.JButton b2 = new javax.swing.JButton("BOTON2");
        JPanel panel2 = new JPanel();
        panel2.add(b2);
        ((DialogoTab)d).agregarComponenteTab(panel2,"Hola2");
        
        return d;
    }    
   
    private Dialogo testDialogoSimple() {
        Dialogo d = creadorDialogo.construirDialogo(TipoDialogo.SIMPLE);
        
        javax.swing.JButton b= new javax.swing.JButton("BOTON1");
        d.agregarComponente(b);
        javax.swing.JButton b1= new javax.swing.JButton("BOTON2");
        d.agregarComponente(b1);
        
        return d;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RunTest();
            }
        });
    }
}
