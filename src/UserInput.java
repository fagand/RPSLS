import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class UserInput {
    String v; //(value) = user input
    String[] stdGestures = {"Rock", "Paper", "Scissors", "Lizard", "Spock"}; //accepted values
    int count;

    // Method for getting the user input.
    public String askUser() {
        try {
            for (int i = 0; i <= 3; i++) {
                v = JOptionPane.showInputDialog("Please type your gesture, either;\nRock, Paper, Scissors, Lizard or Spock");
                count++;
                if (v == null) //cancel option is selected
                {
                    System.exit(0);
                }
                else if (count > 3) // if user is messing about
                {
                    JOptionPane.showMessageDialog(null,"User input incorrectly too many times, program will now exit!\n\nProgram only accepts the aforementioned gestures.","Input Error",JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                }
                validateInput();
            }
            return v;
        } catch (Exception e) {
            System.out.println("User input error" + e);
            return "rock"; //if there is an error display it in the console and give default response
        }
    }

    //Validates user input against the standard gestures (stdGestures). If ok returns the value, if not asks for input again.
    public String validateInput() {
        try {
            boolean validInput = Arrays.stream(stdGestures).anyMatch(v::equalsIgnoreCase); // checks user input (v) against the array of values (stdGestures).

            if (v.length() <= 0) {
                JOptionPane.showMessageDialog(null, "No input received\nPlease input a value");
                askUser();
            } else if (validInput) {
                return v;
            } else {
                JOptionPane.showMessageDialog(null, "You have entered an incorrect input\nPlease enter either, Rock, Paper, Scissors, Lizard or Spock");
                askUser();
            }
        } catch (Exception e) {
            System.out.println("User input validation error" + e);
            return "rock"; //if there is an error display it in the console and give default response
        }
        return v;
    }
}


