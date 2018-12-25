package vista;

import controller.Controlador;

import javax.swing.*;

public class MainWindow extends JFrame{

    Controlador contr = new Controlador();

    private JPanel finestraPrincipal;
    private JTextArea appTitle;
    private JList cataleg;
    private JList watchedList;
    private JList watchNext;
    private JList notStartedYet;

    public MainWindow(){

        cataleg = new JList((ListModel) contr.getCataleg());
        watchedList = new JList((ListModel) contr.llistaDeSeriesAcabades());
        watchNext = new JList((ListModel) contr.llistaDeSeriesComencades());
        notStartedYet = new JList((ListModel) contr.llistaDeSeriesNoComencades());

        add(new JScrollPane(cataleg));
        add(new JScrollPane(watchNext));
        add(new JScrollPane(watchedList));
        add(new JScrollPane(notStartedYet));

        cataleg.setVisibleRowCount(8);
        watchNext.setVisibleRowCount(8);
        watchedList.setVisibleRowCount(8);
        notStartedYet.setVisibleRowCount(8);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}
