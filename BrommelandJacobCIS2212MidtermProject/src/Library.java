//Jacob Brommeland
//Java 2212
//6/21/2018
//Library Midterm

import java.util.Scanner;
 
public class Library {
	
	MediaItem[] item = new MediaItem[100];
	
	int numItems;
	
	static Scanner input = new Scanner(System.in);//needed for inputs
		
public Library(Scanner scanner) {
		// TODO Auto-generated constructor stub
	}
public static int displayMenu() {//strings of menu
		
		int menuObject;
		
		while (true) {
		System.out.println("\n1. Add new item\n"
						 + "2. Mark an item as on loan\n"
						 + "3. List all items\n"
						 + "4. Mark an item as returned\n"
						 + "5. Quit\n"
						 + "What would you like to do?");
		
		menuObject = input.nextInt();
		
		if (menuObject < 1 || menuObject > 5){
			
			System.out.println("I'm sorry, " + menuObject + " wasn't one of the options.");
			continue;
		}
		else {
			return menuObject;
			 }
		}
	} //end displayMenu
	
	//int i = 0; //item counter
public void addNewItem(String title, String format) {
	//System.out.println("What is the title?");
	
	//item[numItems] = new MediaItem(input.nextLine(), title);	
	
	//System.out.println("What is the format?");
	item[numItems] = new MediaItem(title, format);
	numItems++;
	
	//item[i].title = title;
	//item[i].format = format;
	//i++;
	
}
public void markItemOnLoan(String title, String name, String date) {
	
	boolean found = false;
	
	for(int x = 0; x < numItems && !found; x++) {
	    //System.out.println("Loop for: "+item[x].title + " titlepassed: "+ title);
	    	if (item[x].title.equals(title)) {
	    		//System.out.println("bing");  	
	    		item[x].markOnLoan(name, date);
	    		found = true;
	    		//return;	    	
			}
		}
		if (!found) {
		System.out.println("I'm sorry, I couldn't find " + title + " in the library");
		}
	}

String[] listAllItems() {
		
	String stringArray[] = new String[numItems];
	
	for(int x = 0; x < numItems; x++) {//if item is loaned out, outputs string that includes person and date
		if(item[x].onLoan == true) {
	    stringArray[x] = item[x].title + " (" + item[x].format + ") " + "loaned to " + item[x].loanedTo + " on " + item[x].dateLoaned; 
		}
		else {
			stringArray[x] = item[x].title + " (" + item[x].format + ") ";
		}
    }
	return stringArray;
}

public void markItemReturned(String title) {
	
	boolean found = false; 
	
    for(int i = 0; i < numItems && !found; i++){
        if(item[i].getTitle(title).equalsIgnoreCase(title)){
            item[i].markReturned();
            found = true;
        }
    }
    if(!found){
        System.out.println("I'm sorry, I couldn't find " + title + " in the library.");
    }
}

public static void main(String[] args) {
	
	MediaItem mediaObject = new MediaItem(); //links class
			
    Scanner input = new Scanner(System.in);
    Library lib = new Library(new Scanner(System.in));
    
    String title;
    String format;
    String name;
    String date;
    
    
    while (true){

    	int menuObject = displayMenu();
    
    switch(menuObject) {
    	case 1: 
    		System.out.print("What is the title? ");
            title = input.nextLine();
        
            System.out.print("What is the format? ");
            format = input.nextLine();
            lib.addNewItem(title, format);
            
            //System.out.println(title);
           // System.out.println(format);
    		break;
    	case 2:
    		System.out.print("Which item (enter the title)? ");
    		title = input.nextLine();
    		//if (title != )
    		System.out.print("Who are you loaning it to? ");
    		name = input.nextLine();
    		System.out.print("When did you loan it to them? ");
    		date = input.nextLine();
    		
    		lib.markItemOnLoan(title, name, date);
    		
    		//System.out.println(title + " " + name + " " + date);
    		break;
    	case 3:
    		
    		for(int i = 0; i < lib.listAllItems().length; i++) {
    		    System.out.println(lib.listAllItems()[i]);		    
    		}
    		break;
    	case 4:
    		System.out.print("Which item (enter the title) ");
            title = input.nextLine();
            lib.markItemReturned(title);
    		break;
    	case 5:
    		System.out.println("Goodbye!");
            System.exit(0);
    		break;
    	default:
    		System.out.println("Invalid Option!");
    		break;
        }
}
}
}


