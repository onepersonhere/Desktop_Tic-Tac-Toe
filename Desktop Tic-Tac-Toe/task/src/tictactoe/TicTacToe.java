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
        JPanel status = new Status();
        add(status, BorderLayout.PAGE_END);
    }
    public static Board getP(){
        return p;
    }



}

