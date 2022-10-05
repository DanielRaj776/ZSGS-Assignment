package libraryManagement;

import java.util.LinkedList;

class User {
    private static int cordNumber = 1;
    private int libraryCordNumber;
    private String name;
    private long phoneN0;
    private String email;
    private String address;
    private int noOfBooksBorrowed;
    private LinkedList<Integer> borrowedBook;
    
    User (){
	libraryCordNumber = cordNumber;
	cordNumber++;
	noOfBooksBorrowed = 0;
	borrowedBook = new LinkedList<Integer>();
    }
    
    void setName (String n) {
	name = n;
    }
    void setPhoneNo (long p) {
	phoneN0 = p;
    }
    void setEmail (String e) {
	email = e;
    }
    void setAddress (String a) {
	address = a;
    }
    void borrowBook (int bookCode) {
	noOfBooksBorrowed++;
	borrowedBook.add(bookCode);
    }
    void returnBook (int bookCode) {
	noOfBooksBorrowed--;
	borrowedBook.remove(Integer.valueOf(bookCode));
    }
    int getLibraryCordNumber () {
	return libraryCordNumber;
    }
    String getName () {
	return name;
    }
    long getPhoneNo () {
	return phoneN0;
    }
    String getEmail () {
	return email;
    }
    String getAddress () {
	return address;
    }
    int getNoOfBooksBorrowed () {
	return noOfBooksBorrowed;
    }
    LinkedList<Integer> getBorrowedBooks (){
	return borrowedBook;
    }
}
