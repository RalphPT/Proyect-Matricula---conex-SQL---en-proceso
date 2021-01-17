
package Entidad;

public class Alumno {
    
    private int id_alumno;
    private String dni;
    private String nomb_alum;
    private String apell_pat;
    private String apell_mat;
    private String sexo;
    private String fecha_nac;
    private String direccion;
    private String estado;
    private int religion;

    public int getReligion() {
        return religion;
    }

    public void setReligion(int religion) {
        this.religion = religion;
    }

    

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNomb_alum() {
        return nomb_alum;
    }

    public void setNomb_alum(String nomb_alum) {
        this.nomb_alum = nomb_alum;
    }

    public String getApell_pat() {
        return apell_pat;
    }

    public void setApell_pat(String apell_pat) {
        this.apell_pat = apell_pat;
    }

    public String getApell_mat() {
        return apell_mat;
    }

    public void setApell_mat(String apell_mat) {
        this.apell_mat = apell_mat;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
