package com.example.diego.pichanguea.Utilities;

import android.util.Log;

import com.example.diego.pichanguea.Models.Usuario;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class JsonHandler {

    public void getInformacion(String datos, Usuario usuario){
        try{
            JSONObject jo = new JSONObject(datos);
            System.out.println("lenghth"+jo.length());
            usuario.setNombreUsuario(jo.getJSONObject("usuario").getString("nombreUsuario"));
            usuario.setClave(jo.getJSONObject("usuario").getString("clave"));
            usuario.setRutSinDigito(jo.getJSONObject("usuario").getString("rutSinDigito"));
            usuario.setRutConDigito(jo.getJSONObject("usuario").getString("rutConDigito"));
            usuario.setNombre(jo.getJSONObject("usuario").getString("nombre"));
            usuario.setPaterno(jo.getJSONObject("usuario").getString("paterno"));
            usuario.setMaterno(jo.getJSONObject("usuario").getString("materno"));
            usuario.setCelular(jo.getJSONObject("usuario").getString("celular"));
            usuario.setMail(jo.getJSONObject("usuario").getString("mail"));
            usuario.setApodo(jo.getJSONObject("usuario").getString("apodo"));
            usuario.setId(jo.getJSONObject("usuario").getString("id"));

            //return usuario;
        }
        catch (JSONException e) {
            Log.e("ERROR", this.getClass().toString() + " " + e.toString());
        }
        //return null;
    }
    public JSONObject setRegister(Usuario usuario) {
        // build jsonObject
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.accumulate("nombreUsuario", usuario.getNombreUsuario());
            jsonObject.accumulate("clave", usuario.getClave());
            jsonObject.accumulate("rutSinDigito", usuario.getRutSinDigito());
            jsonObject.accumulate("rutConDigito", usuario.getRutConDigito());
            jsonObject.accumulate("nombre", usuario.getNombre());
            jsonObject.accumulate("paterno", usuario.getPaterno());
            jsonObject.accumulate("materno", usuario.getMaterno());
            jsonObject.accumulate("celular", usuario.getCelular());
            jsonObject.accumulate("mail", usuario.getMail());
            jsonObject.accumulate("apodo", usuario.getApodo());
            return jsonObject;

        } catch (JSONException je) {
            Log.e("ERROR", this.getClass().toString() + " - " + je.getMessage());
        }
        return null;
    }


    /**
     * Método que recibe un JSONArray en forma de String y devuelve un String[] con los actores

     public String[] getPublicacion(String publicaciones){
     try {
     JSONArray ja = new JSONArray(publicaciones);
     String[] result = new String[ja.length()];
     String actor;
     for (int i = 0; i < ja.length(); i++) {
     JSONObject row = ja.getJSONObject(i);
     actor =row.getJSONObject("usuario").getString("nombreusuario")+" "+row.getJSONObject("usuario").getString("apellidousuario")
     +" publicó:\n"+row.getString("nombrepublicacion");
     result[i] = actor;
     }
     return result;
     } catch (JSONException e) {
     Log.e("ERROR", this.getClass().toString() + " " + e.toString());
     }
     return null;

     }

    public String[] getUsuario(String usuario) {
        try {
            JSONArray ja = new JSONArray(usuario);
            String[] result = new String[ja.length()];
            String actor;
            for (int i = 0; i < ja.length(); i++) {
                JSONObject row = ja.getJSONObject(i);
                actor = " " + row.getString("nombre") + " " + row.getString("apellido");
                result[i] = actor;
            }
            return result;
        } catch (JSONException e) {
            Log.e("ERROR", this.getClass().toString() + " " + e.toString());
        }
        return null;
    }// getActors(String actors)

    public JSONObject setUsuario(Usuario usuario) {
        // build jsonObject
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.accumulate("apellidousuario", usuario.getAPELLIDOUSUARIO());
            jsonObject.accumulate("celularusuario", usuario.getCELULARUSUARIO());
            jsonObject.accumulate("emailusuario", usuario.getEMAILUSUARIO());
            jsonObject.accumulate("nicknameusuario", usuario.getNICKNAMEUSUARIO());
            jsonObject.accumulate("nombreusuario", usuario.getNOMBREUSUARIO());
            jsonObject.accumulate("passwordusuario", usuario.getPASSWORDUSUARIO());
            return jsonObject;

        } catch (JSONException je) {
            Log.e("ERROR", this.getClass().toString() + " - " + je.getMessage());
        }
        return null;
    }



*/
}// JsonHandler