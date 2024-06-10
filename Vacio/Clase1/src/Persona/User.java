package Persona;

public class User {

    final private String colorCabello;
    final private String nombre;
    private int edad; //Quitando la palabra "final" podemos modificar la variable cuantas veces querramos

    public User(String colorCabello, String nombre, int edad) {
        this.colorCabello = colorCabello;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getColorCabello() {
        return colorCabello;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad(){
        return edad;

    }

    public void setEdad(int edad){
        this.edad = edad;
    }

}