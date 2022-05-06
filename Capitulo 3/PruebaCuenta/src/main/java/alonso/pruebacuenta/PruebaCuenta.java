/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package alonso.pruebacuenta;

// Fig. 3.6: PruebaCuanta.java
// Uso del constructor de Cuenta para inicializar la variable de instancia
// nombre al momento de crear el objeto Cuenta
public class PruebaCuenta {

    public static void main(String[] args) {
        // crear dos objetos Cuenta
        Cuenta cuenta1 = new Cuenta("Jane Green");
        Cuenta cuenta2 = new Cuenta("John Blue");
        
        // muestra el valor inicial  de nombre para cada Cuenta
        System.out.printf("El nombre de cuenta1 es: %s%n", cuenta1.obtenerNombre());
        System.out.printf("El nombre de cuenta2 es: %s%n", cuenta2.obtenerNombre());
    }
} // fin de la clase PruebaCuenta
