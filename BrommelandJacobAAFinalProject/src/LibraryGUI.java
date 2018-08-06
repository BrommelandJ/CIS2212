//Jacob Brommeland
//Java 2212
//8/1/2018
//GUILibrary Final

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JFileChooser;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.ChoiceBoxListCell;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LibraryGUI extends Application implements EventHandler<ActionEvent> {
	
    private Library lib = new Library();
    
    private ObservableList<String> item = FXCollections.observableArrayList();
    
    private ListView<String> items = new ListView<String>(item);
    private ArrayList<String> titles = new ArrayList<String>();
    private ArrayList<String> formats = new ArrayList<String>();
    
    private String title, format, loanedTo, dateLoaned;
    
    private Button add, checkOut, checkIn, save, load, delete, accept1, accept2, accept3, accept4, cancel1, cancel2, cancel3,
            cancel4, cancel5;
    
    private TextField textField1, textField2, textField3, textField4;
    
    private Stage stage1, stage2, stage3, stage4, stage5;
    private int itemNum;

    public static void main(String[] args) {
    	
        launch(args);
    }
    

    
public void errorMessage(String dialogMessage, IOException e) {				//Prints Error Message
    cancel5 = new Button("Retry");
    cancel5.setPrefWidth(70);
    cancel5.setLayoutX(170);
    cancel5.setLayoutY(65);
    cancel5.setOnAction(this);

    //Text dialog = new Text("You cannot check in an item that is not checked out!");
    Text dialog = new Text(dialogMessage);
    dialog.setLayoutX(60);
    dialog.setLayoutY(45);

    Pane layout1 = new Pane();
    layout1.getChildren().addAll(dialog, cancel5);

    stage5 = new Stage();
    stage5.setTitle("Error!");
    stage5.setScene(new Scene(layout1, 400, 100));
    stage5.show();
}


    @Override
    public void start(Stage primaryStage) throws Exception {
    	
        LibraryGUI gui = new LibraryGUI();
        
        primaryStage.setTitle("Graphical Personal Lending Library");
        items.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        
        Scene scene = new Scene(gui.layout(), 450, 278);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public Pane layout() {

        add = new Button("Add");
        add.setOnAction(this);
        add.setLayoutX(6);
        add.setLayoutY(248);
        add.setPrefWidth(105);

        checkOut = new Button("Check Out");
        checkOut.setOnAction(this);
        checkOut.setLayoutX(117);
        checkOut.setLayoutY(248);
        checkOut.setPrefWidth(105);

        checkIn = new Button("Check In");
        checkIn.setOnAction(this);
        checkIn.setLayoutX(229);
        checkIn.setLayoutY(248);
        checkIn.setPrefWidth(105);

        delete = new Button("Delete");
        delete.setOnAction(this);
        delete.setLayoutX(340);
        delete.setLayoutY(248);
        delete.setPrefWidth(104);
        
        save = new Button("Save Library");
        save.setOnAction(this);
        save.setLayoutX(6);
        save.setLayoutY(215);
        save.setPrefWidth(214);
        
        load = new Button("Load Library");
        load.setOnAction(this);
        load.setLayoutX(229);
        load.setLayoutY(215);
        load.setPrefWidth(214);

        Pane layout = new Pane();
        items.setItems(item);
        items.setCellFactory(ChoiceBoxListCell.forListView(item));
        items.setLayoutX(5);
        items.setLayoutY(5);
        items.setPrefWidth(440);
        items.setPrefHeight(200); //238
        layout.getChildren().addAll(items, add, checkOut, checkIn, save, load, delete);
        return layout;
    }

    @Override
    public void handle(ActionEvent event) {
    	
    	if (event.getSource() == save) {											//Saves content to file
    		
    		String fileContent = "";
    		
    		fileContent = fileContent + items.getItems().toString();
    		//System.out.println(fileContent);
    		
    		JFileChooser j = new JFileChooser();

    		j.showSaveDialog(null);
 		
    		j.setCurrentDirectory(new File("Library.txt"));
    		
    		FileOutputStream fos = null;
    		ObjectOutputStream oos = null;
    		try {
    	        // write object to file
    	        fos = new FileOutputStream("Library.txt");
    	        oos = new ObjectOutputStream(fos);
    	        
    	        oos.writeObject(item);
    	        oos.close();


    	    } catch (FileNotFoundException e) {
    	    	String fnfe = "Error: File Not Found!";
    	        
    	        errorMessage(fnfe, e);
    	        e.printStackTrace();
    	        
    	    } catch (IOException e) {
    	    	String ioe = "Error: IO Exception!";
    	        
    	        errorMessage(ioe, e);
    	        e.printStackTrace();
    	    }

    	}
    	
    	if (event.getSource() == load) {											//Loads content from file
    		JFileChooser j = new JFileChooser();
    		File selection = j.getSelectedFile();
    		
    		
    	}
    	
        if (event.getSource() == add) {

            accept1 = new Button("Accept");
            accept1.setPrefWidth(70);
            accept1.setLayoutX(125);
            accept1.setLayoutY(65);
            accept1.setOnAction(this);
            
            cancel1 = new Button("Cancel");
            cancel1.setPrefWidth(70);
            cancel1.setLayoutX(205);
            cancel1.setLayoutY(65);
            cancel1.setOnAction(this);

            Text dialog = new Text("Media Item Name:");
            dialog.setLayoutX(20);
            dialog.setLayoutY(45);
            
            textField1 = new TextField();
            textField1.setPrefHeight(20);
            textField1.setPrefWidth(150);
            textField1.setLayoutX(125);
            textField1.setLayoutY(30);

            Pane layout1 = new Pane();
            layout1.getChildren().addAll(textField1, dialog, accept1, cancel1);

            stage1 = new Stage();
            stage1.setTitle("Item Name");
            stage1.setScene(new Scene(layout1, 400, 100));
            stage1.show();
            
        }

        if (event.getSource() == cancel1) {
            stage1.close();
        }
        

        if (event.getSource() == accept1) {
        	
            title = textField1.getText();
            titles.add(textField1.getText());
            stage1.close();

            accept2 = new Button("Accept");
            accept2.setPrefWidth(70);
            accept2.setLayoutX(125);
            accept2.setLayoutY(65);
            accept2.setOnAction(this);
            
            cancel2 = new Button("Cancel");
            cancel2.setPrefWidth(70);
            cancel2.setLayoutX(205);
            cancel2.setLayoutY(65);
            cancel2.setOnAction(this);

            Text dialog = new Text("Media Item Format:");
            dialog.setLayoutX(15);
            dialog.setLayoutY(45);

            textField2 = new TextField();
            textField2.setPrefHeight(20);
            textField2.setPrefWidth(150);
            textField2.setLayoutX(125);
            textField2.setLayoutY(30);
            format = textField2.getText();

            Pane layout2 = new Pane();
            layout2.getChildren().addAll(textField2, dialog, accept2, cancel2);

            stage2 = new Stage();
            stage2.setTitle("Item Format");
            stage2.setScene(new Scene(layout2, 400, 100));
            stage2.show();
        }

        if (event.getSource() == cancel2) {
        	
            title = null;
            titles.remove(titles.size() - 1);
            stage2.close();
        }

        if (event.getSource() == accept2) {
        	
            format = textField2.getText();
            formats.add(textField2.getText());
            lib.addNewItem(title, format);
            items.getItems().add(title + " (" + format + ")");
            stage2.close();
            
        }

        if (event.getSource() == checkOut) { //item is being checked out
            item = items.getSelectionModel().getSelectedItems();

            for (int i = 0; i < items.getItems().size(); i++) {
                if (items.getSelectionModel().getSelectedItem()
                		
                        .equals(lib.getItemList().get(i).getTitle(title) + " (" + lib.getItemList().get(i).getFormat(format) + ")")

                        && !lib.getItemList().get(i).onLoan) {
                	
                    itemNum = i;

                    accept3 = new Button("Accept");
                    accept3.setPrefWidth(70);
                    accept3.setLayoutX(125);
                    accept3.setLayoutY(65);
                    accept3.setOnAction(this);
                    
                    cancel3 = new Button("Cancel");
                    cancel3.setPrefWidth(70);
                    cancel3.setLayoutX(205);
                    cancel3.setLayoutY(65);
                    cancel3.setOnAction(this);

                    Text dialog = new Text("Loaned To:");
                    dialog.setLayoutX(60);
                    dialog.setLayoutY(45);

                    textField3 = new TextField();
                    textField3.setPrefHeight(20);
                    textField3.setPrefWidth(150);
                    textField3.setLayoutX(125);
                    textField3.setLayoutY(30);

                    Pane layout3 = new Pane();
                    layout3.getChildren().addAll(accept3, cancel3, dialog, textField3);

                    stage3 = new Stage();
                    stage3.setTitle("Check Out");
                    stage3.setScene(new Scene(layout3, 400, 100));
                    stage3.show();
                    
                    

                }
            }
        }

        if (event.getSource() == accept3) {
            loanedTo = textField3.getText();
            lib.getItemList().get(itemNum).loanedTo = loanedTo;
            stage3.close();

            accept4 = new Button("Accept");
            accept4.setPrefWidth(70);
            accept4.setLayoutX(125);
            accept4.setLayoutY(65);
            accept4.setOnAction(this);
            cancel4 = new Button("Cancel");
            cancel4.setPrefWidth(70);
            cancel4.setLayoutX(205);
            cancel4.setLayoutY(65);
            cancel4.setOnAction(this);

            Text dialog = new Text("Date Loaned:");
            dialog.setLayoutX(50);
            dialog.setLayoutY(45);

            textField4 = new TextField();
            textField4.setPrefHeight(20);
            textField4.setPrefWidth(150);
            textField4.setLayoutX(125);
            textField4.setLayoutY(30);

            Pane layout3 = new Pane();
            layout3.getChildren().addAll(accept4, cancel4, dialog, textField4);

            stage4 = new Stage();
            stage4.setTitle("Check Out");
            stage4.setScene(new Scene(layout3, 400, 100));
            stage4.show();

        }

        if (event.getSource() == accept4) {
            stage4.close();
            dateLoaned = textField4.getText();
            lib.getItemList().get(items.getSelectionModel().getSelectedIndex()).dateLoaned = dateLoaned;
            lib.getItemList().get(items.getSelectionModel().getSelectedIndex()).onLoan = true;

            items.getItems().set(items.getSelectionModel().getSelectedIndex(),
                    titles.get(items.getSelectionModel().getSelectedIndex()) + " ("
                            + formats.get(items.getSelectionModel().getSelectedIndex()) + ") loaned to " + loanedTo
                            + " on " + dateLoaned);
        }

        if (event.getSource() == checkIn) {
        	
            for (int i = 0; i < items.getItems().size(); i++) {
            	
                if (items.getSelectionModel().getSelectedItem().contains(lib.getItemList().get(i).getTitle(title))
                        && items.getSelectionModel().getSelectedItem().contains(lib.getItemList().get(i).getFormat(format))
                        && lib.getItemList().get(i).onLoan) {
                    itemNum = i;
                    items.getItems().set(items.getSelectionModel().getSelectedIndex(),
                            titles.get(items.getSelectionModel().getSelectedIndex()) + " ("
                                    + formats.get(items.getSelectionModel().getSelectedIndex()) + ")");

                    lib.getItemList().get(items.getSelectionModel().getSelectedIndex()).dateLoaned = null;
                    lib.getItemList().get(items.getSelectionModel().getSelectedIndex()).onLoan = false;

                }
            }
           
        }
        
        if( ((event.getSource() == checkIn) && (lib.getItemList().get(items.getSelectionModel().getSelectedIndex()).onLoan == false)) ) { //Tests if checkIn was clicked and if item is onLoan
            
        	String errorMessage = "Item must be On Loan to be Checked In!";
            errorMessage(errorMessage, null);
        }
        
       

        
        if (event.getSource() == cancel1) {
            stage5.close();
        }
        

        if (event.getSource() == delete) { //item is being deleted from all lists
        	
            items.getItems().remove(items.getSelectionModel().getSelectedIndex());
            
            for (int i = 0; i < items.getItems().size(); i++) {
            	
                if (items.getSelectionModel().getSelectedItem().contains(lib.getItemList().get(i).getTitle(title))
                        && items.getSelectionModel().getSelectedItem().contains(lib.getItemList().get(i).getFormat(format))) {
                    itemNum = i;
                    lib.getItemList().remove(items.getSelectionModel().getSelectedIndex());
                    items.getItems().remove(items.getSelectionModel().getSelectedIndex());
                    titles.remove(items.getSelectionModel().getSelectedIndex());
                    formats.remove(items.getSelectionModel().getSelectedIndex());

                }
            }
        }

    }

}