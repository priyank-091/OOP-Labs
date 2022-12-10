import java.util.*;

class CurrentThreadEx{
	public static void main(String[] args){
		Thread t = Thread.currentThread();
		System.out.println("Current Thread: " + t);
		t.setName("CurrentThread");
		System.out.println("Current Thread: " + t);

		try{
			for(int i = 0; i < 5; i++){
				Thread.sleep(1000);
				System.out.println(i);
			}
		}catch(InterruptedException ie){
			System.out.println("Main thread interrupted");
		}
	}
}