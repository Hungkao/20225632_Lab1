package btvn2;
import javax.swing.JOptionPane;

public class SimpleCalculate {
    public static void main(String[] args) {
        String strNum1 = JOptionPane.showInputDialog(null, 
            "Please input the first number:", "Input the first number", 
            JOptionPane.INFORMATION_MESSAGE);
      
        String strNum2 = JOptionPane.showInputDialog(null, 
            "Please input the second number:", "Input the second number",
            JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        String result = "Sum: " + sum + "\n" +
                        "Difference: " + difference + "\n" +
                        "Product: " + product + "\n";

        if (num2 != 0) {
            double quotient = num1 / num2;
            result += "Quotient: " + quotient;
        } else {
            result += "Quotient: Division by zero is not allowed!";
        }

        JOptionPane.showMessageDialog(null, result, 
            "Calculation Results", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
