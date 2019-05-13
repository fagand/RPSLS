import javax.swing.*;
import java.util.Arrays;

public class UserInput {
    String v; //user input
    String[] stdGestures = {"Rock", "Paper", "Scissors", "Lizard", "Spock"}; //accepted values

    public String askUser(){
        v = JOptionPane.showInputDialog("Please type your gesture, either;\nRock, Paper, Scissors, Lizard or Spock");
        validateInput();
        return v;
    }

    //Method for getting the user input. Only accepts one of the standard gestures (stdGestures).
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
            return "UserInput error" + e.getLocalizedMessage();
        }
        return v;
    }
}


