package test.collection;

import java.util.*;

public class Test5
{
    public static void main(String[] args)
    {
	    List<Student>	l=new ArrayList<Student>();
	    l.add(new Student(77,"Raju"));
	    l.add(new Student(33,"Pappu"));
	    l.add(new Student(45,"shyam"));
	    l.add(new Student(55,"Raju"));
	    l.add(new Student(88,"Lavanya"));
	    l.add(new Student(12,"Raju"));
	    l.add(new Student(100,"pankaj"));
	    
	    Collections.sort(l,new Student());
	    
	    
	    System.out.println("if name is same sorted in desending order by their id");
	    System.out.println("-------------------------------------------------------");
	    System.out.println("ID\t\tNAME");
	    System.out.println("---------------------------");
	    for(Object obj: l)
		   {
			   System.out.println(obj);
		   }
	    
	    
	}
}
