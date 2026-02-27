
package telas;

import dao.ProdutoDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Produto;


public class Cardapio extends javax.swing.JFrame {
   
    private Menu telamenu;
private ProdutoDAO produtoDAO = new ProdutoDAO();

public Cardapio(Menu telamenu) {
    initComponents();
    this.telamenu = telamenu;
    carregarTabela();
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        LbCardapio = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        JbVoltar = new javax.swing.JButton();
        JbBuscaCategoria = new javax.swing.JButton();
        JbCadastrarP = new javax.swing.JButton();
        JbAtualizarP = new javax.swing.JButton();
        JbExcluirP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Descrição", "Categoria", "Preço"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        LbCardapio.setText("Cardápio");

        JbVoltar.setText("Voltar ao menu ");
        JbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbVoltarActionPerformed(evt);
            }
        });

        JbBuscaCategoria.setText("Buscar por categoria");
        JbBuscaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbBuscaCategoriaActionPerformed(evt);
            }
        });

        JbCadastrarP.setText("Cadastrar Prato");
        JbCadastrarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbCadastrarPActionPerformed(evt);
            }
        });

        JbAtualizarP.setText("Atualizar preços");
        JbAtualizarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbAtualizarPActionPerformed(evt);
            }
        });

        JbExcluirP.setText("Excluir prato");
        JbExcluirP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbExcluirPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(JbVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(JbAtualizarP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JbCadastrarP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(67, 67, 67)
                .addComponent(JbExcluirP, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JbBuscaCategoria)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbCadastrarP)
                    .addComponent(JbBuscaCategoria)
                    .addComponent(JbExcluirP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JbAtualizarP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JbVoltar)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LbCardapio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LbCardapio)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbVoltarActionPerformed
    this.setVisible(false); 
    telamenu.setVisible(true);
    }//GEN-LAST:event_JbVoltarActionPerformed

    private void JbCadastrarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbCadastrarPActionPerformed
        this.setVisible(false);
        CadastrarPrato telaCadastro = new CadastrarPrato(Cardapio.this);
        telaCadastro.setVisible(true);
    }//GEN-LAST:event_JbCadastrarPActionPerformed

    private void JbAtualizarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbAtualizarPActionPerformed
      try {
        int id = Integer.parseInt(
            JOptionPane.showInputDialog(this, "Digite o ID do prato:")
        );

        double preco = Double.parseDouble(
            JOptionPane.showInputDialog(this, "Digite o novo preço:")
        );

        if (produtoDAO.atualizarPreco(id, preco)) {
            carregarTabela();
            JOptionPane.showMessageDialog(this, "Preço atualizado!");
        } else {
            JOptionPane.showMessageDialog(this, "Prato não encontrado!");
        }

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Valor inválido.");
    }
      
    }//GEN-LAST:event_JbAtualizarPActionPerformed

    private void JbBuscaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbBuscaCategoriaActionPerformed
        String categoria = JOptionPane.showInputDialog(this, "Digite a categoria:");

    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);

    for (Produto p : produtoDAO.buscarPorCategoria(categoria)) {
        model.addRow(new Object[]{
            p.getId(),
            p.getNome(),
            p.getDescricao(),
            p.getCategoria().getNomeCategoria(),
            p.getPreco()
        });
    }
    }//GEN-LAST:event_JbBuscaCategoriaActionPerformed

    private void JbExcluirPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbExcluirPActionPerformed
       String idStr = JOptionPane.showInputDialog(this, "Digite o ID do prato:");

    try {
        int id = Integer.parseInt(idStr);

        if (produtoDAO.excluir(id)) {
            carregarTabela();
            JOptionPane.showMessageDialog(this, "Prato excluído com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Prato não encontrado!");
        }

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "ID inválido.");
    }
         
    }//GEN-LAST:event_JbExcluirPActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbAtualizarP;
    private javax.swing.JButton JbBuscaCategoria;
    private javax.swing.JButton JbCadastrarP;
    private javax.swing.JButton JbExcluirP;
    private javax.swing.JButton JbVoltar;
    private javax.swing.JLabel LbCardapio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables


public void carregarTabela() {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);

    for (Produto p : produtoDAO.listarTodos()) {
        model.addRow(new Object[]{
            p.getId(),
            p.getNome(),
            p.getDescricao(),
            p.getCategoria().getNomeCategoria(),
            p.getPreco()
        });
    }
}
}

