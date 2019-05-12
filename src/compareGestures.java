import javax.swing.*;
import java.util.Objects;

public class compareGestures {
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

    public void compareGestures(String u, String c) {
        String userCompare = u;
        String compCompare = c;
        String message;

        // Draw
        if (userCompare.equalsIgnoreCase(compCompare)) {
            message = userCompare + " is the same as " + compCompare;
            messageBox(userCompare, compCompare, message, 0);
        }

        // User Scissors
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
            // User Paper
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
            // User Rock
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
            // User Lizard
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
                } else if (compCompare.equalsIgnoreCase("spock")) {
                    message = compCompare + " smashes " + userCompare;
                    messageBox(userCompare, compCompare, message, 2);
                }
            }
            // User Spock
            if (userCompare.equalsIgnoreCase("spock")) {
                if (compCompare.equalsIgnoreCase("scissors")) {
                    message = userCompare + " smashes " + compCompare;
                    messageBox(userCompare, compCompare, message, 1);
                } else if (compCompare.equalsIgnoreCase("rock")) {
                    message = userCompare + " vaporizes " + compCompare;
                    messageBox(userCompare, compCompare, message, 1);
                } else {
                    message = compCompare + " beats " + userCompare;
                    messageBox(userCompare, compCompare, message, 2);
                }
            }
        }
    }

    public void continuePlaying() {
        int continueValue = JOptionPane.showConfirmDialog(null,
                "Play again?", "Title", JOptionPane.YES_NO_CANCEL_OPTION);
        // 0=yes, 1=no, 2=cancel
        if (continueValue == 0) {
            run goAgain = new run();
            goAgain.runProgram();
        } else {
            System.exit(0);
        }
    }
}
