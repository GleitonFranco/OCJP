package c09threads;

public class DeadlockRisk {
	
	private static class Resource {
		public int value;
	}
	
	private Resource resourceA = new Resource();
	private Resource resourceB = new Resource();
	
	public int read() {
		synchronized(resourceA) { // May deadlock here
			synchronized(resourceB) {
				return resourceB.value + resourceA.value;
			}
		}
	}
	
	public void write(int a, int b) {
		synchronized(resourceB) { // May deadlock here
			synchronized(resourceA) {
				resourceA.value = a;
				resourceB.value = b;
			}
		}
	}
	
}

// The preceding simple example is easy to fix;
// just swap the order of locking for either the reader or the writer
