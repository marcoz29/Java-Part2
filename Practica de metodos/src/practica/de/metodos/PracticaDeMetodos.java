/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.de.metodos;

import javax.swing.JOptionPane;

/**
 *
 * @author Marco
 */
public class PracticaDeMetodos {

    static String[] placas = new String[4];
    static int placa;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Llenemos nuestro vector
        buscarProducto();

        //Llamar el metodo interaccion
        Interaccion();
    }

    private static void buscarProducto() {
        //Este metodo cargar el vector
        placas[0] = "1090";
        placas[1] = "2738";
        placas[2] = "HQ25";
        placas[3] = "MP90";
        System.out.print("Vectore cargado correctamente");
    }

    private static void Interaccion() {
        //Variables locales metodos
        String opcion = JOptionPane.showInputDialog("Ingrese un numero de placa");

        //Convertir la opcion a numero
        int busqueda = Integer.parseInt(opcion);

        //Llamo el metodo de buscar placa.
        String placaEncontrado = BuscarPlaca(busqueda);

        //Notificar al usuario la placa detectada
        JOptionPane.showConfirmDialog(null, "La placa encontrada es:" + placaEncontrado);

    }

    private static String BuscarPlaca(int busqueda) {
        //Variables locales del metodo
        int placaReal = busqueda - 1;
        String respuesta = placas[placaReal];
        return respuesta;
    }

}
