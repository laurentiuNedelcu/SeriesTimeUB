package model;

import java.util.ArrayList;
import java.util.Iterator;

public class SubscriureEpisodi {
    ArrayList<Usuari> vist;

    public SubscriureEpisodi(){
        vist = new ArrayList<>();
    }

    public int subscriureUsuari(Usuari us){
        boolean jaSubscrit = false;
        Iterator<Usuari> it = vist.iterator();
        while(it.hasNext()){
            Usuari user = it.next();
            if(user.equals(us)){
                jaSubscrit = true;
            };
        }
        if(!jaSubscrit){
            vist.add(us);
            return 0;
        }
        return 1;
    }
}