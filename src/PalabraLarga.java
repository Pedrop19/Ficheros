import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PalabraLarga {

    /*
     * Escribe un programa en Java que lea un archivo de texto y encuentre
     * la palabra más larga del archivo. El programa debe solicitar al usuario
     * la ruta del archivo y luego mostrar la palabra más larga en la consola,
     * junto con su longitud. Asegúrate de manejar adecuadamente las excepciones.
     */

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            // Pedir al usuario la ruta del archivo de texto
            System.out.print("Ingrese la ruta del archivo: ");
            String ruta = sc.nextLine();

            try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {

                String contenido = "";
                String line;

                // Leer el archivo de texto y almacenarlo en una variable de tipo String
                while ((line = br.readLine()) != null) {
                    contenido += line + " ";
                }

                // Separar las palabras del archivo utilizando un espacio como separador
                String[] words = contenido.split(" ");
                String palabraLarga = "";

                // Iterar a través de todas las palabras separadas y encontrar la más larga
                for (String word : words) {
                    if (word.length() > palabraLarga.length()) {
                        palabraLarga = word;
                    }
                }
                // Mostrar la palabra más larga y su longitud en la consola
                System.out.println("La palabra más larga es: " + palabraLarga);
                System.out.println("Su longitud es: " + palabraLarga.length());

            } catch (IOException e) {
                System.out.println("Error al leer el archivo");
            }
        }

    }

}
