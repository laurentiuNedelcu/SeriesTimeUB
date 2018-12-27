/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista;

import controller.Controlador;
import model.Serie;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;


public class EpSelection extends javax.swing.JFrame {
    Controlador contr;
    Serie se;
    int temp;
    int ep;
    /**
     * Creates new form EpSelection
     */
    public EpSelection(Controlador contr, Serie se, int temp, int ep) {
        this.contr = contr;
        this.se = se;
        this.temp = temp;
        this.ep = ep;

        initComponents();
        String s;
        lblSerie.setText(se.getTitle());
        s = "Temp: ";
        s += Integer.toString(temp);
        lblTemp.setText(s);
        s = "Ep: ";
        s += Integer.toString(ep);
        lblEp.setText(s);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - Quim Yuste
    private void initComponents() {
        bSubs = new JButton();
        bVisual = new JButton();
        bValor = new JButton();
        lblSerie = new JLabel();
        lblTemp = new JLabel();
        lblEp = new JLabel();
        bCancel = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        //---- bSubs ----
        bSubs.setText("Susbcriure");
        bSubs.addActionListener(e -> bSubsActionPerformed(e));

        //---- bVisual ----
        bVisual.setText("Visualitza");
        bVisual.addActionListener(e -> bVisualActionPerformed(e));

        //---- bValor ----
        bValor.setText("Valora");
        bValor.addActionListener(e -> bValorActionPerformed(e));

        //---- lblSerie ----
        lblSerie.setText("Serie");

        //---- lblTemp ----
        lblTemp.setText("Temp");

        //---- lblEp ----
        lblEp.setText("Ep");

        //---- bCancel ----
        bCancel.setText("Cancel\u00b7la");
        bCancel.addActionListener(e -> bCancelActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(bSubs)
                        .addComponent(lblSerie))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(bCancel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bVisual, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                        .addComponent(lblTemp))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(bValor, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblEp))
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSerie)
                        .addComponent(lblTemp)
                        .addComponent(lblEp))
                    .addGap(28, 28, 28)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(bSubs)
                        .addComponent(bVisual)
                        .addComponent(bValor))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(bCancel)
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
    }// </editor-fold>//GEN-END:initComponents

    private void bValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bValorActionPerformed

    private void bSubsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSubsActionPerformed
        contr.subscriureEpisodi(ep,temp,se.getId());
        this.dispose();
    }//GEN-LAST:event_bSubsActionPerformed

    private void bVisualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVisualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bVisualActionPerformed

    private void bCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_bCancelActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Quim Yuste
    private JButton bSubs;
    private JButton bVisual;
    private JButton bValor;
    private JLabel lblSerie;
    private JLabel lblTemp;
    private JLabel lblEp;
    private JButton bCancel;
    // End of variables declaration//GEN-END:variables
}
