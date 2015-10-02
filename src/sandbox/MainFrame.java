package sandbox;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class MainFrame extends javax.swing.JFrame {

    public GameController controller;

    public MainFrame() {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
            SwingUtilities.updateComponentTreeUI(this);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        levelGroup = new javax.swing.ButtonGroup();
        CellsPane = new java.awt.Canvas();
        ChangeColorPanel = new javax.swing.JPanel();
        redButton = new javax.swing.JButton();
        yellowButton = new javax.swing.JButton();
        greenButton = new javax.swing.JButton();
        blueButton = new javax.swing.JButton();
        tealButton = new javax.swing.JButton();
        purpleButton = new javax.swing.JButton();
        MenuPanel = new javax.swing.JPanel();
        NewGameButton = new javax.swing.JButton();
        AboutButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Min_hard_radio = new javax.swing.JRadioButton();
        Med_hard_radio = new javax.swing.JRadioButton();
        Max_hard_radio = new javax.swing.JRadioButton();
        GameStatusField = new javax.swing.JScrollPane();
        GameStatusFieldText = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Colored Tiles");
        setBounds(new java.awt.Rectangle(0, 0, 1, 1));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(710, 470));
        setResizable(false);
        setSize(new java.awt.Dimension(710, 470));
        getContentPane().setLayout(null);
        getContentPane().add(CellsPane);
        CellsPane.setBounds(10, 10, 400, 400);

        ChangeColorPanel.setMaximumSize(new java.awt.Dimension(270, 210));
        ChangeColorPanel.setLayout(new java.awt.GridLayout(1, 0));

        redButton.setBackground(new java.awt.Color(255, 0, 0));
        redButton.setEnabled(false);
        redButton.setName(""); // NOI18N
        redButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redButtonActionPerformed(evt);
            }
        });
        ChangeColorPanel.add(redButton);

        yellowButton.setBackground(new java.awt.Color(255, 255, 0));
        yellowButton.setEnabled(false);
        yellowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yellowButtonActionPerformed(evt);
            }
        });
        ChangeColorPanel.add(yellowButton);

        greenButton.setBackground(new java.awt.Color(0, 255, 0));
        greenButton.setEnabled(false);
        greenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenButtonActionPerformed(evt);
            }
        });
        ChangeColorPanel.add(greenButton);

        blueButton.setBackground(new java.awt.Color(0, 0, 255));
        blueButton.setEnabled(false);
        blueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueButtonActionPerformed(evt);
            }
        });
        ChangeColorPanel.add(blueButton);

        tealButton.setBackground(new java.awt.Color(0, 255, 255));
        tealButton.setEnabled(false);
        tealButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tealButtonActionPerformed(evt);
            }
        });
        ChangeColorPanel.add(tealButton);

        purpleButton.setBackground(new java.awt.Color(255, 0, 255));
        purpleButton.setEnabled(false);
        purpleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purpleButtonActionPerformed(evt);
            }
        });
        ChangeColorPanel.add(purpleButton);

        getContentPane().add(ChangeColorPanel);
        ChangeColorPanel.setBounds(430, 210, 250, 200);

        NewGameButton.setText("New Game");
        NewGameButton.setPreferredSize(new java.awt.Dimension(95, 28));
        NewGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewGameButtonActionPerformed(evt);
            }
        });
        MenuPanel.add(NewGameButton);

        AboutButton.setText("About");
        AboutButton.setMaximumSize(new java.awt.Dimension(75, 28));
        AboutButton.setMinimumSize(new java.awt.Dimension(75, 28));
        AboutButton.setPreferredSize(new java.awt.Dimension(95, 28));
        AboutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutButtonActionPerformed(evt);
            }
        });
        MenuPanel.add(AboutButton);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Размер поля");
        jLabel1.setPreferredSize(new java.awt.Dimension(250, 20));
        MenuPanel.add(jLabel1);

        levelGroup.add(Min_hard_radio);
        Min_hard_radio.setSelected(true);
        Min_hard_radio.setText("10-10");
        MenuPanel.add(Min_hard_radio);

        levelGroup.add(Med_hard_radio);
        Med_hard_radio.setText("20-20");
        MenuPanel.add(Med_hard_radio);

        levelGroup.add(Max_hard_radio);
        Max_hard_radio.setText("40-40");
        MenuPanel.add(Max_hard_radio);

        GameStatusFieldText.setEditable(false);
        GameStatusFieldText.setColumns(20);
        GameStatusFieldText.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        GameStatusFieldText.setRows(5);
        GameStatusFieldText.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        GameStatusFieldText.setFocusable(false);
        GameStatusField.setViewportView(GameStatusFieldText);

        MenuPanel.add(GameStatusField);

        getContentPane().add(MenuPanel);
        MenuPanel.setBounds(430, 10, 250, 200);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void yellowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yellowButtonActionPerformed
        controller.Move(4);
        controller.MoveComp();
        CellsPainting(controller.getCellsColors());
        buttonsDeactivate(controller.getCellsColors());
        printGameStatus(controller.getGameStatus());
    }//GEN-LAST:event_yellowButtonActionPerformed

    private void redButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redButtonActionPerformed
        controller.Move(1);
        controller.MoveComp();
        CellsPainting(controller.getCellsColors());
        buttonsDeactivate(controller.getCellsColors());
        printGameStatus(controller.getGameStatus());
    }//GEN-LAST:event_redButtonActionPerformed

    private void tealButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tealButtonActionPerformed
        controller.Move(5);
        controller.MoveComp();
        CellsPainting(controller.getCellsColors());
        buttonsDeactivate(controller.getCellsColors());
        printGameStatus(controller.getGameStatus());
    }//GEN-LAST:event_tealButtonActionPerformed

    private void purpleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purpleButtonActionPerformed
        controller.Move(0);
        controller.MoveComp();
        CellsPainting(controller.getCellsColors());
        buttonsDeactivate(controller.getCellsColors());
        printGameStatus(controller.getGameStatus());
    }//GEN-LAST:event_purpleButtonActionPerformed

    private void greenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greenButtonActionPerformed
        controller.Move(2);
        controller.MoveComp();
        CellsPainting(controller.getCellsColors());
        buttonsDeactivate(controller.getCellsColors());
        printGameStatus(controller.getGameStatus());
    }//GEN-LAST:event_greenButtonActionPerformed

    private void blueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueButtonActionPerformed
        controller.Move(3);
        controller.MoveComp();
        CellsPainting(controller.getCellsColors());
        buttonsDeactivate(controller.getCellsColors());
        printGameStatus(controller.getGameStatus());
    }//GEN-LAST:event_blueButtonActionPerformed

    private void AboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutButtonActionPerformed
        AboutFrame help = new AboutFrame();
        help.setVisible(true);
    }//GEN-LAST:event_AboutButtonActionPerformed

    private void NewGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewGameButtonActionPerformed
        allButtonsActivated();
        if (Max_hard_radio.isSelected()) {
            GameController.setCurrentDif(Settings.max_hard.get());
        }
        if (Med_hard_radio.isSelected()) {
            GameController.setCurrentDif(Settings.med_hard.get());
        }
        if (Min_hard_radio.isSelected()) {
            GameController.setCurrentDif(Settings.min_hard.get());
        }
        controller = new GameController();
        allButtonsActivated();
        buttonsDeactivate(controller.getCellsColors());
        CellsPainting(controller.getCellsColors());
        printGameStatus(controller.getGameStatus());
    }//GEN-LAST:event_NewGameButtonActionPerformed

    private void CellsPainting(int[][] arg) {

        Graphics g = CellsPane.getGraphics();
        int cellsSize = GameController.getCellssize();
        for (int i = 0; i < GameController.getCurrentDif(); i++) {
            for (int j = 0; j < GameController.getCurrentDif(); j++) {
                switch (arg[i][j]) {
                    case 1:
                        g.setColor(Color.RED);
                        break;
                    case 2:
                        g.setColor(Color.GREEN);
                        break;
                    case 3:
                        g.setColor(Color.BLUE);
                        break;
                    case 4:
                        g.setColor(Color.YELLOW);
                        break;
                    case 5:
                        g.setColor(Color.CYAN);
                        break;
                    case 0:
                        g.setColor(Color.MAGENTA);
                        break;
                }
                g.fillRect(i * cellsSize, j * cellsSize, (i + 1) * cellsSize, (j + 1) * cellsSize);
            }
        }
    }

    private void printGameStatus(int[] a) {
        if (a[2] == 0) {
            if (a[0] > a[1]) {
                GameStatusFieldText.setText("Вы победили");
                controller.dispose();
                allButtonsDeactivated();
            }
            if (a[0] < a[1]) {
                GameStatusFieldText.setText("Вы проиграли");
                controller.dispose();
                allButtonsDeactivated();
            }
        } else {
            GameStatusFieldText.setText("Краткая статистика игры" + "\n"
                    + "Игрок : " + a[0] + "\n"
                    + "Опонент : " + a[1] + "\n"
                    + "Свободно полей : " + a[2]);
        }
    }

    private void buttonsDeactivate1(int[][] Colors) {

        allButtonsActivated();
        switch (Colors[0][0]) {
            case 1:
                redButton.setEnabled(false);
                break;
            case 2:
                greenButton.setEnabled(false);
                break;
            case 3:
                blueButton.setEnabled(false);
                break;
            case 4:
                yellowButton.setEnabled(false);
                break;
            case 5:
                tealButton.setEnabled(false);
                break;
            case 0:
                purpleButton.setEnabled(false);
                break;
        }
        switch (Colors[controller.getCurrentDif() - 1][controller.getCurrentDif() - 1]) {
            case 1:
                redButton.setEnabled(false);
                break;
            case 2:
                greenButton.setEnabled(false);
                break;
            case 3:
                blueButton.setEnabled(false);
                break;
            case 4:
                yellowButton.setEnabled(false);
                break;
            case 5:
                tealButton.setEnabled(false);
                break;
            case 0:
                purpleButton.setEnabled(false);
                break;
        }
    }

    private void buttonsDeactivate(int[][] Colors) {
        ChangeColorPanel.add(redButton);
        ChangeColorPanel.add(blueButton);
        ChangeColorPanel.add(greenButton);
        ChangeColorPanel.add(yellowButton);
        ChangeColorPanel.add(tealButton);
        ChangeColorPanel.add(purpleButton);
        switch (Colors[0][0]) {
            case 1:
                ChangeColorPanel.remove(redButton);
                break;
            case 2:
                ChangeColorPanel.remove(greenButton);
                break;
            case 3:
                ChangeColorPanel.remove(blueButton);
                break;
            case 4:
                ChangeColorPanel.remove(yellowButton);
                break;
            case 5:
                ChangeColorPanel.remove(tealButton);
                break;
            case 0:
                ChangeColorPanel.remove(purpleButton);
                break;
        }
        switch (Colors[GameController.getCurrentDif() - 1][GameController.getCurrentDif() - 1]) {
            case 1:
                ChangeColorPanel.remove(redButton);
                break;
            case 2:
                ChangeColorPanel.remove(greenButton);
                break;
            case 3:
                ChangeColorPanel.remove(blueButton);
                break;
            case 4:
                ChangeColorPanel.remove(yellowButton);
                break;
            case 5:
                ChangeColorPanel.remove(tealButton);
                break;
            case 0:
                ChangeColorPanel.remove(purpleButton);
                break;
        }
        ChangeColorPanel.updateUI();
    }

    private void allButtonsDeactivated() {
        redButton.setEnabled(false);
        blueButton.setEnabled(false);
        greenButton.setEnabled(false);
        yellowButton.setEnabled(false);
        tealButton.setEnabled(false);
        purpleButton.setEnabled(false);
    }

    private void allButtonsActivated() {
        redButton.setEnabled(true);
        blueButton.setEnabled(true);
        greenButton.setEnabled(true);
        yellowButton.setEnabled(true);
        tealButton.setEnabled(true);
        purpleButton.setEnabled(true);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AboutButton;
    private java.awt.Canvas CellsPane;
    private javax.swing.JPanel ChangeColorPanel;
    private javax.swing.JScrollPane GameStatusField;
    private javax.swing.JTextArea GameStatusFieldText;
    private javax.swing.JRadioButton Max_hard_radio;
    private javax.swing.JRadioButton Med_hard_radio;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JRadioButton Min_hard_radio;
    public static javax.swing.JButton NewGameButton;
    private javax.swing.JButton blueButton;
    private javax.swing.JButton greenButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.ButtonGroup levelGroup;
    private javax.swing.JButton purpleButton;
    private javax.swing.JButton redButton;
    private javax.swing.JButton tealButton;
    private javax.swing.JButton yellowButton;
    // End of variables declaration//GEN-END:variables

}
