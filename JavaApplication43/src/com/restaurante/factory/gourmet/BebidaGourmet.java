/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restaurante.factory.gourmet;

import com.restaurante.product.Bebida;

public class BebidaGourmet implements Bebida {

    @Override
    public String getNombre() {
        return "Copa de vino tinto reserva";
    }

    @Override
    public String descripcion() {
        return "Vino tinto seleccionado, 2018.";
    }
}
