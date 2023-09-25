import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RockPaperScissorsPopUp extends JFrame implements ActionListener {
    JButton button;
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel rock1;
    JLabel rock2;
    JLabel paper1;
    JLabel paper2;
    JLabel scissors1;
    JLabel scissors2;
    JLabel msg;

    RockPaperScissorsPopUp() {

        this.setBounds(470,170,400,400);
        this.setVisible(true);
        this.setTitle("welcome!");
        this.setLayout(null);
        this.setAlwaysOnTop(true);

        label1 = new JLabel("beats");
        label1.setBounds(175,25,60,60);
        label1.setFont(new Font(Font.MONOSPACED,  Font.BOLD, 12));
        label2 = new JLabel("beats");
        label2.setBounds(175, 100, 60, 60);
        label2.setFont(new Font(Font.MONOSPACED,  Font.BOLD, 12));
        label3 = new JLabel("beats");
        label3.setBounds(175, 175, 60,60);
        label3.setFont(new Font(Font.MONOSPACED,  Font.BOLD, 12));

        ImageIcon rockIcon = new ImageIcon("/Users/tony/Desktop/Sager Edu/myGUI/src/rock.png");
        rockIcon.setImage(rockIcon.getImage().getScaledInstance(60,60,Image.SCALE_DEFAULT));
        rock1 = new JLabel(rockIcon);
        rock2 = new JLabel(rockIcon);
        rock1.setBounds(75,25, 60,60);
        rock2.setBounds(255,100,60,60);

        ImageIcon paperIcon = new ImageIcon("/Users/tony/Desktop/Sager Edu/myGUI/src/paper.png");
        paperIcon.setImage(paperIcon.getImage().getScaledInstance(60,60, Image.SCALE_DEFAULT));
        paper1 = new JLabel(paperIcon);
        paper2 = new JLabel(paperIcon);
        paper1.setBounds(75,100, 60, 60);
        paper2.setBounds(255, 175, 60, 60);

        ImageIcon scissorsIcon = new ImageIcon("/Users/tony/Desktop/Sager Edu/myGUI/src/scissors.png");
        scissorsIcon.setImage(scissorsIcon.getImage().getScaledInstance(60,60,Image.SCALE_DEFAULT));
        scissors1 = new JLabel(scissorsIcon);
        scissors2 = new JLabel(scissorsIcon);
        scissors1.setBounds(255,25, 60,60);
        scissors2.setBounds(75, 175, 60, 60);

        msg = new JLabel("The player that gets 5 points first wins the game");
        msg.setFont(new Font(Font.MONOSPACED,  Font.BOLD, 12));
        msg.setHorizontalAlignment(JLabel.CENTER);
        msg.setBounds(0,250, 400,20);

        button = new JButton("OK!");
        button.setBounds(145,320,100,30);
        button.addActionListener(this);
        button.setFont(new Font(Font.MONOSPACED,  Font.BOLD, 12));


        this.add(label1);
        this.add(label2);
        this.add(label3);
        this.add(rock1);
        this.add(rock2);
        this.add(paper1);
        this.add(paper2);
        this.add(scissors1);
        this.add(scissors2);
        this.add(msg);
        this.add(button);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        this.dispose();
    }
}
