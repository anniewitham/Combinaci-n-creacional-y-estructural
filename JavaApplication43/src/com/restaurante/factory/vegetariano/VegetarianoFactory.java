package com.restaurante.factory.vegetariano;

import com.restaurante.factory.MenuFactory;
import com.restaurante.menu.Menu;
import com.restaurante.product.*;

public class VegetarianoFactory implements MenuFactory {

    @Override
    public Entrada crearEntrada() {
        return new EntradaVegetariana();
    }

    @Override
    public PlatoPrincipal crearPlatoPrincipal() {
        return new PlatoPrincipalVegetariano();
    }

    @Override
    public Bebida crearBebida() {
        return new BebidaVegetariana();
    }

    @Override
    public Postre crearPostre() {
        return new PostreVegetariano();
    }

// Factory Method: ensambla un Menu completo con componentes vegetarianos
    @Override
    public Menu crearMenu() {
        Menu menu = new Menu("Vegetariano");
        menu.setEntrada(crearEntrada());
        menu.setPlatoPrincipal(crearPlatoPrincipal());
        menu.setBebida(crearBebida());
        menu.setPostre(crearPostre());
        return menu;
    }
}
