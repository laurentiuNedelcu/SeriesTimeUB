package model;

public class Usuari extends Persona{ //Dades d'un usuari -> classe filla
    private String nickname;
    private String password;
    private String data_naixement;
    //Listas


    public Usuari(){
        super();
        this.nickname = "None";
        this.password = "None";
        this.data_naixement = "None";
    }

    public Usuari(String nom_real, String nacionalitat, String nickname, String password, String data_naixement){
        super(nom_real,nacionalitat);
        this.nickname = nickname;
        this.password = password;
        this.data_naixement = data_naixement;
    }

    public String getNickname(){return this.nickname;}
    public String getPassword(){
        return this.password;
    }
    public String getData_naixement(){
        return this.data_naixement;
    }

    public void setNickname(String nickname){
        this.nickname = nickname;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setData_naixement(String data_naixement){
        this.data_naixement = data_naixement;
    }

    @Override
    public String toString(){
        String informacio;
        informacio = "Nom real de l'usuari: " + getNom_real() + "\n" + "Nacionalitat: " + getNacionalitat() + "\n" + "Data de naixement: " + getData_naixement() + "\n" + "Nom d'usuari: " + getNickname()
                +"\n" + "Contrasenya: " + getPassword();
        return informacio;
    }

    @Override
    public boolean equals(Object obj){
        Usuari nou = null;
        if (obj == null)
            return false;
        if(obj instanceof Usuari){
            nou = (Usuari) obj;
            if (this.getNickname()==nou.getNickname())
                    return true;
            return false;
        }
        return false;
    }
}
