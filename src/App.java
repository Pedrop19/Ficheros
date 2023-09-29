import java.io.BufferedReader;
import java.io.FileReader;

public class App {
    public static void main(String[] args) throws Exception {

        try {
            FileReader fichero = new FileReader("/Pedro/Programacion/POO/Ficheros/src/hello.txt");
            BufferedReader br = new BufferedReader(fichero);

            String linea;
            char caracter;
            int count = 0;

           while((linea = br.readLine()) != null){
                count ++;
           }
        
           System.out.println(count);

            br.close();

        } catch (Exception e) {
            System.out.println("No se ha podido leer el archivo");
        }
    }
}
