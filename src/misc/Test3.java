package misc;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a string with duplicate word");
		String s = sc.nextLine();
		String[] item = s.split(" ");
		Map<String,Integer> m=new HashMap<String,Integer>();

		for(String s1:item){
			if(m.containsKey(s1)){
				m.put(s1, m.get(s1)+1);
			}
			else{
				m.put(s1, 1);
			}			
		}
		Set<Entry<String, Integer>> entrySet = m.entrySet();
		for(Entry e:entrySet){
			if((int)e.getValue()>1){
				System.out.println(e.getKey()+" "+e.getValue()+" times");
			}
		}

	}

}


