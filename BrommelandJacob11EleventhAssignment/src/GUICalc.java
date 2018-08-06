//Jacob Brommeland
//Java 2212
//7/15/2018
//GUI Calculator

import javafx.application.Application;
import javafx.event.ActionEvent;
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
import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;


public class GUICalc extends Application {

	public GUICalc() {
		// TODO Auto-generated constructor stub

	}
	
	Button button;

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
		
		TextField tfInput = new TextField("0.0");
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
		
		
		String btnStyle = "-fx-font: 15pt Tahoma";
		
		btnDivide.setStyle(btnStyle);
		
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
