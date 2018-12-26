package vista;

import controller.Controlador;
import model.Serie;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainWindow{

    private JPanel finestraPrincipal;
    private JTextField SERIESTIMEUBTextField;
    private JList<Serie> cataleg;
    private JList<Serie> watchedList;
    private JList<Serie> watchNext;
    private JList<Serie> notStartedYet;
    private JTextField catalegTextField;
    private JTextField watchedListTextField;
    private JTextField watchNextTextField;
    private JTextField notStartedYetTextField;

    private Controlador contr = new Controlador();

    public MainWindow(){

        SERIESTIMEUBTextField = new JTextField();

        actualitzarLlistes();
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("MainWindow");

        frame.setContentPane(new MainWindow().finestraPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void actualitzarLlistes(){;

        DefaultListModel modelCat = new DefaultListModel();
        DefaultListModel modelWL = new DefaultListModel();
        DefaultListModel modelWN = new DefaultListModel();
        DefaultListModel modelNSY = new DefaultListModel();

        for(Object s: contr.getCataleg()){
            modelCat.addElement(s);
        }

        for(Object s: contr.llistaDeSeriesComencades()){
            modelWN.addElement(s);
        }

        for(Object s: contr.llistaDeSeriesAcabades()){
            modelWL.addElement(s);
        }

        for(Object s: contr.llistaDeSeriesNoComencades()){
            modelNSY.addElement(s);
        }

        cataleg.setModel(modelCat);
        watchNext.setModel(modelWN);
        watchedList.setModel(modelWL);
        notStartedYet.setModel(modelNSY);
    }
}
