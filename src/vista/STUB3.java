package vista;

import controller.Controlador;

public class STUB3 {
    public static void main(String args[]) {
        Controlador contr = new Controlador();
        contr.registreUsuari("userTest","Testeig","1234","Bcn","Test","12345678","03/02","Bcn C/Proba nº1",false);
        contr.logInUsuari("Test","12345678");
        MainWindow vista  = new MainWindow(contr);
        vista.setVisible(true);

    }
}
