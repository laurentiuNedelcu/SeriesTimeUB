package spec.VisualitzarCatalegTest;

import controller.Controlador;
import model.Serie;
import org.concordion.api.BeforeExample;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Iterator;

@RunWith(ConcordionRunner.class)
public class VisualitzarCat {

    private Controlador cont;

    @BeforeExample
    public void init(){
        cont = Controlador.getInstance();
        cont.registreUsuari("c12","Usuari","193840","Here","NouUser","12345678","01/15/99","holi@gmail.con",false);
        cont.logInUsuari("NouUser","12345678");
        cont.subscriureEpisodi(1,1,"mrobot");
        cont.subscriureEpisodi(3,1,"mrobot");
        cont.subscriureEpisodi(1,1,"gofthrones");
    }

    @Test
    public String getCataleg() {
        String s = "";
        Iterator<Serie> it = cont.getCataleg().iterator();
        while(it.hasNext()){
            Serie se = it.next();
            s += se.getTitle();
            s += " ";
        }
        return s;
    }

    @Test
    public String getLlistatSeriesNoComencades(){
        String s = "";
        Iterator<Serie> it = cont.llistaDeSeriesNoComencades().iterator();
        while(it.hasNext()){
            Serie se = it.next();
            s += se.getTitle();
            s += " ";
        }
        return s;
    }

    @Test
    public String getLlistatSeriesComencades(){
        String s = "";
        Iterator<Serie> it = cont.llistaDeSeriesComencades().iterator();
        while(it.hasNext()){
            Serie se = it.next();
            s += se.getTitle();
            s += " ";
        }
        return s;
    }

    @Test
    public String getLlistatSeriesAcabades(){
        String s = "";
        Iterator<Serie> it = cont.llistaDeSeriesAcabades().iterator();
        while(it.hasNext()){
            Serie se = it.next();
            s += se.getTitle();
            s += " ";
        }
        return s;
    }

}

