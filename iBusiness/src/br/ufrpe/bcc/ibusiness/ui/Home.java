/*
 * Home.java
 *
 * Created on 17/12/2011, 14:12:43
 */
package br.ufrpe.bcc.ibusiness.ui;

import br.ufrpe.bcc.continuous.components.Tile;
import br.ufrpe.bcc.ibusiness.ui.components.ConfigTile;
import br.ufrpe.bcc.ibusiness.ui.components.CostumerTile;
import br.ufrpe.bcc.ibusiness.ui.components.HelpTile;
import br.ufrpe.bcc.ibusiness.ui.components.PartnesTile;
import br.ufrpe.bcc.ibusiness.ui.components.ReportsTile;
import br.ufrpe.bcc.ibusiness.ui.components.RhTile;
import br.ufrpe.bcc.ibusiness.ui.components.SalesTile;
import br.ufrpe.bcc.ibusiness.ui.components.SocialTile;
import br.ufrpe.bcc.ibusiness.ui.components.StoqTile;
import javax.swing.JViewport;

/**
 *
 * @author vitor rolim e sergio lisan
 */
public class Home extends javax.swing.JPanel {

    public Home() {
        initComponents();        
        initTiles();
        
        scroll.getViewport().setOpaque(false);
        scroll.setOpaque(false);
    }
    
    /**
     * Cria as tiles do sistema
     */
    private void initTiles() {
        costumers = new CostumerTile();
        mainPanel.add(costumers);
        
        social = new SocialTile();
        mainPanel.add(social);
        
        partners = new PartnesTile();
        mainPanel.add(partners);
        
        stoq = new StoqTile();
        mainPanel.add(stoq);
        
        rh = new RhTile();
        mainPanel.add(rh);
        
        config = new ConfigTile();
        mainPanel.add(config);
        
        help = new HelpTile();
        mainPanel.add(help);
        
        sales = new SalesTile();
        mainPanel.add(sales);
        
        reports = new ReportsTile();       
        mainPanel.add(reports);
        
        mainPanel.updateUI();                
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbLogo = new javax.swing.JLabel();
        btUp = new javax.swing.JLabel();
        btDown = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(64, 128, 128));
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1024, 620));
        setPreferredSize(new java.awt.Dimension(1024, 620));

        lbLogo.setFont(new java.awt.Font("Roboto", 2, 36)); // NOI18N
        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrpe/bcc/ibusiness/ui/img/logo 124.jpg"))); // NOI18N

        btUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrpe/bcc/ibusiness/ui/img/seta_acima_inactive.png"))); // NOI18N

        btDown.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrpe/bcc/ibusiness/ui/img/seta_baixo_inactive.png"))); // NOI18N

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Data e Hora");

        scroll.setBorder(null);
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        scroll.setMaximumSize(new java.awt.Dimension(1920, 1080));

        mainPanel.setMaximumSize(new java.awt.Dimension(1920, 1080));
        mainPanel.setMinimumSize(new java.awt.Dimension(0, 0));
        mainPanel.setOpaque(false);
        mainPanel.setPreferredSize(new java.awt.Dimension(1000, 376));
        mainPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 25, 25));
        scroll.setViewportView(mainPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbLogo)
                    .addComponent(btUp, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 910, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addComponent(btDown, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE)
                    .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbLogo)
                .addGap(18, 18, 18)
                .addComponent(btUp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btDown)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btDown;
    private javax.swing.JLabel btUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables

    private Tile costumers;
    private Tile social;
    private Tile partners;
    private Tile stoq;
    private Tile rh;
    private Tile sales;
    private Tile reports;
    private Tile config;
    private Tile help;
}