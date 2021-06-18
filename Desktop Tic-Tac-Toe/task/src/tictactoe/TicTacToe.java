package tictactoe;

import javax.naming.ldap.Control;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class TicTacToe extends JFrame {
    private static Board p = new Board();
    private static JMenuBar menuBar = new JMenuBar();
    private static JMenu MenuGame = new JMenu("Game");
    private static JMenuItem MenuHumanHuman = new JMenuItem("Human vs Human");
    private static JMenuItem MenuHumanRobot = new JMenuItem("Human vs Robot");
    private static JMenuItem MenuRobotHuman = new JMenuItem("Robot vs Human");
    private static JMenuItem MenuRobotRobot = new JMenuItem("Robot vs Robot");
    private static JMenuItem MenuExit = new JMenuItem("Exit");
    private static JPanel controlpanel = new ControlPanel();

    public TicTacToe() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setSize(600, 635);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());
        add(p, BorderLayout.CENTER);
        p.DISABLEALL();

        JPanel status = new Status();
        add(status, BorderLayout.PAGE_END);

        add(controlpanel, BorderLayout.PAGE_START);

        setJMenuBar(menuBar);

        menuItems();

        setVisible(true);
    }
    public static Board getP(){
        return p;
    }
    private void menuItems(){
        JLabel status = Status.getStatus();
        JButton player1 = ControlPanel.getPlayer1();
        JButton player2 = ControlPanel.getPlayer2();
        JButton startReset = ControlPanel.getStartReset();

        MenuGame.setMnemonic(KeyEvent.VK_G);
        MenuGame.setName("MenuGame");
        menuBar.add(MenuGame);

        MenuHumanHuman.setMnemonic(KeyEvent.VK_H);
        MenuHumanHuman.setName("MenuHumanHuman");
        MenuHumanHuman.addActionListener(event -> {
            //clear field & set status
            Count.setCount(0);
            status.setText("The turn of Human Player (X)");
            p.RESET();
            //set desired values in toolbar
            player1.setText("Human");
            player2.setText("Human");
            Button.setAiPlays(false, " ");
            //start game automatically
            player1.setEnabled(false);
            player2.setEnabled(false);
            p.ENABLE();
            //set startReset Button to Reset mode
            startReset.setText("Reset");

        });

        MenuHumanRobot.setMnemonic(KeyEvent.VK_R);
        MenuHumanRobot.setName("MenuHumanRobot");
        MenuHumanRobot.addActionListener(event -> {
            //clear field
            Count.setCount(0);
            status.setText("The turn of Human Player (X)");
            p.RESET();
            //set desired values in toolbar
            player1.setText("Human");
            player2.setText("Robot");
            //start game automatically
            Button.setAiPlays(true, "O");
            player1.setEnabled(false);
            player2.setEnabled(false);
            p.ENABLE();
            //set startReset Button to Reset mode
            startReset.setText("Reset");
        });

        MenuRobotHuman.setMnemonic(KeyEvent.VK_U);
        MenuRobotHuman.setName("MenuRobotHuman");
        MenuRobotHuman.addActionListener(event -> {
            //clear field
            Count.setCount(0);
            status.setText("The turn of Robot Player (X)");
            p.RESET();
            //set desired values in toolbar
            player1.setText("Robot");
            player2.setText("Human");
            //start game automatically
            Button.setAiPlays(true, "X");
            player1.setEnabled(false);
            player2.setEnabled(false);
            p.ENABLE();
            //set startReset Button to Reset mode
            startReset.setText("Reset");

            EasyAI.opponentAI("X");
            Count.addCount();
            status.setText("The turn of Human Player (O)");
        });

        MenuRobotRobot.setMnemonic(KeyEvent.VK_O);
        MenuRobotRobot.setName("MenuRobotRobot");
        MenuRobotRobot.addActionListener(event -> {
            //clear field
            Count.setCount(0);
            status.setText("The turn of Robot Player (X)");
            p.RESET();
            //set desired values in toolbar
            player1.setText("Robot");
            player2.setText("Robot");
            //start game automatically
            player1.setEnabled(false);
            player2.setEnabled(false);
            p.DISABLEALL();

            //set startReset Button to Reset mode
            startReset.setText("Reset");

            EasyAI.AIvsAI();
        });

        MenuExit.setMnemonic(KeyEvent.VK_X);
        MenuExit.setName("MenuExit");
        MenuExit.addActionListener(event -> {
            System.exit(0);
        });

        MenuGame.add(MenuHumanHuman);
        MenuGame.add(MenuHumanRobot);
        MenuGame.add(MenuRobotHuman);
        MenuGame.add(MenuRobotRobot);

        MenuGame.addSeparator();
        MenuGame.add(MenuExit);
    }


}

