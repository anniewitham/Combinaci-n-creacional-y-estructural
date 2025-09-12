package com.restaurante.factory.gourmet;

import com.restaurante.product.Entrada;

public class EntradaGourmet implements Entrada {

    @Override
    public String getNombre() {
        return "Tartar de atun";
    }

    @Override
    public String descripcion() {
        return "Tartar de atun con emulsiun de soja con citricos.";
    }
}
