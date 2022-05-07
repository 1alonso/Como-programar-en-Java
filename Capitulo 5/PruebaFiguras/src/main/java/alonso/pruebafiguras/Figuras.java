/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alonso.pruebafiguras;

// Fig. 5.27: Figuras.java
// Como dibujar una cascada de figuras con base en la eleccion del usuario.
import java.awt.Graphics;
import javax.swing.JPanel;

public class Figuras extends JPanel{
    private int opcion; // opcion del usuario acerca de cual figura dibujar
    
    // el constructor establece la opcion del usuario
    public  Figuras(int opcionUsuario)
    {
        opcion = opcionUsuario;
    }
    
    //dibuja una cascada de figuras, empezando desde la esquina superior izquierda
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        for (int i =0; i < 10; i++)
        {
            // elige la figura con base en la opcion del usuario
            switch (opcion)
                    {
                    case 1: // dibuja rectangulos
                        g.drawRect(10 + i * 10, 10 + i * 10,
                                50 + i * 10, 50 + i * 10);
                        break;
                    case 2: // dibuja ovalos
                        g.drawOval(10 + i * 10, 10 + i * 10,
                        50 + i *10, 50 + i *10);
                    }
        }
    }
}// fin de la clase Figuras
