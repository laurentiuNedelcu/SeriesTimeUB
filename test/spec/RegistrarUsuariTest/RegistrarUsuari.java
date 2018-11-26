package spec.RegistrarUsuariTest;

import controller.Controlador;
import model.Usuari;
import org.concordion.api.BeforeExample;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class RegistrarUsuari {
    private Controlador controller;
    private Usuari nouUsuari;

    @BeforeExample
    public void init(){
        controller = new Controlador("src/resources/STUB.xml");
        nouUsuari = new Usuari(1,"Edward Elric", 1111111, "Xerxes",
                "Alquimista de Acero", "LoveAlphonse", "00/00/1899", "Unknown", true);
    }

    @Test
    public boolean registreUsuari() {
        Usuari registrat = controller.registreUsuari(1,"Edward Elric",1111111, "Xerxes", "Alquimista de Acero", "LoveAlphonse", "00/00/1899", "Unknown", true);
        if(nouUsuari.equals(registrat))
            return true;
        System.out.println("hi");
        return false;
    }

    @Test
    public boolean usuariJaRegistrat(){
        controller.registreUsuari(1,"Edward Elric", 1111111, "Xerxes", "Alquimista de Acero", "LoveAlphonse", "00/00/1899", "Unknown", true);
        if(nouUsuari.equals(controller.registreUsuari(1,"Edward Elric",1111111, "Xerxes", "Alquimista de Acero", "LoveAlphonse", "00/00/1899","Unknown", true)))
            return true;
        return false;
    }

    @Test
    public boolean contrasenyaNoValida(){
        System.out.println("holi");
        Usuari us = new Usuari(1, "Edward Elric", 1111111, "Xerxes", "Alquimista de Acero", "1234", "00/00/1899", "Unknown", true);
        Usuari registrat = controller.registreUsuari(1,"Edward",1111111,"Xerxes","Edi","1234","00/02/14", "Unknown", true);

        if(us.equals(registrat))
            return true;
        return false;
    }
}
