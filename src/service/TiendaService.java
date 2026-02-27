package service;

import model.*;
import descuento.*;
import java.util.*;

public class TiendaService {
    private Catalogo catalogo = new Catalogo();
    private Carrito carrito = new Carrito();
    private List<Descuento> descuentos = new ArrayList<>();

    public TiendaService(){
        descuentos.add(new DescuentoPorMonto(50000,0.10));
        descuentos.add(new DescuentoPorCategoria("Electronica",0.05));
    }

    public Catalogo getCatalogo(){ return catalogo; }
    public Carrito getCarrito(){ return carrito; }
    public List<Descuento> getDescuentos(){ return descuentos; }

    public Orden confirmarCompra(){
        if(carrito.estaVacio())
            throw new IllegalStateException("Carrito vacío");

        double totalBase = carrito.calcularTotalBase();
        double totalDescuentos = descuentos.stream()
            .mapToDouble(d -> d.aplicar(carrito)).sum();

        double totalFinal = totalBase - totalDescuentos;
        Orden orden = new Orden(carrito.getItems(), totalFinal);
        carrito.vaciar();
        return orden;
    }
}