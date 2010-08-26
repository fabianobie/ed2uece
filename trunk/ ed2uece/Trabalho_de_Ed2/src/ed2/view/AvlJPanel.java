/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AvlJPanel.java
 *
 * Created on 25/08/2010, 00:38:26
 */

package ed2.view;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;


public class AvlJPanel extends JInternalFrame {

  
    public AvlJPanel() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelEntradas = new javax.swing.JPanel();
        jTextFieldEntrada = new javax.swing.JTextField();
        jButtonInserir = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jTabbedTree = new javax.swing.JTabbedPane();
        jPanelAVL = new javax.swing.JPanel();
        jPanelSplay = new javax.swing.JPanel();

        jPanelEntradas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonInserir.setText("Inserir");
        jButtonInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInserirActionPerformed(evt);
            }
        });

        jButtonDeletar.setText("Deletar");
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEntradasLayout = new javax.swing.GroupLayout(jPanelEntradas);
        jPanelEntradas.setLayout(jPanelEntradasLayout);
        jPanelEntradasLayout.setHorizontalGroup(
            jPanelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEntradasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonInserir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDeletar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBuscar)
                .addContainerGap(198, Short.MAX_VALUE))
        );
        jPanelEntradasLayout.setVerticalGroup(
            jPanelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEntradasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonInserir)
                    .addComponent(jButtonDeletar)
                    .addComponent(jButtonBuscar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelAVLLayout = new javax.swing.GroupLayout(jPanelAVL);
        jPanelAVL.setLayout(jPanelAVLLayout);
        jPanelAVLLayout.setHorizontalGroup(
            jPanelAVLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 609, Short.MAX_VALUE)
        );
        jPanelAVLLayout.setVerticalGroup(
            jPanelAVLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        jTabbedTree.addTab("AVL", jPanelAVL);

        javax.swing.GroupLayout jPanelSplayLayout = new javax.swing.GroupLayout(jPanelSplay);
        jPanelSplay.setLayout(jPanelSplayLayout);
        jPanelSplayLayout.setHorizontalGroup(
            jPanelSplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 609, Short.MAX_VALUE)
        );
        jPanelSplayLayout.setVerticalGroup(
            jPanelSplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        jTabbedTree.addTab("SPLAY", jPanelSplay);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelEntradas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedTree, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedTree, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE))
        );

        jTabbedTree.getAccessibleContext().setAccessibleName("AVL");
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInserirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonInserirActionPerformed

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButtonBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonInserir;
    private javax.swing.JPanel jPanelAVL;
    private javax.swing.JPanel jPanelEntradas;
    private javax.swing.JPanel jPanelSplay;
    private javax.swing.JTabbedPane jTabbedTree;
    private javax.swing.JTextField jTextFieldEntrada;
    // End of variables declaration//GEN-END:variables

}
