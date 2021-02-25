
/**
 * Write a description of class TooLargeTooSmall here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TooLargeTooSmall {
    private Integer chosenNum;

    /**
     * Constructor for objects of class TooLargeTooSmall
     */
    public TooLargeTooSmall(Integer seed) {
        // initialise instance variables
        chosenNum = seed;
    }
    
    public Integer guess(Integer g) {

        //First condition to check if the guessed number matches
        if (g==chosenNum)
        {
           return 0;
        }// else check if guessed number is greater
        else if (g > chosenNum){
            return 1;
        }//else we know that the guessed number is less
        else 
            return -1;
        }
        //return choseNum;
}