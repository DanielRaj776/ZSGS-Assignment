package libraryManagement;

import java.util.LinkedList;

class Display {
    void line () {
	System.out.println("_________________________________________________________________");
    }
    void start () {
	System.out.println("=================================================================");
	System.out.println("                          City Library");
	System.out.println("=================================================================");
	System.out.println();
	System.out.println("           1. Enter");
	System.out.println("           2. Exit");
	System.out.println("_________________________________________________________________");
    }
    void displayAdmin (Admin admin) {
	System.out.println("               User : " + admin.getName());
	System.out.print("           Password : ");
    }
    void displayWrongPassword () {
	System.out.println("\n            wrong password");
    }
    void displayAdminOperations () {
	System.out.println();
	System.out.println("           1. Library Card Management");
	System.out.println("           2. Library Book Management");
	System.out.println("           3. Lending Book");
	System.out.println("           4. Search Book");
	System.out.println("           5. Exit");
	line();
    }
    void displayLibraryCardManagementMenu () {
	System.out.println("=================================================================");
	System.out.println("                     Library Card Management");
	System.out.println("=================================================================");
	System.out.println("           1. Register New Library Card(User)");
	System.out.println("           2. Remove Library Card(User");
	System.out.println("           3. Exit");
	line();
    }
    void displayLibraryBookManagementMenu () {
	System.out.println("=================================================================");
	System.out.println("                     Library Book Management");
	System.out.println("=================================================================");
	System.out.println("           1. Add Book");
	System.out.println("           2. Remove Book");
	System.out.println("           3. Exit");
	line();
    }
    void displayLendingBookMenu () {
	System.out.println("=================================================================");
	System.out.println("                          Lending Book");
	System.out.println("=================================================================");
	System.out.println("           1. Lend");
	System.out.println("           2. Return");
	System.out.println("           3. Exit");
	line();
    }
    void displaySearchMenu () {
	System.out.println("=================================================================");
	System.out.println("                          Search Book");
	System.out.println("=================================================================");
	System.out.println("           1. Title Search");
	System.out.println("           2. Author Name Search");
	System.out.println("           3. Subject Search");
	System.out.println("           4. Publication Search");
	System.out.println("           5. Exit");
	line();
    }
    void displayBookList (LinkedList<Book> bookList) {
	for(Book book : bookList) {
	    System.out.println(book.toString());
	}
	line();
    }
     void exit () {
	System.out.println("                Exiting....");
	try {
	    Thread.sleep(2000);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
	System.out.println();
	System.out.println("                Exited");
	System.out.println("_________________________________________________________________");
    }
}
