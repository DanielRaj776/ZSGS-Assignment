package libraryManagement;

import java.util.LinkedList;

class UserList {
    private LinkedList<User> userlist;
    
    public UserList() {
	userlist = new LinkedList<User>();
    }
    
    void registerUser (Input input) {
	User newUser = new User();
	userlist.add(newUser);
	System.out.print("           Enter User Name : ");
	newUser.setName(input.userNameInput());
	System.out.println();
	System.out.print("           Enter Phone number : ");
	newUser.setPhoneNo(input.userPhoneNo());
	System.out.println();
	System.out.print("           Enter Email Address : ");
	newUser.setEmail(input.stringInput());
	System.out.println();
	System.out.print("           Enter Address : ");
	newUser.setAddress(input.stringInput());
	System.out.println();
    }
    void removeUser (int cardNo) {
	boolean contails = true;
	for(User user : userlist) {
	    if(user.getLibraryCordNumber() == cardNo) {
		System.out.println("           Removed user : " + user.getName());
		userlist.remove(user);
		contails = false;
		break;
	    }
	}
	if(contails)
	    System.out.println("           There No Such User");
    }
    User getUser (int libraryCardNo) {
	User output = null;
	for(User user : userlist) {
	    if(user.getLibraryCordNumber() == libraryCardNo) {
		output = user;
		break;
	    }
	}
	return output;
    }
}
