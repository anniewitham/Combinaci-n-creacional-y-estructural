/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ioabstractfactory.factory;

import ioabstractfactory.productos.Entrada;
import ioabstractfactory.productos.Salida;
import ioabstractfactory.productos.joption.JOptionEntrada;
import ioabstractfactory.productos.joption.JOptionSalida;

public class JOptionPaneFactory implements IOFactory {
    @Override
    public Entrada crearEntrada() {
        return new JOptionEntrada();
    }

    @Override
    public Salida crearSalida() {
        return new JOptionSalida();
    }
}
