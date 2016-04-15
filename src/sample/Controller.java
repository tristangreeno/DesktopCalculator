package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller extends Calculations implements Initializable {
    private ObservableList<Calculations> calculations = FXCollections.observableArrayList();

    @FXML
    ListView<Calculations> displayOfCalculations;
    @FXML
    Button buttonOne;
    @FXML
    Button buttonTwo;
    @FXML
    Button buttonThree;
    @FXML
    Button buttonFour;
    @FXML
    Button buttonFive;
    @FXML
    Button buttonSix;
    @FXML
    Button buttonSeven;
    @FXML
    Button buttonEight;
    @FXML
    Button buttonNine;
    @FXML
    Button buttonZero;
    @FXML
    Button buttonClear;
    @FXML
    Button buttonPosNeg;
    @FXML
    TextArea textArea;



    public void onKeyPress(KeyEvent event){

        if(event.getCode() == KeyCode.DIGIT1){
            inputStringOfNumbers = inputStringOfNumbers.concat("1");
        }

        if(event.getCode() == KeyCode.DIGIT2){
            inputStringOfNumbers = inputStringOfNumbers.concat("2");
        }

        if(event.getCode() == KeyCode.DIGIT3){
            inputStringOfNumbers = inputStringOfNumbers.concat("3");
        }

        if(event.getCode() == KeyCode.DIGIT4){
            inputStringOfNumbers = inputStringOfNumbers.concat("4");
        }

        if(event.getCode() == KeyCode.DIGIT5){
            inputStringOfNumbers = inputStringOfNumbers.concat("5");
        }

        if(event.getCode() == KeyCode.DIGIT6){
            inputStringOfNumbers = inputStringOfNumbers.concat("6");
        }

        if(event.getCode() == KeyCode.DIGIT7){
            inputStringOfNumbers = inputStringOfNumbers.concat("7");
        }

        if(event.getCode() == KeyCode.DIGIT8){
            inputStringOfNumbers = inputStringOfNumbers.concat("8");
        }

        if(event.getCode() == KeyCode.DIGIT9){
            inputStringOfNumbers = inputStringOfNumbers.concat("9");
        }

        if(event.getCode() == KeyCode.DIGIT0){
            if(! inputStringOfNumbers.equals("")) {
                inputStringOfNumbers = inputStringOfNumbers.concat("0");
            }
        }

        if(event.getCode() == KeyCode.PERIOD){
            if(! inputStringOfNumbers.contains(".")) {
                inputStringOfNumbers = inputStringOfNumbers.concat(".");
            }
        }

        if(event.getCode() == KeyCode.BACK_SLASH){
            userInput = Double.parseDouble(inputStringOfNumbers);
            currentValue /= userInput;
            addToListOfCalculations(currentValue, userInput, "division");
            inputStringOfNumbers = "";
        }

        if(event.getCode() == KeyCode.PLUS){
            userInput = Double.parseDouble(inputStringOfNumbers);
            currentValue += userInput;
            addToListOfCalculations(currentValue, userInput, "addition");
            inputStringOfNumbers = "";
        }

        if(event.getCode() == KeyCode.MINUS){
            userInput = Double.parseDouble(inputStringOfNumbers);
            currentValue -= userInput;
            addToListOfCalculations(currentValue, userInput, "subtraction");
            inputStringOfNumbers = "";
        }

        if(event.getCode() == KeyCode.ASTERISK){
            userInput = Double.parseDouble(inputStringOfNumbers);
            currentValue *= userInput;
            addToListOfCalculations(currentValue, userInput, "multiplication");
            inputStringOfNumbers = "";
        }

        if(event.getCode() == KeyCode.CIRCUMFLEX){
            userInput = Double.parseDouble(inputStringOfNumbers);
            currentValue = Math.pow(currentValue, userInput);
            addToListOfCalculations(currentValue, userInput, "exponentiation");
            inputStringOfNumbers = "";
        }

        if(event.getCode() == KeyCode.L){
            userInput = Double.parseDouble(inputStringOfNumbers);
            currentValue = Math.log(currentValue) / Math.log(userInput);
            addToListOfCalculations(currentValue, userInput, "a logarithm");
            inputStringOfNumbers = "";
        }

        if(event.getCode() == KeyCode.DELETE){
            currentValue = 0.0;
            inputStringOfNumbers = "";
        }
    }

    private void addToListOfCalculations(Double currentValue, Double userInput, String typeOfCalculation){
        Calculations calculation = new Calculations(currentValue, userInput, typeOfCalculation);
        calculations.add(calculation);
        inputStringOfNumbers = "";
    }

    private void displayCalculations() {
        textArea.setText(inputStringOfNumbers);
    }

    public void buttonOnePressed() {
        inputStringOfNumbers = inputStringOfNumbers.concat("1");
        displayCalculations();

    }

    public void buttonTwoPressed() {
        inputStringOfNumbers = inputStringOfNumbers.concat("2");
        displayCalculations();
    }

    public void buttonThreePressed() {
        inputStringOfNumbers = inputStringOfNumbers.concat("3");
        displayCalculations();
    }

    public void buttonFourPressed() {
        inputStringOfNumbers = inputStringOfNumbers.concat("4");
        displayCalculations();
    }

    public void buttonFivePressed() {
        inputStringOfNumbers = inputStringOfNumbers.concat("5");
        displayCalculations();
    }

    public void buttonSixPressed() {
        inputStringOfNumbers = inputStringOfNumbers.concat("6");
        displayCalculations();
    }

    public void buttonSevenPressed() {
        inputStringOfNumbers = inputStringOfNumbers.concat("7");
        displayCalculations();
    }

    public void buttonEightPressed() {
        inputStringOfNumbers = inputStringOfNumbers.concat("8");
        displayCalculations();
    }

    public void buttonNinePressed() {
        inputStringOfNumbers = inputStringOfNumbers.concat("9");
        displayCalculations();
    }

    public void buttonZeroPressed() {
        if (! inputStringOfNumbers.equals("")) {
            inputStringOfNumbers = inputStringOfNumbers.concat("0");
            displayCalculations();
        }
    }

    public void buttonClearPressed() {
        currentValue = 0.0;
    }

    public void buttonPosNegPressed() {
        Double temp = Double.parseDouble(inputStringOfNumbers);
        temp = -temp;
        inputStringOfNumbers = String.valueOf(temp);
        displayCalculations();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        displayOfCalculations.setItems(calculations);
    }
}
