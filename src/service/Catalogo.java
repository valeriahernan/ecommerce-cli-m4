package service;

import model.Producto;
import java.util.*;

public class Catalogo {
    private Map<Integer, Producto> productos = new HashMap<>();

    public void agregarProducto(Producto p){
        productos.put(p.getId(), p);
    }

    public Producto buscar(int id){
        return productos.get(id);
    }

    public List<Producto> listar(){
        return new ArrayList<>(productos.values());
    }

    public void eliminar(int id){
        productos.remove(id);
    }
}