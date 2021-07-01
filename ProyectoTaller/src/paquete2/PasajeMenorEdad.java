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
public class PasajeMenorEdad extends PasajeInterCantonal 
        implements Serializable{
    
    double porcentDes;

    public PasajeMenorEdad(String nombre, String cedula, String origen, 
            String destino, double numKmD, double tarifaB) {
        super(nombre, cedula, origen, destino, numKmD, tarifaB);
        porcentDes = 0.5;
    }
    public double getPorcentDes() {
        return porcentDes;
    }

    public void setPorcentDes(double porcentDes) {
        this.porcentDes = porcentDes;
    }

    @Override
    public void setValorP() {
        valorP = (numKmD * 0.10) + (tarifaB - (tarifaB *(porcentDes/100)));
    }
    public double getValorP (){
        return valorP; 
    }
      public String toString() {
        String cadena = String.format(">>>> TRANSPORTE MENOR DE EDAD <<<<<<: \n"
                + ">>> Nombre del Pasajero: %s\n"
                + ">>> Cédula: %s\n"
                + ">>> Origen: %s\n"
                + ">>> Destino: %s\n"
                + ">>> El número de distancia es: %.2f\n"
                + ">>> Tarifa base: %.2f\n"
                + ">>> Valor Base: %.2f\n", 
                getNombre(),getCedula(),getOrigen(),
                getDestino(),getNumKmD(),getTarifaB(),
                getValorP()); 
        return cadena;
    }
  
}
