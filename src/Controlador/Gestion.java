/*
    Autor:ArtaiRG
    Fecha:18 abr. 2022,13:28:06
    Ejercicio:


 */
package Controlador;

import Modelo.ObjetoCliente;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Artai
 */
public class Gestion {

    public static ArrayList<ObjetoCliente> CrearObjetos(File Archivo) throws FileNotFoundException, IOException {
        ArrayList<ObjetoCliente> ListaClientes = new ArrayList<>();
        String linea;
        String[] ArrayLinea;
        try ( BufferedReader BuffR = new BufferedReader(new FileReader(Archivo))) {/*Uso los recursos del try para que se cierre automaticamente el lector*/
            while ((linea = BuffR.readLine()) != null) {
                System.out.println(linea);
                ArrayLinea = linea.split(",");/*Spliteo la linea por "," */
                if (linea.startsWith("//")) {/*Si la linea empieza con "//" es un comentario,no es valida*/
                    System.out.println("Primera linea es un cometario");
                } else if (ArrayLinea.length != 4) {/*Si la linea no tiene 4 "valores" tampoco es valida*/
                    System.out.println("Esta linea no es valida");
                } else {
                    ObjetoCliente ObjetoClienteTemporal=new ObjetoCliente(Integer.valueOf(ArrayLinea[0]), ArrayLinea[1], ArrayLinea[2], ArrayLinea[3]);
                    ListaClientes.add(ObjetoClienteTemporal);
                    System.out.println("Objeto: "+ObjetoClienteTemporal.toString()+" Creado");
                }
            }
            System.out.println("Se han creado "+ListaClientes.size()+" Objetos");
        }
        return ListaClientes;
    }

}
