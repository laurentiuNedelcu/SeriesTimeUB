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
    private Usuari usuariExistent;

    @BeforeExample
    public void init(){
        controller = new Controlador("src/resources/STUB.xml");
        usuariExistent = new Usuari("Edward Elric","Xerxes",
                "Alquimista de Acero", "LoveAlphonse", "00/00/1899");
    }

    @Test
    public void registreUsuari() {
        controller.registreUsuari("Alphonse Elrick", "Xerxes", "Alquimista de Acero", "LoveEdward", "00/00/1900");
    }
/*
    @Test
    public void registreUsuari(){
        try {
            controller.registreUsuari("Alphonse Elrick", "Xerxes", "Alquimista de Acero", "Alquimista de Acero", "00/00/1900");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void registreUsuari(){
        try {
            controller.registreUsuari("Alphonse Elrick", "Xerxes", "Armadura Andante", "LoveEdward", "00/00/1900");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
}
