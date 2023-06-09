import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
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
        StringBuilder texto = new StringBuilder();
        leer_fichero.useDelimiter("\\Z");
        System.out.println("Encriptar --> 1\nDescencriptador --> 2");

        if(leer.nextInt()==1){
            System.out.print("Metodo de encriptación: ");
            String metodo = leer.nextLine();
            String text = leer_fichero.nextLine();
            texto = Encriptador.encripter(text,metodo);
            System.out.println(texto);
            PrintWriter writer2 = new PrintWriter(fichero);
            writer2.println(texto);
            writer.close();
            read.close();
            writer2.close();
        }
        else{
            System.out.println("Metodo de desencriptación: ");
            String metodo = leer.nextLine();
            String text = leer_fichero.nextLine();
            texto = Desencriptador.desencripter(text,metodo);
            System.out.println(texto);
            PrintWriter writer2 = new PrintWriter(fichero);
            writer2.println(texto);
            writer.close();
            read.close();
            writer2.close();
        }
    }
}
