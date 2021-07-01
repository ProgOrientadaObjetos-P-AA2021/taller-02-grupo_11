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
public class PasajeNormal extends PasajeInterCantonal 
        implements Serializable{
    double porcentAd;

    public PasajeNormal(String nombre, String cedula, String origen, 
            String destino, double numKmD, double tarifaB) {
        super(nombre, cedula, origen, destino, numKmD, tarifaB);
        porcentAd = 0.3;
    }

    public double getPorcentAd() {
        return porcentAd;
    }

    public void setPorcentAd(double porcentAd) {
        this.porcentAd = porcentAd;
    }

    @Override
    public void setValorP() {
        valorP = (numKmD * 0.15) + (tarifaB + (tarifaB *(porcentAd/100)));
    }
    public double getValorP (){
        return valorP; 
    }
    
}
