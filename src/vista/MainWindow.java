
package vista;

import controller.Controlador;
import model.Serie;
import model.Temporada;

import java.awt.*;
import java.util.Iterator;
import java.util.List;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;


public class MainWindow extends javax.swing.JFrame {
    Controlador contr;

    Serie seCat;
    int tempCat;
    int epCat;

    Serie seWatched;
    int tempWatched;
    int epWatched;

    Serie seWatchNext;
    int tempWatchNext;
    int epWatchNext;

    Serie seNotStarted;
    int tempNotStarted;
    int epNotStarted;

    /**
     * Creates new form MainWindow
     */
    public MainWindow(Controlador contr) {
        this.contr = contr;
        initComponents();
        initCat();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - Quim Yuste
    private void initComponents() {
        jScrollPane1 = new JScrollPane();
        catList = new JList<>();
        jScrollPane2 = new JScrollPane();
        watchNList = new JList<>();
        jScrollPane3 = new JScrollPane();
        notStartedList = new JList<>();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jScrollPane4 = new JScrollPane();
        watchedList = new JList<>();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        bInitCat = new JButton();
        bInitWatchN = new JButton();
        bInitWatched = new JButton();
        bInitNStarted = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        //======== jScrollPane1 ========
        {

            //---- catList ----
            catList.setModel(new AbstractListModel<String>() {
                String[] values = {

                };
                @Override
                public int getSize() { return values.length; }
                @Override
                public String getElementAt(int i) { return values[i]; }
            });
            catList.addListSelectionListener(e -> catListValueChanged(e));
            jScrollPane1.setViewportView(catList);
        }

        //======== jScrollPane2 ========
        {

            //---- watchNList ----
            watchNList.setModel(new AbstractListModel<String>() {
                String[] values = {

                };
                @Override
                public int getSize() { return values.length; }
                @Override
                public String getElementAt(int i) { return values[i]; }
            });
            watchNList.addListSelectionListener(e -> watchNListValueChanged(e));
            jScrollPane2.setViewportView(watchNList);
        }

        //======== jScrollPane3 ========
        {

            //---- notStartedList ----
            notStartedList.setModel(new AbstractListModel<String>() {
                String[] values = {

                };
                @Override
                public int getSize() { return values.length; }
                @Override
                public String getElementAt(int i) { return values[i]; }
            });
            notStartedList.addListSelectionListener(e -> notStartedListValueChanged(e));
            jScrollPane3.setViewportView(notStartedList);
        }

        //---- jLabel1 ----
        jLabel1.setText("Cataleg");

        //---- jLabel2 ----
        jLabel2.setText("Watch Next");

        //---- jLabel3 ----
        jLabel3.setText("NotStarted");

        //======== jScrollPane4 ========
        {

            //---- watchedList ----
            watchedList.setModel(new AbstractListModel<String>() {
                String[] values = {

                };
                @Override
                public int getSize() { return values.length; }
                @Override
                public String getElementAt(int i) { return values[i]; }
            });
            watchedList.addListSelectionListener(e -> watchedListValueChanged(e));
            jScrollPane4.setViewportView(watchedList);
        }

        //---- jLabel4 ----
        jLabel4.setText("Watched");

        //---- jLabel5 ----
        jLabel5.setFont(new Font("Tahoma", Font.PLAIN, 24));
        jLabel5.setText("Series Time UB");

        //---- bInitCat ----
        bInitCat.setText("Init");
        bInitCat.addActionListener(e -> bInitCatActionPerformed(e));

        //---- bInitWatchN ----
        bInitWatchN.setText("Init");
        bInitWatchN.addActionListener(e -> bInitWatchNActionPerformed(e));

        //---- bInitWatched ----
        bInitWatched.setText("Init");
        bInitWatched.addActionListener(e -> bInitWatchedActionPerformed(e));

        //---- bInitNStarted ----
        bInitNStarted.setText("Init");
        bInitNStarted.addActionListener(e -> bInitNStartedActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bInitCat)))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bInitWatchN)))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane4, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bInitWatched)))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(bInitNStarted))
                        .addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(234, 234, 234)
                    .addComponent(jLabel5)
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel5)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(bInitWatchN)
                            .addComponent(jLabel4))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(bInitCat)
                            .addComponent(jLabel1))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(bInitWatched)
                            .addComponent(jLabel3))
                        .addComponent(bInitNStarted, GroupLayout.Alignment.TRAILING))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 387, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 387, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 387, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane4, GroupLayout.PREFERRED_SIZE, 387, GroupLayout.PREFERRED_SIZE)))
        );
        pack();
        setLocationRelativeTo(getOwner());
    }// </editor-fold>//GEN-END:initComponents

    private void catListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_catListValueChanged
        actCat();
    }//GEN-LAST:event_catListValueChanged

    private void watchNListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_watchNListValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_watchNListValueChanged

    private void watchedListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_watchedListValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_watchedListValueChanged

    private void notStartedListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_notStartedListValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_notStartedListValueChanged

    private void bInitCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInitCatActionPerformed
        initCat();
    }//GEN-LAST:event_bInitCatActionPerformed

    private void bInitWatchNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInitWatchNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bInitWatchNActionPerformed

    private void bInitWatchedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInitWatchedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bInitWatchedActionPerformed

    private void bInitNStartedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInitNStartedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bInitNStartedActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow( new Controlador()).setVisible(true);
            }
        });
    }

    public void actCat(){
        if(!catList.isSelectionEmpty()){
            int i = catList.getSelectedIndex();
            DefaultListModel model = (DefaultListModel) catList.getModel();
            DefaultListModel newModel = new DefaultListModel();
            if (model.elementAt(i) instanceof Serie){
                Serie se = (Serie) model.elementAt(i);
                seCat = se;
                for(i = 0; i<se.numTemp(); i++){
                    String t = "Temporada ";
                    t += Integer.toString(i+1);
                    newModel.addElement(t);
                }
                catList.setModel(newModel);
            }
            else{
                String s = (String) model.elementAt(i);
                if(s.charAt(0) == 'T'){
                    tempCat = i+1;
                    Temporada temp = seCat.getTemporada(tempCat-1);
                    for(i = 0; i<temp.numEp();i++){
                        String t = "Episodi ";
                        t += Integer.toString(i+1);
                        newModel.addElement(t);
                    }
                    catList.setModel(newModel);
                }
                else if(s.charAt(0) == 'E'){
                    epCat = i+1;
                    EpSelection ep = new EpSelection(contr,seCat,tempCat,epCat);
                    ep.setVisible(true);
                    catList.clearSelection();
                }
            }
        }
    }
    public void initCat(){
        List list = contr.getCataleg();
        DefaultListModel model = new DefaultListModel();
        Iterator<Serie> it = list.iterator();
        while(it.hasNext()){
            model.addElement(it.next());
        }
        catList.setModel(model);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Quim Yuste
    private JScrollPane jScrollPane1;
    private JList<String> catList;
    private JScrollPane jScrollPane2;
    private JList<String> watchNList;
    private JScrollPane jScrollPane3;
    private JList<String> notStartedList;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JScrollPane jScrollPane4;
    private JList<String> watchedList;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JButton bInitCat;
    private JButton bInitWatchN;
    private JButton bInitWatched;
    private JButton bInitNStarted;
    // End of variables declaration//GEN-END:variables
}


