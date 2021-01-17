/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.ApoderadoDB;
import Entidad.Apoderado;

/**
 *
 * @author Percca
 */
public class ApoderadoL {
    
    ApoderadoDB objapoderadoDB = new ApoderadoDB();

    public boolean graba_Apoderado(Apoderado apoderado) {
        return objapoderadoDB.graba_Apoderado(apoderado);
    }

    public boolean edita_Apoderado(Apoderado apoderado) {
        return objapoderadoDB.edita_Apoderado(apoderado);
    }
    public Apoderado busca_Apoderado(String dni){
        return objapoderadoDB.busca_Apoderado(dni);
    }
}
