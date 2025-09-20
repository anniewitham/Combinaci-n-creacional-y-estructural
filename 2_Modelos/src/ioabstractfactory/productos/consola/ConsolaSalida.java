/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ioabstractfactory.productos.consola;

import ioabstractfactory.productos.Salida;

public class ConsolaSalida implements Salida {
    @Override
    public void mostrarDatos(String data) {
        System.out.println("Salida Consola -> " + data);
    }
}

