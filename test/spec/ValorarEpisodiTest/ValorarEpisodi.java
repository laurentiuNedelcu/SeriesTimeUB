package spec.ValorarEpisodiTest;

import controller.Controlador;
import org.concordion.api.BeforeExample;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class ValorarEpisodi {

    private Controlador cont;
    @BeforeExample
    public void init(){
        cont = new Controlador("src/resources/STUB.xml");
        cont.registreUsuari("Roberto", "spain", "Robert", "12345678", "03/02/99");
        cont.logInUsuari("Robert", "12345678");
        cont.subscriureEpisodi(1,1,"bbad");
    }


    @Test
    public String valorarEpisodi() {
        String s = cont.valorarEpisodi(6,"15/11/18",1,1,"bbad");
        System.out.println(s);
        return s;
    }
    @Test
    public String valorarEpisodiValorat(){
        cont.valorarEpisodi(6,"15/11/18",1,1,"bbad");
        String s = cont.valorarEpisodi(6,"15/11/18",1,1,"bbad");
        System.out.println(s);
        return s;

    }
/*
    @Test
    public int episodiJaSubscrit() {
        cont.subscriureEpisodi(1,1,"bbad");
        return cont.subscriureEpisodi(1,1,"bbad");
    }

*/
}