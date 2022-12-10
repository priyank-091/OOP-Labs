import java.util.*;

class ReverseArray {
	public static void main(String[] args){
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i =0; i < 10; i++){
			arr.add(i);
		}
		System.out.println(arr);
		int start = 0;
		int end = arr.size()-1;
		while(start<end){
			int temp = arr.get(start);
			arr.set(start, arr.get(end));
			arr.set(end,temp);
			start++;
			end--;
		}
		System.out.println(arr);
		Collections.reverse(arr);
		System.out.println(arr);
		
	}

}