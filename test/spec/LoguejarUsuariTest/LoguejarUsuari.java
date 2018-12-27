package spec.LoguejarUsuariTest;

import controller.Controlador;
import model.Usuari;
import org.concordion.api.BeforeExample;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class LoguejarUsuari {
    Controlador controller ;
    private Usuari user;

    @BeforeExample
    public void init(){
        controller = Controlador.getInstance();
    }

    @Test
    public boolean logInUsuari() {
        user = controller.registreUsuari("c20","Campió", "1111111","Monmteló","Nickname","Password","12/14/97","Unkown", true);
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
        user = controller.registreUsuari("c20","Campió", "1111111","Monmteló","Nickname","Password","12/14/97", "Unknown", true);
        if(user.equals(controller.logInUsuari("Nickname","Passwrdo")))
            return true;
        return false;
    }
}
