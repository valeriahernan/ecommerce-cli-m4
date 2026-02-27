import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import model.*;

public class CarritoTest {
    @Test
    void totalCarrito() throws Exception {
        Carrito c = new Carrito();
        Producto p = new Producto(1,"Mouse","Tec",10000);
        c.agregarProducto(p,2);
        assertEquals(20000,c.calcularTotalBase());
    }
}