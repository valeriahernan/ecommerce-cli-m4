import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import model.*;
import descuento.*;

public class DescuentoTest {

    @Test
    void descuentoPorMontoAplicado() throws Exception {
        Carrito c = new Carrito();
        Producto p = new Producto(1,"TV","Electronica",60000);
        c.agregarProducto(p,1);

        Descuento d = new DescuentoPorMonto(50000,0.1);

        assertTrue(d.aplicar(c) > 0);
    }
}