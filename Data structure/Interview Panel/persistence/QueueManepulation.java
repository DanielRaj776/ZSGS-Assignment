package persistence;

import java.util.Queue;

import model.Interviewee;

public class QueueManepulation {
    Queue<Interviewee> queue = IntervieweeQueue.getReference();
    public void enQueue (Interviewee element) {
	queue.add(element);
    }
    public Interviewee deQueue () {
	return queue.poll();
    }
}
