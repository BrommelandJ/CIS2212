import java.util.Scanner;

public class CalculatorClass {
	
	static Scanner input = new Scanner(System.in);//needed for inputs
	
	private double currentValue;
	
	public static int displayMenu() {//strings of menu
		
		int menuObject;
		
		while (true) {
		System.out.println("\nMenu\n"
						 + "1. Add\n"
						 + "2. Subtract\n"
						 + "3. Multiply\n"
						 + "4. Divide\n"
						 + "5. Clear \n"
						 + "6. Quit\n"
						 + "What would you like to do?");
		
		
		menuObject = input.nextInt();
		
		if (menuObject < 1 || menuObject > 6){
			
			System.out.println("I'm sorry, " + menuObject + " wasn't one of the options.");
			continue;
		}
		else {
			return menuObject;
			 }
		}
	}
	
	public static double getOperand(String prompt){
		
		System.out.println(prompt);
		
        //Scanner input = new Scanner(System.in);  
       
        return (double) input.nextDouble(); //input
	}
		
	public double getCurrentValue() {//returns currentValue
		
		return currentValue;
	}
	
	public void add(double operand2) {//addition
		
		operand2 = getOperand("What is the second number? ");
		currentValue = currentValue + operand2;
	}
	
	public void subtract(double operand2) {//subtract
		
		operand2 = getOperand("What is the second number? ");
		currentValue = currentValue - operand2;
	}
	
	public void multiply(double operand2) {//multiplication
		
		operand2 = getOperand("What is the second number? ");
		currentValue = currentValue * operand2;
	}
	
	public void divide(double operand2) {//division
		
		operand2 = getOperand("What is the second number? ");
		if (operand2 == 0) {
            operand2 = Double.NaN;
        }
		currentValue = currentValue / operand2;
	}
		
	public void clear() {//resets currentValue field
		
		currentValue = 0;
	}
}