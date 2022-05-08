/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alonso.pruebadibujo;

// Fig. 8.17: MiLinea.java
// La clase MiLinea representa a una linea.
import java.awt.Color;
import java.awt.Graphics;

public class MiLinea {
    private int x1; // coordenada x del primer punto final
    private int y1; // coordenada y del primer punto final
    private int x2; // coordenada x del segundo punto final
    private int y2; // coordenada y del segundo punto final
    private Color color; // el color de esta figura


    // constructor con valores de entrada
    public MiLinea(int x1, int y1, int x2, int y2, Color color)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color = color;
    }
    
    //Dibuja la linea en el color especifico
    public void dibujar(Graphics g)
    {
        g.setColor(color);
        g.drawLine(x1, y1, x2, y2);
    }

} // fin de la clase MiLinea