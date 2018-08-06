//Jacob Brommeland
//Java 2212
//6/9/2018
//Array Calculator
 
import java.util.Scanner; //needed for user inputs                                
                                                                                           
public class ArrayCalc {                                                                  
                                                                                           
    public static int getMenuOption() {//strings of menu                                           
                                                                                           
        Scanner input= new Scanner(System.in);                                              
       
        
        System.out.println("Menu\n"                                                    
                               + "1. Add\n"                                                
                               + "2. Subtract\n"                                            
                               + "3. Multiply\n"                                            
                               + "4. Divide\n"                                              
                               + "5. Generate Random Number\n"                              
                               + "6. Quit\n"                                                
                               + "What would you like to do?\n");                          
           
       int menuObject = (int) input.nextDouble();
 
       return menuObject;
 
    }
   
    public static double getOperand(String prompt) {//passes prompt
          
        System.out.println(prompt);
        // get input here
        Scanner input = new Scanner(System.in);  
       
        return (double) input.nextDouble();     
    }
   
    public static double[] getOperand(String prompt, int size) {//get input for array size
        
        Scanner input = new Scanner(System.in);
        double[] arrayName = new double[size];
	
		System.out.println(prompt);
		for(int i = 0; i < size; i++) {
		    arrayName[i] = input.nextDouble();
		}
	        return arrayName;
    }
     
    public static double[] add(double[] operand1, double[] operand2) {//addition

        operand1 = getOperand("What is the first array? ", operand1.length);
        operand2 = getOperand("What is the second array? ", operand2.length);
       
        double[] result = new double[operand1.length];

        for(int i = 0; i < operand2.length; i++) {
            result[i] = operand1[i] + operand2[i];

        }
        return result;
    }
   
    public static double subtract(double operand1, double operand2) {//subtraction
        operand1 = getOperand("What is the first number? ");
        operand2 = getOperand("What is the second number? ");
       
        double result = operand1 - operand2;
        return result;
    }

    public static double[] subtract(double[] operand1, double[] operand2) {//subtraction
        operand1 = getOperand("What is the first number? ", operand1.length);
        operand2 = getOperand("What is the second number? ", operand2.length);
       
	double[] result = new double[operand1.length];
	for(int i = 0; i < operand1.length; i++) {//steps through array
	    result[i] = operand1[i] - operand2[i];
	}
        return result;
    }

    public static double multiply(double operand1, double operand2) {//multiplication
        operand1 = getOperand("What is the first number? ");
        operand2 = getOperand("What is the second number? ");
       
        double result = operand1 * operand2;
        return result;
    }
    public static double[] multiply(double[] operand1, double[] operand2) {//multiplication
        operand1 = getOperand("What is the first number? ", operand1.length);
        operand2 = getOperand("What is the second number? ", operand2.length);

	double[] result = new double[operand1.length];	           
	for(int i = 0; i < operand1.length; i++) {
	    result[i] = operand1[i] * operand2[i];
	}
        return result;
    }
    public static double divide(double operand1, double operand2) {//division
        operand1 = getOperand("What is the first number? ");
        operand2 = getOperand("What is the second number? ");
       
        double result = operand1 / operand2;
        if (operand2 == 0) {
            result = Double.NaN;
        }
        return result;
    }
    public static double[] divide(double[] operand1, double[] operand2) {//division
        operand1 = getOperand("What is the first number? ",operand1.length);
        operand2 = getOperand("What is the second number? ", operand2.length);
       
	
        double[] result = new double[operand1.length];

	for(int i = 0; i < operand1.length; i++) {
	    result[i] = operand1[i] / operand2[i]; 
	}
        return result;
    }
   
    public static double[] random(double lowerLimit, double upperLimit) {//random
        lowerLimit = getOperand("What is the lower limit? ");
        upperLimit = getOperand("What is the upper limit? ");
       
        double[] result = null;//= (double[]) ((double[]) (Math.random()*lowerLimit[]) + upperLimit[]); //doesnt work
        return result;
    }
   
    public static void main(String[] args) { //main method    
        //get user input from main menu
        int menuOption = getMenuOption();
       
        //declare variables
        double[] operand1 = {1,2,3,4,5,6};
        double[] operand2 = {1,2,3,4,5,6};
        
        double lowerLimit = 0;
        double upperLimit = 0;
        
        double[] result;
       
        //case statement
        switch (menuOption) {
            case 1: //aDDITION
                result = add(operand1, operand2);
                System.out.println("Answer ");
			for(int i = 0; i < result.length; i++) {//gets length of result for calculation
			    System.out.println(result[i]);
			}
            break;
            case 2:
                result = subtract(operand1, operand2);
                System.out.println("Answer ");
			for(int i = 0; i < result.length; i++) {
			    System.out.println(result[i]);
			}

            break;
            case 3:
                result = multiply(operand1, operand2);
                System.out.println("Answer " );
                for(int i = 0; i < result.length; i++) {
				System.out.println(result[i]);
                }	

            break;
            case 4:
                result = divide(operand1, operand2);
                System.out.println("Answer " );
			for(int i = 0; i < result.length; i++) {
			    System.out.println(result[i]);
			}

            break;
            case 5:
                result = random(lowerLimit, upperLimit);
                System.out.println("Answer " + result);
            break;
            case 6:
                System.out.println("Goodbye!");
                System.exit(0);
            break;
            default:
                System.out.println("I'm sorry, " + menuOption + " wasn't one of the options.");
            break;
        }
       
    }
}