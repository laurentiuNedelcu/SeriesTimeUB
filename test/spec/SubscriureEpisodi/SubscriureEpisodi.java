package spec.SubscriureEpisodi;

import controller.Controlador;
import model.Usuari;
import org.concordion.api.BeforeExample;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class SubscriureEpisodi {

    private Controlador cont;
    @BeforeExample
    public void init(){
        cont = new Controlador("src/resources/STUB.xml");
        cont.registreUsuari("Quim", "spain", "Yuste32", "12345678", "03/02/99");
        cont.logInUsuari("Yuste32", "12345678");
    }


    @Test
    public int subscriureEpisodi() {
        return cont.subscriureEpisodi(1,1,"bbad");
    }

    @Test
    public int episodiJaSubscrit() {
        cont.subscriureEpisodi(1,1,"bbad");
        return cont.subscriureEpisodi(1,1,"bbad");
    }


}
