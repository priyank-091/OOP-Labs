import java.io.*;
import java.util.*;


class FileReadWrite {
	public static void main(String[] args){
		try{
			File newFile = new File("testfile.txt");
			if(newFile.createNewFile()){
				System.out.println("New file created");
			}else{
				System.out.println("File already exists");
			}
		}catch(IOException e){
			System.out.println("Exception " + e);
		}

		FileInputStream fis;
		FileOutputStream fos;

		try{
			fis = new FileInputStream("data.txt");
			fos = new FileOutputStream("testfile.txt");
		}catch(IOException e){
			System.out.println("Exception " + e);
			//e.printStackTree();
			return;
		}
		try{
			int i;
			while(fis.read() != -1){
				i = fis.read();
				fos.write((char)i);
			}
		}catch(IOException e){
			System.out.println("Exception " + e);
		}
		try{
			if(fis != null)
				fis.close();
			if(fos != null)
				fos.close();
		}catch(IOException e){
			System.out.println("Error in closing file");
			System.out.println("Exception " + e);
		}
	}
}