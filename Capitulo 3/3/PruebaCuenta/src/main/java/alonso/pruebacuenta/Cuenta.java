/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alonso.pruebacuenta;

// Fig. 3.8: Cuenta.java
// La clase Cuenta con una variable de instancia double llamada saldo y un constructor
// ademas de un metodo llamado deposito que realiza validacion.
public class Cuenta {
    private String nombre; // variable de instancia
    private double saldo; // vairiable de isntancia
    
    // Constructor de Cuenta que recibe dos parametros 
    public Cuenta (String nombre, double saldo)
    {
        this.nombre = nombre; // asigna nombre a la variable de instancia nombre
        
        // valida que el saldo sea mayor que 0.0; de lo contrario,
        // la variable de instancia saldo mantiene su valor inicial predeterminado de 0.0
        if (saldo > 0.0) // si el saldo es valido
            this.saldo = saldo; // lo saigna a la variable de instancia saldo
    }
    
    // metodo que deposita (suma) solo una actividad  valida al saldo 
    public void  depositar(double montoDeposito)
    {
        if (montoDeposito > 0.0) // si el montoDeposito es valido
            saldo = saldo + montoDeposito; // lo suma al saldo
    }
    
    // metodo que devuelve el saldo de la cuenta
    public double obtenerSaldo()
    {
        return saldo;
    }
 
    // metodo que establece el nombre
    public void establecerNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    // metodo que devuelve el nombre
    public String  obtenerNombre()
    {
        return nombre; //devuelve el valor de name a quien usted invoco
    }// fin del metodo obtenerNombre
}// fin de la clase Cuenta
