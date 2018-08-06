//Jacob Brommeland
//Java 2212
//5/12/2018
//BMI Calculator

import java.util.Scanner; //needed for user console inputs

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a scanner object
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("How much do you weigh (in pounds)? ");
		double weight = (double) input.nextDouble(); //get weight input
		

		System.out.println("How tall are you (in inches)? ");
		double height = (double) input.nextDouble(); //get height input	
		
		//calculate and output BMI
		double BMI = (weight / (height * height)) * 703;
		System.out.println("Your BMI is " + BMI);
		
		if(BMI >= 20 && BMI <=24) {
			System.out.println("Your BMI is between 20 and 24 and is considered ideal.");
		}
		else {
		System.out.println("A BMI between 20 and 24 is considered ideal. What would you like your BMI to be? ");
		
		double goal = (double) input.nextDouble();//get BMI goal input
				
			if (goal > BMI) {
				do {
					weight++; //adds 1 to weight until goal is reached
					BMI = (weight / (height * height)) * 703;
				} while (goal > 0 && goal >= BMI );
			}
			else if (goal < BMI) {
				do {
					weight--;//subtracts 1 from weight until goal is reached
					BMI = (weight / (height * height)) * 703;
				}while (goal > 0 && goal <= BMI );
			}
			
			//Fractions of pounds are too specific for users
			System.out.println("Your weight needs to be " + weight + " pounds for your BMI to be " + BMI);
			
			/*
			if (goal < 18.5) {
				System.out.println("Underweight");
				
			}
			else if (goal < 25) {
				System.out.println("Normal");
			}
			else if (goal < 30) {
				System.out.println("Overweight");
			}
			else if (goal < 35) {
				System.out.println("Obese");
			}
			else if (goal < 40) {
				System.out.println("Severely Obese");
			}
			else {
				System.out.println("Morbidly Obese");
			}
		*/
		}
	}
}