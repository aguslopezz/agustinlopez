package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoPerecederoTest {

    @Test
    void calcularPrecio15Dias() {
        ProductoPerecedero productoPerecedero = new ProductoPerecedero("Queso", "Argentina", 2, 40, 15, 3);
        boolean resultado = false;
        if(productoPerecedero.calcularPrecioFinal() == 40){
            resultado = true;
        }
        assertTrue(resultado = true);

    }
    @Test
    void calcularPrecio120Dias() {
        ProductoPerecedero productoPerecedero = new ProductoPerecedero("Queso", "Argentina", 2, 40, 120, 3);
        boolean resultado = false;
        if (productoPerecedero.calcularPrecioFinal() == 46) {
            resultado = true;
        }
        assertTrue(resultado = true);
    }
}