/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import Class.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;


public class PHPClass {

    /**
     *
     * @param user Instancia de la clase User con la información del usuario que
     * se desea agregar a la base de datos
     * @return TRUE si se almacena la información correctamente, FALSE en el
     * caso contrario
     */
    public boolean saveInfo(Usuario user) {
        try {
            URL url = new URL("https://crustier-twists.000webhostapp.com/ChatTaller/saveInfo.php");
            URLConnection con = url.openConnection();
            con.setDoOutput(true);
            PrintStream ps = new PrintStream(con.getOutputStream());
            ps.print("&table_name=usuarios");
            ps.print("&Cedula=" + user.getCedula());
            ps.print("&Nombre=" + user.getNombre()); 
            ps.print("&Ciudad=" + user.getCiudad());
            ps.print("&CorreoElectronico=" + user.getCorreoElectronico());
            ps.print("&Contrasena=" + user.getContraseña());
            ps.print("&TipoUsuario=" + user.getTipoUsuario());
            con.getInputStream();
            InputStream is = con.getInputStream();
            while (is.available() > 0) {
                // System.out.print((char) is.read());
                is.read();
            }
            return true;
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     *
     * @return Lista de objetos de la clase User con todos los usuarios
     * almacenados en la base de datos
     */
    public List<Usuario> getInfo() throws JSONException {
        List<Usuario> users = new ArrayList<>();
        String json = getJSON("getInfo.php");
        Object jsonObject = JSONValue.parse(json.toString());
        JSONArray array = (JSONArray) jsonObject;

        for (int i = 0; i < array.size(); i++) {
            JSONObject row = (JSONObject) array.get(i);
            users.add(new Usuario(
                    Integer.parseInt(row.get("Cedula").toString()),
                    row.get("Nombre").toString(),
                    row.get("Ciudad").toString(),
                    row.get("CorreoElectronico").toString(),
                    row.get("Contrasena").toString(),
                    row.get("TipoUsuario").toString()));
        }
        return users;
    }
    
        public List<Materia> getInfoSubjects(String d) throws JSONException {
        List<Materia> subjects = new ArrayList<>();
        String json = getJSON(d);
        Object jsonObject = JSONValue.parse(json.toString());
        JSONArray array = (JSONArray) jsonObject;

        for (int i = 0; i < array.size(); i++) {
            JSONObject row = (JSONObject) array.get(i);
            subjects.add(new Materia(
                    Integer.parseInt(row.get("NoMateria").toString()),
                    row.get("Nombre").toString(),
                    Integer.parseInt(row.get("Cedula").toString()),
                    Integer.parseInt(row.get("NoTematica").toString())
                    ));
        }
        return subjects;
    }
        
        public List<Noticia> getInfoNews() throws JSONException {
        List<Noticia> news = new ArrayList<>();
        String json = getJSON("getInfoNews.php");
        Object jsonObject = JSONValue.parse(json.toString());
        JSONArray array = (JSONArray) jsonObject;

        for (int i = 0; i < array.size(); i++) {
            JSONObject row = (JSONObject) array.get(i);
            news.add(new Noticia(
                    Integer.parseInt(row.get("NoNoticia").toString()),
                    row.get("Nombre").toString(),
                    row.get("Descripcion").toString(),
                    Integer.parseInt(row.get("NoMateria").toString())
                    ));
        }
        return news;
    }

        public List<Tematica> getInfoSubjectsUser() throws JSONException {
        List<Tematica> term = new ArrayList<>();
        String json = getJSON("getInfoSubjects&User.php");
        Object jsonObject = JSONValue.parse(json.toString());
        JSONArray array = (JSONArray) jsonObject;

        for (int i = 0; i < array.size(); i++) {
            JSONObject row = (JSONObject) array.get(i);
            term.add(new Tematica(
                    row.get("Nombre").toString(),
                    row.get("Ciudad").toString(),
                    row.get("NombreTematica").toString(),
                    row.get("DescripcionTematica").toString(),
                    row.get("HoraFecha").toString(),
                    Integer.parseInt(row.get("NoMateria").toString())
                    ));
        }
        return term;
    }    
        
    /**
     * Método que invoca el script getInfo.php para extraer la información de la
     * base de datos y empaquetarla en un JSON
     *
     * @return Un JSON con la información extraida de la base de datos
     */
    private String getJSON(String a) {
        StringBuffer response = null;
        try {
            String url = "";
            url = "https://crustier-twists.000webhostapp.com/ChatTaller/"+ a;
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("POST");
            con.setDoOutput(true);
            int responseCode = con.getResponseCode();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (response.toString().contains("Warning")) {
            int i = 0;
            String msg = "";
            while (true) {
                if (response.charAt(i) == '[') {
                    break;
                } else {
                    msg += response.charAt(i);
                    i++;
                }
                if (i > 1000) {
                    break;
                }
            }
            return response.toString().replace(msg, "");
        } else {
            return response.toString();
        }

    }
}