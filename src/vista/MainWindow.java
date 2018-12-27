
package vista;

import java.awt.event.*;

import com.sun.codemodel.internal.JOp;
import controller.Controlador;
import model.Serie;
import model.Temporada;

import java.awt.*;
import java.util.Iterator;
import java.util.List;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;


public class MainWindow extends javax.swing.JFrame implements ObserverLlistas{
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
    private void closeActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void exitActionPerformed(ActionEvent e) {
        this.dispose();
        JOptionPane.showMessageDialog(null,"S'ha finalitzat la sessió amb èxit!", "Fins aviat!", JOptionPane.INFORMATION_MESSAGE);
    }

    public MainWindow() {
        this.contr = Controlador.getInstance();
        contr.addObserverLlista(this);
        initComponents();
        initCat();
        initWatchNext();
        initWatched();
        initNotStarted();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - Marcos
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
        button1 = new JButton();
        icon = new JLabel();

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
        jLabel1.setText("CAT\u00c1LEG D'ESTRENES");
        jLabel1.setFont(new Font("AppleGothic", Font.ITALIC, 13));

        //---- jLabel2 ----
        jLabel2.setText("PENDENTS");
        jLabel2.setFont(new Font("AppleGothic", Font.ITALIC, 13));

        //---- jLabel3 ----
        jLabel3.setText("PER COMEN\u00c7AR");
        jLabel3.setFont(new Font("AppleGothic", Font.ITALIC, 13));

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
        jLabel4.setText("VISTES");
        jLabel4.setFont(new Font("AppleGothic", Font.ITALIC, 13));

        //---- jLabel5 ----
        jLabel5.setFont(new Font("Impact", Font.ITALIC, 24));
        jLabel5.setText("Series Time UB");

        //---- bInitCat ----
        bInitCat.setText("Go Back!");
        bInitCat.setFont(new Font("AppleGothic", Font.ITALIC, 13));
        bInitCat.addActionListener(e -> bInitCatActionPerformed(e));

        //---- bInitWatchN ----
        bInitWatchN.setText("Go Back!");
        bInitWatchN.setFont(new Font("AppleGothic", Font.ITALIC, 13));
        bInitWatchN.addActionListener(e -> bInitWatchNActionPerformed(e));

        //---- bInitWatched ----
        bInitWatched.setText("Go Back!");
        bInitWatched.setFont(new Font("AppleGothic", Font.ITALIC, 13));
        bInitWatched.addActionListener(e -> bInitWatchedActionPerformed(e));

        //---- bInitNStarted ----
        bInitNStarted.setText("Go Back!");
        bInitNStarted.setFont(new Font("AppleGothic", Font.ITALIC, 13));
        bInitNStarted.addActionListener(e -> bInitNStartedActionPerformed(e));

        //---- button1 ----
        button1.setText("Tanca la sessi\u00f3");
        button1.setFont(new Font("AppleGothic", Font.ITALIC, 13));
        button1.addActionListener(e -> {
			closeActionPerformed(e);
			exitActionPerformed(e);
		});

        //---- icon ----
        icon.setIcon(new ImageIcon("/Users/marcosplazagonzalez/Desktop/A04-A04Vista/src/graphicalResources/little.png"));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(jLabel5)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(bInitCat))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)))
                    .addGap(27, 27, 27)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(button1)
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane4, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bInitWatchN)
                            .addGap(12, 12, 12)
                            .addComponent(jLabel4)
                            .addGap(24, 24, 24)
                            .addComponent(bInitWatched)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel3)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(icon)
                                .addComponent(bInitNStarted))))
                    .addContainerGap(13, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(jLabel5)
                        .addComponent(icon))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(bInitCat)
                        .addComponent(bInitWatched)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)
                        .addComponent(bInitWatchN)
                        .addComponent(bInitNStarted))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 387, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 387, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 387, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane4, GroupLayout.PREFERRED_SIZE, 387, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(button1)
                    .addContainerGap(20, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
    }// </editor-fold>//GEN-END:initComponents

    private void catListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_catListValueChanged
        actCat();
    }//GEN-LAST:event_catListValueChanged

    private void watchNListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_watchNListValueChanged
        actWatchNext();
    }//GEN-LAST:event_watchNListValueChanged

    private void watchedListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_watchedListValueChanged
        actWatched();
    }//GEN-LAST:event_watchedListValueChanged

    private void notStartedListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_notStartedListValueChanged
        actNotStarted();
    }//GEN-LAST:event_notStartedListValueChanged

    private void bInitCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInitCatActionPerformed
        initCat();
    }//GEN-LAST:event_bInitCatActionPerformed

    private void bInitWatchNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInitWatchNActionPerformed
        initWatchNext();
    }//GEN-LAST:event_bInitWatchNActionPerformed

    private void bInitWatchedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInitWatchedActionPerformed
        initWatched();
    }//GEN-LAST:event_bInitWatchedActionPerformed

    private void bInitNStartedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInitNStartedActionPerformed
        initNotStarted();
    }//GEN-LAST:event_bInitNStartedActionPerformed


    public void initCat(){
        List list = contr.getCataleg();
        DefaultListModel model = new DefaultListModel();
        Iterator<Serie> it = list.iterator();
        while(it.hasNext()){
            model.addElement(it.next());
        }
        catList.setModel(model);
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
                    EpSelection ep = new EpSelection(seCat,tempCat,epCat);
                    ep.setVisible(true);
                    catList.clearSelection();
                }
            }
        }
    }


    public void initWatchNext(){
        List list = contr.llistaDeSeriesComencades();
        DefaultListModel model = new DefaultListModel();
        Iterator<Serie> it = list.iterator();
        while(it.hasNext()){
            model.addElement(it.next());
        }
        watchNList.setModel(model);
    }

    public void actWatchNext(){
        if(!watchNList.isSelectionEmpty()){
            int i = watchNList.getSelectedIndex();
            DefaultListModel model = (DefaultListModel) watchNList.getModel();
            DefaultListModel newModel = new DefaultListModel();
            if (model.elementAt(i) instanceof Serie){
                Serie se = (Serie) model.elementAt(i);
                seWatchNext = se;
                for(i = 0; i<se.numTemp(); i++){
                    String t = "Temporada ";
                    t += Integer.toString(i+1);
                    newModel.addElement(t);
                }
                watchNList.setModel(newModel);
            }
            else{
                String s = (String) model.elementAt(i);
                if(s.charAt(0) == 'T'){
                    tempWatchNext = i+1;
                    Temporada temp = seWatchNext.getTemporada(tempWatchNext-1);
                    for(i = 0; i<temp.numEp();i++){
                        String t = "Episodi ";
                        t += Integer.toString(i+1);
                        newModel.addElement(t);
                    }
                    watchNList.setModel(newModel);
                }
                else if(s.charAt(0) == 'E'){
                    epWatchNext = i+1;
                    EpSelection ep = new EpSelection(seWatchNext,tempWatchNext,epWatchNext);
                    ep.setVisible(true);
                    watchNList.clearSelection();
                }
            }
        }
    }


    public void initWatched(){
        List list = contr.llistaDeSeriesAcabades();
        DefaultListModel model = new DefaultListModel();
        Iterator<Serie> it = list.iterator();
        while(it.hasNext()){
            model.addElement(it.next());
        }
        watchedList.setModel(model);
    }

    public void actWatched(){
        if(!watchedList.isSelectionEmpty()){
            int i = watchedList.getSelectedIndex();
            DefaultListModel model = (DefaultListModel) watchedList.getModel();
            DefaultListModel newModel = new DefaultListModel();
            if (model.elementAt(i) instanceof Serie){
                Serie se = (Serie) model.elementAt(i);
                seWatched = se;
                for(i = 0; i<se.numTemp(); i++){
                    String t = "Temporada ";
                    t += Integer.toString(i+1);
                    newModel.addElement(t);
                }
                watchedList.setModel(newModel);
            }
            else{
                String s = (String) model.elementAt(i);
                if(s.charAt(0) == 'T'){
                    tempWatched = i+1;
                    Temporada temp = seWatched.getTemporada(tempWatched-1);
                    for(i = 0; i<temp.numEp();i++){
                        String t = "Episodi ";
                        t += Integer.toString(i+1);
                        newModel.addElement(t);
                    }
                    watchedList.setModel(newModel);
                }
                else if(s.charAt(0) == 'E'){
                    epWatched = i+1;
                    EpSelection ep = new EpSelection(seWatched,tempWatched,epWatched);
                    ep.setVisible(true);
                    watchedList.clearSelection();
                }
            }
        }
    }

    public void initNotStarted(){
        List list = contr.llistaDeSeriesNoComencades();
        DefaultListModel model = new DefaultListModel();
        Iterator<Serie> it = list.iterator();
        while(it.hasNext()){
            model.addElement(it.next());
        }
        notStartedList.setModel(model);
    }

    public void actNotStarted(){
        if(!notStartedList.isSelectionEmpty()){
            int i = notStartedList.getSelectedIndex();
            DefaultListModel model = (DefaultListModel) notStartedList.getModel();
            DefaultListModel newModel = new DefaultListModel();
            if (model.elementAt(i) instanceof Serie){
                Serie se = (Serie) model.elementAt(i);
                seNotStarted = se;
                for(i = 0; i<se.numTemp(); i++){
                    String t = "Temporada ";
                    t += Integer.toString(i+1);
                    newModel.addElement(t);
                }
                notStartedList.setModel(newModel);
            }
            else{
                String s = (String) model.elementAt(i);
                if(s.charAt(0) == 'T'){
                    tempNotStarted = i+1;
                    Temporada temp = seNotStarted.getTemporada(tempNotStarted-1);
                    for(i = 0; i<temp.numEp();i++){
                        String t = "Episodi ";
                        t += Integer.toString(i+1);
                        newModel.addElement(t);
                    }
                    notStartedList.setModel(newModel);
                }
                else if(s.charAt(0) == 'E'){
                    epNotStarted = i+1;
                    EpSelection ep = new EpSelection(seNotStarted,tempNotStarted,epNotStarted);
                    ep.setVisible(true);
                    notStartedList.clearSelection();
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Marcos
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
    private JButton button1;
    private JLabel icon;

    @Override
    public void updateLlistas() {
        initCat();
        initWatched();
        initNotStarted();
        initWatchNext();
    }
    // End of variables declaration//GEN-END:variables
}


