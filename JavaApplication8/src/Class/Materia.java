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
public class Materia {
    int NoMateria;
    String NombreMateria;
    int DocenteEncargado;
    int tematica;
    //int EstudiantesAsignados;

    public Materia(int NoMateria, String NombreMateria, int DocenteEncargado, int tematica) {
        this.NoMateria = NoMateria;
        this.NombreMateria = NombreMateria;
        this.DocenteEncargado = DocenteEncargado;
        this.tematica = tematica;
    }

    


    public int getNoMateria() {
        return NoMateria;
    }

    public void setNoMateria(int NoMateria) {
        this.NoMateria = NoMateria;
    }

    public String getNombreMateria() {
        return NombreMateria;
    }

    public void setNombreMateria(String NombreMateria) {
        this.NombreMateria = NombreMateria;
    }

    public int getDocenteEncargado() {
        return DocenteEncargado;
    }

    public void setDocenteEncargado(int DocenteEncargado) {
        this.DocenteEncargado = DocenteEncargado;
    }

    public int getTematica() {
        return tematica;
    }

    public void setTematica(int tematica) {
        this.tematica = tematica;
    }
    
    
}
