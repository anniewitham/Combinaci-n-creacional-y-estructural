/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restaurante.factory.gourmet;

import com.restaurante.product.Postre;

public class PostreGourmet implements Postre {

    @Override
    public String getNombre() {
        return "Coulant de chocolate";
    }

    @Override
    public String descripcion() {
        return "Coulant tibio con helado de vainilla.";
    }
}
