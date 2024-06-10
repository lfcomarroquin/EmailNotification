import Bicicleta.Partes;
import Persona.User;

public class Main {
    public static void main(String[] args) {

        User user = new User("Castaño","Luis",36);
        int edad = user.getEdad();
        Partes partes = new Partes("Shimano","BP50","Azul",1500);
        System.out.println("Marca: " + partes.getMarca());
        System.out.println("Modelo: " + partes.getModelo());
        System.out.println("Color: " + partes.getColor());
        System.out.println("Precio: " + partes.getPrecio());
        //user.setEdad(35);
        //System.out.println(user.getEdad());
    }
}