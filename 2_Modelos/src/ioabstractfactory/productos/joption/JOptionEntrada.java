/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ioabstractfactory.productos.joption;

import ioabstractfactory.productos.Entrada;
import javax.swing.JOptionPane;

public class JOptionEntrada implements Entrada {
    @Override
    public String ingresarDatos(String mensaje) {
        return JOptionPane.showInputDialog(mensaje);
    }
}
