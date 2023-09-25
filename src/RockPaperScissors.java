import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RockPaperScissors extends JFrame implements ActionListener {
    JButton rock;
    JButton paper;
    JButton scissors;
    JLabel p1ChoiceLabel;
    JLabel p2ChoiceLabel;
    JLabel p1ChoicePic;
    JLabel p2ChoicePic;
    JLabel p1Score;
    JLabel p2Score;
    JLabel turn;
    int score1 = 0;
    int score2 = 0;
    boolean p1Turn = true;
    String p1Choice = "";
    String p2Choice = "";
    ImageIcon rockIconChoiceDisplay;
    ImageIcon paperIconChoiceDisplay;
    ImageIcon scissorsIconChoiceDisplay;


    RockPaperScissors() {
        this.setTitle("Rock Paper Scissors");
        this.setVisible(true);
        this.setBounds(420,80,500,500);
        this.setResizable(false);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.cyan);

        RockPaperScissorsPopUp popUp = new RockPaperScissorsPopUp();

        // images
        ImageIcon rockIconChoiceDisplay = new ImageIcon("/Users/tony/Desktop/Sager Edu/myGUI/src/rock.png");
        rockIconChoiceDisplay.setImage(rockIconChoiceDisplay.getImage().getScaledInstance(60,60,Image.SCALE_DEFAULT));
        ImageIcon paperIconChoiceDisplay = new ImageIcon("/Users/tony/Desktop/Sager Edu/myGUI/src/paper.png");
        paperIconChoiceDisplay.setImage(paperIconChoiceDisplay.getImage().getScaledInstance(60,60,Image.SCALE_DEFAULT));
        ImageIcon scissorsIconChoiceDisplay = new ImageIcon("/Users/tony/Desktop/Sager Edu/myGUI/src/scissors.png");
        scissorsIconChoiceDisplay.setImage(scissorsIconChoiceDisplay.getImage().getScaledInstance(60,60,Image.SCALE_DEFAULT));

        turn = new JLabel("P1's Turn");
        turn.setBounds(0,175,500,20);
        turn.setFont(new Font(Font.MONOSPACED,  Font.BOLD, 12));
        turn.setHorizontalAlignment(JLabel.CENTER);

        // p1 choice + p1 pic
        p1ChoiceLabel = new JLabel("P1's Choice: ");
        p1ChoiceLabel.setBounds(20, 225, 100, 60);
        p1ChoiceLabel.setFont(new Font(Font.MONOSPACED,  Font.BOLD, 12));
        p1ChoicePic = new JLabel(rockIconChoiceDisplay);
        p1ChoicePic.setBounds(150, 225, 60, 60);
        p1ChoicePic.setVisible(false);

        // p2 choice + p2 pic
        p2ChoiceLabel = new JLabel("P2's Choice: ");
        p2ChoiceLabel.setBounds(250, 225, 100, 60);
        p2ChoiceLabel.setFont(new Font(Font.MONOSPACED, Font.BOLD, 12));
        p2ChoicePic = new JLabel(paperIconChoiceDisplay);
        p2ChoicePic.setBounds(380, 225, 60, 60);
        p2ChoicePic.setVisible(false);

        p1Score = new JLabel("P1's score is: " + score1);
        p1Score.setBounds(20, 300, 150, 60);
        p1Score.setFont(new Font(Font.MONOSPACED, Font.BOLD, 12));

        p2Score = new JLabel("P2's score is: " + score1);
        p2Score.setBounds(20, 360, 150, 60);
        p2Score.setFont(new Font(Font.MONOSPACED, Font.BOLD, 12));



        rock = new JButton();
        rock.setBounds(25,20,120,120);
        ImageIcon rockIcon = new ImageIcon("/Users/tony/Desktop/Sager Edu/myGUI/src/rock.png");
        rockIcon.setImage(rockIcon.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT));
        rock.setIcon(rockIcon);
        rock.addActionListener(this);

        paper = new JButton();
        paper.setBounds(190, 20, 120, 120);
        ImageIcon paperIcon = new ImageIcon("/Users/tony/Desktop/Sager Edu/myGUI/src/paper.png");
        paperIcon.setImage(paperIcon.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT));
        paper.setIcon(paperIcon);
        paper.addActionListener(this);

        scissors = new JButton();
        scissors.setBounds(355, 20, 120, 120);
        ImageIcon scissorsIcon = new ImageIcon("/Users/tony/Desktop/Sager Edu/myGUI/src/scissors.png");
        scissorsIcon.setImage(scissorsIcon.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT));
        scissors.setIcon(scissorsIcon);
        scissors.addActionListener(this);

        this.add(rock);
        this.add(paper);
        this.add(scissors);
        this.add(turn);
        this.add(p1ChoiceLabel);
        this.add(p1ChoicePic);
        this.add(p2ChoiceLabel);
        this.add(p2ChoicePic);
        this.add(p1Score);
        this.add(p2Score);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        ImageIcon rockIconChoiceDisplay = new ImageIcon("/Users/tony/Desktop/Sager Edu/myGUI/src/rock.png");
        rockIconChoiceDisplay.setImage(rockIconChoiceDisplay.getImage().getScaledInstance(60,60,Image.SCALE_DEFAULT));
        ImageIcon paperIconChoiceDisplay = new ImageIcon("/Users/tony/Desktop/Sager Edu/myGUI/src/paper.png");
        paperIconChoiceDisplay.setImage(paperIconChoiceDisplay.getImage().getScaledInstance(60,60,Image.SCALE_DEFAULT));
        ImageIcon scissorsIconChoiceDisplay = new ImageIcon("/Users/tony/Desktop/Sager Edu/myGUI/src/scissors.png");
        scissorsIconChoiceDisplay.setImage(scissorsIconChoiceDisplay.getImage().getScaledInstance(60,60,Image.SCALE_DEFAULT));
        if (p1Turn) {
            if (e.getSource().equals(rock)) {
                p1ChoicePic.setVisible(false);
                p2ChoicePic.setVisible(false);
                p1Choice = "rock";
                p1Turn = false;
                turn.setText("P2's Turn");
                p1ChoicePic.setIcon(rockIconChoiceDisplay);
            } else if (e.getSource().equals(paper)) {
                p1ChoicePic.setVisible(false);
                p2ChoicePic.setVisible(false);
                p1Choice = "paper";
                p1Turn = false;
                turn.setText("P2's Turn");
                p1ChoicePic.setIcon(paperIconChoiceDisplay);
            } else if (e.getSource().equals(scissors)) {
                p1ChoicePic.setVisible(false);
                p2ChoicePic.setVisible(false);
                p1Choice = "scissors";
                p1Turn = false;
                turn.setText("P2's Turn");
                p1ChoicePic.setIcon(scissorsIconChoiceDisplay);
            }
        } else {
            if (e.getSource().equals(rock)) {
                p2Choice = "rock";
                p2ChoicePic.setIcon(rockIconChoiceDisplay);
                p1ChoicePic.setVisible(true);
                p2ChoicePic.setVisible(true);
                compare(p1Choice, p2Choice);
                p1Turn = true;
                turn.setText("P1's Turn");
                endGameIfWinning();
            } else if (e.getSource().equals(paper)) {
                p2Choice = "paper";
                p2ChoicePic.setIcon(paperIconChoiceDisplay);
                p1ChoicePic.setVisible(true);
                p2ChoicePic.setVisible(true);
                compare(p1Choice,p2Choice);
                p1Turn = true;
                turn.setText("P1's Turn");
                endGameIfWinning();
            } else if (e.getSource().equals(scissors)) {
                p2Choice = "scissors";
                p2ChoicePic.setIcon(scissorsIconChoiceDisplay);
                p1ChoicePic.setVisible(true);
                p2ChoicePic.setVisible(true);
                compare(p1Choice,p2Choice);
                p1Turn = true;
                turn.setText("P1's Turn");
                endGameIfWinning();
            }
        }
    }


    // todo
    // check if any player score
    // is 5 and s
    private void endGameIfWinning() {
        if (score1 == 5) {
            turn.setText("P1 Wins!!!");
            rock.setEnabled(false);
            paper.setEnabled(false);
            scissors.setEnabled(false);

        } else if (score2 == 5) {
            turn.setText("P2 Wins!!!");
            rock.setEnabled(false);
            paper.setEnabled(false);
            scissors.setEnabled(false);

        }
    }

    // todo
    // compare and add score
    private void compare(String p1Choice, String p2Choice) {
        if (p1Choice.equals("rock") && p2Choice.equals("paper")) {
            score2++;
            p1Score.setText("P1's score is: " + score1);
            p2Score.setText("P2's score is: " + score2);
        } else if (p1Choice.equals("rock") && p2Choice.equals("scissors")) {
            score1++;
            p1Score.setText("P1's score is: " + score1);
            p2Score.setText("P2's score is: " + score2);
        } else if (p1Choice.equals("paper") && p2Choice.equals("scissors")) {
            score2++;
            p1Score.setText("P1's score is: " + score1);
            p2Score.setText("P2's score is: " + score2);
        } else if (p1Choice.equals("paper") && p2Choice.equals("rock")) {
            score1++;
            p1Score.setText("P1's score is: " + score1);
            p2Score.setText("P2's score is: " + score2);
        } else if (p1Choice.equals("scissors") && p2Choice.equals("rock")) {
            score2++;
            p1Score.setText("P1's score is: " + score1);
            p2Score.setText("P2's score is: " + score2);
        } else if (p1Choice.equals("scissors") && p2Choice.equals("paper")) {
            score1++;
            p1Score.setText("P1's score is: " + score1);
            p2Score.setText("P2's score is: " + score2);
        } else {
            p1Score.setText("P1's score is: " + score1);
            p2Score.setText("P2's score is: " + score2);
        }
    }
}
