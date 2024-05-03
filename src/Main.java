import java.io.File;
import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args) {
        String continuar = "s";
        while (continuar.equalsIgnoreCase("s")) {
            String ruta = Leer.leerTexto("Escribe la ruta ");
            try {
                funciones.muestraInforRuta(new File(ruta));
            } catch (FileNotFoundException e) {
                System.out.println("La ruta no existe.");
            }
            continuar = Leer.leerTexto("Quieres seguir? s/n ");
        }
    }
}

