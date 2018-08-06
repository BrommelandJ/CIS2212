//Jacob Brommeland
//Java 2212
//7/29/2018
//GUI Calculator

import javafx.application.Application;

import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.awt.*;
import java.awt.event.*;
import javafx.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;


public class GUIMemCalc extends Application {
	
	//CalculatorClass calculatorObject = new CalculatorClass();
	
	private double currentValue = 0.0;
	
	private double operand2 = 0.0;
	
	String strTxt = "";
	
	boolean addClicked;
	boolean subClicked;
	boolean mulClicked;
	boolean divClicked;
	
	boolean equalsClicked;
	
	public GUIMemCalc() {
		// TODO Auto-generated constructor stub
		//Action Listeners.

	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
		
	}
	
	

	@Override
	public void start(Stage primaryStage) throws Exception{
		
		VBox root = new VBox();
		Scene scene = new Scene(root, 300, 450, javafx.scene.paint.Color.WHITE);
		
		GridPane textPane = new GridPane();
		GridPane gridPane = new GridPane();
		GridPane equalsPane = new GridPane();
		
		textPane.setAlignment(Pos.TOP_CENTER);
		gridPane.setAlignment(Pos.CENTER);
		equalsPane.setAlignment(Pos.BOTTOM_CENTER);
		
		TextField tfInput = new TextField(String.valueOf(currentValue));
		
		//TextField tfInput = new TextField(strTxt);
		
		//TextField tfInput = new TextField(String.valueOf(calculatorObject.getCurrentValue()));
		//String test = "test";
		//TextField tfInput = new TextField(test);
		
		
		//GridPane.setConstraints(tfInput, 0, 0);
		
		tfInput.setStyle("-fx-font-weight: bold; -fx-font: 20pt Tahoma");
		
		Button btnDivide = new Button("/");
		Button btnMultiply = new Button("*");
		Button btnAddition = new Button("+");
		Button btnSubtraction = new Button("-");
		Button btnEquals = new Button("=");
		
		Button btnClear = new Button("C");
		Button btnDec = new Button(".");
		
		Button btnZero = new Button("0");
		Button btnOne = new Button("1");
		Button btnTwo = new Button("2");
		Button btnThree = new Button("3");
		Button btnFour = new Button("4");
		Button btnFive = new Button("5");
		Button btnSix = new Button("6");
		Button btnSeven = new Button("7");
		Button btnEight = new Button("8");
		Button btnNine = new Button("9");
		
		
		btnClear.setOnAction(click -> {
				// TODO Auto-generated method stub
				
				strTxt = "";
				currentValue = 0.0;
				operand2 = 0.0;
				//calculatorObject.clear();
				
				//double myCurrentValue = calculatorObject.getCurrentValue();
				//strTxt = String.valueOf(currentValue);
				
				tfInput.setText(String.valueOf(currentValue));
			});
		
		/*
		btnZero.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				tfInput.setText(btnZero.getText());
			}
			
		});*/
		
		btnZero.setOnAction(click -> {
			
			//currentValue = Double.parseDouble((btnZero.getText()));
			
			
			strTxt = strTxt + btnZero.getText();
			//currentValue = 0;
			
			//tfInput.setText(String.valueOf(currentValue));
			//currentValue = Double.parseDouble(test);
			tfInput.setText(strTxt);
		});
		
		btnOne.setOnAction(click -> {
			
			//currentValue = Double.parseDouble((btnZero.getText()));
			strTxt = strTxt + btnOne.getText();
			
			tfInput.setText(strTxt);
		});
		btnTwo.setOnAction(click -> {
			
			//currentValue = Double.parseDouble((btnZero.getText()));
			strTxt = strTxt + btnTwo.getText();
			
			tfInput.setText(strTxt);
		});
		btnThree.setOnAction(click -> {
			
			//currentValue = Double.parseDouble((btnZero.getText()));
			strTxt = strTxt + btnThree.getText();
			
			tfInput.setText(strTxt);
		});
		btnFour.setOnAction(click -> {
			
			//currentValue = Double.parseDouble((btnZero.getText()));
			strTxt = strTxt + btnFour.getText();
			
			tfInput.setText(strTxt);
		});
		btnFive.setOnAction(click -> {
			
			//currentValue = Double.parseDouble((btnZero.getText()));
			strTxt = strTxt + btnFive.getText();
			
			tfInput.setText(strTxt);
		});
		btnSix.setOnAction(click -> {
			
			//currentValue = Double.parseDouble((btnZero.getText()));
			strTxt = strTxt + btnSix.getText();
			
			tfInput.setText(strTxt);
		});
		btnSeven.setOnAction(click -> {
			
			//currentValue = Double.parseDouble((btnZero.getText()));
			strTxt = strTxt + btnSeven.getText();
			
			tfInput.setText(strTxt);
		});
		btnEight.setOnAction(click -> {
			
			//currentValue = Double.parseDouble((btnZero.getText()));
			strTxt = strTxt + btnEight.getText();
			
			tfInput.setText(strTxt);
		});
		btnNine.setOnAction(click -> {
			
			//currentValue = Double.parseDouble((btnZero.getText()));
			strTxt = strTxt + btnNine.getText();
			
			tfInput.setText(strTxt);
		});
		
		btnDec.setOnAction(click -> {
			
			strTxt = strTxt + btnDec.getText();
			
			tfInput.setText(strTxt);
		});
		
		//currentValue = Double.parseDouble(strTxt);
		
		btnAddition.setOnAction(click -> {
			/*
			int clickCount = 0;
			
			if (clickCount > 0){*/
			
			addClicked = true;

			
			currentValue = Double.parseDouble(strTxt);
			
			strTxt = "";
			
			/*
			clickCount++;
			
			}
			else {
				strTxt = "Error";
			}*/
			//operand2 = 0.0;
			//operand2 = Double.parseDouble(strTxt);
			
			//currentValue = currentValue + operand2;
			
		});
		
		btnSubtraction.setOnAction(click -> {
			
			subClicked = true;
			
			currentValue = Double.parseDouble(strTxt);
			
			strTxt = "";
		});
		
		btnMultiply.setOnAction(click -> {
			
			mulClicked = true;
			
			currentValue = Double.parseDouble(strTxt);
			
			strTxt = "";
		});
		
		btnDivide.setOnAction(click -> {
			
			divClicked = true;
			
			currentValue = Double.parseDouble(strTxt);
			
			strTxt = "";
		});
		
		btnEquals.setOnAction(click -> {
			
			equalsClicked = true;
			
			//double tempOp2 = 0;
			
			operand2 = Double.parseDouble(strTxt);
			
			//tempOp2 = operand2;
			
			if (addClicked == true) {
				currentValue = currentValue + operand2;
				addClicked = false;
			}
			if (subClicked == true) {
				currentValue = currentValue - operand2;
				subClicked = false;
			}
			if (mulClicked == true) {
				currentValue = currentValue * operand2;
				mulClicked = false;
			}
			if (divClicked == true) {
				if (operand2 == 0) {
		            operand2 = Double.NaN;
		        }
				
				currentValue = currentValue / operand2;
				mulClicked = false;
			}
			operand2 = 0.0;
			tfInput.setText(String.valueOf(currentValue));
			//strTxt = String.valueOf(currentValue);
			//strTxt = "0.0";
			
			//currentValue = tempOp2;
		});
		
		

		
		String btnStyle = "-fx-font: 15pt Tahoma";
		
		//btnDivide.setStyle(btnStyle);
		
		btnMultiply.setStyle(btnStyle);
		btnAddition.setStyle(btnStyle);
		btnSubtraction.setStyle(btnStyle);
		btnEquals.setStyle(btnStyle);
		
		btnClear.setStyle(btnStyle);
		btnDec.setStyle(btnStyle);
		
		btnZero.setStyle(btnStyle);
		btnOne.setStyle(btnStyle);
		btnTwo.setStyle(btnStyle);
		btnThree.setStyle(btnStyle);
		btnFour.setStyle(btnStyle);
		btnFive.setStyle(btnStyle);
		btnSix.setStyle(btnStyle);
		btnSeven.setStyle(btnStyle);
		btnEight.setStyle(btnStyle);
		btnNine.setStyle(btnStyle);
		
		//JPanel buttonPanel = new JPanel(new GridLayout(4, 6));

		//btnEquals.setMaxWidth(Double.MAX_VALUE);
		
		tfInput.setEditable(false);

		textPane.add(tfInput, 0, 0);
		
		gridPane.add(btnSeven, 0, 0);
		gridPane.add(btnEight, 1, 0);
		gridPane.add(btnNine, 2, 0);
		gridPane.add(btnDivide, 3, 0);
		
		gridPane.add(btnFour, 0, 1);
		gridPane.add(btnFive, 1, 1);
		gridPane.add(btnSix, 2, 1);
		gridPane.add(btnMultiply, 3, 1);
		
		gridPane.add(btnOne, 0, 2);
		gridPane.add(btnTwo, 1, 2);
		gridPane.add(btnThree, 2, 2);
		gridPane.add(btnSubtraction, 3, 2);
		
		gridPane.add(btnClear, 0, 3);
		gridPane.add(btnZero, 1, 3);
		gridPane.add(btnDec, 2, 3);
		gridPane.add(btnAddition, 3, 3);

		equalsPane.add(btnEquals, 0, 0);			//Equals bottom
		
		tfInput.setMinWidth(300);
		tfInput.setMinHeight(75);
		
		btnDivide.setMinWidth(75);
		btnDivide.setMinHeight(75);
		
		btnMultiply.setMinWidth(75);
		btnMultiply.setMinHeight(75);
		
		btnAddition.setMinWidth(75);
		btnAddition.setMinHeight(75);
		
		btnSubtraction.setMinWidth(75);
		btnSubtraction.setMinHeight(75);
		
		btnClear.setMinWidth(75);
		btnClear.setMinHeight(75);
		
		btnDec.setMinWidth(75);
		btnDec.setMinHeight(75);
		
		btnZero.setMinWidth(75);
		btnZero.setMinHeight(75);
		
		btnOne.setMinWidth(75);
		btnOne.setMinHeight(75);
		
		btnTwo.setMinWidth(75);
		btnTwo.setMinHeight(75);
		
		btnThree.setMinWidth(75);
		btnThree.setMinHeight(75);
		
		btnFour.setMinWidth(75);
		btnFour.setMinHeight(75);
		
		btnFive.setMinWidth(75);
		btnFive.setMinHeight(75);
		
		btnSix.setMinWidth(75);
		btnSix.setMinHeight(75);
		
		btnSeven.setMinWidth(75);
		btnSeven.setMinHeight(75);
		
		btnEight.setMinWidth(75);
		btnEight.setMinHeight(75);
		
		btnNine.setMinWidth(75);
		btnNine.setMinHeight(75);
		
		btnEquals.setMinWidth(300);				//EqualsBottom
		btnEquals.setMinHeight(75);
		
		root.getChildren().addAll(textPane, gridPane, equalsPane);
		//Scene scene = new Scene(gridPane, 300, 450);
		//Scene second = new Scene(equalsPane, 250, 350);
		primaryStage.setTitle("GUI Calc");
		primaryStage.setScene(scene);
		//primaryStage.setScene(second);
		primaryStage.show();
		
	}
	
}
