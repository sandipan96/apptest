import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Game extends JFrame{

    private JFrame frame;
    private JPanel panel;
    private JButton buttonCounter, buttonReset;
    private JLabel labelCount;
    //private JTextField textfield;

    private int clicks = 0;

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

        
        labelCount = new JLabel();
        labelCount.setPreferredSize(new Dimension(200,30));

        updateCounter();

        buttonCounter = new JButton("Click me");
        buttonCounter.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    clicks++;
                    updateCounter();
                }
            }
        );
        buttonReset = new JButton("Reset");
        buttonReset.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    clicks = 0;
                    updateCounter();
                }
            }  
        );
        /*textfield = new JTextField();
        textfield.setPreferredSize(new Dimension(200,15));*/

        panel.add(buttonCounter);
        panel.add(buttonReset);
        panel.add(labelCount);
        //panel.add(textfield);
        frame.add(panel);

    }

    private void updateCounter(){
        labelCount.setText("Clicked " + clicks + " times");
    }

    public static void main(String[] args) {
        new Game();
    }

    
}