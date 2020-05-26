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
public class Noticia {
    int NoNoticia;
    String NombreNoticia;
    String DescripcionNoticia;
    int NoMateria;

    public Noticia(int NoNoticia, String NombreNoticia, String DescripcionNoticia, int NoMateria) {
        this.NoNoticia = NoNoticia;
        this.NombreNoticia = NombreNoticia;
        this.DescripcionNoticia = DescripcionNoticia;
        this.NoMateria = NoMateria;
    }
    

    public int getNoNoticia() {
        return NoNoticia;
    }

    public void setNoNoticia(int NoNoticia) {
        this.NoNoticia = NoNoticia;
    }

    public String getNombreNoticia() {
        return NombreNoticia;
    }

    public void setNombreNoticia(String NombreNoticia) {
        this.NombreNoticia = NombreNoticia;
    }

    public String getDescripcionNoticia() {
        return DescripcionNoticia;
    }

    public void setDescripcionNoticia(String DescripcionNoticia) {
        this.DescripcionNoticia = DescripcionNoticia;
    }

    public int getNoMateria() {
        return NoMateria;
    }

    public void setNoMateria(int NoMateria) {
        this.NoMateria = NoMateria;
    }
    
}
   