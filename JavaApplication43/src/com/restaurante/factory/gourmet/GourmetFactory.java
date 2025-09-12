/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restaurante.factory.gourmet;

import com.restaurante.factory.MenuFactory;
import com.restaurante.menu.Menu;
import com.restaurante.product.*;

public class GourmetFactory implements MenuFactory {

    @Override
    public Entrada crearEntrada() {
        return new EntradaGourmet();
    }

    @Override
    public PlatoPrincipal crearPlatoPrincipal() {
        return new PlatoPrincipalGourmet();
    }

    @Override
    public Bebida crearBebida() {
        return new BebidaGourmet();
    }

    @Override
    public Postre crearPostre() {
        return new PostreGourmet();
    }

    @Override
    public Menu crearMenu() {
        Menu menu = new Menu("Gourmet");
        menu.setEntrada(crearEntrada());
        menu.setPlatoPrincipal(crearPlatoPrincipal());
        menu.setBebida(crearBebida());
        menu.setPostre(crearPostre());
        return menu;
    }
}
