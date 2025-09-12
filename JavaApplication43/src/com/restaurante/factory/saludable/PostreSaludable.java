/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restaurante.factory.saludable;

import com.restaurante.product.Postre;

public class PostreSaludable implements Postre {

    @Override
    public String getNombre() {
        return "Yogur con frutos rojos";
    }

    @Override
    public String descripcion() {
        return "Yogur natural con mezcla de frutos rojos y semillas.";
    }
}
