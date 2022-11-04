package view;

import model.Interviewee;

public class IntervieweeDetails {
    private Input input = new Input(); 
    private final String arrow = "->";
    public Interviewee getIntervieweeDetails () {
	System.out.println("Enter name");
	System.out.print(arrow);
	String  name =  input.nameInput();
	System.out.println("Enter age");
	System.out.print(arrow);
	int age = (int)input.numberInput();
	System.out.println("Enter education qualification");
	System.out.print(arrow);
	String education = input.nameInput();
	System.out.println("Enter work experience (in years)");
	System.out.print(arrow);
	int workEcperience = (int)input.numberInput();
	return new Interviewee(name, age, education, workEcperience);
    }
}
