import javafx.scene.input.KeyCode;
import org.junit.Assert;
import org.junit.Test;


/**
 * Unit testing before implementing code.
 */
public class Testing {

    @Test
    public void testInputConcat() {
        String inputStringOfNumbers = "";
        KeyCode event;
        event = KeyCode.DIGIT1;

        if(event == KeyCode.DIGIT1){
            inputStringOfNumbers = inputStringOfNumbers.concat("1");
        }

        Assert.assertEquals("Not concatenated", "1", inputStringOfNumbers);
    }

    @Test
    public void testIfPeriodControlFlowWorks() {
        String inputStringOfNumbers = "1.2";

        if(! inputStringOfNumbers.contains(".")) inputStringOfNumbers = inputStringOfNumbers.concat(".");

        Assert.assertEquals("Extra period added", "1.2", inputStringOfNumbers);
    }

    @Test
    public void testUserInputInFunctions() {
        String userInputString = "01432";
        Double userInput = Double.parseDouble(userInputString);

        Double currentValue = 1432 / userInput;

        Assert.assertEquals("Not equal to expected", (Double) 1., currentValue);
    }

    @Test
    public void testIfFirstNumberCanBeZero() {
        String userInputString = "";
        KeyCode keyCode = KeyCode.DIGIT0;

        if(! userInputString.equals("")) {
            userInputString = userInputString.concat("0");
        }

        Assert.assertEquals("Starts with zero", "", userInputString);
    }
}
