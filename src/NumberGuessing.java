import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class NumberGuessing extends JFrame implements ActionListener {
    JTextField textField;
    JLabel messageLabel;
    JLabel chancesLabel;
    int chancesLeft = 7;
    int userGuess = 0;
    JLabel hintLabel;
    Font tooBig = new Font(Font.MONOSPACED, Font.BOLD, 20);
    Font tooSmall = new Font(Font.MONOSPACED, Font.BOLD, 8);
    Font normal = new Font(Font.MONOSPACED, Font.BOLD, 12);
    int answer;
    Random randInt = new Random();
    boolean correct = false;


    NumberGuessing() {
        this.setTitle("Number Guessing");
        this.setVisible(true);
        this.setBounds(420, 330, 500, 250);
        this.setResizable(false);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.cyan);
        answer = randInt.nextInt(101);

        textField = new JTextField();
        textField.setBounds(250, 70, 200, 50);
        textField.setBackground(Color.GRAY);
        textField.setFont(normal);
        textField.setForeground(Color.cyan);
        textField.addActionListener(this);

        messageLabel = new JLabel("Guess a number between 1 to 100: ");
        messageLabel.setBounds(20, 70, 500, 50);
        messageLabel.setFont(normal);

        hintLabel = new JLabel();
        hintLabel.setBounds(0, 140, 500, 50);
        hintLabel.setHorizontalAlignment(JLabel.CENTER);

        chancesLabel = new JLabel("You have " + chancesLeft + " more chance/s");
        chancesLabel.setBounds(0, 30, 500, 50);
        chancesLabel.setHorizontalAlignment(JLabel.CENTER);
        chancesLabel.setFont(normal);


        this.add(textField);
        this.add(messageLabel);
        this.add(hintLabel);
        this.add(chancesLabel);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = textField.getText();
        if (numOnly(input)) {
            provideHint(input);
            checkGameOver();
            chancesLabel.setText("You have " + (chancesLeft--) + " more chance/s");
        } else {
            hintLabel.setFont(normal);
            hintLabel.setText("NUMBERS ONLY");
        }
    }

    private void checkGameOver() {
        if (!correct && chancesLeft == 0) {
            hintLabel.setFont(normal);
            hintLabel.setText("YOU LOSE!!!");
            textField.setText("GAME OVER!");
            textField.setHorizontalAlignment(JTextField.CENTER);
            textField.setEnabled(false);
        }
    }

    private void provideHint(String input) {
        if (Integer.parseInt(input) > answer) {
            hintLabel.setText("TOO BIG!!!");
            hintLabel.setFont(tooBig);
        } else if (Integer.parseInt(input) < answer) {
            hintLabel.setText("TOO SMALL!!!");
            hintLabel.setFont(tooSmall);
        } else {
            hintLabel.setText("YOU ARE CORRECT, THE ANSWER IS: " + answer);
            correct = true;
        }
    }

    private boolean numOnly(String input) {
        boolean allNum = true;
        for (int i = 0; i < input.length(); i++) {
            char l = input.charAt(i);
            if (!(l == '0' || l == '1' || l == '2' || l == '3' || l == '4' || l == '5' || l == '6' || l == '7' ||
                    l == '8' || l == '9')) {
                allNum = false;
            }
        }
        return allNum;
    }
}
