
import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {
        // Display confirm dialog
        int option = JOptionPane.showConfirmDialog(null,
                "Do you want to change to the first class ticket?");
        
        // Display message based on user's choice
        JOptionPane.showMessageDialog(null, 
                "You've chosen: " + (option == JOptionPane.YES_OPTION ? "Yes" : "No"));
        
        // Exit the program
        System.exit(0);   
    }
}
