import java.io.*;
import java.util.Scanner;

public class FileManager {

    //Excepcion personalizada para cuando un archivo no se encuentra
    static class ArchivoNoEncontradoException extends Exception {

        //Constructor con mensaje predeterminado
        public ArchivoNoEncontradoException() {
            super("El archivo solicitado no existe o no fue encontrado");
        }

        //Constructor que acepta un mensaje personalizado
        public ArchivoNoEncontradoException(String mensaje) {
            super(mensaje);
        }
    }

    //Excepcion personalizada para cuando un archivo ya existe
    static class ArchivoYaExisteException extends Exception {

        //Constructor con mensaje predeterminado
        public ArchivoYaExisteException() {
            super("El archivo ya existe, accediendo a él...");
        }

        //Constructor que acepta un mensaje personalizado
        ArchivoYaExisteException(String mensaje) {
            super(mensaje);
        }
    }

    //Excepcion personalizada para cuando un archivo sea creado porque no existia
    static class ArchivoCreadoException extends Exception {

        //Constructor con mensaje predeterminado
        public ArchivoCreadoException() {
            super("Archivo creado exitosamente");
        }

        //Constructor que acepta un mensaje personalizado
        ArchivoCreadoException(String mensaje) {
            super(mensaje);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del archivo");
        String nombreArchivo = scanner.nextLine();

        try {
            verificarArchivo(nombreArchivo);
            //Si el archivo ya existe, lanza la excepcion ArchivoYaExiste
            try {
                throw new ArchivoYaExisteException();
            } catch (ArchivoYaExisteException e) {
                System.out.println(e.getMessage());
            }
        } catch (ArchivoNoEncontradoException e) {
            System.out.println(e.getMessage());
            //Si el archivo no existe, intentara crearlo
            try {
                crearArchivo(nombreArchivo);
                //Si el archivo es creado exitosamente, lanza la excepcion ArchivoCreadoException
                try {
                    throw new ArchivoCreadoException();
                } catch (ArchivoCreadoException ex) {
                    System.out.println(ex.getMessage());
                }
            } catch (IOException ex) {
                System.out.println("Ocurrio un error al crear el archivo: " + ex.getMessage());
                ex.printStackTrace();
            }
        }

        boolean continuar = true;
        while (continuar) {
            System.out.println("Elija una opcion");
            System.out.println("1. Agregar nuevas lineas al archivo");
            System.out.println("2. Mostrar el contenido del archivo");
            System.out.println("3. Mostrar una linea especifica del archivo");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine(); //Limpia el buffer del scanner

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la linea de texto a agregar: ");
                    String linea = scanner.nextLine();
                    agregarLinea(nombreArchivo, linea);
                    break;
                case 2:
                    leerArchivo(nombreArchivo);
                    break;
                case 3:
                    System.out.println("Ingrese la linea a mostrar: ");
                    int numeroLinea = scanner.nextInt();
                    scanner.nextLine();
                    leerLineaEspecifica(nombreArchivo, numeroLinea);
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo");
                    break;
            }
        }
        scanner.close();
    }

    // Método para verificar la existencia de un archivo
    public static void verificarArchivo(String rutaArchivo) throws ArchivoNoEncontradoException {
        File archivo = new File(rutaArchivo);
        if (!archivo.exists()) {
            throw new ArchivoNoEncontradoException();
        }
    }

    //Metodo para crear un archivo
    public static void crearArchivo(String rutaArchivo) throws IOException {
        File archivo = new File(rutaArchivo);
        if (!archivo.exists()) {
            try{
                archivo.createNewFile();
            } catch (IOException ex){
                System.out.println("Ocurrio un error al crear el archivo: " + ex.getMessage());
                ex.printStackTrace();
            }
        } else {
            //Si el archivo ya existe, no hace nada para que luego se lance la excepcion ArchivoYaExiste
        }
    }

    //Metodo para agregar una nueva linea de texto a un archivo existente
    static void agregarLinea(String rutaArchivo, String linea) {
        try {
            FileWriter escritor = new FileWriter(rutaArchivo, true);
            BufferedWriter buffer = new BufferedWriter(escritor);
            buffer.write(linea);
            buffer.newLine();
            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Metodo para leer y mostrar el contenido de un archivo
    static void leerArchivo(String rutaArchivo) {
        try {
            FileReader lector = new FileReader(rutaArchivo);
            BufferedReader buffer = new BufferedReader(lector);
            String linea;
            while ((linea = buffer.readLine()) != null) {
                System.out.println(linea);
            }
            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Metodo para leer y mostrar una linea especifica de un archivo
    static void leerLineaEspecifica(String rutaArchivo, int numeroLinea) {
        try {
            FileReader lector = new FileReader(rutaArchivo);
            BufferedReader buffer = new BufferedReader(lector);
            int contador = 0;
            String linea;
            while ((linea = buffer.readLine()) != null) {
                if (contador == numeroLinea) {
                    System.out.println(linea);
                    break;
                }
            }
            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}