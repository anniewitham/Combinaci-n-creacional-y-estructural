package com.restaurante.factory.vegetariano;

import com.restaurante.product.Entrada;

public class EntradaVegetariana implements Entrada {

    @Override
    public String getNombre() {
        return "Ensalada de quinoa";
    }

    @Override
    public String descripcion() {
        return "Ensalada tibia de quinoa, tomate cherry y aguacate.";
    }
}
