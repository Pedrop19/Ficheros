import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public class Inversion {
    
    /*Crea un programa para "invertir" el contenido de un archivo de texto: 
    crea un archivo que contiene las mismas líneas que el archivo original 
    pero en orden inverso (la primera línea será la última, la segunda será la penúltima, 
    y así sucesivamente, hasta la última línea del archivo original, 
    que debe aparecer en la primera posición del archivo resultante). 
    Asegúrate de manejar adecuadamente las excepciones.*/


public class InvertirArchivoTexto {
    
    public static void main(String[] args) throws Exception{
        String primerArchivo = "/Pedro/Programacion/POO/Ficheros/src/hello.txt";
        String segundoArchivo = "/Pedro/Programacion/POO/Ficheros/src/hello2.txt";

        LinkedList<String> lines = new LinkedList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(primerArchivo))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
            System.out.println(lines);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }

        Collections.reverse(lines);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(segundoArchivo))) {
            for (int i = 0; i < lines.size(); i++) {
                bw.write(lines.get(i));
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo");
        }
    }
}

}