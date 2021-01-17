/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.MatriculaDB;
import Entidad.Matricula;

/**
 *
 * @author PC02
 */
public class MatriculaL {
    
    MatriculaDB objmatriculaDB=new MatriculaDB();
    public boolean graba_Matricula(Matricula matricula){
        return objmatriculaDB.graba_Matricula(matricula);
    }
    
    public Matricula busca_Matricula(String matricula){
        return objmatriculaDB.busca_Matricula(matricula);
    }
    public Matricula bussca_Matricula(String dni){
        return objmatriculaDB.bussca_Matricula(dni);
    }
    public boolean edita_Matricula(Matricula matricula){
        return objmatriculaDB.edita_Matricula(matricula);
    }
}
