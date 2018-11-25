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
    private Usuari user;

    @BeforeExample
    public void init(){
        controller = new Controlador("src/resources/STUB.xml");
    }

    @Test
    public boolean logInUsuari() {
        user = controller.registreUsuari("Campió","Monmteló","Nickname","Password","12/14/97");
        if(user.equals(controller.logInUsuari("Nickname","Password")))
            return true;
        return false;
    }

    @Test
    public boolean logInUsuariNoRegistrat(){
        if(controller.logInUsuari("Nickname","Password")==null)
            return true;
        return false;
    }

    @Test
    public boolean logInUsuariContrasenyaIncorrecta(){
        user = controller.registreUsuari("Campió","Monmteló","Nickname","Password","12/14/97");
        if(user.equals(controller.logInUsuari("Nickname","Passwrdo")))
            return true;
        return false;
    }
}
