import javax.swing.*;
import java.util.Arrays;

public class userInput {

    //Method for getting the user input. Only accepts one of the standard gestures (stdGestures).
    public String getInput() {
        String v; //user input
        String[] stdGestures = {"Rock", "Paper", "Scissors", "Lizard", "Spock"}; //accepted values


        try {
            v = JOptionPane.showInputDialog("Please type your gesture, either;\nRock, Paper, Scissors, Lizard or Spock");
            boolean validInput = Arrays.stream(stdGestures).anyMatch(v::equalsIgnoreCase); // checks user input (v) against the array of values (stdGestures).

            if (v.length() <= 0) {
                JOptionPane.showMessageDialog(null, "No input received\nPlease input a value");
                getInput();
            } else if (validInput == true) {
                return v;
            } else {
                JOptionPane.showMessageDialog(null, "You have entered an incorrect input\nPlease enter either, Rock, Paper, Scissors, Lizard or Spock");
                getInput();
            }
        } catch (Exception e) {
            return "userInput error" + e.getLocalizedMessage();
        }
        return v;
    }
}


