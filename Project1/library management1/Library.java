package libraryManagement;

import java.util.LinkedList;

class Library {
    private LinkedList<Book> library;
    
    public Library() {
	library = new LinkedList<Book>();
    }
    Book getBook (int bookCode) {
	Book output = null;
	for(Book book : library) {
	    if(book.getBookCode() == bookCode) {
		output = book;
		break;
	    }
	}
	return output;
    }
    void addBook (Input input) {
	Book newBook = new Book();
	library.add(newBook);
	System.out.print("          Enter Book Title :  ");
	newBook.setTitle(input.stringInput());
	System.out.println();
	System.out.print("          Enter Book's Auther Name : ");
	newBook.setAuthor(input.stringInput());
	System.out.println();
	System.out.print("          Enter Subject of The Book : ");
	newBook.setSubject(input.stringInput());
	System.out.println();
	System.out.print("          Enter Edition No : ");
	newBook.setEdition(input.integerInput());
	System.out.println();
	System.out.print("          Enter Volume No : ");
	newBook.setVolume(input.integerInput());
	System.out.println();
	System.out.print("          Enter Publication : ");
	newBook.setPublication(input.stringInput());
	System.out.println();
	System.out.print("          Enter Published Year : ");
	newBook.setPublishedYear(input.bookPublishedYear());
	System.out.println();
    }
    void removeBook (int bookCode) {
	for(Book book : library) {
	    if(book.getBookCode() == bookCode) {
		System.out.println(book.getTitle() + " Is Removed From Library");
		library.remove(book);
		break;
	    }
	}
    }
    LinkedList<Book> searchTitle (String title){
	LinkedList<Book> searchResult = new LinkedList<Book>();
	boolean flage = true;
	for(Book book : library) {
	    if(book.getTitle().equals(title)) {
		searchResult.add(book);
		flage = false;
	    }
	}
	if(flage)
	    System.out.println("          No Matches Are Found");
	return searchResult;
    }
    LinkedList<Book> searchAuthor (String author){
	LinkedList<Book> searchResult = new LinkedList<Book>();
	boolean flage = true;
	for(Book book : library) {
	    if(book.getAuthor().equals(author)) {
		searchResult.add(book);
		flage = false;
	    }
	}
	if(flage)
	    System.out.println("          No Matches Are Found");
	return searchResult;
    }
    LinkedList<Book> searchSubject (String subject){
	LinkedList<Book> searchResult = new LinkedList<Book>();
	boolean flage = true;
	for(Book book : library) {
	    if(book.getSubject().equals(subject)) {
		searchResult.add(book);
		flage = false;
	    }
	}
	if(flage)
	    System.out.println("          No Matches Are Found");
	return searchResult;
    }
    LinkedList<Book> searchPublication (String publication){
	LinkedList<Book> searchResult = new LinkedList<Book>();
	boolean flage = true;
	for(Book book : library) {
	    if(book.getPublication().equals(publication)) {
		searchResult.add(book);
		flage = false;
	    }
	}
	if(flage)
	    System.out.println("          No Matches Are Found");
	return searchResult;
    }
}
