package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Start {
    private Display display;
    private AdminLoginView adminLoginView;
    public Start() {
	display = new Display();
	adminLoginView = new AdminLoginView();
    }
    private void startMenu () {
	List<String> menuOptions = new ArrayList<>(Arrays.asList("Admin", "Passenger", "Exit"));
	System.out.println("welcome to IRCTC");
	int selectedOption = 0;
	do {
	    selectedOption = display.displayMenu(menuOptions);
	    if(!(selectedOption > 0 && selectedOption <= menuOptions.size()))
	    	System.out.println("invalid input");
	} while (!(selectedOption > 0 && selectedOption <= menuOptions.size()));
	 switch(selectedOption) {
	 case 1:{
	     adminLoginView.login();
	     startMenu();
	     break;
	 }
	 case 2:{
	     startMenu();
	     break;
	 }
	 case 3:
	     return;
	 }
    }
    
    public static void main(String[] args) {
	Start start = new Start();
	start.startMenu();
    }

}
