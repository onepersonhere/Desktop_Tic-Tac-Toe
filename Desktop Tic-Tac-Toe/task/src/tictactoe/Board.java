package tictactoe;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {

    private Button a1 = new Button("ButtonA1", "A1");
    private Button a2 = new Button("ButtonA2", "A2");
    private Button a3 = new Button("ButtonA3", "A3");
    private Button b1 = new Button("ButtonB1", "B1");
    private Button b2 = new Button("ButtonB2", "B2");
    private Button b3 = new Button("ButtonB3", "B3");
    private Button c1 = new Button("ButtonC1", "C1");
    private Button c2 = new Button("ButtonC2", "C2");
    private Button c3 = new Button("ButtonC3", "C3");

    public Board() {
        setLayout(new GridLayout(3,3));
        setPreferredSize(new Dimension(600,600));
        //setBackground(Color.GREEN);
        cells();
    }
    private void cells(){
        add(a3);add(b3);add(c3);
        add(a2);add(b2);add(c2);
        add(a1);add(b1);add(c1);
    }
    public void RESET(){
        a1.resetText();
        a2.resetText();
        a3.resetText();
        b1.resetText();
        b2.resetText();
        b3.resetText();
        c1.resetText();
        c2.resetText();
        c3.resetText();
    }

}
