package tictactoe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlPanel extends JPanel {
    private static int player1Count = 0;
    private static int player2Count = 0;
    private static int startResetCount = 0;
    private JButton player1 = new JButton();
    private JButton player2 = new JButton();
    private JButton startReset = new JButton();

    public ControlPanel(){
        setPreferredSize(new Dimension(600,35));
        setLayout(new GridLayout(1,3));

        player1.setName("ButtonPlayer1");
        player1.setFocusPainted(false);
        player1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                player1Count++;
                choosePlayer(player1, player1Count);

            }
        });
        choosePlayer(player1, player1Count);
        add(player1); //count starts from 0 aka X

        startReset.setName("ButtonStartReset");
        startReset.setFocusPainted(false);
        startReset.setText("Start");
        startReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                startReset(startReset);
                startResetCount++;
                if(player1.getText().equals("Robot") && player2.getText().equals("Robot")){
                    Board p = TicTacToe.getP();
                    p.DISABLEALL();

                    EasyAI.AIvsAI();

                }
                else if(player1.getText().equals("Robot")){
                    EasyAI.opponentAI("X");
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
                player2Count++;
                choosePlayer(player2, player2Count);
            }
        });
        choosePlayer(player2, player2Count);
        add(player2); //count starts from 1 aka O


    }

    private void choosePlayer(JButton player, int playerCount){
        if(playerCount % 2 == 0){
            player.setText("Human");
            humanPlays(player.getName());
        }else{
            player.setText("Robot");
            computerPlays(player.getName());
        }
    }
    private void startReset(JButton startReset){
        JLabel status = Status.getStatus();
        Board p = TicTacToe.getP();
        if(startResetCount % 2 != 0) {
            //When reset
            Count.setCount(0);
            player1.setEnabled(true);
            player2.setEnabled(true);
            player1Count = 0;
            player2Count = 0;
            startReset.setText("Start");
            player1.setText("Human");
            player2.setText("Human");
            Button.setAiPlays(false, " ");
            p.RESET();
            status.setText("Game is not started");
        }else{
            //when start
            player1.setEnabled(false);
            player2.setEnabled(false);
            p.ENABLE();
            startReset.setText("Reset");
            status.setText("Game in progress");
        }
    }

    public void computerPlays(String playerName){
        //for 1 AI
        if(playerName.equals("ButtonPlayer1")){
            Button.setAiPlays(true, "X");
        }
        if(playerName.equals("ButtonPlayer2")){
            Button.setAiPlays(true, "O");
        }
    }
    public void humanPlays(String playerName){
        if(playerName.equals("ButtonPlayer1")){
            Button.setAiPlays(false, "O");
        }
        if(playerName.equals("ButtonPlayer2")){
            Button.setAiPlays(false, "X");
        }
    }

    public JButton getPlayer1() {
        return player1;
    }

    public JButton getPlayer2() {
        return player2;
    }

    public JButton getStartReset(){
        return startReset;
    }
}
