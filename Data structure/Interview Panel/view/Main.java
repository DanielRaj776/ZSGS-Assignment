package view;

import java.util.Arrays;
import java.util.List;

import controller.InterviewPanel;
import controller.Reception;

public class Main {
    private Display display = new Display();
    private Reception reception = new Reception();
    private InterviewPanel interviewPanel = new InterviewPanel();
    private void menu () {
	List<String> optionsList = Arrays.asList("Reception", "InterviewPanel", "Exit");
	int selection = display.getSelectedOption(optionsList);
	if(selection == optionsList.size()) {
	    return;
	}else {
	    switch (selection) {
	    case 1:
		reception.register();
		menu();
		break;
	    case 2:
		display.displayInterviewee(interviewPanel.next());
		menu();
		break;
	    }
	}
    }
    public static void main(String[] args) {
	Main ob = new Main();
	ob.menu();
    }

}
