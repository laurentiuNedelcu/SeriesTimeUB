package vista;

import controller.Controlador;
import model.Episodi;
import model.Serie;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
//Este es lo bo, ho faig pa poder fer un altre commit
public class VisualSelection extends javax.swing.JFrame{

    Controlador contr;
    Serie se;
    int temp;
    int ep;
    Timer t;

    public VisualSelection(Controlador contr, Serie se, int temp, int ep){
        this.contr = contr;
        this.se = se;
        this.temp = temp;
        this.ep = ep;

        initComponents();
        setLocationRelativeTo(null);
        t = new Timer(10,actions);
        bValor.setEnabled(false);
    }

    private int sec, cs;
    private ActionListener actions = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ++cs;
            if (cs == 100){
                cs = 0;
                ++sec;
            }

            if (sec == 5){
                t.stop();
                button1.setEnabled(false);
                button2.setEnabled(false);
                bValor.setEnabled(true);
            }
            actualitzarLabel();
        }
    };

    public void actualitzarLabel(){
        String tiempo = (sec<=9?"0":"")+sec+":"+(cs<=9?"0":"")+cs;
        timeLabel.setText(tiempo);
    }


    private void bValorActionPerformed(ActionEvent e) {
        ValorateSelection val = new ValorateSelection(contr, se, temp, ep);
        val.setVisible(true);
        this.dispose();
    }

    private void bCancelActionPerformed(ActionEvent e) {
        this.dispose();
    }

    private void button1ActionPerformed(ActionEvent e) {
        t.start();
        button1.setEnabled(false);
        button1.setText("Reanudar");
        button2.setEnabled(true);
    }

    private void button2ActionPerformed(ActionEvent e) {
        t.stop();
        button1.setEnabled(true);
        button2.setEnabled(false);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Laurentiu Nedelcu
        bValor = new JButton();
        bCancel = new JButton();
        timeLabel = new JLabel();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        //---- bValor ----
        bValor.setText("Valora");
        bValor.addActionListener(e -> bValorActionPerformed(e));

        //---- bCancel ----
        bCancel.setText("Cancel\u00b7la");
        bCancel.addActionListener(e -> bCancelActionPerformed(e));

        //---- timeLabel ----
        timeLabel.setText("00:00");
        timeLabel.setFont(new Font("Ubuntu", Font.PLAIN, 24));

        //---- button1 ----
        button1.setText("Play");
        button1.addActionListener(e -> button1ActionPerformed(e));

        //---- button2 ----
        button2.setText("Pause");
        button2.addActionListener(e -> {
			button2ActionPerformed(e);
			button2ActionPerformed(e);
		});

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(bValor, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                    .addComponent(bCancel, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addContainerGap(149, Short.MAX_VALUE)
                            .addComponent(timeLabel, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addComponent(button1)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                            .addComponent(button2)))
                    .addGap(39, 39, 39))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(timeLabel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                    .addGap(29, 29, 29)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button1)
                        .addComponent(button2))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(bValor)
                        .addComponent(bCancel))
                    .addGap(38, 38, 38))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Laurentiu Nedelcu
    private JButton bValor;
    private JButton bCancel;
    private JLabel timeLabel;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
