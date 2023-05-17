import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;
public class App {
   public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        System.out.print("Dirección del fichero: ");
        String direccion = leer.nextLine();
        File fichero = new File(direccion);
        
        if(!fichero.exists()){
            System.out.println("El archivo no existe");
            System.exit(0);
        }
        FileReader read = new FileReader(fichero);
        FileWriter writer = new FileWriter(fichero,true);
        Scanner leer_fichero = new Scanner(fichero);
        leer_fichero.useDelimiter("\\Z");
        System.out.print("Metodo de encriptación: ");
        StringBuilder texto = new StringBuilder();
        texto = Encriptador.encripter(leer_fichero.nextLine(),leer.nextLine());
    }
}
