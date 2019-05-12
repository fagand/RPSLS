public class run {
    userInput u = new userInput();
    compGesture c = new compGesture();
    compareGestures compare = new compareGestures();


    public void runProgram() {
        String userInput = u.getInput();
        String compGesture = c.compSelection();
        compare.compareGestures(userInput, compGesture);
    }
    public void testScissorsVPaper(){
        String userInput = u.getInput();
        String compGesture = "paper";
        compare.compareGestures(userInput,compGesture);
    }
}
