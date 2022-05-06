/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package alonso.pruebapaneldibujo;

// Fig. 4.19: PruebaPanelDibujo.java
// Crear un objeto JFRame para mostrar un objeto PanelDibujo
import javax.swing.JFrame;

public class PruebaPanelDibujo {

    public static void main(String[] args) {
        // crea un panel que contiene nuestro dibujo
        PanelDibujo panel = new PanelDibujo();
        
        // crea un nuevo marco para contener el panel
        JFrame aplicacion = new JFrame();
        
        // establece el marco para salir cuando se cierre
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        aplicacion.add(panel); // agrega el panel al marco
        aplicacion.setSize(250, 250); // establece el tamaño del marco
        aplicacion.setVisible(true); // hace que el marco sea visible
    }
}
