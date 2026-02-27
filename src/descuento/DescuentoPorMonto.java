package descuento;

import model.Carrito;

public class DescuentoPorMonto implements Descuento {
    private double minimo;
    private double porcentaje;

    public DescuentoPorMonto(double minimo, double porcentaje){
        this.minimo = minimo;
        this.porcentaje = porcentaje;
    }

    @Override
    public double aplicar(Carrito carrito){
        double total = carrito.calcularTotalBase();
        if(total >= minimo) return total * porcentaje;
        return 0;
    }

    public String getDescripcion(){
        return porcentaje*100 + "% sobre compras mayores a " + minimo;
    }
}