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
    public void DISABLEALL(){
        a1.setEnabled(false);
        a2.setEnabled(false);
        a3.setEnabled(false);
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        c1.setEnabled(false);
        c2.setEnabled(false);
        c3.setEnabled(false);
    }
    public void ENABLE(){
        a1.setEnabled(true);
        a2.setEnabled(true);
        a3.setEnabled(true);
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        c1.setEnabled(true);
        c2.setEnabled(true);
        c3.setEnabled(true);
    }
    public String getA1() {
        return a1.getText();
    }

    public String getA2() {
        return a2.getText();
    }

    public String getA3() {
        return a3.getText();
    }

    public String getB1() {
        return b1.getText();
    }

    public String getB2() {
        return b2.getText();
    }

    public String getB3() {
        return b3.getText();
    }

    public String getC1() {
        return c1.getText();
    }

    public String getC2() {
        return c2.getText();
    }

    public String getC3() {
        return c3.getText();
    }

    public void setA1(String text) {
        a1.setText(text);
    }

    public void setA2(String text) {
        a2.setText(text);
    }

    public void setA3(String text) {
        a3.setText(text);
    }

    public void setB1(String text) {
        b1.setText(text);
    }

    public void setB2(String text) {
        b2.setText(text);
    }

    public void setB3(String text) {
        b3.setText(text);
    }

    public void setC1(String text) {
        c1.setText(text);
    }

    public void setC2(String text) {
        c2.setText(text);
    }

    public void setC3(String text) {
        c3.setText(text);
    }
}
