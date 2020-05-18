package olamundoproj;

public class OlaMundo extends javax.swing.JFrame {

    public OlaMundo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblmsg = new javax.swing.JLabel();
        btmclick = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblmsg.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblmsg.setText("Aqui vai aprecer a msg");

        btmclick.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btmclick.setText("Clique em mim");
        btmclick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmclickActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(lblmsg))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(btmclick)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblmsg)
                .addGap(33, 33, 33)
                .addComponent(btmclick)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btmclickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmclickActionPerformed
        lblmsg.setText("Ola, mundo");
    }//GEN-LAST:event_btmclickActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OlaMundo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmclick;
    private javax.swing.JLabel lblmsg;
    // End of variables declaration//GEN-END:variables
}
