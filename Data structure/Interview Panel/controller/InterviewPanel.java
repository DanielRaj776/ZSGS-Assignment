package controller;

import model.Interviewee;
import persistence.QueueManepulation;

public class InterviewPanel {
    private QueueManepulation queueManepulation = new QueueManepulation(); 
    public Interviewee next (){
	return queueManepulation.deQueue();
    }
}
