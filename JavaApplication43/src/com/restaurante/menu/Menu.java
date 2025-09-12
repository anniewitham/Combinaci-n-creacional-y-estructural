/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restaurante.menu;

import com.restaurante.product.*;

public class Menu {

    private final String tipo;
    private Entrada entrada;
    private PlatoPrincipal platoPrincipal;
    private Bebida bebida;
    private Postre postre;

    public Menu(String tipo) {
        this.tipo = tipo;
    }

    public void setEntrada(Entrada e) {
        this.entrada = e;
    }

    public void setPlatoPrincipal(PlatoPrincipal p) {
        this.platoPrincipal = p;
    }

    public void setBebida(Bebida b) {
        this.bebida = b;
    }

    public void setPostre(Postre p) {
        this.postre = p;
    }

    public String getTipo() {
        return tipo;
    }

// Métodos para mostrar componentes (si existen)
    public void mostrarEntrada() {
        if (entrada != null) {
            System.out.println("Entrada: " + entrada.getNombre() + " - " + entrada.descripcion());
        } else {
            System.out.println("Sin entrada seleccionada.");
        }
    }

    public void mostrarPlatoPrincipal() {
        if (platoPrincipal != null) {
            System.out.println("Plato principal: " + platoPrincipal.getNombre() + " - " + platoPrincipal.descripcion());
        } else {
            System.out.println("Sin plato principal seleccionado.");
        }
    }

    public void mostrarBebida() {
        if (bebida != null) {
            System.out.println("Bebida: " + bebida.getNombre() + " - " + bebida.descripcion());
        } else {
            System.out.println("Sin bebida seleccionada.");
        }
    }

    public void mostrarPostre() {
        if (postre != null) {
            System.out.println("Postre: " + postre.getNombre() + " - " + postre.descripcion());
        } else {
            System.out.println("Sin postre seleccionado.");
        }
    }

    public void mostrarMenuCompleto() {
        System.out.println("--- Menu " + tipo + " ---");
        mostrarEntrada();
        mostrarPlatoPrincipal();
        mostrarBebida();
        mostrarPostre();
        System.out.println("----------------------");
    }
}
