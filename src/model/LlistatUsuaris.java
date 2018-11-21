package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class LlistatUsuaris {// Gesitiona el registre i el login dels usuaris

    private ArrayList<Usuari> llistat_usuaris;

    public LlistatUsuaris(){
        this.llistat_usuaris = new ArrayList<>();
    }

    public ArrayList<Usuari> getLlistat_usuaris(){
        return this.llistat_usuaris;
    }

    public void registrarUsuari(String nom_real, String nacionalitat, String nickname, String password, String data_naixement) {
        Usuari nouUsuari = new Usuari(nom_real, nacionalitat, nickname, password, data_naixement);
        if(existentUser(nouUsuari)){
            System.out.println("Aquest nom d'usuari ja existeix, siusplau escogeix un altre.");
        }else {
            llistat_usuaris.add(nouUsuari);
        }
    }

    public Usuari logInUsuari(String nickname, String password) {
        Iterator<Usuari> it = llistat_usuaris.iterator();
        Usuari currentUser = null;
        while(it.hasNext()){
            currentUser = it.next();
            if (currentUser.getNickname().equals(nickname) && currentUser.getPassword().equals(password)) {
                break;
            }
            currentUser = null;
        }
        return currentUser;
    }

    public boolean existentUser(Usuari nouUser){
        Iterator<Usuari> it = llistat_usuaris.iterator();
        while (it.hasNext()){
            Usuari user = it.next();
            if (user.getNickname().equals(nouUser.getNickname())) {
                return true;
            }
        }
        return false;
    }
}
