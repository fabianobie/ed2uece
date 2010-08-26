/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JanelaPrincipal.java
 *
 * Created on 24/08/2010, 23:46:03
 */

package ed2.view;

import java.awt.Color;
import java.awt.LayoutManager;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;


public class JanelaPrincipal extends javax.swing.JFrame {

   
    public JanelaPrincipal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuEstrturas = new javax.swing.JMenu();
        jMenuTree = new javax.swing.JMenuItem();
        jMenuItemHash = new javax.swing.JMenuItem();
        jMenuItemHeap = new javax.swing.JMenuItem();
        jMenuItemFechar = new javax.swing.JMenuItem();
        jMenuSobre = new javax.swing.JMenu();
        jMenuItemEquipe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane.setAutoscrolls(true);

        jMenuEstrturas.setText("Estruturas");
        jMenuEstrturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEstrturasActionPerformed(evt);
            }
        });

        jMenuTree.setText("Arvores de Busca");
        jMenuTree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTreeActionPerformed(evt);
            }
        });
        jMenuEstrturas.add(jMenuTree);

        jMenuItemHash.setText("Hash");
        jMenuItemHash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHashActionPerformed(evt);
            }
        });
        jMenuEstrturas.add(jMenuItemHash);

        jMenuItemHeap.setText("Heap");
        jMenuItemHeap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHeapActionPerformed(evt);
            }
        });
        jMenuEstrturas.add(jMenuItemHeap);

        jMenuItemFechar.setText("Fechar");
        jMenuItemFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFecharActionPerformed(evt);
            }
        });
        jMenuEstrturas.add(jMenuItemFechar);

        jMenuBar1.add(jMenuEstrturas);

//        jMenuSobre.setText("Sobre");
//        jMenuSobre.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jMenuSobreActionPerformed(evt);
//            }
//        });
//
//        jMenuItemEquipe.setText("Equipe");
//        jMenuItemEquipe.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jMenuItemEquipeActionPerformed(evt);
//            }
//        });
        jMenuSobre.add(jMenuItemEquipe);

        jMenuBar1.add(jMenuSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 829, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuEstrturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEstrturasActionPerformed
       
    }//GEN-LAST:event_jMenuEstrturasActionPerformed

    private void jMenuItemHashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemHashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemHashActionPerformed

    private void jMenuItemHeapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemHeapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemHeapActionPerformed

    private void jMenuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSobreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuSobreActionPerformed

    private void jMenuItemEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEquipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemEquipeActionPerformed

    private void jMenuItemFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFecharActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemFecharActionPerformed

    private void jMenuTreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTreeActionPerformed

        AvlJPanel treePanel = new AvlJPanel();
        try{
        addInternalPainel(treePanel);
        }catch(Exception ex){
            
        }
       System.out.print("passei aqui");
    }//GEN-LAST:event_jMenuTreeActionPerformed


        public void addInternalPainel(JInternalFrame novo) throws Exception {
                novo.setVisible(true);
                novo.setBounds( 10, 10, 460, 410);
                novo.setClosable(true);
                novo.setResizable(true);
                novo.setMaximizable(true);
                novo.setIconifiable(true);
                novo.setFocusable(true);
                novo.setBackground(Color.white);
                jDesktopPane.add(novo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        }


    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame jmain = new JanelaPrincipal();

               /* try{
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                }catch(Exception ex) {
                   ex.printStackTrace();
                }*/

                jmain.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuEstrturas;
    private javax.swing.JMenuItem jMenuItemEquipe;
    private javax.swing.JMenuItem jMenuItemFechar;
    private javax.swing.JMenuItem jMenuItemHash;
    private javax.swing.JMenuItem jMenuItemHeap;
    private javax.swing.JMenu jMenuSobre;
    private javax.swing.JMenuItem jMenuTree;
    // End of variables declaration//GEN-END:variables

}
