/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SaleUI.java
 *
 * Created on 17/12/2011, 15:46:26
 */
package br.ufrpe.bcc.ibusiness.ui;

/**
 *
 * @author serginho
 */
public class SaleUI extends javax.swing.JPanel {

    /** Creates new form SaleUI */
    public SaleUI() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btOptions1 = new javax.swing.JLabel();
        lbPanel = new javax.swing.JLabel();
        btHelp = new javax.swing.JLabel();
        btOptions = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(64, 128, 128));
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1024, 620));

        btOptions1.setBackground(new java.awt.Color(153, 0, 153));
        btOptions1.setFont(new java.awt.Font("Roboto", 1, 24));
        btOptions1.setForeground(new java.awt.Color(255, 255, 255));
        btOptions1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btOptions1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrpe/bcc/ibusiness/ui/img/casinha.png"))); // NOI18N
        btOptions1.setMaximumSize(new java.awt.Dimension(38, 38));
        btOptions1.setMinimumSize(new java.awt.Dimension(38, 38));
        btOptions1.setOpaque(true);
        btOptions1.setPreferredSize(new java.awt.Dimension(38, 38));

        lbPanel.setFont(new java.awt.Font("Lucida Sans", 2, 36));
        lbPanel.setForeground(new java.awt.Color(255, 255, 255));
        lbPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPanel.setText("Vendas");

        btHelp.setBackground(new java.awt.Color(255, 255, 255));
        btHelp.setFont(new java.awt.Font("Roboto", 1, 24));
        btHelp.setForeground(new java.awt.Color(64, 128, 128));
        btHelp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btHelp.setText("?");
        btHelp.setMaximumSize(new java.awt.Dimension(38, 38));
        btHelp.setMinimumSize(new java.awt.Dimension(38, 38));
        btHelp.setOpaque(true);
        btHelp.setPreferredSize(new java.awt.Dimension(38, 38));

        btOptions.setBackground(new java.awt.Color(255, 204, 0));
        btOptions.setFont(new java.awt.Font("Roboto", 1, 24));
        btOptions.setForeground(new java.awt.Color(255, 255, 255));
        btOptions.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btOptions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrpe/bcc/ibusiness/ui/img/engrenagem.png"))); // NOI18N
        btOptions.setMaximumSize(new java.awt.Dimension(38, 38));
        btOptions.setMinimumSize(new java.awt.Dimension(38, 38));
        btOptions.setOpaque(true);
        btOptions.setPreferredSize(new java.awt.Dimension(38, 38));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Lucida Sans", 2, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("código do produto...");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        jLabel1.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Lucida Sans", 2, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("descrição do produto...");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        jLabel4.setOpaque(true);

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 51, 51));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Lucida Sans", 2, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("quantid...");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        jLabel2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Total:");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        jLabel3.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btOptions1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 761, Short.MAX_VALUE)
                .addComponent(btOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btHelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addGap(232, 232, 232))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(572, 572, 572)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btHelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(582, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btOptions1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
    }// </editor-fold>//GEN-END:initComponents

private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextField1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btHelp;
    private javax.swing.JLabel btOptions;
    private javax.swing.JLabel btOptions1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbPanel;
    // End of variables declaration//GEN-END:variables
}