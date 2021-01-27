package test.collection;

import java.util.*;
import java.util.Map.Entry;


public class Test6
{
    public static void main(String[] args)
    {
    	Scanner sc =new Scanner(System.in);
    	
		Map<Character, Integer> m= new LinkedHashMap<Character, Integer>();
		
		System.out.println("Enter the string to find their frequency");
		String s =sc.next();
 	   
 	   char[] c =s.toCharArray();
 	 	 
 		  for(int i=0;i<c.length;i++)
 		  {
 			  
 			     if(m.containsKey(c[i]))
 			     {
 		     	   m.put(c[i],(m.get(c[i])+1));
 			     }
 			     else
 			     {
 			    	 m.put(s.charAt(i), 1);
 		     	  }
 		     	 
 		     	  
 		  }
		
		
		System.out.println("String and their letter occurance ");
		System.out.println("------------------------------------------");
		Set<Entry<Character,Integer>> p= m.entrySet();
		Iterator<Entry<Character,Integer>> itr=p.iterator();
		while (itr.hasNext())
		{
			Entry<Character, Integer> e= itr.next();
			System.out.println(e.getKey()+"\t\t"+e.getValue());
		}
		
		
	}
}
