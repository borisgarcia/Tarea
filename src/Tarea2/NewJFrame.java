/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea2;

/**
 *
 * @author dell
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Suma = new javax.swing.JButton();
        Division = new javax.swing.JButton();
        Resta = new javax.swing.JButton();
        Expo = new javax.swing.JButton();
        Multi = new javax.swing.JButton();
        Num1 = new javax.swing.JTextField();
        Num2 = new javax.swing.JTextField();
        Resp = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Suma.setText("Suma");
        Suma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SumaMouseClicked(evt);
            }
        });
        Suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumaActionPerformed(evt);
            }
        });

        Division.setText("Division");
        Division.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DivisionMouseClicked(evt);
            }
        });

        Resta.setText("Resta");
        Resta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RestaMouseClicked(evt);
            }
        });

        Expo.setText("Exponente");
        Expo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExpoMouseClicked(evt);
            }
        });

        Multi.setText("Multiplicacion");
        Multi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MultiMouseClicked(evt);
            }
        });
        Multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiActionPerformed(evt);
            }
        });

        Num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num1ActionPerformed(evt);
            }
        });

        Resp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RespActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Mini Calculadora");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(Multi))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(Resp, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Division, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Suma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Num1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Resta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Expo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Num2))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Num1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Num2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Suma)
                    .addComponent(Resta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Division)
                    .addComponent(Expo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Multi)
                .addGap(18, 18, 18)
                .addComponent(Resp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Num1ActionPerformed

    private void MultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MultiActionPerformed

    private void RespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RespActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RespActionPerformed

    private void SumaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SumaMouseClicked
        // TODO add your handling code here:
        int n1 = Integer.parseInt(Num1.getText());
        int n2 = Integer.parseInt(Num2.getText());
        int res = n1 + n2;
        Resp.setText(res +"");
        
       

    }//GEN-LAST:event_SumaMouseClicked

    private void SumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SumaActionPerformed

    private void RestaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RestaMouseClicked
        // TODO add your handling code here:
        int n1 = Integer.parseInt(Num1.getText());
        int n2 = Integer.parseInt(Num2.getText());
        int res = n1 - n2;
        Resp.setText(res +"");
    }//GEN-LAST:event_RestaMouseClicked

    private void DivisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DivisionMouseClicked
        // TODO add your handling code here:
        double n1 = Integer.parseInt(Num1.getText());
        double n2 = Integer.parseInt(Num2.getText());
        double res = n1 / n2;
        Resp.setText(res +"");
    }//GEN-LAST:event_DivisionMouseClicked

    private void MultiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MultiMouseClicked
        // TODO add your handling code here:
        int n1 = Integer.parseInt(Num1.getText());
        int n2 = Integer.parseInt(Num2.getText());
        int res = n1 * n2;
        Resp.setText(res +"");
    }//GEN-LAST:event_MultiMouseClicked

    private void ExpoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExpoMouseClicked
        // TODO add your handling code here:
        int n1 = Integer.parseInt(Num1.getText());
        int n2 = Integer.parseInt(Num2.getText());
        int cont = 0, acum = 1; 
        
        while(n2 > cont){
            acum = acum * n1;
            cont = cont + 1;
	}
        Resp.setText(acum +"");
    }//GEN-LAST:event_ExpoMouseClicked

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Division;
    private javax.swing.JButton Expo;
    private javax.swing.JButton Multi;
    private javax.swing.JTextField Num1;
    private javax.swing.JTextField Num2;
    private javax.swing.JTextField Resp;
    private javax.swing.JButton Resta;
    private javax.swing.JButton Suma;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
