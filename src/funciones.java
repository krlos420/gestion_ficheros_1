import java.io.File;
import java.io.FileNotFoundException;
public class funciones {
    public static void muestraInforRuta(File ruta) throws FileNotFoundException{
        if (!ruta.exists()){
            throw new FileNotFoundException();
        }

        if (ruta.isDirectory()){
            File [] archivos = ruta.listFiles();
            if (archivos !=null){
                for (File archivo : archivos){
                    if(archivo.isDirectory()){
                        System.out.println("[d] " + archivo.getName());
                    } else {
                        System.out.println("[-] " + archivo.getName());
                    }
                }
            }
        } else {
            System.out.println(ruta.getName());
        }
    }
}
