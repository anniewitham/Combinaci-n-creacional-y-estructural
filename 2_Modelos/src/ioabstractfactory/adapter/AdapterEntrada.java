/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ioabstractfactory.adapter;

import ioabstractfactory.productos.Entrada;

public class AdapterEntrada {
    private final Entrada entrada;

    public AdapterEntrada(Entrada entrada) {
        this.entrada = entrada;
    }

    public int getInt(String mensaje) {
        return Integer.parseInt(entrada.ingresarDatos(mensaje));
    }

    public double getDouble(String mensaje) {
        return Double.parseDouble(entrada.ingresarDatos(mensaje));
    }

    public boolean getBoolean(String mensaje) {
        return Boolean.parseBoolean(entrada.ingresarDatos(mensaje));
    }

    public String getString(String mensaje) {
        return entrada.ingresarDatos(mensaje);
    }
}
