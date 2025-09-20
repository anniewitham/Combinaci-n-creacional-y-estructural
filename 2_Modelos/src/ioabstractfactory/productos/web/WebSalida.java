/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ioabstractfactory.productos.web;

import ioabstractfactory.productos.Salida;

public class WebSalida implements Salida {
    @Override
    public void mostrarDatos(String data) {
        System.out.println("[WEB] Simulación de salida -> " + data);
    }
}
