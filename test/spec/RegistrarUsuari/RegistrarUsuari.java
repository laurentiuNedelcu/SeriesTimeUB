package spec.RegistrarUsuari;

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
        nouUsuari = new Usuari("Edward Elric","Xerxes", 
                "Alquimista de Acero", "LoveAlphonse", "00/00/1899");
    }

    @Test
    public boolean registreUsuari() {
        Usuari registrat = controller.registreUsuari("Edward Elric", "Xerxes", "Alquimista de Acero", "LoveAlphonse", "00/00/1899");
        if(nouUsuari.equals(registrat))
            return true;
        System.out.println("hi");
        return false;
    }

    @Test
    public boolean usuariJaRegistrat(){
        controller.registreUsuari("Edward Elric", "Xerxes", "Alquimista de Acero", "LoveAlphonse", "00/00/1899");
        if(nouUsuari.equals(controller.registreUsuari("Edward Elric", "Xerxes", "Alquimista de Acero", "LoveAlphonse", "00/00/1899")))
            return true;
        return false;
    }

    @Test
    public boolean contrasenyaNoValida(){
        System.out.println("holi");
        Usuari us = new Usuari("Edward Elric", "Xerxes", "Alquimista de Acero", "1234", "00/00/1899");
        Usuari registrat = controller.registreUsuari("Edward","Xerxes","Edi","1234","00/02/14");

        if(us.equals(registrat))
            return true;
        return false;
    }
}
