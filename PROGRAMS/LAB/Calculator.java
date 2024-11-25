import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {
    private JFrame frame;
    private JTextField textField;
    private String operator;
    private double firstOperand, secondOperand, result;

    public Calculator() {
        frame = new JFrame("Calculator");
        textField = new JTextField();

        
        frame.setLayout(new BorderLayout());

        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        
        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

       
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(this);
            panel.add(button);
        }

        
        frame.add(textField, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);

        
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

       
        if ((command.charAt(0) >= '0' && command.charAt(0) <= '9') || command.equals(".")) {
            textField.setText(textField.getText() + command);
        }
       
        else if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/")) {
            operator = command;
            firstOperand = Double.parseDouble(textField.getText());
            textField.setText("");
        }
       
        else if (command.equals("=")) {
            secondOperand = Double.parseDouble(textField.getText());
            switch (operator) {
                case "+":
                    result = firstOperand + secondOperand;
                    break;
                case "-":
                    result = firstOperand - secondOperand;
                    break;
                case "*":
                    result = firstOperand * secondOperand;
                    break;
                case "/":
                    if (secondOperand != 0) {
                        result = firstOperand / secondOperand;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Cannot divide by zero!");
                        result = 0;
                    }
                    break;
            }
            textField.setText(String.valueOf(result));
        }
    }

    public static void main(String[] args) {
        
        new Calculator();
    }
}
