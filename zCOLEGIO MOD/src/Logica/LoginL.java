/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.LoginDB;
import Entidad.Login;

/**
 *
 * @author Gemelas
 */
public class LoginL {
    
    
    LoginDB objloginDB=new LoginDB();
    public boolean graba_usuario (Login login){
        return objloginDB.graba_usuario(login);
    }
    public boolean busca_Login (String Usuario, String Contraseña){
        return objloginDB.busca_Login(Usuario, Contraseña);
    }
    
}
