package persistence;

import java.util.LinkedList;
import java.util.Queue;

import model.Interviewee;

public class IntervieweeQueue {
    private static Queue<Interviewee> queue = null;
    private IntervieweeQueue () { };
    public static Queue<Interviewee> getReference () {
	if(queue == null) {
	    queue = new LinkedList<>();
	}
	return queue;
    }
}
