package tictactoe;

import javax.swing.*;

public class Count {
    private static int count = 0;

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Count.count = count;
    }

    public static void addCount(){
        JLabel status = Status.getStatus();
        Board p = TicTacToe.getP();
        Count.count += 1;
        System.out.println(count);
        if(count >= 9){
            status.setText("Draw");
        }
    }
    //set status, with reference to getText of obj and obj Symbol
}
