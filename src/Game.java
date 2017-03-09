import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Game extends JFrame{

    private JFrame frame;
    private JPanel panel;
    private JButton buttonCounter, buttonReset, buttonSubmit;
    private JLabel labelCount, labelMessage;
    private JTextField textfield;

    private int clicks = 0;

    public Game (){
        gui();
    }

    public void gui (){
        frame = new JFrame("Test Window");
        
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

        JLabel label = new JLabel("Enter your name: ");
        panel.add(label);

        textfield = new JTextField(12);
        //textfield.setPreferredSize(new Dimension(150,30));
        panel.add(textfield);

        buttonSubmit = new JButton("Submit");
        buttonSubmit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String name = textfield.getText();
                if(name.isEmpty()){
                    labelMessage.setText("Empty name, error!");
                }
                else{
                    labelMessage.setText("Hello There, " + name + ". How are you?");
                }
            }
        });
        panel.add(buttonSubmit);

        labelMessage = new JLabel("Please enter your name");
        panel.add(labelMessage);

        /*textfield = new JTextField();
        textfield.setPreferredSize(new Dimension(200,15));*/

        //panel.add(buttonCounter);
        //panel.add(buttonReset);
        //panel.add(labelCount);
        //panel.add(textfield);
        frame.add(panel);
        frame.setVisible(true);

    }

    private void updateCounter(){
        labelCount.setText("Clicked " + clicks + " times");
    }

    public static void main(String[] args) {
        new Game();
    }

    
}