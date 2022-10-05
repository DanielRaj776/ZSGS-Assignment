package libraryManagement;

class Main {
    private Display display = new Display();
    private Input input = new Input();
    private Admin admin = new Admin();
    private Library library = new Library();
    private UserList userList = new UserList();
    private int startMenu;
    private int adminMenu = 0;
    
    public void start () {
	display.start();
	startMenu = input.startMenuInput();
	if(startMenu == 1) {
	    display.displayAdmin(admin);
	    if(input.passwordInput().equals(admin.getPassword())) {
		display.line();
		do {
		    display.displayAdminOperations();
		    adminMenu = input.adminOperationsMenuInput();
		    int option = 0;
		    switch(adminMenu) {
		    case 1:
			do {
			    display.displayLibraryCardManagementMenu();
			    option = input.optionInput();
			    switch(option) {
			    case 1:
				userList.registerUser(input);
				break;
			    case 2:
				System.out.println("          Enter Library Card No");
				userList.removeUser(input.integerInput());
				break;
			    }
			    if(!(option >= 1 && option <= 3)) {
				System.out.println("           Invalid Input");
			    }
			} while (option != 3);
			break;
		    case 2:
			do {
			    display.displayLibraryBookManagementMenu();
			    option = input.optionInput();
			    switch(option) {
			    case 1:
				library.addBook(input);
				break;
			    case 2:
				System.out.println("          Enter Book Code");
				library.removeBook(input.integerInput());
				break;
			    }
			    if(!(option >= 1 && option <= 3)) {
				System.out.println("           Invalid Input");
			    }
			} while (option != 3);
			break;
		    case 3:
			do {
			    display.displayLendingBookMenu();
				option = input.optionInput();
				int code;
				int cardNo;
				switch(option) {
				case 1:
				    System.out.println("          Enter Book Code");
				    code = input.integerInput();
				    System.out.println("          Enter Library Card No");
				    cardNo = input.integerInput();
				    admin.lend(library, userList, code, cardNo);
				    break;
				case 2:
				    System.out.println("          Enter Book Code");
				    code = input.integerInput();
				    System.out.println("          Enter Library Card No");
				    cardNo = input.integerInput();
				    admin.Return(library, userList, code, cardNo);
				    break;
				}
				if(!(option >= 1 && option <= 3)) {
					System.out.println("           Invalid Input");
				}
			}while(option != 3);
			break;
		    case 4:
			do {
			    display.displaySearchMenu();
			    option = input.optionInput();
			    switch(option) {
			    case 1:
				System.out.println("           Enter the Title");
				display.displayBookList(library.searchTitle(input.stringInput()));
				break;
			    case 2:
				System.out.println("           Enter Author Name");
				display.displayBookList(library.searchAuthor(input.stringInput()));
				break;
			    case 3:
				System.out.println("           Enter Subject Name");
				display.displayBookList(library.searchSubject(input.stringInput()));
				break;
			    case 4:
				System.out.println("           Enter Publication");
				display.displayBookList(library.searchPublication(input.stringInput()));
				break;
			    }
			    if(!(option >= 1 && option <= 5)) {
				System.out.println("           Invalid Input");
			    }
			} while (option != 5);
			break;
		    }
		    if(!(adminMenu >= 1 && adminMenu <= 5))
			System.out.println("           Invalid Input");
		}while(adminMenu != 5);
	    }else {
		display.displayWrongPassword();
		display.line();
	    }
	}
	input.colse();
	display.exit();
    }
    public static void main(String[] args) {
	Main main = new Main();
	main.start();
    }

}
