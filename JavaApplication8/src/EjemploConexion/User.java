/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploConexion;

import Conexion.*;

/**
 * Clase que permite almacenar información y hacer transacciones con la base de
 * datos
 *
 * @author Antony García
 */
public class User {

    private int id;
    private String name;
    private String lastName;
    private String birthdate;
    private String gender;

    /**
     * Constructor de la clase
     * @param id Identificación de fila en la tabla de la base de datos
     * @param name Nombre
     * @param lastName Apellido
     * @param birthdate Fecha de cumpleaños
     * @param gender Sexo
     */
    public User(int id, String name, String lastName, String birthdate, String gender) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.gender = gender;
    }

     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}