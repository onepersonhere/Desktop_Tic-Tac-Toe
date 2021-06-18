package tictactoe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JButton {
    private static boolean aiPlays = false;
    private static String aiSymbol;
    public Button(String buttonName, String coord){
        setName(buttonName);
        setFocusPainted(false);
        setText(" ");
        setFont(new Font("Arial", Font.BOLD, 80));

        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //change this part to correspond to the count
                int count = Count.getCount();
                if(getText().equals(" ") && count % 2 == 0) {
                    setText("X");
                    checkStatus();
                    Count.addCount();
                    opponent();
                }
                if(getText().equals(" ") && count % 2 != 0){
                    setText("O");
                    checkStatus();
                    Count.addCount();
                    opponent();
                }

            }
        });
    }
    private void opponent(){
        //opponent(AI)
        if(aiPlays && aiSymbol.equals("X")){
            EasyAI.opponentAI("X");
            checkStatus();
            Count.addCount();
        }
        if(aiPlays && aiSymbol.equals("O")){
            EasyAI.opponentAI("O");
            checkStatus();
            Count.addCount();
        }
    }

    public static void setAiPlays(boolean aiPlays, String aiSymbol) {
        Button.aiPlays = aiPlays;
        Button.aiSymbol = aiSymbol;
    }

    //check if win
    public static void checkStatus(){
        JLabel status = Status.getStatus();
        Board p = TicTacToe.getP();

        status.setText("Game in progress");
        if(p.getA1().equals(p.getA2()) && p.getA2().equals(p.getA3())){
            if(p.getA1().equals("X")) {
                status.setText("X wins");
                p.DISABLEALL();
            }
            if(p.getA1().equals("O")){
                status.setText("O wins");
                p.DISABLEALL();
            }
        }
        if(p.getB1().equals(p.getB2()) && p.getB2().equals(p.getB3())){
            if(p.getB1().equals("X")) {
                status.setText("X wins");
                p.DISABLEALL();
            }
            if(p.getB1().equals("O")){
                status.setText("O wins");
                p.DISABLEALL();
            }
        }
        if(p.getC1().equals(p.getC2()) && p.getC2().equals(p.getC3())){
            if(p.getC1().equals("X")) {
                status.setText("X wins");
                p.DISABLEALL();
            }
            if(p.getC1().equals("O")){
                status.setText("O wins");
                p.DISABLEALL();
            }
        }
        if(p.getA1().equals(p.getB1()) && p.getB1().equals(p.getC1())){
            if(p.getA1().equals("X")) {
                status.setText("X wins");
                p.DISABLEALL();
            }
            if(p.getA1().equals("O")){
                status.setText("O wins");
                p.DISABLEALL();
            }
        }
        if(p.getA2().equals(p.getB2()) && p.getB2().equals(p.getC2())){
            if(p.getA2().equals("X")) {
                status.setText("X wins");
                p.DISABLEALL();
            }
            if(p.getA2().equals("O")){
                status.setText("O wins");
                p.DISABLEALL();
            }
        }
        if(p.getA3().equals(p.getB3()) && p.getB3().equals(p.getC3())){
            if(p.getA3().equals("X")) {
                status.setText("X wins");
                p.DISABLEALL();
            }
            if(p.getA3().equals("O")){
                status.setText("O wins");
                p.DISABLEALL();
            }
        }
        if(p.getA1().equals(p.getB2()) && p.getB2().equals(p.getC3())){
            if(p.getA1().equals("X")) {
                status.setText("X wins");
                p.DISABLEALL();
            }
            if(p.getA1().equals("O")){
                status.setText("O wins");
                p.DISABLEALL();
            }
        }
        if(p.getA3().equals(p.getB2()) && p.getB2().equals(p.getC1())){
            if(p.getA3().equals("X")) {
                status.setText("X wins");
                p.DISABLEALL();
            }
            if(p.getA3().equals("O")){
                status.setText("O wins");
                p.DISABLEALL();
            }
        }
    }
    public void resetText(){
        setText(" ");
    }
}
