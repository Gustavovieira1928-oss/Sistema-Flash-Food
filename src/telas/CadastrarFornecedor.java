
package telas;

import javax.swing.JOptionPane;
import model.Fornecedor;
import dao.FornecedorDAO;


public class CadastrarFornecedor extends javax.swing.JFrame {

   private Fornecedores telafornecedores;
   private FornecedorDAO fornecedorDAO = new FornecedorDAO();
  public CadastrarFornecedor(Fornecedores telaFornecedores) {
    this.telafornecedores = telaFornecedores;
    initComponents();
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxCnpj = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxContato = new javax.swing.JTextField();
        JbVoltar = new javax.swing.JButton();
        JbCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro de Fornecedor");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Informe o ID do Fornecedor");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Informe o nome do  fornecedor");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Infome o CNPJ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Informe o contato celular (com DDD) ou telefone (com DDD) Ex: ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("11999999999");

        JbVoltar.setText("Voltar");
        JbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbVoltarActionPerformed(evt);
            }
        });

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(TxId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(TxCnpj))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxContato, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JbVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(TxCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TxContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbVoltar)
                    .addComponent(JbCadastrar))
                .addGap(45, 45, 45))
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbVoltarActionPerformed
       this.setVisible(false);
       telafornecedores.setVisible(true);
    }//GEN-LAST:event_JbVoltarActionPerformed

    private void JbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbCadastrarActionPerformed
       cadastrarF();
    }//GEN-LAST:event_JbCadastrarActionPerformed

  
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbCadastrar;
    private javax.swing.JButton JbVoltar;
    private javax.swing.JTextField TxCnpj;
    private javax.swing.JTextField TxContato;
    private javax.swing.JTextField TxId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
public void cadastrarF() {
    try {
        int id = Integer.parseInt(TxId.getText());
        String nome = jTextField1.getText().trim();
        String cnpjDigitado = TxCnpj.getText().trim();
        String contatoDigitado = TxContato.getText().trim();

        if (nome.isEmpty() || cnpjDigitado.isEmpty() || contatoDigitado.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos.");
            return;
        }

        String cnpjLimpo = cnpjDigitado.replaceAll("\\D", "");
        String contatoLimpo = contatoDigitado.replaceAll("\\D", "");

        if (cnpjLimpo.length() != 14) {
            JOptionPane.showMessageDialog(this, "CNPJ inválido.");
            TxCnpj.requestFocus();
            return;
        }

      
        if (fornecedorDAO.buscarPorCnpj(cnpjLimpo) != null) {
            JOptionPane.showMessageDialog(this, "Já existe um fornecedor com este CNPJ.");
            TxCnpj.requestFocus();
            return;
        }

        String cnpjFormatado = formatarCnpj(cnpjLimpo);
        String contatoFormatado = formatarContato(contatoLimpo);

        if (contatoFormatado == null) {
            JOptionPane.showMessageDialog(this, "Contato inválido. Use celular ou telefone com DDD.");
            TxContato.requestFocus();
            return;
        }

        Fornecedor fornecedor = new Fornecedor(
                id,
                nome,
                cnpjFormatado,
                contatoFormatado
        );

       
        boolean sucesso = fornecedorDAO.inserir(fornecedor);

        if (sucesso) {
            JOptionPane.showMessageDialog(this, "Fornecedor cadastrado com sucesso!");
            telafornecedores.atualizarTabela();
            limparCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar fornecedor.");
        }

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "ID inválido.");
        TxId.requestFocus();
    }
}


private String formatarCnpj(String cnpj) {
    return cnpj.substring(0, 2) + "." +
           cnpj.substring(2, 5) + "." +
           cnpj.substring(5, 8) + "/" +
           cnpj.substring(8, 12) + "-" +
           cnpj.substring(12);
}

private String formatarContato(String contato) {
    if (contato.length() == 11) { // celular
        return "(" + contato.substring(0, 2) + ") " +
               contato.substring(2, 7) + "-" +
               contato.substring(7);
    }
    if (contato.length() == 10) { // telefone fixo
        return "(" + contato.substring(0, 2) + ") " +
               contato.substring(2, 6) + "-" +
               contato.substring(6);
    }
    return null;
}
private void limparCampos() {
    TxId.setText("");
    jTextField1.setText("");
    TxCnpj.setText("");
    TxContato.setText("");
    TxId.requestFocus();
}


}
