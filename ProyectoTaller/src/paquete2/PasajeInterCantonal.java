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
public abstract class PasajeInterCantonal implements Serializable{
    String nombre;
    String cedula;
    String origen;
    String destino;
    double numKmD;
    double tarifaB;
    double valorP;  

    public PasajeInterCantonal(String nombre, String cedula, String origen, 
            String destino, double numKmD, double tarifaB) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.origen = origen;
        this.destino = destino;
        this.numKmD = numKmD;
        this.tarifaB = tarifaB;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getNumKmD() {
        return numKmD;
    }

    public void setNumKmD(double numKmD) {
        this.numKmD = numKmD;
    }

    public double getTarifaB() {
        return tarifaB;
    }

    public void setTarifaB(double tarifaB) {
        this.tarifaB = tarifaB;
    }

    public double getValorP() {
        return valorP;
    }

    public abstract void setValorP();
    
  
    
    
    @Override
    public String toString(){ 
        return String.format("Pasaje.");
    } 
}
