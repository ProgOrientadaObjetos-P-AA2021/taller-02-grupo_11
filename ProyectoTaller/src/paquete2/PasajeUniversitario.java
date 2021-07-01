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
public class PasajeUniversitario extends PasajeInterCantonal {

    String nomUni;

    public PasajeUniversitario(String nombre, String cedula, String origen, 
            String destino, double numKmD, double tarifaB, String nomUni) {
        super(nombre, cedula, origen, destino, numKmD, tarifaB);
        this.nomUni = nomUni;
    }

    public String getNombreunivercidad() {
        return nomUni;
    }

    public void setNombreUnivercidad(String nomUni) {
        this.nomUni = nomUni;
    }

    @Override
    public void setValorP() {
        valorP = (tarifaB / 2);
    }

    public double getValorP() {
        return valorP;
    }
}
