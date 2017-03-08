import javax.swing.*;
import java.awt.*;


public class Game{

    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JLabel label;

    public Game (){
        gui();
    }

    public void gui (){
        frame = new JFrame("Test Window");
        frame.setVisible(true);
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setBackground(Color.lightGray);

        button = new JButton("Test");
        label = new JLabel("Test Label");

        panel.add(button);
        panel.add(label);
        frame.add(panel);

    }

    public static void main(String[] args) {
        new Game();
    }
}