/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipo.triangulo;

/**
 *
 * @author berto
 */
public class TelaTipoTrangulo extends javax.swing.JFrame {

    /**
     * Creates new form TelaTipoTrangulo
     */
    public TelaTipoTrangulo() {
        initComponents();
        panTipo.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sdrA = new javax.swing.JSlider();
        sdrB = new javax.swing.JSlider();
        sdrC = new javax.swing.JSlider();
        lblA = new javax.swing.JLabel();
        lblB = new javax.swing.JLabel();
        lblC = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        panTipo = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnTipo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel1.setText("A");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel3.setText("B");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel4.setText("C");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        sdrA.setMaximum(30);
        sdrA.setValue(0);
        sdrA.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        sdrA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sdrAStateChanged(evt);
            }
        });
        getContentPane().add(sdrA, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        sdrB.setMaximum(30);
        sdrB.setValue(0);
        sdrB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sdrBStateChanged(evt);
            }
        });
        getContentPane().add(sdrB, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        sdrC.setMaximum(30);
        sdrC.setValue(0);
        sdrC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sdrCStateChanged(evt);
            }
        });
        getContentPane().add(sdrC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        lblA.setText("0");
        getContentPane().add(lblA, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 20, -1));

        lblB.setText("0");
        getContentPane().add(lblB, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 30, -1));

        lblC.setText("0");
        getContentPane().add(lblC, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 30, -1));

        jLabel8.setText("A");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel9.setText("B");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel10.setText("C");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel11.setText("O tipo de Trinagulo que você fez é um:");

        lblTipo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(0, 0, 102));
        lblTipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblTipo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panTipoLayout = new javax.swing.GroupLayout(panTipo);
        panTipo.setLayout(panTipoLayout);
        panTipoLayout.setHorizontalGroup(
            panTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTipoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panTipoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        panTipoLayout.setVerticalGroup(
            panTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTipoLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(202, 202, 202))
        );

        getContentPane().add(panTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 280, 110));

        jButton1.setText("Tipo De Triangulo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        btnTipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/silhueta-de-triangulo-escaleno.png"))); // NOI18N
        getContentPane().add(btnTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, -20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        panTipo.setVisible(true);
        
        int a = sdrA.getValue();
        int b = sdrB.getValue();
        int c= sdrC.getValue();
        
        if (a<b+c && b<a+c && c<a+b){
            if (a==b && b == c && c==a) {
                lblTipo.setText("Equilatero");
            } 
            else if (a!=b && b!=c && c!=a){
                lblTipo.setText("Escaleno");
            } 
            else  {
                lblTipo.setText("Isósceles");
            }
        } else {
            lblTipo.setText("<html> Não forma um triangulo <hteml>");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sdrAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sdrAStateChanged
        // TODO add your handling code here:
        lblA.setText(Integer.toString(sdrA.getValue()));
    }//GEN-LAST:event_sdrAStateChanged

    private void sdrBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sdrBStateChanged
        // TODO add your handling code here:
        lblB.setText(Integer.toString(sdrB.getValue()));
    }//GEN-LAST:event_sdrBStateChanged

    private void sdrCStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sdrCStateChanged
        // TODO add your handling code here:
        lblC.setText(Integer.toString(sdrC.getValue()));
    }//GEN-LAST:event_sdrCStateChanged

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
            java.util.logging.Logger.getLogger(TelaTipoTrangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTipoTrangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTipoTrangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTipoTrangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTipoTrangulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JPanel panTipo;
    private javax.swing.JSlider sdrA;
    private javax.swing.JSlider sdrB;
    private javax.swing.JSlider sdrC;
    // End of variables declaration//GEN-END:variables
}
