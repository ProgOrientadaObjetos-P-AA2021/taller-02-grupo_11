/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class PasajeTerceraEdad extends PasajeInterCantonal {

    public PasajeTerceraEdad(String nombre, String cedula, String origen,
            String destino, double numKmD, double tarifaB) {
        super(nombre, cedula, origen, destino, numKmD, tarifaB);

    }

    @Override
    public void setValorP() {
        valorP = (numKmD * 0.5) + (tarifaB/2);
    }
     @Override
    public double getValorP (){
        return valorP; 
    }
      @Override
    public String toString() {
        String cadena = String.format(">>> TRANSPORTE TERCERA DE EDAD <<<<: \n"
                + ">>> Nombre del pasajero: %s\n"
                + ">>> Cédula de identidad: %s\n"
                + ">>> Su lugar de Origen es: %s\n"
                + ">>> Destino con rumbo a: %s\n"
                + ">>> Número de distancia: %.2f\n"
                + ">>> La tarifa base es: %.2f\n"
                + ">>> Valor del pasaje: %.2f\n", 
                getNombre(),getCedula(),getOrigen(),
                getDestino(),getNumKmD(),getTarifaB(),
                getValorP()); 
        return cadena;
    }
}
