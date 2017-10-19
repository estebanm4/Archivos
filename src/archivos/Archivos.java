package archivos;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivos {

    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        File f = new File("hamlet.txt");
        System.out.println("Exist returns " + f.exists());
        System.out.println("canRead returns " + f.canRead());
        System.out.println("Length returns " + f.length());
        System.out.println("getAbsolutePath returns " + f.getAbsolutePath());
        
        System.out.println("Nombre del Archivo");
        String nombre = lectura.next();
        File archivo = new File(nombre);
        if (archivo.exists()) {
            System.out.println("Existe");
        } else {
            try {
                archivo.createNewFile();
                System.out.println(archivo.getAbsoluteFile());
            } catch (IOException ex) {
                System.out.println("No se puede crear el Archivo" + ex.getMessage());
            }
        }     
    }   
}
