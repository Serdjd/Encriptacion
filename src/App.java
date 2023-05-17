import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;
public class App {
   public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        System.out.print("Dirección del fichero: ");
        String texto = leer.nextLine();
        File fichero = new File(texto);
        
        if(!fichero.exists()){
            System.out.println("El archivo no existe");
            System.exit(0);
        }
        FileReader read = new FileReader(fichero);
        FileWriter writer = new FileWriter(fichero,true);
        Scanner leer_fichero = new Scanner(fichero);
        
    }
}
