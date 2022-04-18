/*
    Autor:ArtaiRG
    Fecha:21 feb. 2022,22:00:45
    Ejercicio:


 */
package Modelo;

/**
 *
 * @author Artai
 */
public class ObjetoCliente {
    int edad;
    String nombre,apellidos,dni;

    public ObjetoCliente() {
    }

    public ObjetoCliente(int edad, String nombre, String apellidos, String dni) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "ObjetoCliente{" + "edad=" + edad + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + '}';
    }
    
}
