
package telas;

import dao.FornecedorDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Fornecedor;


public class Fornecedores extends javax.swing.JFrame {

    private Menu telamenu;
   private FornecedorDAO fornecedorDAO = new FornecedorDAO();
   public Fornecedores(Menu telamenu) {
    initComponents();
    this.telamenu = telamenu;
    atualizarTabela();
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        JbVoltar = new javax.swing.JButton();
        JbCadastrarF = new javax.swing.JButton();
        JbBuscarFornecedor = new javax.swing.JButton();
        JbExcluirFornecedor = new javax.swing.JButton();
        JbMostrarTodos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Fornecedores");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "CNPJ", "Contato"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        JbVoltar.setText("Voltar");
        JbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbVoltarActionPerformed(evt);
            }
        });

        JbCadastrarF.setText("Cadastrar Fornecedor");
        JbCadastrarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbCadastrarFActionPerformed(evt);
            }
        });

        JbBuscarFornecedor.setText("Buscar Fornecedor");
        JbBuscarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbBuscarFornecedorActionPerformed(evt);
            }
        });

        JbExcluirFornecedor.setText("Excluir Fornecedor");
        JbExcluirFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbExcluirFornecedorActionPerformed(evt);
            }
        });

        JbMostrarTodos.setText("Mostrar todos");
        JbMostrarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbMostrarTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(JbVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JbCadastrarF, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(JbExcluirFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JbBuscarFornecedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbMostrarTodos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbCadastrarF)
                    .addComponent(JbBuscarFornecedor))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbExcluirFornecedor)
                    .addComponent(JbMostrarTodos))
                .addGap(38, 38, 38)
                .addComponent(JbVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JbCadastrarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbCadastrarFActionPerformed
       this.setVisible(false);
       CadastrarFornecedor telacf= new CadastrarFornecedor(this);
       telacf.setVisible(true);
    }//GEN-LAST:event_JbCadastrarFActionPerformed

    private void JbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbVoltarActionPerformed
          this.setVisible(false); 
          telamenu.setVisible(true);
    }//GEN-LAST:event_JbVoltarActionPerformed

    private void JbBuscarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbBuscarFornecedorActionPerformed
      String cnpj = JOptionPane.showInputDialog(this, "Digite o CNPJ do fornecedor:");

if (cnpj == null || cnpj.isEmpty()) return;


cnpj = cnpj.replaceAll("[^0-9]", "");

    Fornecedor f = fornecedorDAO.buscarPorCnpj(cnpj);

    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);

    if (f != null) {
        model.addRow(new Object[]{
            f.getId(),
            f.getNome(),
            f.getCnpj(),
            f.getContato()
        });
    } else {
        JOptionPane.showMessageDialog(this, "Fornecedor não encontrado.");
    }
    }//GEN-LAST:event_JbBuscarFornecedorActionPerformed

    private void JbMostrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbMostrarTodosActionPerformed
        atualizarTabela();
    }//GEN-LAST:event_JbMostrarTodosActionPerformed

    private void JbExcluirFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbExcluirFornecedorActionPerformed
    String cnpj = JOptionPane.showInputDialog(this, "Digite o CNPJ do fornecedor:");

if (cnpj == null || cnpj.isEmpty()) return;


cnpj = cnpj.replaceAll("[^0-9]", "");

    try {
        boolean removido = fornecedorDAO.excluirPorCnpj(cnpj);

     if (removido) {
    JOptionPane.showMessageDialog(this, "Fornecedor removido com sucesso!");
    atualizarTabela(); // recarrega do banco
} else {
    JOptionPane.showMessageDialog(this, "Fornecedor não encontrado.");
}
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao excluir: " + e.getMessage());
    }
        
        
    }//GEN-LAST:event_JbExcluirFornecedorActionPerformed


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
            java.util.logging.Logger.getLogger(Fornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbBuscarFornecedor;
    private javax.swing.JButton JbCadastrarF;
    private javax.swing.JButton JbExcluirFornecedor;
    private javax.swing.JButton JbMostrarTodos;
    private javax.swing.JButton JbVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

public void atualizarTabela() {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);

    try {
        List<Fornecedor> fornecedores = fornecedorDAO.listarTodos();

        for (Fornecedor f : fornecedores) {
            model.addRow(new Object[]{
                f.getId(),
                f.getNome(),
                f.getCnpj(),
                f.getContato()
            });
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao carregar fornecedores: " + e.getMessage());
    }
}


}
