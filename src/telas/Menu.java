
package telas;



import model.Usuario;

public class Menu extends javax.swing.JFrame {

    private Cardapio telacardapio;  
    private Fornecedores telafornecedores;

    private Usuario usuarioLogado;
    

    public Menu(Usuario usuarioLogado) {
        initComponents();
        setTitle("Menu Principal");
        this.usuarioLogado = usuarioLogado;
       

        LbBemVindo.setText("Bem-vindo, " + usuarioLogado.getNome());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LbBemVindo = new javax.swing.JLabel();
        LbSelecione = new javax.swing.JLabel();
        JbVendas = new javax.swing.JButton();
        JbCadastrarUsuario = new javax.swing.JButton();
        JbFornecedor = new javax.swing.JButton();
        JbCardapio = new javax.swing.JButton();
        JbHistorico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LbBemVindo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LbBemVindo.setText("Bem vindo!");

        LbSelecione.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LbSelecione.setText("Selecione a opção desejada:");

        JbVendas.setText("Iniciar Venda");
        JbVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbVendasActionPerformed(evt);
            }
        });

        JbCadastrarUsuario.setText("Cadastrar Usuario");
        JbCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbCadastrarUsuarioActionPerformed(evt);
            }
        });

        JbFornecedor.setText("Fornecedores");
        JbFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbFornecedorActionPerformed(evt);
            }
        });

        JbCardapio.setText("Cardápio");
        JbCardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbCardapioActionPerformed(evt);
            }
        });

        JbHistorico.setText("Histórico de vendas");
        JbHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbHistoricoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LbSelecione)
                    .addComponent(LbBemVindo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JbHistorico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JbVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JbCadastrarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JbCardapio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JbFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(LbBemVindo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LbSelecione)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbVendas)
                    .addComponent(JbCardapio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbFornecedor)
                    .addComponent(JbHistorico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JbCadastrarUsuario)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JbCardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbCardapioActionPerformed
   
    if (telacardapio == null) {
        telacardapio = new Cardapio(this);
    }

    telacardapio.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_JbCardapioActionPerformed

    private void JbFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbFornecedorActionPerformed
        if(telafornecedores==null){
            telafornecedores=new Fornecedores(this);
        }
        telafornecedores.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JbFornecedorActionPerformed

    private void JbCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbCadastrarUsuarioActionPerformed
    CadastrarUsuario tela = new CadastrarUsuario(this);
    tela.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_JbCadastrarUsuarioActionPerformed

    private void JbHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbHistoricoActionPerformed
     TelaVendasRealizadas tela = new TelaVendasRealizadas(this);
    tela.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_JbHistoricoActionPerformed

    private void JbVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbVendasActionPerformed
        TelaVenda telaVenda = new TelaVenda(this);
    telaVenda.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_JbVendasActionPerformed

 


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbCadastrarUsuario;
    private javax.swing.JButton JbCardapio;
    private javax.swing.JButton JbFornecedor;
    private javax.swing.JButton JbHistorico;
    private javax.swing.JButton JbVendas;
    private javax.swing.JLabel LbBemVindo;
    private javax.swing.JLabel LbSelecione;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
