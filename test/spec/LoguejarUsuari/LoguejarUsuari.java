package spec.LoguejarUsuari;

import controller.Controlador;
import model.Usuari;
import org.concordion.api.BeforeExample;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class LoguejarUsuari {
    private Controlador controller;

    @BeforeExample
    public void init(){
        controller = new Controlador("src/resources/STUB.xml");
    }

    @Test
    public Usuari logInUsuari() {return controller.logInUsuari("Nickname","Password");}
}
