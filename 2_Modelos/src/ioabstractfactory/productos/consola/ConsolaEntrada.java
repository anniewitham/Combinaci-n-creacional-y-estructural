/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ioabstractfactory.productos.consola;

import ioabstractfactory.productos.Entrada;
import java.util.Scanner;

public class ConsolaEntrada implements Entrada {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String ingresarDatos(String mensaje) {
        System.out.print(mensaje + ": ");
        return scanner.nextLine();
    }
}
