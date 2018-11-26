package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//LlistatUsuaris ha d'emmagatzemar la informació de l'aplicació de tots els usuaris
public class LlistatUsuaris {

    private ArrayList<Usuari> llistat_usuaris;
    private Usuari usuariActual;

    public LlistatUsuaris(){
        this.llistat_usuaris = new ArrayList<>();
    }

    public ArrayList<Usuari> getLlistat_usuaris(){
        return this.llistat_usuaris;
    }

    public Usuari registrarUsuari(int id, String nom_real, int dni, String nacionalitat, String nickname, String password, String data_naixement, String adress, boolean vip){
        Usuari nouUsuari = new Usuari(id, dni, nom_real, nacionalitat, nickname, password, data_naixement, adress, vip);
        if(existentUser(nouUsuari) || !safePassword(nouUsuari)) {
            return null;

        } else {
            llistat_usuaris.add(nouUsuari);
            return nouUsuari;
        }
    }

    public Usuari logInUsuari(String nickname, String password){
        Iterator<Usuari> it = llistat_usuaris.iterator();
        Usuari currentUser;
        while(it.hasNext()){
            currentUser = it.next();
            if (currentUser.getNickname().equals(nickname) && currentUser.getPassword().equals(password)) {
                usuariActual = currentUser;
                return currentUser;
            }
        }
        return null;
    }

    public boolean existentUser(Usuari nouUser){//Mètode per a comprobar si existeix un usuari a partir del nickname
        Iterator<Usuari> it = llistat_usuaris.iterator();
        while (it.hasNext()){
            Usuari user = it.next();
            if (user.getNickname().equals(nouUser.getNickname())) {
                return true;
            }
        }
        return false;
    }

    public boolean safePassword(Usuari u){
        //Necesitamos comprobar que la contraseña escogida es segura
        String nickname, name, birthDate, password;
        int minimumLength = 8;

        nickname = u.getNickname();
        name = u.getNom_real();
        birthDate = u.getData_naixement();
        password = u.getPassword();

        if(nickname.equals(password) || name.equals(password) || birthDate.equals(password) || password.length()<minimumLength) {
            return false;
        }
        return true;
    }

    public Usuari getUsuariActual() {
        return usuariActual;
    }
}
