/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SocialUI.java
 *
 * Created on 17/12/2011, 15:45:20
 */
package br.ufrpe.bcc.ibusiness.ui;

/**
 *
 * @author serginho
 */
public class SocialUI extends javax.swing.JPanel {

    private Home home;

    /** Creates new form SocialUI */
    public SocialUI() {
        initComponents();
    }

    SocialUI(Home aThis) {
        this();
        this.home = aThis;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        btOptions1 = new javax.swing.JLabel();
        lbPanel = new javax.swing.JLabel();
        btOptions = new javax.swing.JLabel();
        btHelp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(64, 128, 128));
        setMinimumSize(new java.awt.Dimension(1024, 620));
        setPreferredSize(new java.awt.Dimension(1024, 620));

        btOptions1.setBackground(new java.awt.Color(153, 0, 153));
        btOptions1.setFont(new java.awt.Font("Roboto", 1, 24));
        btOptions1.setForeground(new java.awt.Color(255, 255, 255));
        btOptions1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btOptions1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrpe/bcc/ibusiness/ui/img/casinha.png"))); // NOI18N
        btOptions1.setMaximumSize(new java.awt.Dimension(38, 38));
        btOptions1.setMinimumSize(new java.awt.Dimension(38, 38));
        btOptions1.setOpaque(true);
        btOptions1.setPreferredSize(new java.awt.Dimension(38, 38));
        btOptions1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btOptions1MouseClicked(evt);
            }
        });

        lbPanel.setFont(new java.awt.Font("Lucida Sans", 2, 36));
        lbPanel.setForeground(new java.awt.Color(255, 255, 255));
        lbPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPanel.setText("Social");

        btOptions.setBackground(new java.awt.Color(255, 204, 0));
        btOptions.setFont(new java.awt.Font("Roboto", 1, 24));
        btOptions.setForeground(new java.awt.Color(255, 255, 255));
        btOptions.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btOptions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrpe/bcc/ibusiness/ui/img/engrenagem.png"))); // NOI18N
        btOptions.setMaximumSize(new java.awt.Dimension(38, 38));
        btOptions.setMinimumSize(new java.awt.Dimension(38, 38));
        btOptions.setOpaque(true);
        btOptions.setPreferredSize(new java.awt.Dimension(38, 38));

        btHelp.setBackground(new java.awt.Color(255, 255, 255));
        btHelp.setFont(new java.awt.Font("Roboto", 1, 24));
        btHelp.setForeground(new java.awt.Color(64, 128, 128));
        btHelp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btHelp.setText("?");
        btHelp.setMaximumSize(new java.awt.Dimension(38, 38));
        btHelp.setMinimumSize(new java.awt.Dimension(38, 38));
        btHelp.setOpaque(true);
        btHelp.setPreferredSize(new java.awt.Dimension(38, 38));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrpe/bcc/ibusiness/ui/img/1324441882_Facebook.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrpe/bcc/ibusiness/ui/img/1324442077_Blue twitter.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrpe/bcc/ibusiness/ui/img/1324442179_comments.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrpe/bcc/ibusiness/ui/img/seta pra dir.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrpe/bcc/ibusiness/ui/img/sta para esq.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btOptions1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 770, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(btHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel5)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btHelp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                            .addComponent(btOptions, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPanel, 0, 0, Short.MAX_VALUE)
                            .addComponent(btOptions1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(226, 226, 226)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(217, 217, 217))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(277, 277, 277))))
        );
    }// </editor-fold>//GEN-END:initComponents

private void btOptions1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btOptions1MouseClicked
home.Return();// TODO add your handling code here:
}//GEN-LAST:event_btOptions1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btHelp;
    private javax.swing.JLabel btOptions;
    private javax.swing.JLabel btOptions1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel lbPanel;
    // End of variables declaration//GEN-END:variables
}
