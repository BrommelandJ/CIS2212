//Jacob Brommeland
//Java 2212
//6/28/2018
//Arabic to Roman Numerals

import java.util.Scanner;

public class ArabicToRoman {

   public static String arabicToRoman(int arabic) {
	   
	   //Arrays
       String [] romanArray = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"} ;
       int [] arabicArray = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
       
       //Empty string which will be concatenated with correct Roman Numerals, then returned to arguments.
       String result = "";
       
       int x = 0;
       
       for (int i = arabicArray.length - 1; i >= 0; i--){ //steps through array
    	   
           if(arabic >= arabicArray[i]){
        	   
        	   x = arabic / arabicArray[i];
               
	               while(x != 0){
	                   result = result + romanArray[i];
	                   x--;
	               	   }
	               
               arabic = arabic % arabicArray[i];
           }
       }

       return result;
}

public static void main(String[] args){

   Scanner input = new Scanner(System.in); //scanner
   
   while(true){
	   
	   System.out.print("\n\nEnter an integer (-1 to quit): ");//Entry message and gets input
	   int arabic = input.nextInt();
	   System.out.print(arabicToRoman(arabic));
	   
	   if (arabic == -1){//Terminates program
		   	System.out.print("Goodbye!");
	   		System.exit(0);
	   		}
	   else if(arabic < 1 || arabic > 3999){//Special boundaries
    	   System.out.print("The Romans did not have a way to represent negative numbers or zero.");
       		}
   		}
   }
}

/*
Test Plan:

 Normal Case inputs and their expected outputs as follows:
 	1 outputs I
 	5 outputs V
 	4 outputs IV
 	9 outputs IX
 	29 outputs XXIX
 	150 outputs CL
 	3999 outputs MMMCMXCIX
 	
 	Allows user inputs until closed by user.
 	
 	I chose these test numbers because they represent simple inputs that the average user might enter.
 	They also represent variances of single, double, and triple digits. 
 	They should also give proper outputs for the instances of 9, so as not to never output four of the same.
 	
 	All test inputs output as expected.
 	
 Invalid Case inputs and their expected outputs as follows:
 	Negatives numbers
 	
 	-2 outputs message stating the Romans lack of negative numbers
 	0 outputs message stating the Romans lack of negative numbers
 	4000 outputs same error message as above.
 	
 	These are important because everything below 1 and after 3999 should output the same error/explanation message.
 	
 	All test inputs output as expected.
 
 Boundary Case inputs and their expected outputs as follows:
	-1 outputs Goodbye message and terminates program.
	
	-1 is a special boundary as it is specified to terminate the program when entered, as stated by the input message.
	
	All test inputs output as expected.
*/








