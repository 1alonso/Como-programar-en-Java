/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alonso.pruebapaneldibujo;

// Fig. 4.18: PanelDibujo.jva
//Uso de drawLine para conectar las esquinas de un panel
import java.awt.Graphics;
import javax.swing.JPanel;

// Uso de drawLine para conectar las esquinas de un panel
public class PanelDibujo extends JPanel{
    // dibuja una x desde las esquinas del panel
    public void paintComponent (Graphics g)
    {
        // llama a paintComponent para asegurar que el panel se muestre correctamente
        super.paintComponent(g);
        
        int anchura = getWidth(); // anchura total
        int altura = getHeight(); // altura total
        
        //dibuja una linea de la esquina inferior izquierda a la esquina inferior derecha
        g.drawLine(0, 0, anchura, altura);
        
        //dibuja una linea de la esquina inferior izquierda a la esquina superior derecha
        g.drawLine(0, altura, anchura, 0);
    }
}
