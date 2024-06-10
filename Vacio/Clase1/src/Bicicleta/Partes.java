package Bicicleta;

import java.io.Serializable;

public class Partes implements Bicicleta {
    //Atributos
    private String marca;
    private String modelo;
    private String color;
    private float precio;

    //Constructor
    public Partes(String marca, String modelo, String color, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }

    @Override
    public void mover() {
        System.out.println("mover");
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
