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

    public void logInUsuari(String nickname, String password) {
        Scanner scan = new Scanner();
        Iterator<Usuari> it = llistat_usuaris.iterator();

        System.out.println("Introdueix el nom d'usuari: ");
        nickname = scan.nextLine();
        System.out.println("Introdueix la contrasenya: ");
        password = scan.nextLine();

        while(it.hasNext()){
            Usuari currentUser = it.next();
            if (currentUser.getNickname().equals(nickname) && currentUser.getPassword().equals(password)) {
                System.out.println("S'ha iniciat la sessió amb éxit!");
            }
        }
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
