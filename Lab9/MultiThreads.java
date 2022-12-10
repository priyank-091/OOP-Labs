class NewThread2 extends Thread {
	NewThread2(String name){
		super(name);
		System.out.println("Child thread created: " + this);
	}

	public void run(){
		System.out.println("Child Thread " + this);
	}
}

class DemoThread2{
	public static void main(String[] args){
		NewThread2 nt1 = new NewThread2("First Child");
		NewThread2 nt2 = new NewThread2("Second Child");
		nt1.start();
		nt2.start();
		System.out.println("Main thread.");
	}
}