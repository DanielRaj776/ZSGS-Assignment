package view;

import java.util.List;

import model.Interviewee;

public class Display {
    private Input input = new Input();
    private String arrow = "->";
    public int getSelectedOption (List<String> option) {
	int listSize = option.size();
	int selection = 0;
	for (int i = 0; i < listSize; i++) {
	    System.out.printf("%2d. %s\n", i + 1, option.get(i));
	}
	do {
	    System.out.print(arrow);
	    selection = (int)input.numberInput();
	} while (!(selection > 0 && selection <= listSize));
	return selection;
    }
    public void displayInterviewee (Interviewee input) {
	if(input == null) {
	    System.out.println("There is no one else");
	}else {
	    System.out.println("name : " +  input.getName());
	    System.out.println("age : " + input.getAge());
	    System.out.println("education : " + input.getEducation());
	    System.out.println("work experience : " + input.getPreviousWorkExperience());
	    System.out.println();
	}
    }
}
