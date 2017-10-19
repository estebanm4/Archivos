package archivos;
import java.io.File;

public class GestionArchivos {
    public void listarArchivos(String ruta){
        String [] lista = null;
        File archivo = new File(ruta);
        if (archivo.exists()){
            if(archivo.isFile()){
                System.out.println(archivo.getName());
            } else {
                lista = archivo.list();
                for(String nombre : lista){
                    this.listarArchivos(ruta+"/" + nombre);
                }
            }
        }
    }
}
