/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package alonso.dialogonombre;

// Fig. 3.13: DialogoNommbre.java
// Entrada basica con un cuadro de dialogo.
import javax.swing.JOptionPane;

public class DialogoNombre {

    public static void main(String[] args) {
        // pide al usuario que escriba su nombre
        String nombre =JOptionPane.showInputDialog("Cual es su nombre?");
        
        // crea el mensaje
        String mensaje =
                String.format("Bienvenido, %s a la programacion en Java! ", nombre);
        
        // muestra el mensaje para dar la bienvenida al usuario poe su nombre
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
