package model;

import java.util.*;

public class Orden {
    private List<ItemCarrito> items;
    private double totalFinal;

    public Orden(List<ItemCarrito> items, double totalFinal){
        this.items = new ArrayList<>(items);
        this.totalFinal = totalFinal;
    }

    public double getTotalFinal(){
        return totalFinal;
    }
}