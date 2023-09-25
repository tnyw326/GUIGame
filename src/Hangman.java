import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hangman extends JFrame implements ActionListener {

    Hangman() {
        
        this.setTitle("Hangman");
        this.setVisible(true);
        this.setBounds(420,80,500,500);
        this.setResizable(false);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.cyan);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
