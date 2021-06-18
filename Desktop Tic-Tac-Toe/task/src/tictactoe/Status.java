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

        setLayout(new FlowLayout(FlowLayout.LEADING));


        String statustxt = "Game is not started";
        status(status, statustxt);
        add(status);

    }

    private void status(JLabel status, String statustxt){
        status.setName("LabelStatus");
        status.setText(statustxt);
        status.setBounds(2, 0, 100, 30);
    }

    public static JLabel getStatus() {
        return status;
    }

}
