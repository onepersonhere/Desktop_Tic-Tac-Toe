package tictactoe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JButton {
    public Button(String buttonName, String coord){
        setName(buttonName);
        setFocusPainted(false);
        setText("");
        setFont(new Font("Arial", Font.BOLD, 80));

        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(getText().equals("")) {
                    setText("X");
                }else if(getText().equals("X")){
                    setText("O");
                }
            }
        });
    }
    public void resetText(){
        setText("");
    }
}
