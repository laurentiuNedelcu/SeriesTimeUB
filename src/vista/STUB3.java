package vista;

import controller.Controlador;

import javax.swing.*;

public class STUB3 {
    public static void main(String args[]) {
        Controlador contr = Controlador.getInstance();
        contr.registreUsuari("userTest","Testeig","1234","Bcn","Test","12345678","03/02","Bcn C/Proba nº1",false);
        JOptionPane.showMessageDialog(null,"Hem registrat un únic usuari amb nom d'usuari: Test, i contrasenya: 12345678, per a no haver de fer la interfície gráfica de 'Registrar usuari'!","DADA IMPORTANT!", JOptionPane.INFORMATION_MESSAGE);
        STUB_LogInSignIn vista  = new STUB_LogInSignIn();
        vista.setVisible(true);

    }
}
