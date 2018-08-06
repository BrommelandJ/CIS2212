//Jacob Brommeland
//Java 2212
//5/28/2018
//Menu-Driven Calculator

//2 counter keep increasing every time they enter something invalid
//3 wrap whole thing in an endless loop

import java.util.Scanner; //nEEDED fOR uSER cONSOLE iNPUTS                                  
                                                                                           
public class methodCalc {                                                                  
                                                                                           
    public static int getMenuOption() {                                                    
                                                                                           
        Scanner input= new Scanner(System.in);                                              
        
        //strings of menu
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
    
    public static double getOperand(String prompt) {
    	   	
    	
    	System.out.println(prompt);
        // get input here
        Scanner input= new Scanner(System.in);   
        
        return (double) input.nextDouble();
      
  		
    }
     
    public static double add(double operand1, double operand2) {//addition
    	
    	operand1 = getOperand("What is the first number? ");
    	operand2 = getOperand("What is the second number? ");
    	
    	double result = operand1 + operand2;
    	return result;
    }
    
    public static double subtract(double operand1, double operand2) {//subtraction
    	operand1 = getOperand("What is the first number? ");
    	operand2 = getOperand("What is the second number? ");
    	
    	double result = operand1 - operand2;
    	return result;
    }
    public static double multiply(double operand1, double operand2) {//multiplication
    	operand1 = getOperand("What is the first number? ");
    	operand2 = getOperand("What is the second number? ");
    	
    	double result = operand1 * operand2;
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
    
    public static double random(double lowerLimit, double upperLimit) {//random
    	lowerLimit = getOperand("What is the lower limit? ");
    	upperLimit = getOperand("What is the upper limit? ");
    	
    	double result = (int) (Math.random()*lowerLimit) + upperLimit; //doesnt work
    	return result;
    }
    
       
    public static void main(String[] args) { //main method    
    	//get user input from main menu
    	int menuOption = getMenuOption();
    	
    	//declare variables
    	double operand1 = 0;
    	double operand2 = 0;
    	
    	double lowerLimit = 0;
    	double upperLimit = 0;
    	
    	double result;
    	
    	//case statement
    	switch (menuOption) {
			case 1: //aDDITION
				result = add(operand1, operand2);
				System.out.println("Answer " + result);
			break;
			case 2:
				result = subtract(operand1, operand2);
				System.out.println("Answer " + result);
			break;
			case 3:
				result = multiply(operand1, operand2);
				System.out.println("Answer " + result);
			break;
			case 4:
				result = divide(operand1, operand2);
				System.out.println("Answer " + result);
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




//OLD MENUCALC
/*	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// cREATE a sCANNER oBJECT
		Scanner input = new Scanner(System.in);
		
		int modOne = 0; //variable for invalid menu options until valid is selected
		int modTwo = 0; //counter for three invalid options in a row 
		boolean modThree = false; //boolean to reset menu
		
		
		
		while (modOne != 1) {	
			while (!modThree) {//resets menu after each case
		//dISPLAYS mENU
		System.out.println("Menu\n"
						 + "1. Add\n"
						 + "2. Subtract\n"
						 + "3. Multiply\n"
						 + "4. Divide\n"
						 + "5. Generate Random Number\n"
						 + "6. Quit\n"
						 + "What would you like to do?\n");
		
		// cREATES a sWITCH sTATEMENT
		int menuObject = (int) input.nextDouble(); // fOLLOWS tHE sTANDARD jAVA cODING cONVENTION fOR nAMING vARIABLES
		
		//declare variables
		double firstNum;
		double secondNum;
		double answer;
		int lowerLimit;
		int upperLimit;
		
		
			
		switch (menuObject) {
			case 1: //aDDITION
				System.out.println("What is the first number? ");//gETS fIRST nUMBER
				firstNum = (double) input.nextDouble();
				
				System.out.println("What is the second number? ");//gETS sECOND nUMBER
				secondNum = (double) input.nextDouble();
				answer = firstNum + secondNum;
				
				System.out.print("Answer: " + answer + "\n\n");//oUTPUTS aNSWER
				modOne++;
				modTwo = 0;
				break;
				
			case 2: //sUBTRACTION
				System.out.println("What is the first number? ");//gETS fIRST nUMBER
				firstNum = (double) input.nextDouble();
				
				System.out.println("What is the second number? ");//gETS sECOND nUMBER
				secondNum = (double) input.nextDouble();
				answer = firstNum - secondNum;
				
				System.out.print("Answer: " + answer + "\n\n");//oUTPUTS aNSWER
				modOne++;
				modTwo = 0;
				break;
			case 3: //mULTIPLICATION
				System.out.println("What is the first number? ");//gETS fIRST nUMBER
				firstNum = (double) input.nextDouble();
				
				System.out.println("What is the second number? ");//gETS sECOND nUMBER
				secondNum = (double) input.nextDouble();
				answer = firstNum * secondNum;
				
				System.out.print("Answer: " + answer + "\n\n");//oUTPUTS aNSWER
				modOne++;
				modTwo = 0;
				break;
			case 4:
				System.out.println("What is the first number? ");//gETS fIRST nUMBER
				firstNum = (double) input.nextDouble();
				
				System.out.println("What is the second number? ");//gETS sECOND nUMBER
				secondNum = (double) input.nextDouble();
				if (secondNum == 0){
					System.out.println("I'm sorry, you can't divide by zero.");
				}
				else {
				answer = firstNum / secondNum;
				System.out.print("Answer: " + answer + "\n\n");//oUTPUTS aNSWER
				}
				modOne++;
				modTwo = 0;
				break;
			case 5:
				System.out.println("What is the lower limit? ");
				lowerLimit = (int) input.nextDouble();//get user input for lowerLimit
				
				System.out.println("What is the upper limit? ");
				upperLimit = (int) input.nextDouble();//get user input for upperLimit
				
				answer = (int) (Math.random()*lowerLimit) + upperLimit;
				System.out.print("Answer: " + answer + "\n\n");//oUTPUTS aNSWER
				modOne++;
				modTwo = 0;
				break;
			case 6:
				System.out.println("Goodbye!");
				System.exit(0);
				modThree = true;
				break;
			default: 
				System.out.println("I'm sorry, " + menuObject + " wasn't one of the options.");
				modTwo++;
				if (modTwo == 3) {
					System.out.println("Please try again later.");
					System.exit(0);
				}
				break;
		}
		}
		}
	}
}
	*/