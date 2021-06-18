package tictactoe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class TicTacToe extends JFrame {
    private static Board p = new Board();
    private static JMenuBar menuBar = new JMenuBar();
    private static JMenu menuGame = new JMenu("Game");
    private static JMenuItem MenuHumanHuman = new JMenuItem("Human vs Human");
    private static JMenuItem MenuHumanRobot = new JMenuItem("Human vs Robot");
    private static JMenuItem MenuRobotHuman = new JMenuItem("Robot vs Human");
    private static JMenuItem MenuRobotRobot = new JMenuItem("Robot vs Robot");
    private static JMenuItem MenuExit = new JMenuItem("Exit");

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

        JPanel ControlPanel = new ControlPanel();
        add(ControlPanel, BorderLayout.PAGE_START);

        setJMenuBar(menuBar);

        menuItems();

        setVisible(true);
    }
    public static Board getP(){
        return p;
    }
    private void menuItems(){
        menuGame.setMnemonic(KeyEvent.VK_G);
        menuBar.add(menuGame);

        MenuHumanHuman.setMnemonic(KeyEvent.VK_H);
        MenuHumanHuman.setName("MenuHumanHuman");
        MenuHumanHuman.addActionListener(event -> {
            //clear field
            //set desired values in toolbar
            //start game automatically
            //set startReset Button to Reset mode
        });

        MenuHumanRobot.setMnemonic(KeyEvent.VK_R);
        MenuHumanRobot.setName("MenuHumanRobot");
        MenuHumanRobot.addActionListener(event -> {

        });

        MenuRobotHuman.setMnemonic(KeyEvent.VK_U);
        MenuRobotHuman.setName("MenuRobotHuman");
        MenuRobotHuman.addActionListener(event -> {

        });

        MenuRobotRobot.setMnemonic(KeyEvent.VK_O);
        MenuRobotRobot.setName("MenuRobotRobot");
        MenuRobotRobot.addActionListener(event -> {

        });

        MenuExit.setMnemonic(KeyEvent.VK_X);
        MenuExit.setName("MenuExit");
        MenuExit.addActionListener(event -> {
            System.exit(0);
        });

        menuGame.add(MenuHumanHuman);
        menuGame.add(MenuHumanRobot);
        menuGame.add(MenuRobotHuman);
        menuGame.add(MenuRobotRobot);

        menuGame.addSeparator();
        menuGame.add(MenuExit);
    }


}

