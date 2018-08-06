//Jacob Brommeland
//Java 2212
//6/16/2018
//Memory Calculator

import java.io.IOException;
import java.util.Scanner; //needed for user inputs

public class MemCalcTextOutput {
			
	static Scanner input = new Scanner(System.in);//needed for inputs
	
	public static void main(String[] args) {
		
		CalculatorClass calculatorObject = new CalculatorClass(); //links class

        double operand2 = 0;
        
        CalculatorClass.logList.add("Initial value is " + calculatorObject.getCurrentValue());
        
        while(true) {
        	
        int menuObject = CalculatorClass.displayMenu();
		
        
        switch (menuObject) { //switch stuff acting off of menu input
        	case 1: 
        		calculatorObject.add(operand2);
        		System.out.println("\nThe current value is " + calculatorObject.getCurrentValue());
        	break;
        	case 2:
        		calculatorObject.subtract(operand2);
        		System.out.println("\nThe current value is " + calculatorObject.getCurrentValue());
        	break;
        	case 3:
        		calculatorObject.multiply(operand2);
        		System.out.println("\nThe current value is " + calculatorObject.getCurrentValue());
        	break;
        	case 4:
	        	calculatorObject.divide(operand2);
	        	System.out.println("\nThe current value is " + calculatorObject.getCurrentValue());
        	break;
        	case 5:
        		calculatorObject.clear();
        		System.out.println("\nThe current value is " + calculatorObject.getCurrentValue());
        	break;
        	case 6:
        		calculatorObject.save();
        		System.out.println("\nThe current value is " + calculatorObject.getCurrentValue());

        	break;
        	default:
        		System.out.println("Goodbye!");
                System.exit(0);
        	}
        }
	}
}