/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;



/**
 *
 * @author User
 */
public class Tematica {
    //int NoTematica;
    String NombreDocente;
    String Ciudad;
    String NombreTematica;
    String DescripcionTematica;
    //int EstudiantesAsignados;
    String HoraFecha;
    int Materia;

    public Tematica(String NombreDocente, String Ciudad, String NombreTematica, String DescripcionTematica, String HoraFecha, int Materia) {
        this.NombreDocente = NombreDocente;
        this.Ciudad = Ciudad;
        this.NombreTematica = NombreTematica;
        this.DescripcionTematica = DescripcionTematica;
        this.HoraFecha = HoraFecha;
        this.Materia = Materia;
    }

    public String getNombreDocente() {
        return NombreDocente;
    }

    public void setNombreDocente(String NombreDocente) {
        this.NombreDocente = NombreDocente;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getNombreTematica() {
        return NombreTematica;
    }

    public void setNombreTematica(String NombreTematica) {
        this.NombreTematica = NombreTematica;
    }

    public String getDescripcionTematica() {
        return DescripcionTematica;
    }

    public void setDescripcionTematica(String DescripcionTematica) {
        this.DescripcionTematica = DescripcionTematica;
    }

    public String getHoraFecha() {
        return HoraFecha;
    }

    public void setHoraFecha(String HoraFecha) {
        this.HoraFecha = HoraFecha;
    }

    public int getMateria() {
        return Materia;
    }

    public void setMateria(int Materia) {
        this.Materia = Materia;
    }

    

    
}
