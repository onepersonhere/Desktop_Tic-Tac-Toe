package tictactoe;

import javax.swing.*;
import java.awt.*;

public class TicTacToe extends JFrame {
    private static Board p = new Board();
    public TicTacToe() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setSize(600, 635);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(new BorderLayout());
        add(p, BorderLayout.CENTER);
        p.DISABLEALL();
        
        JPanel status = new Status();
        add(status, BorderLayout.PAGE_END);

        JPanel ControlPanel = new ControlPanel();
        add(ControlPanel, BorderLayout.PAGE_START);
    }
    public static Board getP(){
        return p;
    }



}

