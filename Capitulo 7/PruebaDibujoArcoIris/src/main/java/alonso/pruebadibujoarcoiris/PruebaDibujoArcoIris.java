/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package alonso.pruebadibujoarcoiris;

// Fig. 7.26: PrubaDibujoArcoIris.java
// Aplicacion de prueba para mostrar un arco iris.
import javax.swing.JFrame;

public class PruebaDibujoArcoIris {

    public static void main(String[] args) {
        DibujoArcoIris panel = new DibujoArcoIris();
        JFrame aplicacion = new JFrame();
        
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel);
        aplicacion.setSize(400, 250);
        aplicacion.setVisible(true);
    }
}
