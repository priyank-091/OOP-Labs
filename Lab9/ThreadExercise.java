class numThread implements Runnable{
	Thread t;

	numThread(String name){
		t = new Thread(this,name);
	}
	public void run(){
		try{
			for(int i = 1; i <= 26; i++){
				System.out.println(i);
				Thread.sleep(1000);
			}
		}catch (InterruptedException e) {
			System.out.println("Child Interrupted.");	
		}
	}
}

class charThread implements Runnable{
	Thread t;
	charThread(String name){
		t = new Thread(this,name);
	}
	public void run(){
		try{
			for(int i = 0; i < 26; i++){
				char temp = (char)(i + 65);
				System.out.println(temp);
				Thread.sleep(1000);
			}
		}catch(InterruptedException ie){
			System.out.println("Child interrupted.");
		}
	}
}

class ThreadExercise{
	public static void main(String[] args){
		charThread ct = new charThread("Char Thread");
		numThread nt = new numThread("Num Thread");
		System.out.println("Starting Child Threads");
		ct.t.start();
		nt.t.start();
		try{
			ct.t.join();
			nt.t.join();
		}catch(InterruptedException e){
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Main thread exiting.");
	}
}