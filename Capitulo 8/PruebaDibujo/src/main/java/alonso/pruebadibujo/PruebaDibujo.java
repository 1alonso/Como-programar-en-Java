/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package alonso.pruebadibujo;

// Fig. 8.19: PruebaDibujo.java
// Creacion de un objeto JFrame para mostrar un PanelDibujo en pantalla.
import javax.swing.JFrame;

public class PruebaDibujo {

    public static void main(String[] args) {
        PanelDibujo panel = new PanelDibujo();
        JFrame aplicacion = new JFrame();
        
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel);
        aplicacion.setSize(300, 300);
        aplicacion.setVisible(true);
    }
}
