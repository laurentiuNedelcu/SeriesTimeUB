package controller;

import model.STUB;
import model.Usuari;

public class FacadeController{// Funcionalitats de loguejar i registrar usuari
    private STUB dades;

    public FacadeController(STUB dades){
        this.dades = dades;
    }

    public Usuari registreUsuari(String nom_real, String nacionalitat, String nickname, String password, String data_naixement){
        return dades.getLlistat_usuaris().registrarUsuari(nom_real, nacionalitat, nickname, password, data_naixement);
    }

    public Usuari logInUsuari(String nickname, String password) {//+/- recuperar/desar Dades de Pro2
        return dades.getLlistat_usuaris().logInUsuari(nickname, password);
    }
}
