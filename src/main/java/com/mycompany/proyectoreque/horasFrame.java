
package com.mycompany.proyectoreque;

/**
 *
 * @author chava
 */
public class horasFrame extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     * @param dia
     */
    public horasFrame(String dia) {
        initComponents();
        updateTable(dia);
    }
    
    private void updateTable(String day) {
        int dia = Integer.parseInt(day);
        int pasado = dia - 1;
        int futuro = dia + 1;
        String presenteS = String.valueOf(dia);
        String pasadoS = String.valueOf(pasado);
        String futuroS = String.valueOf(futuro);
        lblPresent.setText(presenteS);
        lblPast.setText(pasadoS);
        lblFuture.setText(futuroS);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lbl7301 = new javax.swing.JLabel();
        lbl7302 = new javax.swing.JLabel();
        lbl7303 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbl9001 = new javax.swing.JLabel();
        lbl9002 = new javax.swing.JLabel();
        lbl9003 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lbl10310 = new javax.swing.JLabel();
        lbl10311 = new javax.swing.JLabel();
        lbl10312 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        lbl13310 = new javax.swing.JLabel();
        lbl13311 = new javax.swing.JLabel();
        lbl13312 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        lbl15004 = new javax.swing.JLabel();
        lbl15005 = new javax.swing.JLabel();
        lbl15006 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        lbl16304 = new javax.swing.JLabel();
        lbl16305 = new javax.swing.JLabel();
        lbl16306 = new javax.swing.JLabel();
        panelPast = new javax.swing.JPanel();
        lblPast = new javax.swing.JLabel();
        panelPresent = new javax.swing.JPanel();
        lblPresent = new javax.swing.JLabel();
        panelFuture = new javax.swing.JPanel();
        lblFuture = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        lbl7301.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl7301.setText("7:30 - 8:30");

        lbl7302.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl7302.setText("7:30 - 8:30");

        lbl7303.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl7303.setText("7:30 - 8:30");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lbl7301, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl7302, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl7303, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl7301, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(lbl7302, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl7303, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(241, 241, 241));

        lbl9001.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl9001.setText("9:00 - 10:00");

        lbl9002.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl9002.setText("9:00 - 10:00");

        lbl9003.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl9003.setText("9:00 - 10:00");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lbl9001, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl9003, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(246, 246, 246)
                    .addComponent(lbl9002, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(253, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl9001, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(lbl9003, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lbl9002, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        lbl10310.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl10310.setText("10:30 - 11:30");

        lbl10311.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl10311.setText("10:30 - 11:30");

        lbl10312.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl10312.setText("10:30 - 11:30");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(lbl10310, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl10312, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(246, 246, 246)
                    .addComponent(lbl10311, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(254, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl10310, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(lbl10312, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lbl10311, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(241, 241, 241));

        lbl13310.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl13310.setText("13:30 - 14:30");

        lbl13311.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl13311.setText("13:30 - 14:30");

        lbl13312.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl13312.setText("13:30 - 14:30");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(lbl13310, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl13312, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addGap(246, 246, 246)
                    .addComponent(lbl13311, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(253, Short.MAX_VALUE)))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl13310, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(lbl13312, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lbl13311, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));

        lbl15004.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl15004.setText("15:00 - 16:00");

        lbl15005.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl15005.setText("15:00 - 16:00");

        lbl15006.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl15006.setText("15:00 - 16:00");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(lbl15004, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl15006, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                    .addGap(246, 246, 246)
                    .addComponent(lbl15005, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(255, Short.MAX_VALUE)))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl15004, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(lbl15006, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lbl15005, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(241, 241, 241));

        lbl16304.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl16304.setText("16:30 - 17:30");

        lbl16305.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl16305.setText("16:30 - 17:30");

        lbl16306.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl16306.setText("16:30 - 17:30");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(lbl16304, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl16306, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel15Layout.createSequentialGroup()
                    .addGap(246, 246, 246)
                    .addComponent(lbl16305, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(254, Short.MAX_VALUE)))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl16304, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(lbl16306, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lbl16305, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );

        panelPast.setBackground(new java.awt.Color(236, 236, 236));

        lblPast.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblPast.setForeground(new java.awt.Color(30, 140, 200));
        lblPast.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPast.setText("13");

        javax.swing.GroupLayout panelPastLayout = new javax.swing.GroupLayout(panelPast);
        panelPast.setLayout(panelPastLayout);
        panelPastLayout.setHorizontalGroup(
            panelPastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPastLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblPast, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelPastLayout.setVerticalGroup(
            panelPastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPastLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblPast, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelPresent.setBackground(new java.awt.Color(236, 236, 236));

        lblPresent.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblPresent.setForeground(new java.awt.Color(30, 140, 200));
        lblPresent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPresent.setText("14");
        lblPresent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelPresentLayout = new javax.swing.GroupLayout(panelPresent);
        panelPresent.setLayout(panelPresentLayout);
        panelPresentLayout.setHorizontalGroup(
            panelPresentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPresent, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );
        panelPresentLayout.setVerticalGroup(
            panelPresentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPresent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelFuture.setBackground(new java.awt.Color(236, 236, 236));

        lblFuture.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblFuture.setForeground(new java.awt.Color(30, 140, 200));
        lblFuture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFuture.setText("15");

        javax.swing.GroupLayout panelFutureLayout = new javax.swing.GroupLayout(panelFuture);
        panelFuture.setLayout(panelFutureLayout);
        panelFutureLayout.setHorizontalGroup(
            panelFutureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFuture, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
        );
        panelFutureLayout.setVerticalGroup(
            panelFutureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFuture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelPast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelPresent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(panelFuture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelPast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPresent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelFuture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbl10301;
    private javax.swing.JLabel lbl10302;
    private javax.swing.JLabel lbl10303;
    private javax.swing.JLabel lbl10304;
    private javax.swing.JLabel lbl10305;
    private javax.swing.JLabel lbl10306;
    private javax.swing.JLabel lbl10307;
    private javax.swing.JLabel lbl10308;
    private javax.swing.JLabel lbl10309;
    private javax.swing.JLabel lbl10310;
    private javax.swing.JLabel lbl10311;
    private javax.swing.JLabel lbl10312;
    private javax.swing.JLabel lbl13301;
    private javax.swing.JLabel lbl13302;
    private javax.swing.JLabel lbl13303;
    private javax.swing.JLabel lbl13304;
    private javax.swing.JLabel lbl13305;
    private javax.swing.JLabel lbl13306;
    private javax.swing.JLabel lbl13307;
    private javax.swing.JLabel lbl13308;
    private javax.swing.JLabel lbl13309;
    private javax.swing.JLabel lbl13310;
    private javax.swing.JLabel lbl13311;
    private javax.swing.JLabel lbl13312;
    private javax.swing.JLabel lbl15001;
    private javax.swing.JLabel lbl15002;
    private javax.swing.JLabel lbl15003;
    private javax.swing.JLabel lbl15004;
    private javax.swing.JLabel lbl15005;
    private javax.swing.JLabel lbl15006;
    private javax.swing.JLabel lbl16301;
    private javax.swing.JLabel lbl16302;
    private javax.swing.JLabel lbl16303;
    private javax.swing.JLabel lbl16304;
    private javax.swing.JLabel lbl16305;
    private javax.swing.JLabel lbl16306;
    private javax.swing.JLabel lbl7301;
    private javax.swing.JLabel lbl7302;
    private javax.swing.JLabel lbl7303;
    private javax.swing.JLabel lbl9001;
    private javax.swing.JLabel lbl9002;
    private javax.swing.JLabel lbl9003;
    private javax.swing.JLabel lblFuture;
    private javax.swing.JLabel lblPast;
    private javax.swing.JLabel lblPresent;
    private javax.swing.JPanel panelFuture;
    private javax.swing.JPanel panelPast;
    private javax.swing.JPanel panelPresent;
    // End of variables declaration//GEN-END:variables
}
