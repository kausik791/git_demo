package misc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Map<Integer,String> m= new HashMap<Integer,String>();
		m.put(1,"babu");
		m.put(5,"kumar");
		m.put(3,"rahul");
		m.put(4,"sumit");
		System.out.println(m);
		Map.Entry e;
		Set s=m.entrySet();
		Iterator itr=s.iterator();
		
		while(itr.hasNext()){
			e=(Entry) itr.next();
			System.out.print(e.getKey());
			System.out.println(" "+e.getValue());
		}
	
		}
			
		}
	

	



