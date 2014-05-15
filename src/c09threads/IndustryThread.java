package c09threads;

import java.util.ArrayList;
import java.util.List;

public class IndustryThread {

	public static void main(String[] args) {

	}

}

class OperatorDraft extends Thread {
	public void run(){
		while(true){
			// Get shape from user
			synchronized(this){
				// Calculate new machine steps from shape
				notify();
			}
		}
	}
}

class MachineDraft extends Thread {
	OperatorDraft operator; // assume this gets initialized
	public void run(){
		while(true){
			synchronized(operator){
				try {
					operator.wait();
				} catch(InterruptedException ie) {}
				// Send machine steps to hardware
			}
		}
	}
}

// Versoes melhoradas

class Operator extends Thread {
	Machine machine; // assume this gets initialized
	public void run() {
		while (true) {
			Shape shape = getShapeFromUser();
			MachineInstructions job = calculateNewInstructionsFor(shape);
			machine.addJob(job);
		}
	}

	private MachineInstructions calculateNewInstructionsFor(Shape shape) {
		return null;
	}

	private Shape getShapeFromUser() {
		return null;
	}
}


class Machine extends Thread {
	List<MachineInstructions> jobs = new ArrayList<MachineInstructions>();
	public void addJob(MachineInstructions job) {
		synchronized (jobs) {
			jobs.add(job);
			jobs.notify();
		}
	}
	public void run() {
		while (true) {
			synchronized (jobs) {
				// wait until at least one job is available
				while (jobs.isEmpty()) {
					try {
						jobs.wait();
					} catch (InterruptedException ie) { }
				}
				// If we get here, we know that jobs is not empty
				MachineInstructions instructions = jobs.remove(0);
				// Send machine steps to hardware
			}
		}
	}
}

class Shape {
	
}

class MachineInstructions {
	
}