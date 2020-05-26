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
public class Estudiante extends Usuario{
    String[] TematicaAsignada;

    public Estudiante(int Cedula, String Nombre, String Ciudad, String CorreoElectronico, String Contraseña, String TipoUsuario) {
        super(Cedula, Nombre, Ciudad, CorreoElectronico, Contraseña, TipoUsuario);
    }
    
}
