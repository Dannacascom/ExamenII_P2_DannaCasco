
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Danna Casco
 */
public class main extends javax.swing.JFrame {

    ArrayList<Equipos> e = new ArrayList();
    ArrayList<Torneo> t = new ArrayList();
    ArrayList<Partidos> p = new ArrayList();
    ArrayList<Deporte> d = new ArrayList();
    listaa l = new listaa(this, true);
    puntoss pjd = new puntoss(this, true);
  DefaultMutableTreeNode node;
    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        setLocationRelativeTo(null);
        l.setLocationRelativeTo(null);
        pjd.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popmenu = new javax.swing.JPopupMenu();
        crearD = new javax.swing.JMenuItem();
        popmenuT = new javax.swing.JPopupMenu();
        listar = new javax.swing.JMenuItem();
        tabla = new javax.swing.JMenuItem();
        Guardar = new javax.swing.JMenuItem();
        popmenuD = new javax.swing.JPopupMenu();
        crearT = new javax.swing.JMenuItem();
        CrearE = new javax.swing.JMenuItem();
        crearP = new javax.swing.JMenuItem();
        bg = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        treee = new javax.swing.JTree();
        bar = new javax.swing.JProgressBar();

        crearD.setText("Crear deporte\n");
        crearD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearDActionPerformed(evt);
            }
        });
        popmenu.add(crearD);

        listar.setText("Listar Equipos\n");
        listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarActionPerformed(evt);
            }
        });
        popmenuT.add(listar);

        tabla.setText("Mostrar Tabla\n");
        tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tablaActionPerformed(evt);
            }
        });
        popmenuT.add(tabla);

        Guardar.setText("Guardar\n");
        popmenuT.add(Guardar);

        crearT.setText("Crear Torneo\n");
        crearT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearTActionPerformed(evt);
            }
        });
        popmenuD.add(crearT);

        CrearE.setText("Crear Equipo");
        CrearE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearEActionPerformed(evt);
            }
        });
        popmenuD.add(CrearE);

        crearP.setText("Crear Partido");
        crearP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearPActionPerformed(evt);
            }
        });
        popmenuD.add(crearP);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Tareas");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Q1");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Q2");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Q4");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Q5");
        treeNode1.add(treeNode2);
        treee.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        treee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                treeeMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(treee);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(bar, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(bar, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void treeeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_treeeMousePressed

        showPopup(evt);
    }//GEN-LAST:event_treeeMousePressed

    public void showPopup(MouseEvent evt) {
        TreePath path = treee.getPathForLocation(evt.getX(), evt.getY());
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) path.getLastPathComponent();

        if (selectedNode.toString().equals("Q1") || (selectedNode.toString().equals("Q2")) || (selectedNode.toString().equals("Q4")) || (selectedNode.toString().equals("Q5"))) {
            popmenu.show(evt.getComponent(), evt.getX(), evt.getY());
        } else if ((selectedNode.getParent().toString().equals("Q1") || (selectedNode.toString().equals("Q4")) || (selectedNode.toString().equals("Q5"))) && selectedNode.getLevel() == 2) {
            popmenuD.show(evt.getComponent(), evt.getX(), evt.getY());
        } else if ((selectedNode.getParent().getParent().toString().equals("Q1") || (selectedNode.toString().equals("Q4")) || (selectedNode.toString().equals("Q5"))) && selectedNode.getLevel() == 3) {
            popmenuT.show(evt.getComponent(), evt.getX(), evt.getY());
        } else if ((selectedNode.toString().equals("Q2")) && selectedNode.getLevel() == 2) {
            popmenuD.show(evt.getComponent(), evt.getX(), evt.getY());

        }
    }
    private void crearPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crearPActionPerformed

    private void crearDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearDActionPerformed
        // TODO add your handling code here:
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) treee.getLastSelectedPathComponent();
        String child = JOptionPane.showInputDialog("Ingrese Deporte: ");

        DefaultMutableTreeNode childNode = new DefaultMutableTreeNode(child);

        DefaultMutableTreeNode parentNode = (DefaultMutableTreeNode) treee.getModel().getRoot();
        for (int i = 0; i < parentNode.getChildCount(); i++) {
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) parentNode.getChildAt(i);
            node.add(new DefaultMutableTreeNode(child));
        }
        ((DefaultTreeModel) treee.getModel()).reload();

        Deporte de = new Deporte(child);

        d.add(de);
    }//GEN-LAST:event_crearDActionPerformed

    private void crearTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearTActionPerformed
        String child = JOptionPane.showInputDialog("Ingrese nombre de Torneo: ");
        DefaultMutableTreeNode selectedChildNode = (DefaultMutableTreeNode) treee.getLastSelectedPathComponent();
        DefaultMutableTreeNode newChildNode = new DefaultMutableTreeNode(child);
        selectedChildNode.add(newChildNode);
        DefaultTreeModel treeModel = (DefaultTreeModel) treee.getModel();
        treeModel.reload();

        Torneo to = new Torneo(child, selectedChildNode.toString());
        t.add(to);
    }//GEN-LAST:event_crearTActionPerformed

    private void CrearEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearEActionPerformed
        // TODO add your handling code here:
        String equipo = JOptionPane.showInputDialog("Ingrese nombre de Equipo: ");
        Equipos eq = new Equipos(equipo);

        e.add(eq);
        
    }//GEN-LAST:event_CrearEActionPerformed

    
    
    private void listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarActionPerformed
        // TODO add your handling code here:
        l.setVisible(true);
        
        DefaultListModel modelo = (DefaultListModel) l.listaaa().getModel();
        modelo.removeAllElements();
        modelo.addAll( ((Torneo) node.getUserObject()).getEquipos() );
    }//GEN-LAST:event_listarActionPerformed

    private void tablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tablaActionPerformed
        // TODO add your handling code here:
       
        DefaultTableModel modelo = (DefaultTableModel)  pjd.obtenerTabla().getModel();
       modelo.setRowCount(0);
       
     
        Torneo torneo = (Torneo) node.getUserObject();
        ArrayList<Integer> puntos = new ArrayList<>();

        for (Equipos equipo : torneo.getEquipos()) {
            Object[] row = {equipo.getNombre(),equipo.getPuntos()};
            modelo.addRow(row);
        }
        Collections.sort(puntos);
        
        Comparator<Equipos> compareByPoints = Comparator.comparing(Equipos::getPuntos).reversed();
        Collections.sort(torneo.getEquipos(), compareByPoints);
        for (Equipos equipo : torneo.getEquipos()) {
            Object[] row = {equipo.getNombre(),equipo.getPuntos()};
            modelo.addRow(row);
        }
        pjd.setVisible(true);
    }//GEN-LAST:event_tablaActionPerformed

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
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CrearE;
    private javax.swing.JMenuItem Guardar;
    private javax.swing.JProgressBar bar;
    private javax.swing.JPanel bg;
    private javax.swing.JMenuItem crearD;
    private javax.swing.JMenuItem crearP;
    private javax.swing.JMenuItem crearT;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem listar;
    private javax.swing.JPopupMenu popmenu;
    private javax.swing.JPopupMenu popmenuD;
    private javax.swing.JPopupMenu popmenuT;
    private javax.swing.JMenuItem tabla;
    private javax.swing.JTree treee;
    // End of variables declaration//GEN-END:variables
}
