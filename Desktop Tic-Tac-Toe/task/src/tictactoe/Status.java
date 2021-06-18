package tictactoe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Status extends JPanel {
    private static JLabel status = new JLabel();

    public Status(){
        setPreferredSize(new Dimension(600,35));
        setBackground(Color.GREEN);

        setLayout(new BorderLayout(5,5));

        JButton reset = new JButton();
        reset(reset);
        add(reset, BorderLayout.EAST);

        String statustxt = "Game is not started";
        status(status, statustxt);
        add(status, BorderLayout.WEST);

    }

    private void status(JLabel status, String statustxt){
        status.setName("LabelStatus");
        status.setText(statustxt);
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
                p.ENABLE();
                Count.setCount(0);
                status.setText("Game is not started");
            }
        });
    }

    public static JLabel getStatus() {
        return status;
    }

}
