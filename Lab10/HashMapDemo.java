import java.util.*;

class HashMapDemo {

	public static void main(String[] args){

		HashMap<Integer,String> map = new HashMap<>();
		map.put(1,"Amit");
		map.put(5,"Rahul");
		map.put(2,"Jai");
		map.put(6,"Amit");

		Set<Map.Entry<Integer,String>> set = map.entrySet();
		Iterator<Map.Entry<Integer,String>> itr = set.iterator();
		while(itr.hasNext())
		{
			//Converting to Map.Entry so that we can get key and value separately
			Map.Entry<Integer,String> entry = (Map.Entry)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		String s = (String)map.get(5);
		System.out.println(s);
		System.out.println(map);
	}
}