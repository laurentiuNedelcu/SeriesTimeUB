package spec.VisualitzarEpisodiTest;

import controller.Controlador;
import org.concordion.api.BeforeExample;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class VisualitzarEp {
    private Controlador cont;

    @BeforeExample
    public void init(){
        cont = Controlador.getInstance();
    }

    @Test
    public String visualitzarEp() {
        if(cont.visualitzarEpisodi(1,1,"bbad")==0){
            return "Episodi visualitzat";
        }
        return "No s'ha pogut visualtizar episodi";
    }

    @Test
    public String visualitzarEpNoExistent(){
        if(cont.visualitzarEpisodi(90,1,"bbad")==0){
            return "Episodi visualitzat";
        }
        return "No s'ha pogut visualtizar episodi";
    }
}