package ioabstractfactory.cliente;

import ioabstractfactory.factory.IOFactory;
import ioabstractfactory.factory.ConsolaFactory;
import ioabstractfactory.factory.JOptionPaneFactory;
import ioabstractfactory.factory.WebFactory;
import ioabstractfactory.productos.Entrada;
import ioabstractfactory.productos.Salida;
import ioabstractfactory.adapter.AdapterEntrada;
import ioabstractfactory.adapter.AdapterSalida;

import java.util.Scanner;

public class AbstractFactoryIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== Seleccione el entorno de E/S ===");
            System.out.println("1. Consola");
            System.out.println("2. JOptionPane");
            System.out.println("3. Web");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            if (opcion == 4) {
                System.out.println("Saliendo del programa...");
                break;
            }

            IOFactory factory = null;
            switch (opcion) {
                case 1 -> factory = new ConsolaFactory();
                case 2 -> factory = new JOptionPaneFactory();
                case 3 -> factory = new WebFactory();
                default -> {
                    System.out.println("Opcion invalida. Intente de nuevo.");
                    continue;
                }
            }

            // Crear Entrada y Salida
            Entrada entrada = factory.crearEntrada();
            Salida salida = factory.crearSalida();

            // Adaptadores
            AdapterEntrada adapterEntrada = new AdapterEntrada(entrada);
            AdapterSalida adapterSalida = new AdapterSalida(salida);

            // === Pruebas ===
            String nombre = adapterEntrada.getString("Ingrese un nombre");
            int edad = adapterEntrada.getInt("Ingrese su edad");
            double altura = adapterEntrada.getDouble("Ingrese su altura en metros");

            adapterSalida.mostrar("Nombre: " + nombre);
            adapterSalida.mostrar("Edad: " + edad);
            adapterSalida.mostrar("Altura: " + altura);

        } while (true);

        sc.close();
    }
}
