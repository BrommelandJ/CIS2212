import java.util.Scanner;


public class MemoryCalc {

	private double currentValue;
	
	
	public double getCurrentValue() {
		return currentValue;
	}
	
	
	public void setCurrentValue(double currentValue) {
		this.currentValue = currentValue;
	}

	
	public int displayMenu() {
		Scanner input = new Scanner(System.in);

		int choice = -1;

		while (choice < 1 || choice > 6) {
			System.out.println();
			System.out.println("Menu");
			System.out.println("1. Add");
			System.out.println("2. Subtract");
			System.out.println("3. Multiply");
			System.out.println("4. Divide");
			System.out.println("5. Power");
			System.out.println("6. Logarithm");
			System.out.println("7. Clear");
			System.out.println("8. Quit");
			System.out.println();
			System.out.print("What would you like to do? ");

			choice = input.nextInt();

			if (choice < 1 || choice > 8) {
				System.out.println(choice + " wasn't one of the options");
			}

			if (choice == 8) {
				System.out.println("Goodbye!");
				System.exit(0);
			}
		}

		return choice;
	}


	public double getOperand(String prompt) {
		Scanner input = new Scanner(System.in);
		System.out.print(prompt);
		return input.nextDouble();
	}


	public void add(double op2) {
		currentValue += op2;
	}


	public void subtract(double op2) {
		currentValue -= op2;
	}


	public void multiply(double op2) {
		currentValue *= op2;
	}


	public void divide(double op2) {
		if (op2 == 0) {
			currentValue = Double.NaN;
		} else {
			currentValue /= op2;
		}
	}
	
	class ScientificMemClass extends MemoryCalc{

		public void power(double op2) {
			currentValue = java.lang.Math.pow(currentValue, op2);
		}
		public void log(double op2) {
			currentValue = java.lang.Math.log(currentValue);
		}
	}
	
	public void clear() {
		currentValue = 0;
	}
}
