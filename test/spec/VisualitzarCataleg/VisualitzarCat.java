package spec.VisualitzarCataleg;

import controller.Controlador;
import org.concordion.api.BeforeExample;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;

@RunWith(ConcordionRunner.class)
public class VisualitzarCat {

    private Controlador cont;

    @BeforeExample
    public void init(){
        cont = new Controlador("src/resources/STUB.xml");
    }

    @Test
    public String getCataleg() {
        return cont.getCataleg();
    }

}

