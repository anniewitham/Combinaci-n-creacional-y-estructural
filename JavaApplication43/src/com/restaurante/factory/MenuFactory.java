package com.restaurante.factory;


import com.restaurante.product.*;
import com.restaurante.menu.Menu;

/**
 *
 * @author Personal
 */
public interface MenuFactory {
Entrada crearEntrada();
PlatoPrincipal crearPlatoPrincipal();
Bebida crearBebida();
Postre crearPostre();


// Factory Method: crea un objeto Menu (ensambla los productos)
Menu crearMenu();
}