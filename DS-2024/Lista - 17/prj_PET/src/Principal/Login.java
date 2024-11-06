package Principal;
public class Login extends javax.swing.JFrame {


    public Login() {
        initComponents();
        setResizable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tela = new javax.swing.JPanel();
        Titulo1 = new java.awt.Label();
        Csenha = new java.awt.TextField();
        label1 = new java.awt.Label();
        Cuser = new java.awt.TextField();
        label2 = new java.awt.Label();
        button1 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(204, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("login"); // NOI18N

        tela.setBackground(new java.awt.Color(204, 255, 204));

        Titulo1.setAlignment(java.awt.Label.CENTER);
        Titulo1.setFont(new java.awt.Font("Bell MT", 1, 36)); // NOI18N
        Titulo1.setForeground(new java.awt.Color(0, 153, 0));
        Titulo1.setText("Login");

        Csenha.setBackground(new java.awt.Color(204, 255, 161));
        Csenha.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Csenha.setForeground(new java.awt.Color(0, 102, 0));
        Csenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CsenhaActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 153, 0));
        label1.setName(""); // NOI18N
        label1.setText("Usuario:");

        Cuser.setBackground(new java.awt.Color(204, 255, 161));
        Cuser.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Cuser.setForeground(new java.awt.Color(51, 153, 0));
        Cuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuserActionPerformed(evt);
            }
        });

        label2.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(0, 153, 0));
        label2.setName(""); // NOI18N
        label2.setText("Senha:");

        button1.setBackground(new java.awt.Color(204, 255, 169));
        button1.setForeground(new java.awt.Color(0, 153, 0));
        button1.setLabel("Entrar");
        button1.setName(""); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout telaLayout = new javax.swing.GroupLayout(tela);
        tela.setLayout(telaLayout);
        telaLayout.setHorizontalGroup(
            telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(telaLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaLayout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(268, Short.MAX_VALUE))
                    .addGroup(telaLayout.createSequentialGroup()
                        .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cuser, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                            .addComponent(Csenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(telaLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        telaLayout.setVerticalGroup(
            telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Cuser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Csenha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        Titulo1.getAccessibleContext().setAccessibleName("Login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tela, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tela, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CuserActionPerformed

    private void CsenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CsenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CsenhaActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField Csenha;
    private java.awt.TextField Cuser;
    private java.awt.Label Titulo1;
    private java.awt.Button button1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JPanel tela;
    // End of variables declaration//GEN-END:variables
}
