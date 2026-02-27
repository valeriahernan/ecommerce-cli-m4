package descuento;

import model.Carrito;

public interface Descuento {
    double aplicar(Carrito carrito);
    String getDescripcion();
}