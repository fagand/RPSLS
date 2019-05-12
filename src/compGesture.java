import java.util.Random;

public class compGesture {
    public String compSelection (){
        String compGestureStr;
        int compNum;

        compNum = (int)((Math.random()*5)+1);

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
