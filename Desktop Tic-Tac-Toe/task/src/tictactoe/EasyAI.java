package tictactoe;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class EasyAI {
    public EasyAI(){
        //generates & changes coords Symbol based on coords
        //uses get"Button" and set"Button"
        //check status after every move
    }
    public static void opponentAI(String symbol){
        AI(symbol);
        Button.checkStatus();
    }
    //includes count
    public static void AIvsAI(){
        JLabel status = Status.getStatus();
        while(!status.getText().equals("The Robot Player (X) wins") ||
                !status.getText().equals("The Robot Player (O) wins")) {
            if(Count.getCount() % 2 == 0) {
                EasyAI.opponentAI("X");
                Count.addCount();
                Button.checkStatus();
            }else {
                EasyAI.opponentAI("O");
                Count.addCount();
                Button.checkStatus();
            }
        }
    }
    private static void AI(String symbol){
        Board p = TicTacToe.getP();
        int cell = (int)(Math.random() * 9 + 1);
        if(cell == 1){
            if(p.getA1().equals(" ")){
                p.setA1(symbol);
            }else{
                AI(symbol);
            }
        }
        if(cell == 2){
            if(p.getA2().equals(" ")){
                p.setA2(symbol);
            }else{
                AI(symbol);
            }
        }
        if(cell == 3){
            if(p.getA3().equals(" ")){
                p.setA3(symbol);
            }else{
                AI(symbol);
            }
        }
        if(cell == 4){
            if(p.getB1().equals(" ")){
                p.setB1(symbol);
            }else{
                AI(symbol);
            }
        }
        if(cell == 5){
            if(p.getB2().equals(" ")){
                p.setB2(symbol);
            }else{
                AI(symbol);
            }
        }
        if(cell == 6){
            if(p.getB3().equals(" ")){
                p.setB3(symbol);
            }else{
                AI(symbol);
            }
        }
        if(cell == 7){
            if(p.getC1().equals(" ")){
                p.setC1(symbol);
            }else{
                AI(symbol);
            }
        }
        if(cell == 8){
            if(p.getC2().equals(" ")){
                p.setC2(symbol);
            }else{
                AI(symbol);
            }
        }
        if(cell == 9){
            if(p.getC3().equals(" ")){
                p.setC3(symbol);
            }else{
                AI(symbol);
            }
        }
    }
}
