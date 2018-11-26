package controller;

import model.STUB;
import model.Usuari;

public class ControladorAcces {// Funcionalitats de loguejar i registrar usuari
    private STUB dades;

    public ControladorAcces(STUB dades){
        this.dades = dades;
    }

    public Usuari registreUsuari(int id, String nom_real,int dni, String nacionalitat, String nickname, String password, String data_naixement, String adress, boolean vip){
        return dades.getLlistat_usuaris().registrarUsuari(id, nom_real, dni, nacionalitat, nickname, password, data_naixement, adress, vip);
    }

    public Usuari logInUsuari(String nickname, String password) {//+/- recuperar/desar Dades de Pro2
        return dades.getLlistat_usuaris().logInUsuari(nickname, password);
    }
}
