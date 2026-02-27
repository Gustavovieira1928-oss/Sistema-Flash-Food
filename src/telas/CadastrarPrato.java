
package telas;

import dao.CategoriaDAO;
import java.util.List;
import javax.swing.JOptionPane;
import model.Categoria;
import model.Produto;


public class CadastrarPrato extends javax.swing.JFrame {

   private Cardapio telaCardapio;
   
   public CadastrarPrato(Cardapio telaCardapio) {
    this.telaCardapio = telaCardapio; 
    initComponents();
    preencherComboCategorias();
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LbCNP = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TxNumeroPrato = new javax.swing.JTextField();
        DigiteNome = new javax.swing.JLabel();
        TxNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxDesc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxPreco = new javax.swing.JTextField();
        JbVoltar = new javax.swing.JButton();
        JbCadastrar = new javax.swing.JButton();
        CbCategoria = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LbCNP.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LbCNP.setText("CADASTRAR NOVO PRATO ");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Digite o numero do prato no cardápio");

        DigiteNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DigiteNome.setText("Digite o nome do prato");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Digite a descrição do prato ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Selecione a categoria");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Digite o preço R$");

        JbVoltar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JbVoltar.setText("Voltar");
        JbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbVoltarActionPerformed(evt);
            }
        });

        JbCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JbCadastrar.setText("Cadastrar");
        JbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LbCNP)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(TxDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(DigiteNome)
                                .addGap(18, 18, 18)
                                .addComponent(TxNome))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(TxNumeroPrato, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(TxPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(CbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JbVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JbCadastrar)
                        .addGap(83, 83, 83))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(LbCNP)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxNumeroPrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DigiteNome)
                    .addComponent(TxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbVoltar)
                    .addComponent(JbCadastrar))
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbCadastrarActionPerformed
       CadastrarP();
    }//GEN-LAST:event_JbCadastrarActionPerformed

    private void JbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbVoltarActionPerformed
       this.setVisible(false); 
    telaCardapio.setVisible(true); 
    }//GEN-LAST:event_JbVoltarActionPerformed


    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<model.Categoria> CbCategoria;
    private javax.swing.JLabel DigiteNome;
    private javax.swing.JButton JbCadastrar;
    private javax.swing.JButton JbVoltar;
    private javax.swing.JLabel LbCNP;
    private javax.swing.JTextField TxDesc;
    private javax.swing.JTextField TxNome;
    private javax.swing.JTextField TxNumeroPrato;
    private javax.swing.JTextField TxPreco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
// Adicione este método para carregar o combo logo no início
private void preencherComboCategorias() {
    dao.CategoriaDAO catDao = new dao.CategoriaDAO();
    java.util.List<model.Categoria> lista = catDao.listar();

    CbCategoria.removeAllItems(); 
    for (model.Categoria c : lista) {
        CbCategoria.addItem(c); // Agora o erro sumirá!
    }
}

// Método de cadastro atualizado
public void CadastrarP() {
    try {
        if (TxNumeroPrato.getText().isEmpty() || TxNome.getText().isEmpty() || TxPreco.getText().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
            return;
        }

        int id = Integer.parseInt(TxNumeroPrato.getText());
        String nome = TxNome.getText();
        String descricao = TxDesc.getText();
        double preco = Double.parseDouble(TxPreco.getText());

        // Agora pegamos o objeto selecionado
        model.Categoria categoria = (model.Categoria) CbCategoria.getSelectedItem();

        if (categoria == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione uma categoria!");
            return;
        }

        model.Produto produto = new model.Produto(id, nome, descricao, categoria, preco);

        dao.ProdutoDAO dao = new dao.ProdutoDAO();
        dao.cadastrar(produto);

        telaCardapio.carregarTabela();
        javax.swing.JOptionPane.showMessageDialog(this, "Prato cadastrado com sucesso!");
        limparCampos(); // Agora o método existe abaixo!

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
    }
}

// O método que estava faltando!
private void limparCampos() {
    TxNumeroPrato.setText("");
    TxNome.setText("");
    TxDesc.setText("");
    TxPreco.setText("");
    if (CbCategoria.getItemCount() > 0) CbCategoria.setSelectedIndex(0);
    TxNumeroPrato.requestFocus();
}
}
