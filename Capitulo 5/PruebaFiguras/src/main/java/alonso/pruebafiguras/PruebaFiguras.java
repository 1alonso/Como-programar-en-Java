/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package alonso.pruebafiguras;

// 
// Obtener la entrada del usuario y crear un JFrame para mostrar Figuras.
import javax.swing.JFrame; // maneja la visualizacion
import javax.swing.JOptionPane; 
public class PruebaFiguras {

    public static void main(String[] args) {
        // obtiene la opcion del usuario 
        String entrada = JOptionPane.showInputDialog(
                "Escriba 1 para dibujar rectangulo\n" + 
                "Escriba 2 para dibujar ovalos");
        
        int opcion = Integer.parseInt(entrada); // convierte entrada en int
        
        // crea el panel con la entrada del usuario
        Figuras panel = new Figuras(opcion);
        
        JFrame aplicacion = new JFrame(); // crea un nuevo objeto JFrame
        
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel);
        aplicacion.setSize(300, 300);
        aplicacion.setVisible(true);
        
    }
} // fin de la clase PruebaFiguras
