package spec.VisualitzarCatalegTest;

import controller.Controlador;
import org.concordion.api.BeforeExample;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class VisualitzarCat {

    private Controlador cont;

    @BeforeExample
    public void init(){
        cont = new Controlador("src/resources/STUB.xml");
        cont.registreUsuari("c12","Usuari","193840","Here","NouUser","12345678","01/15/99","holi@gmail.con",false);
        cont.logInUsuari("NouUser","12345678");
        cont.subscriureEpisodi(1,1,"mrobot");
        cont.subscriureEpisodi(3,1,"mrobot");
        cont.subscriureEpisodi(1,1,"gofthrones");
    }

    @Test
    public String getCataleg() {
        return cont.getCataleg();
    }

    @Test
    public String getLlistatSeriesNoComencades(){
        String s = cont.llistaDeSeriesNoComencades();
        return s;
    }

    @Test
    public String getLlistatSeriesComencades(){
        String s = cont.llistaDeSeriesComencades();
        return s;
    }

    @Test
    public String getLlistatSeriesAcabades(){
        String s = cont.llistaDeSeriesAcabades();
        return s;
    }

}

