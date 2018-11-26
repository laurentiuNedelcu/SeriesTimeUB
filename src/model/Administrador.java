package model;

public class Administrador extends Persona {
    private int id;
    private String nickname, password;

    public Administrador(){
        super();
        this.id = 0;
        this.nickname = "None";
        this.password = "None";
    }

    public Administrador (int id, String nickname, String password){
        this.id = id;
        this.nickname = nickname;
        this.password = password;
    }
}
