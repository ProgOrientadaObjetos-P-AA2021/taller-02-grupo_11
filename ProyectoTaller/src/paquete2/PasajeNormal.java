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
    public String toString() {
        String cadena = String.format("%s\n>>>> TRANSPORTE NORMAL <<<<<<: "
                + "\n"
                + ">>> Nombre del Pasajero: %s\n"
                + ">>> Cédula: %s\n"
                + ">>> Origen: %s\n"
                + ">>> Destino: %s\n"
                + ">>> El número de distancia es: %.2f\n"
                + ">>> Tarifa base: %.2f\n"
                + ">>> Valor Base: %.2f\n"
                + ">>> Porcentaje adicional: %.2f\n"
                + ">>> Valor Total: %.2f" ,super.toString(), 
                getNombre(),getCedula(),getOrigen(),
                getDestino(),getNumKmD(),getTarifaB(),
                getValorP(), getPorcentAd(), getValorP()); 
        return cadena;
    }
}
