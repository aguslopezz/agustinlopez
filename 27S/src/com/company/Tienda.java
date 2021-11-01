package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class Tienda {
    public HashMap<Producto, Integer> productosVendidos;
    public HashSet<Producto> productos;

    public Tienda() {
        this.productosVendidos = new HashMap<Producto, Integer>();
        this.productos = new HashSet<>();
    }

    public void registroVentas(Producto p, Integer cantidad) {
        p.stock = -cantidad;
        if (productosVendidos.containsKey(p)) {
            Integer cantidadActualizada = productosVendidos.get(p) + cantidad;
            productosVendidos.replace(p, cantidadActualizada);
        }
    }

    public HashSet masDe5() {
        HashSet<Producto> prodMasDe5 = new HashSet<>();
        for (Producto p : productosVendidos.keySet()) {
            if (productosVendidos.get(p) < 5) {
                prodMasDe5.add(p);
            }

        }
        return prodMasDe5;
    }

    public HashSet productosVendidos() {
        HashSet<String> nombreVendidos = new HashSet<>();
        for (Producto p : productosVendidos.keySet()) {
            nombreVendidos.add(p.getNombre());
        }
        return nombreVendidos;
    }
}
