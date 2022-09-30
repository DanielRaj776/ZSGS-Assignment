package libraryManagement;

class Admin {
    private String name;
    private String password;
    
    Admin (){
	name = "Admin";
	password = "12345";
    }
    
    String getName () {
	return name;
    }
    String getPassword () {
	return password;
    }
    
    void lend (Library library, UserList userList,  int bookCode, int libraryCardNo) {
	User user = userList.getUser(libraryCardNo);
	Book book = library.getBook(bookCode);
	if(user.getNoOfBooksBorrowed() >= 5) {
	    System.out.println("You Have Already Borrow The Max Number Of Book Allowed");
	}else if(!(book.getAvailable())){
	    System.out.println("This book is not Available");
	}else {
	    user.borrowBook(bookCode);
	    book.setAvailable(false);
	    System.out.println(book.getTitle() + " is lended to " + user.getName());
	}
    }
    void Return (Library library, UserList userList, int bookCode, int libraryCardNo) {
	User user = userList.getUser(libraryCardNo);
	Book book = library.getBook(bookCode);
	user.returnBook(bookCode);
	book.setAvailable(true);
	System.out.println(book.getTitle() + " Was Returned.");
    }
    
}
