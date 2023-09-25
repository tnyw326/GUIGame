import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeScreen extends JFrame implements ActionListener {
    JLabel message;
    JLabel rpsLabel;
    JLabel hmLabel;
    JLabel ngLabel;
    JButton rockPaperScissors;
    JButton numberGuessing;
    JButton hangman;
    JButton quit;

    HomeScreen() {
        message = new JLabel("Which game do you want to play?");
        message.setFont(new Font(Font.MONOSPACED, Font.BOLD, 15));
        message.setBounds(0, 50, 500, 50);
        message.setHorizontalAlignment(JLabel.CENTER);

        rockPaperScissors = new JButton("Rock Paper Scissors");
        rockPaperScissors.setBounds(150, 150, 200, 50);
        rockPaperScissors.setFont(new Font(Font.MONOSPACED, Font.BOLD, 10));
        rockPaperScissors.addActionListener(this);

        numberGuessing = new JButton("Number Guessing");
        numberGuessing.setBounds(150, 200, 200, 50);
        numberGuessing.setFont(new Font(Font.MONOSPACED, Font.BOLD, 10));
        numberGuessing.addActionListener(this);

        hangman = new JButton("Hangman");
        hangman.setBounds(150, 250, 200, 50);
        hangman.setFont(new Font(Font.MONOSPACED, Font.BOLD, 10));
        hangman.addActionListener(this);


        ImageIcon rps = new ImageIcon("/Users/tony/Desktop/Sager Edu/myGUI/src/icon1.png");
        rps.setImage(rps.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        ImageIcon ng = new ImageIcon("/Users/tony/Desktop/Sager Edu/myGUI/src/icon3.png");
        ng.setImage(ng.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        ImageIcon hm = new ImageIcon("/Users/tony/Desktop/Sager Edu/myGUI/src/icon2.png");
        hm.setImage(hm.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        rpsLabel = new JLabel(rps);
        rpsLabel.setBounds(400, 150, 50, 50);
        ngLabel = new JLabel(ng);
        ngLabel.setBounds(50, 200, 50, 50);
        hmLabel = new JLabel(hm);
        hmLabel.setBounds(400, 250, 50, 50);

        this.setTitle("My Games");
        this.setVisible(true);
        this.setBounds(400, 100, 500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.cyan);
        this.add(message);
        this.add(rockPaperScissors);
        this.add(numberGuessing);
        this.add(hangman);
        this.add(rpsLabel);
        this.add(ngLabel);
        this.add(hmLabel);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(rockPaperScissors)) {
            RockPaperScissors rps = new RockPaperScissors();
        } else if (e.getSource().equals(hangman)) {
            Hangman hm = new Hangman();
        } else {
            NumberGuessing ng = new NumberGuessing();
        }

    }

}