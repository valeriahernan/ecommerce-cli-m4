package model;

public class Producto {
    private int id;
    private String nombre;
    private String categoria;
    private double precio;

    public Producto(int id, String nombre, String categoria, double precio) {
        if(precio <= 0) throw new IllegalArgumentException("Precio inválido");
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getCategoria() { return categoria; }
    public double getPrecio() { return precio; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public void setPrecio(double precio) { this.precio = precio; }
}