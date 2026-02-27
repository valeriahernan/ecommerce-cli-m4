package model;

import java.util.*;
import exception.CantidadInvalidaException;

public class Carrito {
    private List<ItemCarrito> items = new ArrayList<>();

    public void agregarProducto(Producto p, int cantidad) throws CantidadInvalidaException {
        items.add(new ItemCarrito(p, cantidad));
    }

    public double calcularTotalBase(){
        return items.stream().mapToDouble(ItemCarrito::getSubtotal).sum();
    }

    public boolean estaVacio(){
        return items.isEmpty();
    }

    public void vaciar(){
        items.clear();
    }

    public List<ItemCarrito> getItems(){
        return items;
    }
}