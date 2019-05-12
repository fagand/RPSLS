import javax.swing.*;
import java.util.Objects;

public class compareGestures {
    // Method for displaying the message box bringing in user input (u), computer gesture (c), message (m) and result (r).
    public void messageBox(String u, String c, String m, int r) {
        //Draw
        if (r == 0) {
            JOptionPane.showMessageDialog(null,
                    "User Input: \t\t" + u + "\n" + "Counter Gesture: \t" + c +
                            "\nTherefore, result: \tDraw\n\nBecause: " + m);
            continuePlaying();
        } else if (r == 1) {
            JOptionPane.showMessageDialog(null,
                    "User Input: \t\t" + u + "\n" + "Counter Gesture: \t" + c +
                            "\nTherefore, result: \tUser Win\n\nBecause: " + m);
            continuePlaying();
        } else if (r == 2) {
            JOptionPane.showMessageDialog(null,
                    "User Input: \t\t" + u + "\n" + "Counter Gesture: \t" + c +
                            "\nTherefore, result: \tComputer Win\n\nBecause: " + m);
            continuePlaying();
        }
    }
    /* Method for comparing the user gesture against the randomized computer gesture
    Depending if the user or the computer wins, a result (r) is passed to the message box to display the winner
    along with a (message) detailing why the user beats the computer or vice versa.
     */
    public void compareGestures(String u, String c) {
        String userCompare = u;
        String compCompare = c;
        String message;

        // If result is a draw
        if (userCompare.equalsIgnoreCase(compCompare)) {
            message = userCompare + " is the same as " + compCompare;
            messageBox(userCompare, compCompare, message, 0);
        }

        // If user inputs "Scissors"
        if (userCompare.equalsIgnoreCase("scissors")) {
            if (compCompare.equalsIgnoreCase("paper")) {
                message = userCompare + " cuts " + compCompare;
                messageBox(userCompare, compCompare, message, 1);
            } else if (compCompare.equalsIgnoreCase("lizard")) {
                message = userCompare + " decapitates " + compCompare;
                messageBox(userCompare, compCompare, message, 1);
            } else if (compCompare.equalsIgnoreCase("spock")) {
                message = compCompare + " smashes " + userCompare;
                messageBox(userCompare, compCompare, message, 2);
            } else if (compCompare.equalsIgnoreCase("rock")) {
                message = compCompare + " smashes " + userCompare;
                messageBox(userCompare, compCompare, message, 2);
            }
        }
        // If user inputs "Paper"
        if (userCompare.equalsIgnoreCase("paper")) {
            if (compCompare.equalsIgnoreCase("rock")) {
                message = userCompare + " covers " + compCompare;
                messageBox(userCompare, compCompare, message, 1);
            } else if (compCompare.equalsIgnoreCase("spock")) {
                message = userCompare + " disproves " + compCompare;
                messageBox(userCompare, compCompare, message, 1);
            } else if (compCompare.equalsIgnoreCase("lizard")) {
                message = compCompare + " eats " + userCompare;
                messageBox(userCompare, compCompare, message, 2);
            } else if (compCompare.equalsIgnoreCase("scissors")) {
                message = compCompare + " cuts " + userCompare;
                messageBox(userCompare, compCompare, message, 2);
            }
        }
        // If user inputs "Rock"
        if (userCompare.equalsIgnoreCase("rock")) {
            if (compCompare.equalsIgnoreCase("lizard")) {
                message = userCompare + " crushes " + compCompare;
                messageBox(userCompare, compCompare, message, 1);
            } else if (compCompare.equalsIgnoreCase("scissors")) {
                message = userCompare + " crushes " + compCompare;
                messageBox(userCompare, compCompare, message, 1);
            } else if (compCompare.equalsIgnoreCase("paper")) {
                message = compCompare + " covers " + userCompare;
                messageBox(userCompare, compCompare, message, 2);
            } else if (compCompare.equalsIgnoreCase("spock")) {
                message = compCompare + " vaporizes " + userCompare;
                messageBox(userCompare, compCompare, message, 2);
            }
        }
        // If user inputs "Lizard"
        if (userCompare.equalsIgnoreCase("lizard")) {
            if (compCompare.equalsIgnoreCase("spock")) {
                message = userCompare + " poisons " + compCompare;
                messageBox(userCompare, compCompare, message, 1);
            } else if (compCompare.equalsIgnoreCase("paper")) {
                message = userCompare + " eats " + compCompare;
                messageBox(userCompare, compCompare, message, 1);
            } else if (compCompare.equalsIgnoreCase("rock")) {
                message = compCompare + " crushes " + userCompare;
                messageBox(userCompare, compCompare, message, 2);
            } else if (compCompare.equalsIgnoreCase("scissors")) {
                message = compCompare + " decapitates " + userCompare;
                messageBox(userCompare, compCompare, message, 2);
            }
        }
        // If user inputs "Spock"
        if (userCompare.equalsIgnoreCase("spock")) {
            if (compCompare.equalsIgnoreCase("scissors")) {
                message = userCompare + " smashes " + compCompare;
                messageBox(userCompare, compCompare, message, 1);
            } else if (compCompare.equalsIgnoreCase("rock")) {
                message = userCompare + " vaporizes " + compCompare;
                messageBox(userCompare, compCompare, message, 1);
            } else if (compCompare.equalsIgnoreCase("lizard")) {
                message = compCompare + " poisons " + userCompare;
                messageBox(userCompare, compCompare, message, 2);
            } else if (compCompare.equalsIgnoreCase("paper")) {
                message = compCompare + " disproves " + userCompare;
                messageBox(userCompare, compCompare, message, 2);
            }
        }
    }
    /* JOptionPane asking the user if the want to continue playing
    0 = they do therefore rerun the program
    no/cancel = end the program
     */
    public void continuePlaying() {
        int continueValue = JOptionPane.showConfirmDialog(null,
                "Play again?", "Do you want to play again?", JOptionPane.YES_NO_CANCEL_OPTION);
        // 0=yes, 1=no, 2=cancel
        if (continueValue == 0) {
            run goAgain = new run();
            goAgain.runProgram();
        } else {
            System.exit(0);
        }
    }
}
