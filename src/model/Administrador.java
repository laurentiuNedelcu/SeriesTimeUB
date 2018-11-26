package model;

public class Administrador extends Persona {
    private String nickname, password;

    public Administrador(){
        super();
        this.nickname = "None";
        this.password = "None";
    }

    public Administrador (int id, String nom_real, String nacionalitat, String nickname, String password){
        super(id,nom_real,nacionalitat);
        this.nickname = nickname;
        this.password = password;
    }
}
