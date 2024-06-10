public class CargaDatosException extends Exception{
    public CargaDatosException(){
        super("Error al cargar los datos. Intenta de nuevo más tarde");
    }
}