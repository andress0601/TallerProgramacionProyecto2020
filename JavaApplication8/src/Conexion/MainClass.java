/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import Class.Usuario;
import org.json.JSONException;

public class MainClass {

    public static void main(String[] args) throws JSONException {
        //Agregar registro a la tabla users_list en la base de datos example_database
        //new PHPClass().saveInfo(new Usuario(5, "Antony Garcia", "Mexico","Gracia@ChatT.com", "30071992", "E"));

        /*
         Se imprimen todos los registros almacenados en la tabla users_list de la
         base de datos example_database. Se utiliza una expresión lambda (forEach)
         para recorrer una lista (getInfo() devuelve una lista de usuarios)
         */
        new PHPClass().getInfo().forEach(i -> {
            String usuario = "Cedula: " + i.getCedula()
                    + ", Nombre: " + i.getNombre()
                    + ", Ciudad: " + i.getCiudad()
                    + ", Correo electronico: " + i.getCorreoElectronico()
                    + ", Contrasena: " + i.getContraseña()
                    + ", Tipo de Usuario: " + i.getTipoUsuario();
            System.out.println(usuario);
        });
        
        new PHPClass().getInfoSubjects("getInfoSubjects.php").forEach(i -> {
            String materia = "NoMateria: " + i.getNoMateria()
                    + ", Nombre: " + i.getNombreMateria()
                    + ", Cedula: " + i.getDocenteEncargado()
                    + ", No Tematica: " + i.getTematica()
                    ;
            System.out.println(materia);
        });
        
        new PHPClass().getInfoNews().forEach(i -> {
            String noticia = "NoNoticia: " + i.getNoNoticia()
                    + ", Nombre: " + i.getNombreNoticia()
                    + ", Descripcion: " + i.getDescripcionNoticia()
                    + ", No Materia: " + i.getNoMateria()
                    ;
            System.out.println(noticia);
        });
        
        new PHPClass().getInfoSubjectsUser().forEach(i -> {
            String tematica = "Nombre docente: " + i.getNombreDocente()
                    + ", Ciudad: " + i.getCiudad()
                    + ", Nombre tematica: " + i.getNombreTematica()
                    + ", Descripcion tematica: " + i.getDescripcionTematica()
                    + ", Hora y fecha: " + i.getHoraFecha()
                    ;
            System.out.println(tematica);
        });
    }
}