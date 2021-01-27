package test.collection;

import java.util.*;

public class Test1
{
   public static void main(String[] args)
   {
	  List<Integer> l=new LinkedList<Integer>();
	 
	  l.add(15);
	  l.add(56);
	  l.add(56);
	  l.add(74);
	  l.add(32);
	  l.add(23);
	  l.add(32);
	  Set<Integer> s=new LinkedHashSet<Integer>(l) ; 
	 // System.out.println(s);
	  
	  
	  
	  System.out.println("After removing duplicate object");
	  System.out.println("----------------------------------");
	  for(Object obj: s)
	  {
		  System.out.println(obj);
	  }
	  
	  
   }
}
