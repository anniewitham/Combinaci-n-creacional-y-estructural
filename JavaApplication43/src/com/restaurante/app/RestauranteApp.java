package com.restaurante.app;

import com.restaurante.factory.MenuFactory;
import com.restaurante.factory.gourmet.GourmetFactory;
import com.restaurante.factory.saludable.SaludableFactory;
import com.restaurante.factory.vegetariano.VegetarianoFactory;
import com.restaurante.menu.Menu;
import com.restaurante.product.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RestauranteApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a Pepitos & pepitas");

        List<String> pedidoMesa = new ArrayList<>();

        boolean continuarMesa = true;
        while (continuarMesa) {
            System.out.println("Elija tipo de menu: 1) Vegetariano  2) Gourmet  3) Saludable  9) Finalizar mesa  0) Salir");
            String opt = sc.nextLine().trim();

            if (opt.equals("0")) {
                System.out.println("Que vuelva");
                break;
            }
            if (opt.equals("9")) {
                continuarMesa = false;
                continue;
            }

            MenuFactory factory = null;
            switch (opt) {
                case "1":
                    factory = new VegetarianoFactory();
                    break;
                case "2":
                    factory = new GourmetFactory();
                    break;
                case "3":
                    factory = new SaludableFactory();
                    break;
                default:
                    System.out.println("Opcion invlida. Intente otra vez.");
                    continue;
            }

            // Creamos menú base con el tipo elegido
            Menu menu = new Menu(factory.getClass().getSimpleName().replace("Factory", ""));

            List<String> seleccionCliente = new ArrayList<>();
            boolean continuarSeleccion = true;

            while (continuarSeleccion) {
                System.out.println("Seleccione: 1) Entrada 2) Plato principal 3) Bebida 4) Postre 0) Finalizar pedido de este cliente");
                String sel = sc.nextLine().trim();
                switch (sel) {
                    case "1":
                        Entrada e = factory.crearEntrada();
                        menu.setEntrada(e);
                        seleccionCliente.add("Entrada: " + e.getNombre());
                        System.out.println("Has pedido la entrada: " + e.getNombre() + "\nDescripcion del plato: "+ e.descripcion()+"\n");
                        break;
                    case "2":
                        PlatoPrincipal p = factory.crearPlatoPrincipal();
                        menu.setPlatoPrincipal(p);
                        seleccionCliente.add("Plato principal: " + p.getNombre());
                        System.out.println("Has pedido el plato principal: " + p.getNombre()+ "\nDescripcion del plato: "+ p.descripcion()+"\n");
                        break;
                    case "3":
                        Bebida b = factory.crearBebida();
                        menu.setBebida(b);
                        seleccionCliente.add("Bebida: " + b.getNombre());
                        System.out.println("Has pedido la bebida: " + b.getNombre()+ "\nDescripcion del plato: "+ b.descripcion()+"\n");
                        break;
                    case "4":
                        Postre po = factory.crearPostre();
                        menu.setPostre(po);
                        seleccionCliente.add("Postre: " + po.getNombre());
                        System.out.println("Has pedido el postre: " + po.getNombre()+ "\nDescripcion del plato: "+ po.descripcion()+"\n");
                        break;
                    case "0":
                        continuarSeleccion = false;
                        break;
                    default:
                        System.out.println("Opcion no valida.");
                }
            }
            System.out.println("\n=== Resumen de menu personalizado del cliente ===");
            if (seleccionCliente.isEmpty()) {
                System.out.println("No selecciono ningun producto.");
            } else {
                for (String item : seleccionCliente) {
                    System.out.println(item);
                    pedidoMesa.add(item);
                }
            }
            System.out.println("===============================================\n");
        }

        // Mostrar resumen final de toda la mesa
        System.out.println("\n===== Resumen final del pedido de la mesa =====");
        if (pedidoMesa.isEmpty()) {
            System.out.println("La mesa no realizo ningún pedido.");
        } else {
            for (String item : pedidoMesa) {
                System.out.println(item);
            }
        }
        System.out.println("===============================================");

        sc.close();
    }
}
