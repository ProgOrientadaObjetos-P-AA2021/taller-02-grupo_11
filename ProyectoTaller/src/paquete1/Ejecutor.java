/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;
import paquete2.*;
import paquete3.*;

public class Ejecutor {

    public static void main(String[] args) {

        
           String nombreArchivo = "pasajes.data";
        ArrayList<PasajeInterCantonal> pasajes = new ArrayList<>();

        PasajeNormal pN = new PasajeNormal("Maicol", "1548888555",
                "Colinas lojanas", "Terminal", 3, 4);
        PasajeTerceraEdad pT = new PasajeTerceraEdad("Gerald", "1150454455",
                "Zamora Huaico", "Sauces", 2.5, 3);
        
        PasajeMenorEdad pM = new PasajeMenorEdad("Kevin", "154578558",
                "Daniel Alvares", "Motupe", 1.5, 4);
        
        pasajes.add(pN);
        pasajes.add(pT);
        pasajes.add(pM);

        EscrituraArchivoSecuencial archivo = new EscrituraArchivoSecuencial(
                nombreArchivo);
        
        for (int i = 0; i < pasajes.size(); i++) {
            pasajes.get(i).setValorP();
            // establecer el valor del atributo registro
            archivo.establecerRegistro(pasajes.get(i));
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }

        archivo.cerrarArchivo();

        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(
                nombreArchivo);
        lectura.establecerListaPasajes();
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }
}
/**/