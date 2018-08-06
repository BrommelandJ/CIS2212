import java.util.*;
import java.util.jar.Attributes.Name;

import javax.swing.*;

import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.awt.TextArea;
import java.awt.event.ActionEvent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorClass {
	
	static Scanner input = new Scanner(System.in);//needed for inputs
	
	private double currentValue;
	
	static String logFile = "logFile.txt";
	//Path logFile = Paths.get("logFile.txt");
	
	static ArrayList <String> logList = new ArrayList <String>();
	


	public static int displayMenu() {//strings of menu
		
		int menuObject;
		
		while (true) {
		System.out.println("\nMenu\n"
						 + "1. Add\n"
						 + "2. Subtract\n"
						 + "3. Multiply\n"
						 + "4. Divide\n"
						 + "5. Clear \n"
						 + "6. Save \n"
						 + "7. Quit\n"
						 + "What would you like to do?");
		
		//System.out.println(logList);
		
		menuObject = input.nextInt();
		
		if (menuObject < 1 || menuObject > 7){
			
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
		
		double oldValue = currentValue;
		
		operand2 = getOperand("What is the second number? ");	
		currentValue = currentValue + operand2;
		
		logList.add("\n" + oldValue + " + " + operand2 + " = " + currentValue);
		//System.out.println(logList);
	}
	
	public void subtract(double operand2) {//subtract
		double oldValue = currentValue;
		
		operand2 = getOperand("What is the second number? ");
		currentValue = currentValue - operand2;
		
		logList.add("\n" + oldValue + " - " + operand2 + " = " + currentValue);
	}
	
	public void multiply(double operand2) {//multiplication
		double oldValue = currentValue;
		
		operand2 = getOperand("What is the second number? ");
		currentValue = currentValue * operand2;
		
		logList.add("\n" + oldValue + " * " + operand2 + " = " + currentValue);
	}
	
	public void divide(double operand2) {//division
		double oldValue = currentValue;
		
		operand2 = getOperand("What is the second number? ");
		
		double secondValue = operand2; //prevents second number output from being NaN in the event user enters 0
		
		if (operand2 == 0) {
            operand2 = Double.NaN;
        }
		currentValue = currentValue / operand2;
		
		logList.add("\n" + oldValue + " / " + secondValue + " = " + currentValue);
	}
	public void save() {
		//logList.add(TextArea.getText());
		
		//SaveFile(logFile, logList);
		JFileChooser j = new JFileChooser();
		//j.setCurrentDirectory(new File("logFile.txt"));
		//j.showOpenDialog(null);
		j.showSaveDialog(null);
		File selection = j.getSelectedFile();
		
		FileOutputStream fout = null;
		ObjectOutputStream oos = null;
		
		try {
			fout = new FileOutputStream(selection);
			oos = new ObjectOutputStream(fout);
		
			oos.writeObject(logList);
			oos.close();
		}
		catch(FileNotFoundException ex) {
			System.out.println("\nFile not found");
		}
		catch (IOException ex) {
			System.out.println("\nFile failed to write");
		}
		
		
		/*
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(selection);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		*/
		System.out.println(selection);
		//Path writeSelection = Paths.get(selection);
		//Files.write(selection, logList);
	}
		
	public void clear() {//resets currentValue field
		logList.add("\nCleared");
		currentValue = 0;
	}
}





