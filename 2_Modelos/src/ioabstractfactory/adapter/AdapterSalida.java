/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ioabstractfactory.adapter;

import ioabstractfactory.productos.Salida;

public class AdapterSalida {
    private final Salida salida;

    public AdapterSalida(Salida salida) {
        this.salida = salida;
    }

    public void mostrar(Object obj) {
        salida.mostrarDatos(String.valueOf(obj));
    }
}
