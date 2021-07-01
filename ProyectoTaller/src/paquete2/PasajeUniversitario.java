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
public class PasajeUniversitario extends PasajeInterCantonal  
        implements Serializable {

    String nomUni;

    public PasajeUniversitario(String nombre, String cedula, String origen, 
            String destino, double numKmD, double tarifaB, String nomUni) {
        super(nombre, cedula, origen, destino, numKmD, tarifaB);
        this.nomUni = nomUni;
    }

    public String getNombreuniversidad() {
        return nomUni;
    }

    public void setNombreUniversidad(String nomUni) {
        this.nomUni = nomUni;
    }

    @Override
    public void setValorP() {
        valorP = (tarifaB / 2);
    }

    public double getValorP() {
        return valorP;
    }
      public String toString() {
        String cadena = String.format("%s\n>>>> TRANSPORTE UNIVERSITARIO <<<<<<:"
                + " \n"
                + ">>> Nombre del Pasajero: %s\n"
                + ">>> Cédula: %s\n"
                + ">>> Origen: %s\n"
                + ">>> Destino: %s\n"
                + ">>> El número de distancia es: %.2f\n"
                + ">>> Tarifa base: %.2f\n"
                + ">>> Valor Base: %.2f\n"
                + ">>> Nombre de la Universidad: %.2f\n" ,super.toString(), 
                getNombre(),getCedula(),getOrigen(),
                getDestino(),getNumKmD(),getTarifaB(),
                getValorP(), getNombreuniversidad()); 
        return cadena;
    }
}
