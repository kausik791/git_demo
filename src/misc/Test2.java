package misc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		Map<Integer,String> m= new HashMap<Integer,String>();
		m.put(1,"babu");
		m.put(5,"kumar");
		m.put(3,"rahul");
		m.put(4,"sumit");
		System.out.println(m);
		Set<Entry<Integer, String>> s = m.entrySet();
		Iterator<Entry<Integer, String>> itr=s.iterator();
		while(itr.hasNext()){
			Entry<Integer, String> next = itr.next();
			System.out.println(next.getKey()+" "+next.getValue());
		}
		
		}
	
		}
			
		
	

	



