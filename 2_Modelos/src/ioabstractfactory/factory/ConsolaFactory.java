/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ioabstractfactory.factory;

import ioabstractfactory.productos.Entrada;
import ioabstractfactory.productos.Salida;
import ioabstractfactory.productos.consola.ConsolaEntrada;
import ioabstractfactory.productos.consola.ConsolaSalida;

public class ConsolaFactory implements IOFactory {
    @Override
    public Entrada crearEntrada() {
        return new ConsolaEntrada();
    }

    @Override
    public Salida crearSalida() {
        return new ConsolaSalida();
    }
}

