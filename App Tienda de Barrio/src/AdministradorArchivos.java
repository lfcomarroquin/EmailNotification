import java.io.*;

public class AdministradorArchivos {
    static void leerArchivo(String rutaArchivo) {
        try {
            FileReader lector = new FileReader(rutaArchivo);
            BufferedReader lectura = new BufferedReader(lector);
            String linea;
            while ((linea = lectura.readLine()) != null) {
                System.out.println(linea);
            }
            lectura.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void escribirArchivo(String rutaArchivo, String datos) {
        try {
            FileWriter escritor = new FileWriter(rutaArchivo,true);
            BufferedWriter escritura = new BufferedWriter(escritor);
            escritura.write(datos);
            escritura.newLine();
            escritura.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
