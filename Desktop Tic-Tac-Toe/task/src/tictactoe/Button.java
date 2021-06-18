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
                JLabel status = Status.getStatus();

                int count = Count.getCount();
                if(getText().equals(" ") && count % 2 == 0) {
                    setText("X");
                    Count.addCount();
                    checkStatus();
                    if(!status.getText().equals("X wins")) {
                        opponent();
                    }
                }
                if(getText().equals(" ") && count % 2 != 0){
                    setText("O");
                    Count.addCount();
                    checkStatus();
                    if(!status.getText().equals("O wins")) {
                        opponent();
                    }
                }

            }
        });
    }
    private void opponent(){
        //opponent(AI)
        if(aiPlays && aiSymbol.equals("X")){
            EasyAI.opponentAI("X");
            Count.addCount();
            checkStatus();

        }
        if(aiPlays && aiSymbol.equals("O")){
            EasyAI.opponentAI("O");
            Count.addCount();
            checkStatus();

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
        JButton player1 = ControlPanel.getPlayer1();
        JButton player2 = ControlPanel.getPlayer2();

        if(Count.getCount() % 2 == 0){
            status.setText("The turn of " + player1.getText() + " Player (X)");
        }else{
            status.setText("The turn of " + player2.getText() + " Player (O)");
        }
        //status.setText("Game in progress");
        if(Count.getCount() >= 9){
            status.setText("Draw");
        }
        if(p.getA1().equals(p.getA2()) && p.getA2().equals(p.getA3())){
            if(p.getA1().equals("X")) {
                String str = player1.getText();
                status.setText("The " + str + " Player (X) wins");
                p.DISABLEALL();
            }
            if(p.getA1().equals("O")){
                String str = player2.getText();
                status.setText("The " + str + " Player (O) wins");
                p.DISABLEALL();
            }
        }
        if(p.getB1().equals(p.getB2()) && p.getB2().equals(p.getB3())){
            if(p.getB1().equals("X")) {
                String str = player1.getText();
                status.setText("The " + str + " Player (X) wins");
                p.DISABLEALL();
            }
            if(p.getB1().equals("O")){
                String str = player2.getText();
                status.setText("The " + str + " Player (O) wins");
                p.DISABLEALL();
            }
        }
        if(p.getC1().equals(p.getC2()) && p.getC2().equals(p.getC3())){
            if(p.getC1().equals("X")) {
                String str = player1.getText();
                status.setText("The " + str + " Player (X) wins");
                p.DISABLEALL();
            }
            if(p.getC1().equals("O")){
                String str = player2.getText();
                status.setText("The " + str + " Player (O) wins");
                p.DISABLEALL();
            }
        }
        if(p.getA1().equals(p.getB1()) && p.getB1().equals(p.getC1())){
            if(p.getA1().equals("X")) {
                String str = player1.getText();
                status.setText("The " + str + " Player (X) wins");
                p.DISABLEALL();
            }
            if(p.getA1().equals("O")){
                String str = player2.getText();
                status.setText("The " + str + " Player (O) wins");
                p.DISABLEALL();
            }
        }
        if(p.getA2().equals(p.getB2()) && p.getB2().equals(p.getC2())){
            if(p.getA2().equals("X")) {
                String str = player1.getText();
                status.setText("The " + str + " Player (X) wins");
                p.DISABLEALL();
            }
            if(p.getA2().equals("O")){
                String str = player2.getText();
                status.setText("The " + str + " Player (O) wins");
                p.DISABLEALL();
            }
        }
        if(p.getA3().equals(p.getB3()) && p.getB3().equals(p.getC3())){
            if(p.getA3().equals("X")) {
                String str = player1.getText();
                status.setText("The " + str + " Player (X) wins");
                p.DISABLEALL();
            }
            if(p.getA3().equals("O")){
                String str = player2.getText();
                status.setText("The " + str + " Player (O) wins");
                p.DISABLEALL();
            }
        }
        if(p.getA1().equals(p.getB2()) && p.getB2().equals(p.getC3())){
            if(p.getA1().equals("X")) {
                String str = player1.getText();
                status.setText("The " + str + " Player (X) wins");
                p.DISABLEALL();
            }
            if(p.getA1().equals("O")){
                String str = player2.getText();
                status.setText("The " + str + " Player (O) wins");
                p.DISABLEALL();
            }
        }
        if(p.getA3().equals(p.getB2()) && p.getB2().equals(p.getC1())){
            if(p.getA3().equals("X")) {
                String str = player1.getText();
                status.setText("The " + str + " Player (X) wins");
                p.DISABLEALL();
            }
            if(p.getA3().equals("O")){
                String str = player2.getText();
                status.setText("The " + str + " Player (O) wins");
                p.DISABLEALL();
            }
        }
    }
    public void resetText(){
        setText(" ");
    }
}
