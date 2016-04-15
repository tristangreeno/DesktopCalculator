package sample;

/**
 * Holds the current value and the type of calculation the user wants to perform.
 */
public class Calculations {
    Double currentValue;
    String typeOfCalculation;
    String inputStringOfNumbers = "";
    Double userInput;

    public Calculations(double currentValue, String typeOfCalculation){
        this.currentValue = currentValue;
        this.typeOfCalculation = typeOfCalculation;
    }

    public Calculations(){
        this.currentValue = 0.0;
    }

    public Calculations(Double currentValue, Double userInput, String typeOfCalculation){
        this.currentValue = currentValue;
        this.userInput = userInput;
        this.typeOfCalculation = typeOfCalculation;
    }

    @Override
    public String toString() {
        StringBuilder listCalculation = new StringBuilder();
        listCalculation.append("Number changed to ").append(currentValue)
                .append(" through ").append(typeOfCalculation)
                .append(" with the given number ").append(userInput);
        return String.valueOf(listCalculation);
    }
}
