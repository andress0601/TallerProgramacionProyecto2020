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
public class Usuario {
    int Cedula;
    String Nombre;
    String Ciudad;
    String CorreoElectronico;
    String Contraseña;
    String TipoUsuario;
    //boolean Estado;

    public Usuario(int Cedula, String Nombre, String Ciudad, String CorreoElectronico, String Contraseña, String TipoUsuario) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Ciudad = Ciudad;
        this.CorreoElectronico = CorreoElectronico;
        this.Contraseña = Contraseña;
        this.TipoUsuario = TipoUsuario;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String CorreoElectronico) {
        this.CorreoElectronico = CorreoElectronico;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getTipoUsuario() {
        return TipoUsuario;
    }

    public void setTipoUsuario(String TipoUsuario) {
        this.TipoUsuario = TipoUsuario;
    }
    
    

           
}
