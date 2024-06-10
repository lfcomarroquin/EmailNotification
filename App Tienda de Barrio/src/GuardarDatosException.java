public class GuardarDatosException extends Exception{
    public GuardarDatosException(){
        super("Error al guardar los datos, intenta de nuevo más tarde o contacte al administrador");
    }
}