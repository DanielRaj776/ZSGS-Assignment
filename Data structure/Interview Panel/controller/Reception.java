package controller;

import persistence.QueueManepulation;
import view.IntervieweeDetails;

public class Reception {
    private IntervieweeDetails intervieweeDetails = new IntervieweeDetails();
    private QueueManepulation queueManepulation = new QueueManepulation();
    public void register () {
	queueManepulation.enQueue(intervieweeDetails.getIntervieweeDetails());
    }
}
