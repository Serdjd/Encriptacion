import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;
public class App {
   public static void main(String[] args) throws Exception {
        File fichero = new File("texto.txt");
        String texto;
        if(!fichero.exists()){
            System.out.println("El archivo no existe");
            System.exit(0);
        }
        FileReader read = new FileReader(fichero);
        FileWriter writer = new FileWriter(fichero,true);
        Scanner leer = new Scanner(System.in);
        Scanner leer_fichero = new Scanner(fichero);
        System.out.println("Imprime el texto por pantalla");
        texto=leer.nextLine();
        
    }
}
