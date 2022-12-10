import java.util.*;

class InvalidArgumentException extends Exception {

	int code;
	public InvalidArgumentException(){
		code = 333;
	}

	public String toString(){
		return "Exception: Code: 333: Invalid Argument Exception";
	}
}

class Demo {
	public static void main(String[] args){
		for(int i = 0; i < args.length; i++){
			try{
				if(args[i].equals("NO")){
					throw new InvalidArgumentException();
				}
				System.out.println("Argument " + args[i] + " is valid");
			}catch(InvalidArgumentException iae) {
				System.out.println(iae);
			}
		}
		System.out.println("Last in main");
	}
}