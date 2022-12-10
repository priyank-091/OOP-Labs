import java.util.*;
import java.io.*;


class DatastreamDemo {

	public static void main(String[] args){
		try{
			FileOutputStream fos = new FileOutputStream("data2.txt");
			DataOutputStream dos = new DataOutputStream(fos);

			int x = 1000;
			double d = 69.69;
			boolean b = false;

			dos.writeInt(1000);
			dos.writeDouble(69.69);
			dos.writeBoolean(false);
		}catch(FileNotFoundException e){
			System.out.println("Connot open output file");
			return;
		}catch(IOException e){
			System.out.println("IO ERROR " + e);
		}
		try{
			DataInputStream dis = new DataInputStream(new FileInputStream("data2.txt"));

			int x = dis.readInt();
			double d = dis.readDouble();
			boolean b = dis.readBoolean();

			System.out.println("x = " + x + " d = " + d + " b = " + b);
		}catch(FileNotFoundException e){
			System.out.println("Connot open output file");
			return;
		}catch(IOException e){
			System.out.println("IO ERROR " + e);
		}

	}

}