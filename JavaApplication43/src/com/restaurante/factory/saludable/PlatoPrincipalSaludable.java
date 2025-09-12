/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restaurante.factory.saludable;

import com.restaurante.product.PlatoPrincipal;

public class PlatoPrincipalSaludable implements PlatoPrincipal {

    @Override
    public String getNombre() {
        return "Pechuga de pollo a la plancha";
    }

    @Override
    public String descripcion() {
        return "Pechuga de pollo, quinoa y vegetales al vapor.";
    }
}
