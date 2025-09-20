/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ioabstractfactory.factory;

import ioabstractfactory.productos.Entrada;
import ioabstractfactory.productos.Salida;

public interface IOFactory {
    Entrada crearEntrada();
    Salida crearSalida();
}
