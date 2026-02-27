
package telas;

import model.Venda;
import model.Produto;
import javax.swing.JOptionPane;
import model.FormaPagamento;


public class TelaVenda extends javax.swing.JFrame {

private Venda vendaAtual;

private Menu telamenu;

public TelaVenda( Menu telamenu) {
    initComponents();
    
 
    this.vendaAtual = new Venda();
    this.telamenu=telamenu;

    buttonGroup1.add(RbDinheiro);
    buttonGroup1.add(RbCartaoCredito);
    buttonGroup1.add(RbCartaoDebito);
    buttonGroup1.add(RbPix);
}

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxNumeroProduto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxQuantidade = new javax.swing.JTextField();
        JbAdicionar = new javax.swing.JButton();
        JbRemover = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        RbDinheiro = new javax.swing.JRadioButton();
        RbCartaoCredito = new javax.swing.JRadioButton();
        RbCartaoDebito = new javax.swing.JRadioButton();
        RbPix = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        TxTotal = new javax.swing.JTextField();
        JbVoltar = new javax.swing.JButton();
        JbFinalizarVenda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Iniciar Venda ");

        jLabel2.setText("Digite o numero do produto:");

        jLabel3.setText("Digite a quantidade:");

        JbAdicionar.setText("Adicionar");
        JbAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbAdicionarActionPerformed(evt);
            }
        });

        JbRemover.setText("Remover ");
        JbRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbRemoverActionPerformed(evt);
            }
        });

        jLabel4.setText("Selecione o metodo de pagamento:");

        RbDinheiro.setText("Dinheiro");

        RbCartaoCredito.setText("Cartão de Crédito");

        RbCartaoDebito.setText("Cartão de débito ");

        RbPix.setText("PIX");
        RbPix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbPixActionPerformed(evt);
            }
        });

        jLabel5.setText("Total R$");

        TxTotal.setText("0.00");

        JbVoltar.setText("Voltar");
        JbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbVoltarActionPerformed(evt);
            }
        });

        JbFinalizarVenda.setText("Finalizar");
        JbFinalizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbFinalizarVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(RbDinheiro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RbCartaoCredito)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RbCartaoDebito)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RbPix)))
                        .addContainerGap(53, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(JbRemover)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxNumeroProduto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(JbAdicionar)
                                .addComponent(TxQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JbFinalizarVenda)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(JbVoltar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxNumeroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbAdicionar)
                    .addComponent(JbRemover))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RbCartaoCredito)
                    .addComponent(RbDinheiro)
                    .addComponent(RbCartaoDebito)
                    .addComponent(RbPix))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TxTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbVoltar)
                    .addComponent(JbFinalizarVenda))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RbPixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbPixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RbPixActionPerformed

    private void JbAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbAdicionarActionPerformed
       try {
        int id = Integer.parseInt(TxNumeroProduto.getText());
        int quantidade = Integer.parseInt(TxQuantidade.getText());
        
        if (quantidade <= 0) {
            JOptionPane.showMessageDialog(this, "Quantidade inválida");
            return;
        }

        
        dao.ProdutoDAO dao = new dao.ProdutoDAO();
        Produto produto = dao.buscarPorId(id); 

        if (produto == null) {
            JOptionPane.showMessageDialog(this, "Produto não encontrado no banco!");
            return;
        }

        vendaAtual.adicionarItem(produto, quantidade);

        TxTotal.setText(String.format("%.2f", vendaAtual.getTotal()));
        TxNumeroProduto.setText("");
        TxQuantidade.setText("");
        TxNumeroProduto.requestFocus();
        
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Digite valores válidos");
    }

    }//GEN-LAST:event_JbAdicionarActionPerformed

    private void JbRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbRemoverActionPerformed
         try {
        int id = Integer.parseInt(TxNumeroProduto.getText());

        vendaAtual.removerItem(id);

        TxTotal.setText(String.format("%.2f", vendaAtual.getTotal()));

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Digite um ID válido");
    }
    }//GEN-LAST:event_JbRemoverActionPerformed

    private void JbFinalizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbFinalizarVendaActionPerformed
if (vendaAtual.getItens().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Não é possível finalizar uma venda sem itens!");
        return;
    }


    FormaPagamento formaPgto = null;

    // 2. Associar os Radio Buttons aos valores do seu Enum
    if (RbDinheiro.isSelected()) {
        formaPgto = FormaPagamento.DINHEIRO;
    } else if (RbCartaoCredito.isSelected()) {
        formaPgto = FormaPagamento.CARTAO_CREDITO;
    } else if (RbCartaoDebito.isSelected()) {
        formaPgto = FormaPagamento.CARTAO_DEBITO;
    } else if (RbPix.isSelected()) {
        formaPgto = FormaPagamento.PIX;
    }

    if (formaPgto == null) {
        JOptionPane.showMessageDialog(this, "Por favor, selecione uma forma de pagamento!");
        return;
    }

    try {
        // 3. Agora passamos o objeto Enum corretamente
        vendaAtual.setFormaPagamento(formaPgto); 
        
        // Removi o vendaAtual.setData pois seu construtor já faz isso!

        // 4. Salvar no Banco
        dao.VendaDAO vDao = new dao.VendaDAO();
        vDao.salvar(vendaAtual);

        JOptionPane.showMessageDialog(this, "Venda #" + vendaAtual.getId() + " salva no banco de dados!");
        limparTelaVenda();
        buttonGroup1.clearSelection();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao salvar: " + e.getMessage());
    }
    }//GEN-LAST:event_JbFinalizarVendaActionPerformed

    private void JbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbVoltarActionPerformed
          this.setVisible(false); 
          telamenu.setVisible(true);
    }//GEN-LAST:event_JbVoltarActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbAdicionar;
    private javax.swing.JButton JbFinalizarVenda;
    private javax.swing.JButton JbRemover;
    private javax.swing.JButton JbVoltar;
    private javax.swing.JRadioButton RbCartaoCredito;
    private javax.swing.JRadioButton RbCartaoDebito;
    private javax.swing.JRadioButton RbDinheiro;
    private javax.swing.JRadioButton RbPix;
    private javax.swing.JTextField TxNumeroProduto;
    private javax.swing.JTextField TxQuantidade;
    private javax.swing.JTextField TxTotal;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
private void limparTelaVenda() {
    vendaAtual = new Venda(); // Cria uma nova instância limpa
    TxTotal.setText("0.00");
    TxNumeroProduto.setText("");
    TxQuantidade.setText("");
    // Se tiver um campo de lista visual ou texto com os itens, limpe-o aqui também
}
}
