

package ioabstractfactory.productos.joption;

import ioabstractfactory.productos.Salida;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JOptionSalida implements Salida {
    /*@Override
    public void mostrarDatos(String data) {
        /*Icono personalizado (debe estar en la carpeta del proyecto o ruta absoluta)
        ImageIcon icono = new ImageIcon("src/resources/icon.");

        // Mostrar todos los resultados en un solo cuadro
        JOptionPane.showMessageDialog(
                null,
                data,
                "Resultados",
                JOptionPane.INFORMATION_MESSAGE,
                icono
        );
    }*/

    @Override
    public void mostrarDatos(String data) {
        JOptionPane.showMessageDialog(null, "Salida JOptionPane -> " + data);
    }


}


