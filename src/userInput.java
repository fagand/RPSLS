import javax.swing.*;
import java.util.Arrays;

public class userInput {

    public String getInput(){
        String v;
        Boolean b;
        String[] stdGestures = {"Rock", "Paper", "Scissors", "Lizard", "Spock"};

        v = JOptionPane.showInputDialog("Please input");
        boolean validInput = Arrays.stream(stdGestures).anyMatch(v::equalsIgnoreCase);

        try {
            if (v.length() <= 0)
            {
                JOptionPane.showMessageDialog(null,"Please input a value");
                getInput();
            }
            else if (validInput == true)
            {
                return v;
            }
            else
            {
                JOptionPane.showMessageDialog(null,"You have entered an incorrect input\nplease enter rock paper scissors lizard spock");
                getInput();
            }
        }
        catch (Exception e) {
            return "userInput error" + e.getLocalizedMessage();
        }
        return v;
    }
}


