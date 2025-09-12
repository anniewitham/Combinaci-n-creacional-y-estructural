package com.restaurante.factory.vegetariano;

import com.restaurante.product.Bebida;

public class BebidaVegetariana implements Bebida {

    @Override
    public String getNombre() {
        return "Limonada natural";
    }

    @Override
    public String descripcion() {
        return "Limonada casera con menta.";
    }
}
