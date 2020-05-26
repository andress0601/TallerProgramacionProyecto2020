/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploConexion;

import Conexion.*;
import org.json.JSONException;

public class MainClass {

    public static void main(String[] args) throws JSONException {
        //Agregar registro a la tabla users_list en la base de datos example_database
        new PHPClass().saveInfo(new User(0, "Antony", "Garcia", "30/07/1992", "M"));

        /*
         Se imprimen todos los registros almacenados en la tabla users_list de la
         base de datos example_database. Se utiliza una expresión lambda (forEach)
         para recorrer una lista (getInfo() devuelve una lista de usuarios)
         */
        new PHPClass().getInfo().forEach(i -> {
            String usuario = "Nombre: " + i.getName()
                    + ", Apellido: " + i.getLastName()
                    + ", Fecha de nacimiento: " + i.getBirthdate()
                    + ", Sexo: " + i.getGender();
            System.out.println(usuario);
        });
    }
}