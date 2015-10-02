package sandbox;

public class SettingsFrame extends javax.swing.JFrame {

    public SettingsFrame() {
        initComponents();
        switch (GameController.getCurrentDif()){
//            case Settings.MIN_FIELD_SIZE: MinFieldRadio.setSelected(true);break;
//            case Settings.MEDIUM_FIELD_SIZE: MedFieldRadio.setSelected(true);break;
//            case Settings.MAX_FIELD_SIZE: MaxFieldRadio.setSelected(true);break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        MinFieldRadio = new javax.swing.JRadioButton();
        MedFieldRadio = new javax.swing.JRadioButton();
        MaxFieldRadio = new javax.swing.JRadioButton();
        CloseButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        buttonGroup2.add(MinFieldRadio);
        MinFieldRadio.setSelected(true);
        MinFieldRadio.setText("Поле 10 на 10");

        buttonGroup2.add(MedFieldRadio);
        MedFieldRadio.setText("Поле 20 на 20");

        buttonGroup2.add(MaxFieldRadio);
        MaxFieldRadio.setText("Поле 40 на 40");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MaxFieldRadio)
                    .addComponent(MinFieldRadio)
                    .addComponent(MedFieldRadio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MinFieldRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MedFieldRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MaxFieldRadio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CloseButton.setText("Начать новую игру");
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(CloseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CloseButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
        if (MaxFieldRadio.isSelected()) {
//            GameController.setCurrentDif(Settings.MAX_FIELD_SIZE);
        }
        if (MedFieldRadio.isSelected()) {
//            GameController.setCurrentDif(Settings.MEDIUM_FIELD_SIZE);
        }
        if (MinFieldRadio.isSelected()) {
//            GameController.setCurrentDif(Settings.MIN_FIELD_SIZE);
        }
        this.dispose();
       
        MainFrame.NewGameButton.doClick();
    }//GEN-LAST:event_CloseButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SettingsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CloseButton;
    private javax.swing.JRadioButton MaxFieldRadio;
    private javax.swing.JRadioButton MedFieldRadio;
    private javax.swing.JRadioButton MinFieldRadio;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
