package Logica;

import Datos.AlumnoDB;
import Entidad.Alumno;

public class AlumnoL {

    AlumnoDB objalumnoDB = new AlumnoDB();

    public boolean graba_Alumno(Alumno alumno) {
        return objalumnoDB.graba_Alumno(alumno);
    }

    public boolean edita_Alumno(Alumno alumno) {
        return objalumnoDB.edita_Alumno(alumno);
    }

    public Alumno busca_Alumno(String dni) {
        return objalumnoDB.busca_Alumno(dni);
    }
    public Alumno bussca_Alumno(String dni) {
        return objalumnoDB.bussca_Alumno(dni);
    }
    public boolean busssca_Alumno(String dni) {
        return objalumnoDB.busssca_Alumno(dni);
    }
}
