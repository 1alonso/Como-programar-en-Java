/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package alonso.pruebadibujarcarasonriente;

// Fig. 6.12: PruebaDibujarCaraSonriente.java
// Aplicacion de prueba que muestre una cara sonriente.
import javax.swing.JFrame;

public class PruebaDibujarCaraSonriente {

    public static void main(String[] args) {
        DibujarCaraSonriente panel = new DibujarCaraSonriente();
        JFrame aplicacion = new JFrame();
        
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel);
        aplicacion.setSize(230, 250);
        aplicacion.setVisible(true);
    
    }
}// fin de la clase PruebaDibujarCaraSonriente
