
package telas;

import javax.swing.JOptionPane;


import model.Usuario;
import dao.UsuarioDAO;


public class Login extends javax.swing.JFrame {
     
private UsuarioDAO usuarioDAO = new UsuarioDAO();
private Usuario usuarioLogado;

 
    public Login() {
        initComponents();
        setTitle("Login");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        LbCpf = new javax.swing.JLabel();
        TxCpf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TxSenha = new javax.swing.JTextField();
        JbEsqueci = new javax.swing.JButton();
        JbLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Logo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Logo.setText("FLASH FOOD");

        LbCpf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LbCpf.setText("CPF");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Senha");

        JbEsqueci.setText("Esqueci a senha ");
        JbEsqueci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbEsqueciActionPerformed(evt);
            }
        });

        JbLogin.setText("Login");
        JbLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addComponent(Logo)
                .addGap(119, 119, 119))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(LbCpf)
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxCpf)
                            .addComponent(TxSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(JbEsqueci)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addComponent(JbLogin)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(Logo)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbCpf)
                    .addComponent(TxCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbEsqueci)
                    .addComponent(JbLogin))
                .addContainerGap(44, Short.MAX_VALUE))
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

    private void JbLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbLoginActionPerformed
   if (logar()) {
        Menu telamenu = new Menu(usuarioLogado);
        dispose();
        telamenu.setVisible(true);
    }
    }//GEN-LAST:event_JbLoginActionPerformed

    private void JbEsqueciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbEsqueciActionPerformed
        EsqueciSenha();
    }//GEN-LAST:event_JbEsqueciActionPerformed

 
    public static void main(String args[]) {
         
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbEsqueci;
    private javax.swing.JButton JbLogin;
    private javax.swing.JLabel LbCpf;
    private javax.swing.JLabel Logo;
    private javax.swing.JTextField TxCpf;
    private javax.swing.JTextField TxSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
public boolean logar() {

    if (TxCpf.getText().isEmpty() || TxSenha.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Preencha os campos CPF e Senha");
        return false;
    }

    String cpf = TxCpf.getText().replaceAll("\\D", "");

    if (cpf.length() != 11) {
        JOptionPane.showMessageDialog(this, "CPF inválido");
        return false;
    }

    cpf = String.format("%s.%s.%s-%s",
            cpf.substring(0, 3),
            cpf.substring(3, 6),
            cpf.substring(6, 9),
            cpf.substring(9, 11)
    );

    String senha = TxSenha.getText();

    Usuario usuario = usuarioDAO.autenticar(cpf, senha);

    if (usuario == null) {
        JOptionPane.showMessageDialog(this, "CPF ou senha inválidos");
        return false;
    }

    usuarioLogado = usuario;

    JOptionPane.showMessageDialog(this, "Bem-vindo, " + usuario.getNome());
    return true;
}
public void EsqueciSenha() {

    String login = JOptionPane.showInputDialog(this, "Digite seu CPF:");

    if (login == null || login.trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Operação cancelada");
        return;
    }

   
    login = login.trim().replaceAll("[^0-9]", "");

   
    if (login.length() != 11) {
        JOptionPane.showMessageDialog(this, "CPF inválido");
        return;
    }

  
    login = String.format("%s.%s.%s-%s",
            login.substring(0, 3),
            login.substring(3, 6),
            login.substring(6, 9),
            login.substring(9, 11)
    );

    String novaSenha = JOptionPane.showInputDialog(this, "Digite a nova senha:");

    if (novaSenha == null || novaSenha.trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Senha não alterada");
        return;
    }

   boolean alterado = usuarioDAO.alterarSenha(login, novaSenha);

    if (alterado) {
        JOptionPane.showMessageDialog(this, "Senha alterada com sucesso!");
    } else {
        JOptionPane.showMessageDialog(this, "Usuário não encontrado");
    }
}
}
