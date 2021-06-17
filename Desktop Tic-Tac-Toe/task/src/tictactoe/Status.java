package tictactoe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Status extends JPanel {
    public Status(){
        setPreferredSize(new Dimension(600,35));
        setBackground(Color.GREEN);

        setLayout(new BorderLayout(5,5));
        JLabel status = new JLabel();
        status(status);
        add(status, BorderLayout.WEST);

        JButton reset = new JButton();
        reset(reset);
        add(reset, BorderLayout.EAST);
    }

    private void status(JLabel status){
        status.setName("LabelStatus");
        status.setText("Game is not started");
        status.setBounds(2, 0, 100, 30);
    }

    private void reset(JButton reset){
        reset.setName("ButtonReset");
        reset.setText("Reset");
        reset.setFocusPainted(false);
        reset.setPreferredSize(new Dimension(75,30));
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Board p = TicTacToe.getP();
                p.RESET();
            }
        });
    }
}
