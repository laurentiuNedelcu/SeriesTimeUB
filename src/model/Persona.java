package model;

public class Persona { //Superclasse, emmagatzema atributs propis de la persona segons els requisits de STUB
    private String nom_real;
    private String nacionalitat;

    public Persona(){
        this.nom_real = "None";
        this.nacionalitat = "None";
    }

    public Persona(String nom_real, String nacionalitat){
        this.nom_real = nom_real;
        this.nacionalitat = nacionalitat;
    }

    public String getNom_real(){
        return this.nom_real;
    }

    public String getNacionalitat(){
        return this.nacionalitat;
    }

    public void setNom_real(String nom_real){
         this.nom_real = nom_real;
    }

    public void setNacionalitat(String nacionalitat){
        this.nacionalitat = nacionalitat;
    }
}
