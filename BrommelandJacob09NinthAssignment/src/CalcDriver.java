
public class CalcDriver {

	public static void main(String[] args) {
		
		MemoryCalc calc = new MemoryCalc();
		
		

		while (true) {
			
			System.out.println("The current value is " + calc.getCurrentValue());

			int choice = calc.displayMenu();

			double second = 0;
			if (choice < 6) {
				second = calc.getOperand("What is the second number? ");
			}

			if (choice == 1) {
				calc.add(second);
			} else if (choice == 2) {
				calc.subtract(second);
			} else if (choice == 3) {
				calc.multiply(second);
			} else if (choice == 4) {
				calc.divide(second);
			} else if (choice == 5) {
				//calc.power(second);
			} else if (choice == 6) {
				//calc.log(second);
			} else if (choice == 7) {
				calc.clear();
			}
		}
	}
}
