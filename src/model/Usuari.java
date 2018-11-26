package model;

public class Usuari extends Persona{
    private String nickname, password, data_naixement, adress, dni;
    private boolean vip;


    public Usuari(){
        super();
        this.nickname = "None";
        this.password = "None";
        this.data_naixement = "None";
        this.adress = "None";
        this.dni = "None";
        this.vip = false;
    }

    public Usuari(String id, String nom_real, String dni, String nacionalitat, String nickname, String password, String data_naixement, String adress, boolean vip){
        super(id, nom_real,nacionalitat);
        this.nickname = nickname;
        this.password = password;
        this.data_naixement = data_naixement;
        this.adress = adress;
        this.dni = dni;
        this.vip = vip;
    }

    public String getNickname(){return this.nickname;}
    public String getPassword(){
        return this.password;
    }
    public String getData_naixement(){
        return this.data_naixement;
    }
    public String getAdress(){return this.adress;}
    public String getDni(){return this.dni;}
    public boolean getVip(){return this.vip;}

    public void setNickname(String nickname){
        this.nickname = nickname;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setData_naixement(String data_naixement){
        this.data_naixement = data_naixement;
    }
    public void setAdress(String adress){ this.adress = adress;}
    public void setDni(String dni){this.dni = dni;}
    public void setVip(boolean vip){this.vip = vip;}

    @Override
    public String toString(){
        String informacio;
        informacio = "Nom real de l'usuari: " + getNom_real() + "\n" + "DNI: " + getDni() + "\n"
                + "Nacionalitat: " + getNacionalitat() + "\n" + "Data de naixement: " + getData_naixement()
                + "\n" + "Nom d'usuari: " + getNickname() +"\n" + "Contrasenya: " + getPassword() + "\n" + "Adreça: "
                + getAdress() + "\n" + "VIP: " + getVip();
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
