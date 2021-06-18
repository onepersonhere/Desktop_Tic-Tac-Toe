package tictactoe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlPanel extends JPanel {
    private static JButton player1 = new JButton();
    private static JButton player2 = new JButton();
    private static JButton startReset = new JButton();

    public ControlPanel(){
        setPreferredSize(new Dimension(600,35));
        setLayout(new GridLayout(1,3));

        player1.setName("ButtonPlayer1");
        player1.setFocusPainted(false);
        player1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                choosePlayer(player1);

            }
        });
        choosePlayer(player1);
        add(player1); //count starts from 0 aka X

        startReset.setName("ButtonStartReset");
        startReset.setFocusPainted(false);
        startReset.setText("Start");
        //startReset button function
        startReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                startReset(startReset);
                JLabel status = Status.getStatus();
                //AI v AI
                if(player1.getText().equals("Robot") && player2.getText().equals("Robot")){
                    Board p = TicTacToe.getP();
                    p.DISABLEALL();
                    EasyAI.AIvsAI();
                }
                //AI v Human
                else if(player1.getText().equals("Robot")){
                    status.setText("The turn of " + player1.getText() + " Player (X)");
                    EasyAI.opponentAI("X");
                    status.setText("The turn of " + player2.getText() + " Player (O)");
                    Count.addCount();
                }

            }
        });
        add(startReset);

        player2.setName("ButtonPlayer2");
        player2.setFocusPainted(false);
        player2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                choosePlayer(player2);
            }
        });
        choosePlayer(player2);
        add(player2); //count starts from 1 aka O
    }

    public static void choosePlayer(JButton player){
        if(player.getText().equals("Human")){
            player.setText("Robot");
            computerPlays(player.getName());
        }else{
            player.setText("Human");
            humanPlays(player.getName());
        }
    }
    //startReset button function
    private void startReset(JButton startReset){
        JLabel status = Status.getStatus();
        Board p = TicTacToe.getP();
        //To Reset
        if(startReset.getText().equals("Reset")) {
            //When reset
            Count.setCount(0);
            player1.setEnabled(true);
            player2.setEnabled(true);
            p.DISABLEALL();

            startReset.setText("Start");
            player1.setText("Human");
            player2.setText("Human");
            Button.setAiPlays(false, " ");
            p.RESET();
            //change status
            status.setText("Game is not started");
        }
        //To start
        else if(startReset.getText().equals("Start")){
            //when start
            player1.setEnabled(false);
            player2.setEnabled(false);
            p.ENABLE();
            startReset.setText("Reset");
            //change status
            if(Count.getCount() % 2 == 0) {
                status.setText("The turn of " + player1.getText() + " Player (X)");
            }else{
                status.setText("The turn of " + player2.getText() + " Player (O)");
            }
            Button.checkStatus();
        }
    }

    public static void computerPlays(String playerName){
        //for 1 AI
        if(playerName.equals("ButtonPlayer1")){
            Button.setAiPlays(true, "X");
        }
        if(playerName.equals("ButtonPlayer2")){
            Button.setAiPlays(true, "O");
        }
    }
    public static void humanPlays(String playerName){
        if(playerName.equals("ButtonPlayer1")){
            Button.setAiPlays(false, "O");
        }
        if(playerName.equals("ButtonPlayer2")){
            Button.setAiPlays(false, "X");
        }
    }

    public static JButton getPlayer1() {
        return player1;
    }

    public static JButton getPlayer2() {
        return player2;
    }

    public static JButton getStartReset(){
        return startReset;
    }
}
