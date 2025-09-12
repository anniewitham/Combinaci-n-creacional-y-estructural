/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restaurante.factory.gourmet;

import com.restaurante.product.PlatoPrincipal;

public class PlatoPrincipalGourmet implements PlatoPrincipal {

    @Override
    public String getNombre() {
        return "Solomillo con reduccion de vino";
    }

    @Override
    public String descripcion() {
        return "Solomillo de ternera, pure trufado y reduccion de vino tinto.";
    }
}
