class Box {
	synchronized public void printBox(){
		try{
			System.out.print("[..");
			Thread.sleep(1000);
			System.out.print("..]");
		}catch(InterruptedException ie){
			System.out.println("Child thread interrupted");
		}
	}
}

class ChildThread extends Thread{

	static Box b = new Box();
	String name;

	ChildThread(String name){

		super(name);
		this.name = name;
		start();
	}

	public void run(){
		System.out.println(name + " started.");
		b.printBox();
	}
}

class ThreadSync {
	public static void main(String args[]){
		ChildThread c1 = new ChildThread("Thread 1");
		ChildThread c2 = new ChildThread("Thread 2");
		ChildThread c3 = new ChildThread("Thread 3");
	
		try{
			c1.join();
			c2.join();
			c3.join();
		}
		catch(InterruptedException ie){
			System.out.println("Main thread Interrupted");
		}

		System.out.println("Main thread Exit");
	}
}