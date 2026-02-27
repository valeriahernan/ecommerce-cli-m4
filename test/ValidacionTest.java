import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import model.*;
import exception.CantidadInvalidaException;

public class ValidacionTest {

    @Test
    void cantidadInvalida() {
        assertThrows(CantidadInvalidaException.class, () -> {
            new ItemCarrito(new Producto(1,"Mouse","Tec",10000), 0);
        });
    }
}