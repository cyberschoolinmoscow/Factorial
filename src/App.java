import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App extends JFrame implements ItemListener {
    private final JPanel myContainer;
    JFrame actualWindow;
    JLabel inputLable, outputLable, outputTextField;
    JTextField inputTextField;
    JRadioButton btn;
//    JButton btn;

    App() {
        Font myFont = new Font("Verdana", Font.BOLD, 60);
        actualWindow = new JFrame("Calc");
        myContainer = new JPanel();
        inputLable = new JLabel("Enter any integer value: ");
        inputTextField = new JTextField("1", 3);

        btn = new JRadioButton("Compute");
        outputLable = new JLabel("Factorial of given integer number is ");
        outputTextField = new JLabel("1");
        btn.addItemListener(this);

        inputLable.setFont(myFont);
        inputTextField.setFont(myFont);
        outputLable.setFont(myFont);
        inputTextField.setForeground(Color.DARK_GRAY);
        outputLable.setForeground(Color.BLUE);
        outputTextField.setFont(myFont);
        btn.setFont(myFont);
        myContainer.add(inputLable);
        myContainer.add(inputTextField);

        myContainer.add(btn);
        myContainer.add(outputLable);
        myContainer.add(outputTextField);
        myContainer.setBackground(Color.MAGENTA);
        
        actualWindow.add(myContainer);
        actualWindow.setSize(900, 600);
        actualWindow.setVisible(true);
    }

    int fact(int f) {
        if (f == 0)
            return 1;
        else
            return f * fact(f - 1);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        int fact = fact(Integer.parseInt(inputTextField.getText()));
        outputTextField.setText(String.valueOf(fact));
    }
}

class Calc {

    public static void main(String[] args) {
        new App();
    }
}