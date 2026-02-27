package model;

import exception.CantidadInvalidaException;

public class ItemCarrito {
    private Producto producto;
    private int cantidad;

    public ItemCarrito(Producto producto, int cantidad) throws CantidadInvalidaException {
        if(cantidad <= 0) throw new CantidadInvalidaException();
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto(){ return producto; }
    public int getCantidad(){ return cantidad; }

    public double getSubtotal(){
        return producto.getPrecio() * cantidad;
    }
}