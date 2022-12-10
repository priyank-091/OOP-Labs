import java.util.*;

class NewThread implements Runnable {
	Thread t;

	NewThread(String name){
		t = new Thread(this, name);
		System.out.println("Child thread");
	}

	public void run(){
		System.out.println("Running child thread. " + t.getName());
	}

}

class ThreadDemo {
	public static void main(String[] args){
		NewThread nt = new NewThread("Child");
		nt.t.run();
		Thread t = Thread.currentThread();
		System.out.println("Main Thread " + t.getName());

	}
}