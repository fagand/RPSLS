/**
 * @Author David Fagan
 * Last modified 12/05/19
 */
public class Run {
    // Initialize the classes.
    UserInput u = new UserInput();
    ComputerGenerator c = new ComputerGenerator();
    CompareGestures compare = new CompareGestures();


    public void runProgram() {
        String userInput = u.askUser();
        String compGesture = c.compSelection();
        compare.compareGestures(userInput, compGesture);
    }
    public void testScissorsVPaper(){
        String userInput = u.validateInput();
        String compGesture = "paper";
        compare.compareGestures(userInput,compGesture);
    }
    public void testDraw(){
        String u = "rock";
        String c = "rock";
        compare.compareGestures(u,c);
    }
}
