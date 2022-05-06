/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package alonso.pruebacuenta;

// Fig. 3.9: PruebaCuenta.java
// Entrada y dalida de numeros de punto flotante con objetos Cuenta
import java.util.Scanner;
public class PruebaCuenta {

    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Jane Green", 50.00);
        Cuenta cuenta2 = new Cuenta("John Blue", -7.53);
        
        // muestra el saldo inicial de cada objeto
        System.out.printf("Saldo de %s: $%.2f%n",
                cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
        System.out.printf("Saldo de %s: $%.2f%n%n",
                cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());
        
        // crea un objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Escriba  el monto a depositar para cuanta1 "); // indicador (promt)
        double montoDeposito = entrada.nextDouble(); // obtine entrada del usuario
        System.out.printf("%nsumando %.2f al saldo de cuenta2%n%n ", montoDeposito);
        cuenta1.depositar(montoDeposito); // suma al saldo  de cuenta2
        
        // muestra los saldos
        System.out.printf("Saldo de %s: $%.2f%n",
                cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
        System.out.printf("Saldo de %s: $%.2f%n",
                cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());
        
    }// fin de main
}// fin de la calse PruebaCuenta
