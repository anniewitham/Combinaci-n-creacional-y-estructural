/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restaurante.factory.saludable;

import com.restaurante.product.Bebida;

public class BebidaSaludable implements Bebida {

    @Override
    public String getNombre() {
        return "Agua infusionada";
    }

    @Override
    public String descripcion() {
        return "Agua con rodajas de pepino y limon.";
    }
}
