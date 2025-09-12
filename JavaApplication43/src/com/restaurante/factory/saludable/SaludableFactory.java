package com.restaurante.factory.saludable;

import com.restaurante.factory.MenuFactory;
import com.restaurante.menu.Menu;
import com.restaurante.product.*;

public class SaludableFactory implements MenuFactory {

    @Override
    public Entrada crearEntrada() {
        return new EntradaSaludable();
    }

    @Override
    public PlatoPrincipal crearPlatoPrincipal() {
        return new PlatoPrincipalSaludable();
    }

    @Override
    public Bebida crearBebida() {
        return new BebidaSaludable();
    }

    @Override
    public Postre crearPostre() {
        return new PostreSaludable();
    }

    @Override
    public Menu crearMenu() {
        Menu menu = new Menu("Saludable");
        menu.setEntrada(crearEntrada());
        menu.setPlatoPrincipal(crearPlatoPrincipal());
        menu.setBebida(crearBebida());
        menu.setPostre(crearPostre());
        return menu;
    }
}
