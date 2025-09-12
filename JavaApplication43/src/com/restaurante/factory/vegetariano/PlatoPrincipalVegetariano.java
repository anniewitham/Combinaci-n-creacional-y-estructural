package com.restaurante.factory.vegetariano;

import com.restaurante.product.PlatoPrincipal;

public class PlatoPrincipalVegetariano implements PlatoPrincipal {

    @Override
    public String getNombre() {
        return "Lasaña de verduras";
    }

    @Override
    public String descripcion() {
        return "Lasaña con berenjena, calabacín y bechamel ligera.";
    }
}
