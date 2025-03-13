
package com.mycompany.proyectoreque;

import java.awt.BorderLayout;
import java.awt.Color;

/**
 *
 * @author chava
 */
public class homeMenu extends javax.swing.JFrame {

    /**
     * Creates new form homeMenu
     */
    public homeMenu() {
        initComponents();
        String home = "<HTML><u>Home</u></HTML>";
        lblHome.setText(home);
        String help = "<HTML><u>Help</u></HTML>";
        lblHelp.setText(help);
        
        waitingPanel waiting = new waitingPanel();
        waiting.setSize(730,430);
        waiting.setLocation(0,0);
        
        mainPanel.removeAll();
        mainPanel.add(waiting, BorderLayout.CENTER);
        mainPanel.revalidate();
        mainPanel.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        optionsPanel = new javax.swing.JPanel();
        panelNewAppointment = new javax.swing.JPanel();
        lblNewAppointment = new javax.swing.JLabel();
        panelDeleteAppointment = new javax.swing.JPanel();
        lblDeleteAppointment = new javax.swing.JLabel();
        panelEditAppointment = new javax.swing.JPanel();
        lblEditAppointment = new javax.swing.JLabel();
        panelCheckAppointment = new javax.swing.JPanel();
        lblCheckAppointmets = new javax.swing.JLabel();
        panelAccount = new javax.swing.JPanel();
        lblAccount = new javax.swing.JLabel();
        panelLogOut = new javax.swing.JPanel();
        lblLogOut = new javax.swing.JLabel();
        lblHelp = new javax.swing.JLabel();
        toolsBar = new javax.swing.JPanel();
        panelDispose = new javax.swing.JPanel();
        lblDispose = new javax.swing.JLabel();
        panelMinimize = new javax.swing.JPanel();
        lblMinimize = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();
        lblHome = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        lblBanner = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        optionsPanel.setBackground(new java.awt.Color(240, 240, 240));

        panelNewAppointment.setBackground(new java.awt.Color(240, 240, 240));

        lblNewAppointment.setBackground(new java.awt.Color(240, 240, 240));
        lblNewAppointment.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNewAppointment.setForeground(new java.awt.Color(30, 140, 200));
        lblNewAppointment.setIcon(new javax.swing.ImageIcon("D:\\chava\\Documents\\NetBeansProjects\\proyectoReque\\images\\new_appointment.png")); // NOI18N
        lblNewAppointment.setText("New Appointment");
        lblNewAppointment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNewAppointmentMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNewAppointmentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNewAppointmentMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelNewAppointmentLayout = new javax.swing.GroupLayout(panelNewAppointment);
        panelNewAppointment.setLayout(panelNewAppointmentLayout);
        panelNewAppointmentLayout.setHorizontalGroup(
            panelNewAppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNewAppointment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelNewAppointmentLayout.setVerticalGroup(
            panelNewAppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNewAppointment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panelDeleteAppointment.setBackground(new java.awt.Color(240, 240, 240));

        lblDeleteAppointment.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDeleteAppointment.setForeground(new java.awt.Color(30, 140, 200));
        lblDeleteAppointment.setIcon(new javax.swing.ImageIcon("D:\\chava\\Documents\\NetBeansProjects\\proyectoReque\\images\\delete_appointment.png")); // NOI18N
        lblDeleteAppointment.setText("Delete Appointment");
        lblDeleteAppointment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDeleteAppointmentMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDeleteAppointmentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDeleteAppointmentMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelDeleteAppointmentLayout = new javax.swing.GroupLayout(panelDeleteAppointment);
        panelDeleteAppointment.setLayout(panelDeleteAppointmentLayout);
        panelDeleteAppointmentLayout.setHorizontalGroup(
            panelDeleteAppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDeleteAppointment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelDeleteAppointmentLayout.setVerticalGroup(
            panelDeleteAppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDeleteAppointment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panelEditAppointment.setBackground(new java.awt.Color(240, 240, 240));

        lblEditAppointment.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEditAppointment.setForeground(new java.awt.Color(30, 140, 200));
        lblEditAppointment.setIcon(new javax.swing.ImageIcon("D:\\chava\\Documents\\NetBeansProjects\\proyectoReque\\images\\editAppointment.png")); // NOI18N
        lblEditAppointment.setText("Edit Appoinment");
        lblEditAppointment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditAppointmentMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEditAppointmentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEditAppointmentMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelEditAppointmentLayout = new javax.swing.GroupLayout(panelEditAppointment);
        panelEditAppointment.setLayout(panelEditAppointmentLayout);
        panelEditAppointmentLayout.setHorizontalGroup(
            panelEditAppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEditAppointment, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        panelEditAppointmentLayout.setVerticalGroup(
            panelEditAppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEditAppointmentLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblEditAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelCheckAppointment.setBackground(new java.awt.Color(240, 240, 240));

        lblCheckAppointmets.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCheckAppointmets.setForeground(new java.awt.Color(30, 140, 200));
        lblCheckAppointmets.setIcon(new javax.swing.ImageIcon("D:\\chava\\Documents\\NetBeansProjects\\proyectoReque\\images\\check_appointments.png")); // NOI18N
        lblCheckAppointmets.setText("Check Appointments");
        lblCheckAppointmets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCheckAppointmetsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCheckAppointmetsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCheckAppointmetsMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelCheckAppointmentLayout = new javax.swing.GroupLayout(panelCheckAppointment);
        panelCheckAppointment.setLayout(panelCheckAppointmentLayout);
        panelCheckAppointmentLayout.setHorizontalGroup(
            panelCheckAppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCheckAppointmets, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        panelCheckAppointmentLayout.setVerticalGroup(
            panelCheckAppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCheckAppointmentLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblCheckAppointmets, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelAccount.setBackground(new java.awt.Color(240, 240, 240));

        lblAccount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAccount.setForeground(new java.awt.Color(30, 140, 200));
        lblAccount.setIcon(new javax.swing.ImageIcon("D:\\chava\\Documents\\NetBeansProjects\\proyectoReque\\images\\account.png")); // NOI18N
        lblAccount.setText("Account");
        lblAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAccountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAccountMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelAccountLayout = new javax.swing.GroupLayout(panelAccount);
        panelAccount.setLayout(panelAccountLayout);
        panelAccountLayout.setHorizontalGroup(
            panelAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAccount, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        panelAccountLayout.setVerticalGroup(
            panelAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAccountLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelLogOut.setBackground(new java.awt.Color(240, 240, 240));

        lblLogOut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblLogOut.setForeground(new java.awt.Color(30, 140, 200));
        lblLogOut.setIcon(new javax.swing.ImageIcon("D:\\chava\\Documents\\NetBeansProjects\\proyectoReque\\images\\log_out.png")); // NOI18N
        lblLogOut.setText("Log Out");
        lblLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogOutMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelLogOutLayout = new javax.swing.GroupLayout(panelLogOut);
        panelLogOut.setLayout(panelLogOutLayout);
        panelLogOutLayout.setHorizontalGroup(
            panelLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLogOutLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelLogOutLayout.setVerticalGroup(
            panelLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogOut)
        );

        javax.swing.GroupLayout optionsPanelLayout = new javax.swing.GroupLayout(optionsPanel);
        optionsPanel.setLayout(optionsPanelLayout);
        optionsPanelLayout.setHorizontalGroup(
            optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelNewAppointment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDeleteAppointment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionsPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelCheckAppointment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelAccount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(optionsPanelLayout.createSequentialGroup()
                        .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelEditAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        optionsPanelLayout.setVerticalGroup(
            optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(panelNewAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelDeleteAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(panelEditAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(panelCheckAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(panelAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        bg.add(optionsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 220, 430));

        lblHelp.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblHelp.setForeground(new java.awt.Color(30, 140, 200));
        lblHelp.setText("Help");
        bg.add(lblHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 40, 50));

        toolsBar.setBackground(new java.awt.Color(0, 0, 0));

        panelDispose.setBackground(new java.awt.Color(0, 0, 0));

        lblDispose.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDispose.setForeground(new java.awt.Color(255, 255, 255));
        lblDispose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDispose.setText("X");
        lblDispose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDisposeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDisposeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDisposeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelDisposeLayout = new javax.swing.GroupLayout(panelDispose);
        panelDispose.setLayout(panelDisposeLayout);
        panelDisposeLayout.setHorizontalGroup(
            panelDisposeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDispose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );
        panelDisposeLayout.setVerticalGroup(
            panelDisposeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDispose, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        panelMinimize.setBackground(new java.awt.Color(0, 0, 0));

        lblMinimize.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        lblMinimize.setForeground(new java.awt.Color(255, 255, 255));
        lblMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimize.setText("-");
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelMinimizeLayout = new javax.swing.GroupLayout(panelMinimize);
        panelMinimize.setLayout(panelMinimizeLayout);
        panelMinimizeLayout.setHorizontalGroup(
            panelMinimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMinimize, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );
        panelMinimizeLayout.setVerticalGroup(
            panelMinimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMinimize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout toolsBarLayout = new javax.swing.GroupLayout(toolsBar);
        toolsBar.setLayout(toolsBarLayout);
        toolsBarLayout.setHorizontalGroup(
            toolsBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, toolsBarLayout.createSequentialGroup()
                .addGap(0, 840, Short.MAX_VALUE)
                .addComponent(panelMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDispose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        toolsBarLayout.setVerticalGroup(
            toolsBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDispose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelMinimize, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg.add(toolsBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 20));

        lblIcon.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblIcon.setForeground(new java.awt.Color(30, 140, 200));
        lblIcon.setIcon(new javax.swing.ImageIcon("D:\\chava\\Documents\\NetBeansProjects\\proyectoReque\\images\\logotipo.png")); // NOI18N
        lblIcon.setText("Medict");
        bg.add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 100, 50));

        lblHome.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblHome.setForeground(new java.awt.Color(30, 140, 200));
        lblHome.setText("Home");
        bg.add(lblHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 50, 50));

        mainPanel.setBackground(new java.awt.Color(247, 255, 235));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        bg.add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 740, 430));

        lblBanner.setIcon(new javax.swing.ImageIcon("D:\\chava\\Documents\\NetBeansProjects\\proyectoReque\\images\\banner.png")); // NOI18N
        bg.add(lblBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 950, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblDeleteAppointmentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeleteAppointmentMouseEntered
        String deleteAppointment = "<HTML><u>Delete Appointment</u></HTML>";
        lblDeleteAppointment.setText(deleteAppointment);
        panelDeleteAppointment.setBackground(new Color(250,250,250));
    }//GEN-LAST:event_lblDeleteAppointmentMouseEntered

    private void lblDeleteAppointmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeleteAppointmentMouseClicked
        lblDeleteAppointment.setText("Delete Appointment");
    }//GEN-LAST:event_lblDeleteAppointmentMouseClicked

    private void lblDeleteAppointmentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeleteAppointmentMouseExited
        lblDeleteAppointment.setText("Delete Appointment");
        panelDeleteAppointment.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_lblDeleteAppointmentMouseExited

    private void lblEditAppointmentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditAppointmentMouseEntered
        String editAppointment = "<HTML><u>Edit Appointment</u></HTML>";
        lblEditAppointment.setText(editAppointment);
        panelEditAppointment.setBackground(new Color(250,250,250));
    }//GEN-LAST:event_lblEditAppointmentMouseEntered

    private void lblEditAppointmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditAppointmentMouseClicked
        lblEditAppointment.setText("Edit Appointment");
    }//GEN-LAST:event_lblEditAppointmentMouseClicked

    private void lblEditAppointmentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditAppointmentMouseExited
        lblEditAppointment.setText("Edit Appointment");
        panelEditAppointment.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_lblEditAppointmentMouseExited

    private void lblCheckAppointmetsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCheckAppointmetsMouseEntered
        String checkAppointments = "<HTML><u>Check Appointments</u></HTML>";
        lblCheckAppointmets.setText(checkAppointments);
        panelCheckAppointment.setBackground(new Color(250,250,250));
    }//GEN-LAST:event_lblCheckAppointmetsMouseEntered

    private void lblCheckAppointmetsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCheckAppointmetsMouseClicked
        lblCheckAppointmets.setText("Check Appointments");
    }//GEN-LAST:event_lblCheckAppointmetsMouseClicked

    private void lblCheckAppointmetsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCheckAppointmetsMouseExited
        lblCheckAppointmets.setText("Check Appointments");
        panelCheckAppointment.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_lblCheckAppointmetsMouseExited

    private void lblAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAccountMouseEntered
        String account = "<HTML><u>Account</u></HTML>";
        lblAccount.setText(account);
        panelAccount.setBackground(new Color(250,250,250));
    }//GEN-LAST:event_lblAccountMouseEntered

    private void lblAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAccountMouseClicked
        lblAccount.setText("Account");
    }//GEN-LAST:event_lblAccountMouseClicked

    private void lblAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAccountMouseExited
        lblAccount.setText("Account");
        panelAccount.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_lblAccountMouseExited

    private void lblLogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogOutMouseEntered
        String logOut = "<HTML><u>Log Out</u></HTML>";
        lblLogOut.setText(logOut);
        panelLogOut.setBackground(new Color(250,250,250));
    }//GEN-LAST:event_lblLogOutMouseEntered

    private void lblLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogOutMouseClicked
        lblLogOut.setText("Log Out");
    }//GEN-LAST:event_lblLogOutMouseClicked

    private void lblLogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogOutMouseExited
        lblLogOut.setText("Log Out");
        panelLogOut.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_lblLogOutMouseExited

    private void lblNewAppointmentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNewAppointmentMouseExited
        lblNewAppointment.setText("New Appointment");
        panelNewAppointment.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_lblNewAppointmentMouseExited

    private void lblNewAppointmentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNewAppointmentMouseEntered
        String newAppointment = "<HTML><u>New Appointment</u></HTML>";
        lblNewAppointment.setText(newAppointment);
        panelNewAppointment.setBackground(new Color(250,250,250));
    }//GEN-LAST:event_lblNewAppointmentMouseEntered

    private void lblNewAppointmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNewAppointmentMouseClicked
        lblNewAppointment.setText("New Appointment");
        
        newAppointmentFrame p1 = new newAppointmentFrame();
        p1.setSize(730,430);
        p1.setLocation(0,0);
        
        mainPanel.removeAll();
        mainPanel.add(p1, BorderLayout.CENTER);
        mainPanel.revalidate();
        mainPanel.repaint();
        
    }//GEN-LAST:event_lblNewAppointmentMouseClicked

    private void lblDisposeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDisposeMouseEntered
        panelDispose.setBackground(Color.RED);
        lblDispose.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblDisposeMouseEntered

    private void lblDisposeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDisposeMouseExited
        panelDispose.setBackground(Color.BLACK);
        lblDispose.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblDisposeMouseExited

    private void lblDisposeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDisposeMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblDisposeMouseClicked

    private void lblMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseEntered
        panelMinimize.setBackground(Color.BLUE);
        lblMinimize.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblMinimizeMouseEntered

    private void lblMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseExited
        panelMinimize.setBackground(Color.BLACK);
        lblMinimize.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblMinimizeMouseExited

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_lblMinimizeMouseClicked

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
            java.util.logging.Logger.getLogger(homeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homeMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel lblAccount;
    private javax.swing.JLabel lblBanner;
    private javax.swing.JLabel lblCheckAppointmets;
    private javax.swing.JLabel lblDeleteAppointment;
    private javax.swing.JLabel lblDispose;
    private javax.swing.JLabel lblEditAppointment;
    private javax.swing.JLabel lblHelp;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblLogOut;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblNewAppointment;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel optionsPanel;
    private javax.swing.JPanel panelAccount;
    private javax.swing.JPanel panelCheckAppointment;
    private javax.swing.JPanel panelDeleteAppointment;
    private javax.swing.JPanel panelDispose;
    private javax.swing.JPanel panelEditAppointment;
    private javax.swing.JPanel panelLogOut;
    private javax.swing.JPanel panelMinimize;
    private javax.swing.JPanel panelNewAppointment;
    private javax.swing.JPanel toolsBar;
    // End of variables declaration//GEN-END:variables
}
