/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UserHome extends javax.swing.JFrame {

    private User client;
    private int count = 0;

    public UserHome() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        wellcome = new javax.swing.JLabel();
        userBalance = new javax.swing.JLabel();
        depositField = new javax.swing.JTextField();
        depositButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        depositLabel = new javax.swing.JLabel();
        whitdrawField = new javax.swing.JTextField();
        whitdrawButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        whitdrawLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JavaBank-Home");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        wellcome.setBackground(new java.awt.Color(255, 255, 255));
        wellcome.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        wellcome.setForeground(new java.awt.Color(51, 51, 51));
        wellcome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        userBalance.setBackground(new java.awt.Color(255, 255, 255));
        userBalance.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        userBalance.setForeground(new java.awt.Color(0, 153, 51));
        userBalance.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(wellcome, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(userBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(wellcome, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(userBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        depositField.setBackground(new java.awt.Color(204, 204, 204));

        depositButton.setBackground(new java.awt.Color(204, 204, 255));
        depositButton.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        depositButton.setForeground(new java.awt.Color(51, 51, 51));
        depositButton.setText("Depositar");
        depositButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        depositButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("R$:");

        depositLabel.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        depositLabel.setForeground(new java.awt.Color(204, 0, 0));

        whitdrawField.setBackground(new java.awt.Color(204, 204, 204));

        whitdrawButton.setBackground(new java.awt.Color(204, 204, 255));
        whitdrawButton.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        whitdrawButton.setForeground(new java.awt.Color(51, 51, 51));
        whitdrawButton.setText("Sacar");
        whitdrawButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        whitdrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whitdrawButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("R$:");

        whitdrawLabel.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        whitdrawLabel.setForeground(new java.awt.Color(204, 0, 0));

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jMenu1.setText("Opções");

        jMenuItem1.setBackground(new java.awt.Color(204, 204, 255));
        jMenuItem1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jMenuItem1.setText("Sair da conta");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setBackground(new java.awt.Color(204, 204, 255));
        jMenuItem2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jMenuItem2.setText("Deletar conta");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setBackground(new java.awt.Color(204, 204, 255));
        jMenuItem3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jMenuItem3.setText("Transferência");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(depositLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(depositField, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                        .addGap(136, 136, 136)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(whitdrawLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(whitdrawField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(depositButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(whitdrawButton)
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(depositField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(5, 5, 5)
                        .addComponent(depositLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(depositButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(whitdrawField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(5, 5, 5)
                        .addComponent(whitdrawLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(whitdrawButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void depositButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositButtonActionPerformed

        if (new Verifyer().verifyNumber(depositField.getText()) >= 0) {
            deposit(new Verifyer().verifyNumber(depositField.getText()));
        } else {

            depositLabel.setForeground(new Color(204, 0, 0));
            depositLabel.setText("Número inválido");
        }

    }//GEN-LAST:event_depositButtonActionPerformed


    private void whitdrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whitdrawButtonActionPerformed
        if (new Verifyer().verifyNumber(whitdrawField.getText()) >= 0) {
            whitdraw(new Verifyer().verifyNumber(whitdrawField.getText()));
        } else {
            whitdrawLabel.setForeground(new Color(204, 0, 0));
            whitdrawLabel.setText("Número inválido");
        }
    }//GEN-LAST:event_whitdrawButtonActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        int choice = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja deletar a conta?", "Deletar a conta", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);

        if (choice == 0) {
            
            JOptionPane.showMessageDialog(null, "Conta deletada! Até mais :(", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            
            new PackageManager().deleteUser(client);
            this.setVisible(false);
            new Login().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Operação cancelada!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Transfer transfer = new Transfer();
        transfer.setVisible(true);
        this.setVisible(false);
        transfer.get(client);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void deposit(double number) {
        PackageManager pm = new PackageManager();
        ArrayList<User> list = new ArrayList<>();
        client.deposit(number);
        try {
            list = (ArrayList<User>) pm.getObject();
            list.set(pm.findIndexOf(client), client);
            pm.writeObject(list);
            userBalance.setText("Seu saldo: R$" + client.getBalance());
            depositLabel.setForeground(new Color(12, 121, 0));
            depositLabel.setText("Depósito realizado!");
            whitdrawLabel.setText(null);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    public void whitdraw(double number) {
        PackageManager pm = new PackageManager();
        ArrayList<User> list = new ArrayList<>();

        String assinatura = JOptionPane.showInputDialog(null, "Confirme sua assinatura eletrônica para continuar com a operação:", 
                "Assinatura eletrônica", JOptionPane.INFORMATION_MESSAGE);

        if (assinatura.equals(client.getAe())) {

            count = 0;

            if (new Verifyer().verifyWihtdraw(number, client) == 0) {
                JOptionPane.showMessageDialog(null, "Saldo invalido!", "Aviso", JOptionPane.ERROR_MESSAGE);
                whitdrawLabel.setText("");
            } else {
                try {
                    client.whitdraw(new Verifyer().verifyWihtdraw(number, client));
                    list = (ArrayList<User>) pm.getObject();                   
                    list.set(pm.findIndexOf(client), client);
                    pm.writeObject(list);
                    userBalance.setText("Seu saldo: R$" + client.getBalance());
                    whitdrawLabel.setForeground(new Color(12, 121, 0));
                    whitdrawLabel.setText("Saque realizado!");
                    depositLabel.setText(null);
                } catch (IOException | ClassNotFoundException e) {
                    System.out.println(e);
                }
            }
        } else {
            whitdrawLabel.setText("");
            count++;
            JOptionPane.showMessageDialog(null, ("Assinatura incorreta: restam " + (3 - count) + " tentativas."), 
                    "Aviso", JOptionPane.ERROR_MESSAGE);
            if (count == 3) {
                JOptionPane.showMessageDialog(null, "Login bloqueado (Assinatura foi errada 3 vezes).", 
                        "Aviso", JOptionPane.ERROR_MESSAGE);
                this.setVisible(false);
                new Login().setVisible(true);
            }
        }
    }

    public void get(User user) {
        wellcome.setText("   Bem vindo, " + user.getName() + " " + user.getLastname().charAt(0) + ".!");
        userBalance.setText("Seu saldo: R$" + user.getBalance());
        client = user;
    }

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
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new UserHome().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton depositButton;
    private javax.swing.JTextField depositField;
    private javax.swing.JLabel depositLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel userBalance;
    private javax.swing.JLabel wellcome;
    private javax.swing.JButton whitdrawButton;
    private javax.swing.JTextField whitdrawField;
    private javax.swing.JLabel whitdrawLabel;
    // End of variables declaration//GEN-END:variables

}
