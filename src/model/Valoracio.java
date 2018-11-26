package model;

import java.util.ArrayList;
import java.util.Iterator;

public class Valoracio {
    private ArrayList<Usuari> valUsuari;
    private ArrayList<String> valoracions;

    public Valoracio(){
        valUsuari = new ArrayList<>();
        valoracions = new ArrayList<>();
    }

    public String valorarUnEpisodi(Usuari us, int puntuacio,String data) {
        if(usuariJaValorat(us)){
            return "No pot tornar a valorar";
        }
        String valoracio;
        switch (puntuacio){
            //good, funny, wow, sad, meh , bad
            case 1: valoracio =  ": bad - ";
            break;
            case 2: valoracio = ": meh - ";
            break;
            case 3: valoracio = ": sad - ";
            break;
            case 4: valoracio = ": wow - ";
            break;
            case 5: valoracio = ": funny - ";
            break;
            case 6: valoracio = ": good - ";
            break;
            default: return "valoracio no valida";

        }
        valoracio = us.getNickname()+valoracio+data;
        valoracions.add(valoracio);
        valUsuari.add(us);
        return valoracio;
    }

    private boolean usuariJaValorat(Usuari us){
        Iterator<Usuari> it = valUsuari.iterator();
        while(it.hasNext()){
            Usuari user = it.next();
            if (user.equals(us))
                return true;
        }
        return false;
    }
}
