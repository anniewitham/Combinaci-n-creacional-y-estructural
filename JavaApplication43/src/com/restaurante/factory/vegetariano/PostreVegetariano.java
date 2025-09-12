package com.restaurante.factory.vegetariano;

import com.restaurante.product.Postre;

public class PostreVegetariano implements Postre {

    @Override
    public String getNombre() {
        return "Fruta asada con miel";
    }

    @Override
    public String descripcion() {
        return "Manzana y pera asadas con toque de miel.";
    }
}
