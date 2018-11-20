package model;

public class Usuari extends Persona{ //Dades d'un usuari -> classe filla
    private String nickname;
    private String password;
    private String data_naixement;

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

    public String getNickname(){
        return this.nickname;
    }
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
}
