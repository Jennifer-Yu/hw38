import cs1.Keyboard; // Keyboard

public class GuessNumber {
    
    //instance variables
    static int num = 0;
    static int guess = 0;
    static int times = 0;
    
    //reset the variables for a new game
    public static void resetnums() {
        num = 0;
        guess = 0;
        times = 0;
    }
    
    //get the number to guess
    public static int getNum() {
        num = (int)((Math.random()*99)+1);
        return num;
    }
    
    //input
    public static void toguess() {
        System.out.print("\033[0mGuess a number from 1-100: \033[1m");
        guess = Keyboard.readInt();
    }
    

    //main method
    public static void main(String[] args) {
        resetnums();
        getNum();
        while (guess != num) { //while not correct
            toguess();
            if (guess > num) { //if it's too high
                System.out.println("\033[0mToo high, try again...");
            }
            if (guess < num) { //if it's too low
                System.out.println("\033[0mToo low, try again...");
            }
            times += 1; //add to the times looped
        }
        if (guess == num) { //times looped or failed guesses
            System.out.println("\033[0mCorrect! It took " + times + " guesses.");            
        }
    }
}
