import java.util.Random;

public class compGesture {
    public String compSelection (){
        String compGestureStr;
        int compNum;

        compNum = (int)((Math.random()*5)+1); // Generates a random number between 1 and 5.
        // Depending on the random number (compNum) selects a computer based on that.
        switch (compNum) {
            case 1: compGestureStr = "Rock";
            break;
            case 2: compGestureStr = "Paper";
            break;
            case 3: compGestureStr = "Scissors";
            break;
            case 4: compGestureStr = "Lizard";
            break;
            case 5: compGestureStr = "Spock";
            break;
            default: compGestureStr = "Invalid selection";
        }
        return compGestureStr;
    }
}
