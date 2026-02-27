package descuento;

import model.Carrito;

public class DescuentoPorCategoria implements Descuento {
    private String categoria;
    private double porcentaje;

    public DescuentoPorCategoria(String categoria,double porcentaje){
        this.categoria = categoria;
        this.porcentaje = porcentaje;
    }

    @Override
    public double aplicar(Carrito carrito){
        boolean existe = carrito.getItems().stream()
            .anyMatch(i -> i.getProducto().getCategoria().equalsIgnoreCase(categoria));
        if(existe) return carrito.calcularTotalBase()*porcentaje;
        return 0;
    }

    public String getDescripcion(){
        return porcentaje*100 + "% si contiene categoría "+categoria;
    }
}