/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ioabstractfactory.factory;

import ioabstractfactory.productos.Entrada;
import ioabstractfactory.productos.Salida;
import ioabstractfactory.productos.web.WebEntrada;
import ioabstractfactory.productos.web.WebSalida;

public class WebFactory implements IOFactory {
    @Override
    public Entrada crearEntrada() {
        return new WebEntrada();
    }

    @Override
    public Salida crearSalida() {
        return new WebSalida();
    }
}
