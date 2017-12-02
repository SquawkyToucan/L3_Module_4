package threads;

public class ThreadedReverseGreeting {
	// Write a program that creates a thread (Thread 1) that creates another thread
	// (Thread 2);
	// Thread 2 creates Thread 3; and so on, up to Thread 50.
	// Each thread should print "Hello from Thread <num>!",
	// but you should structure your program such that the threads print their
	// greetings in reverse order.
	static int i = 50;
	public static void main(String[] args) {
		while(i > 0) {
		new Thread(() -> sayNum()).start();
		System.out.println("Hello from thread " + i + "!");
		i--;
		if(i <= 0) {
			System.exit(0);
		}
		}
	}
	public static void sayNum() {
		
	}
}
