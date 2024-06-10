public class Main {
    public static void main(String[] args) {
        Productos producto1 = new Productos("Laptop ROG Strix Scar", "Laptop Gamer de alto rendimiento", "Electronica", "Portatil,Computadora", 12000, "https://www.pacifiko.com/pid/NTIwM2IzMj");
        Productos producto2 = new Productos("Laptop ROG Strix G15", "Laptop Gamer de alto rendimiento", "Electronica", "Portatil,Computadora", 9770,"https://www.pacifiko.com/pid/YzY5MmU0Mj");

        producto1.mostrarDetalles();
        producto2.mostrarDetalles();
    }
}
