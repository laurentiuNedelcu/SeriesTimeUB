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
    public void registreUsuari() {
        return controller.registreUsuari();
    }
}
