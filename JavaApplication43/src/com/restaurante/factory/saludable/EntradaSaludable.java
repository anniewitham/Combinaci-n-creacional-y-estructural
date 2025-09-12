/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restaurante.factory.saludable;

import com.restaurante.product.Entrada;

public class EntradaSaludable implements Entrada {

    @Override
    public String getNombre() {
        return "Sopa de verduras ligera";
    }

    @Override
    public String descripcion() {
        return "Sopa baja en sal con caldo de verduras frescas.";
    }
}
