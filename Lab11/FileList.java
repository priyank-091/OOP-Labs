import java.io.*;
import java.util.*;

class FileList {
	
	public static void main(String[] args){
		//File dir = new File("D:\\COURSES\\CS F213\\Labs");//both works.
		File dir = new File("D:/COURSES/CS F213/Labs");
		String[] files = dir.list();
		for(int i =0; i < files.length; i++){
			File f = new File(dir,files[i]);
			if(f.isDirectory()){
				System.out.println(f.getName() + " is a directory.");
			}else{
				System.out.println(f.getName() + " is a file.");
			}
		}

	}
}