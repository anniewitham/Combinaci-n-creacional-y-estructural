/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ioabstractfactory.productos.web;

import ioabstractfactory.productos.Entrada;

public class WebEntrada implements Entrada {
    @Override
    public String ingresarDatos(String mensaje) {
        // Simulación de entrada desde un formulario web
        System.out.println("[WEB] Simulación de entrada: " + mensaje);
        return "SimuladoWebInput";
    }
}

