/*
    Autor:ArtaiRG
    Fecha:18 abr. 2022,13:24:29
    Ejercicio:


 */
package Vista;

import Modelo.ObjetoCliente;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author Artai
 */
public class Vista {
    public static void main(String[] args) {
        try {
            File Archivo = new File(".\\src\\Datos\\Datos.txt");
            try {
                ArrayList<ObjetoCliente> Clientes =Controlador.Gestion.CrearObjetos(Archivo);
            } catch (Exception e) {
                System.out.println(e);
            }

        } catch (Exception e) {
            System.err.println(e);
        } finally {
        }
    }
    
}
