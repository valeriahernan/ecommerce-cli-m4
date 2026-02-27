package exception;

public class CantidadInvalidaException extends Exception {
    public CantidadInvalidaException(){
        super("Cantidad debe ser mayor a 0");
    }
}