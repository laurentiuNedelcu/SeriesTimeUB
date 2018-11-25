package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//LlistatUsuaris ha d'emmagatzemar la informació de l'aplicació de tots els usuaris
public class LlistatUsuaris {

    private ArrayList<Usuari> llistat_usuaris;

    public LlistatUsuaris(){
        this.llistat_usuaris = new ArrayList<>();
    }

    public ArrayList<Usuari> getLlistat_usuaris(){
        return this.llistat_usuaris;
    }

    public String registrarUsuari(String nom_real, String nacionalitat, String nickname, String password, String data_naixement){
        Usuari nouUsuari = new Usuari(nom_real, nacionalitat, nickname, password, data_naixement);
        if(existentUser(nouUsuari)) {
            //throw new Exception("Aquest nom d'usuari ja existeix!");
            return "Aquest nom d'usuari ja existeix!";
        }
        if(!safePassword(nouUsuari)){
            //throw new Exception("La contrassenya es massa insegura!");
            return "La contrassenya es massa insegura!";
        }
        if(!existentUser(nouUsuari)==true && safePassword(nouUsuari)==true){
            llistat_usuaris.add(nouUsuari);
            //System.out.println("Benvolgut, " + nickname + " has estat afegit amb éxit!");
            return "Benvolgut, " + nickname + " has estat afegit amb éxit!";
        }
        return null;
    }

    public Usuari logInUsuari(String nickname, String password) throws Exception{
        Iterator<Usuari> it = llistat_usuaris.iterator();
        Usuari currentUser;
        while(it.hasNext()){
            currentUser = it.next();
            if (currentUser.getNickname().equals(nickname) && currentUser.getPassword().equals(password)) {
                System.out.println(currentUser.toString());
                return currentUser;
            }
        }
        throw new Exception("Error en l'inici de sessió!");
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
}
