/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alonso.pruebacuenta;

// Fig.3.5: Cuenta.java
// Clase Cuenta con un constructor que inicializa el nombre.

public class Cuenta {
    private String nombre;// variable de instancia
    // el constructor inicializa nombre con el parametro nombre
    public Cuenta(String nombre)// el nombre del constructor es el nombre de la clase
    {
        this.nombre = nombre;
    }
    
    // metodo para establecer el nombre
    public void establecerNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    // metodos para recuperar el nombre 
    public String obtenerNombre()
    {
        return nombre;
    }
}// din de la clase Cuenta
