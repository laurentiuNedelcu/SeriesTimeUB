package spec.SubscriureEpisodiTest;

import controller.Controlador;
import org.concordion.api.BeforeExample;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class SubscriureEpisodi {

    private Controlador cont;
    @BeforeExample
    public void init(){
        cont = Controlador.getInstance();
        cont.registreUsuari("c20","Quim", "1111111","spain", "Yuste32", "12345678", "03/02/99", "Unknown", true);
        cont.logInUsuari("Yuste32", "12345678");
    }


    @Test
    public boolean subscriureEpisodi() {
        if(cont.subscriureEpisodi(1,1,"bbad") == 0)
            return true;
        return false;
    }

    @Test
    public boolean episodiJaSubscrit() {
        cont.subscriureEpisodi(1,1,"bbad");
        if(cont.subscriureEpisodi(1,1,"bbad") == 0)
            return true;
        return false;
    }


}
