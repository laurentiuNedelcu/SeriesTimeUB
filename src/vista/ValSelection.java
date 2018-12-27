package vista;

import controller.Controlador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ValSelection extends JFrame{
    Controlador contr;
    EpSelection ep;

    public ValSelection(Controlador contr, EpSelection ep){
        this.contr = contr;
        this.ep = ep;

        initComponents();
        bValor.enable(false);
        final int MAX = 5;

        // creates progress bar
        progressBar1.setMinimum(0);
        progressBar1.setMaximum(MAX);
        progressBar1.setStringPainted(true);

        // add progress bar
        setLayout(new FlowLayout());
        getContentPane().add(progressBar1);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);

        // update progressbar
        for (int i = 0; i <= MAX; i++) {
            final int currentValue = i;
            try {
                SwingUtilities.invokeLater(() -> progressBar1.setValue(currentValue));
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }

        if (progressBar1.getValue() == MAX){
            bValor.enable(true);
        }

    }

    private void bValorActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void bCancelActionPerformed(ActionEvent e) {
        this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Laurentiu Nedelcu
        bValor = new JButton();
        bCancel = new JButton();
        progressBar1 = new JProgressBar();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        //---- bValor ----
        bValor.setText("Valora");
        bValor.addActionListener(e -> bValorActionPerformed(e));

        //---- bCancel ----
        bCancel.setText("Cancel\u00b7la");
        bCancel.addActionListener(e -> bCancelActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(bValor, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                    .addComponent(bCancel, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
                    .addGap(34, 34, 34))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(86, Short.MAX_VALUE)
                    .addComponent(progressBar1, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE)
                    .addGap(73, 73, 73))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(progressBar1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                    .addGap(42, 42, 42)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(bCancel)
                        .addComponent(bValor))
                    .addContainerGap(137, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Laurentiu Nedelcu
    private JButton bValor;
    private JButton bCancel;
    private JProgressBar progressBar1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
