package controller;

import model.Cataleg;
import model.STUBapp;
import resources.DAO_XML_STUB;

public class Controlador {
    STUBapp cat;
    DAO_XML_STUB dao;

    public Controlador(String nomFitxer){
        cat = new STUBapp();
        dao = new DAO_XML_STUB(nomFitxer,cat);
    }

}
