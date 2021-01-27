package test.collection;

import java.util.*;

public class Test2
{
    public static void main(String[] args)
    {
	   List<Employee> l =new ArrayList<Employee>();	
	   
	   l.add(new Employee("Rajan",45800));
	   l.add(new Employee("Manju",75800));
	   l.add(new Employee("sawan",35800));
	   l.add(new Employee("Pankaj",98300));
	   l.add(new Employee("Deepak",22030));
	   l.add(new Employee("sanay",49800));
	   
	   Collections.sort(l,new Employee());
	   
	   
	   System.out.println("Employee salary in decending order");
	   System.out.println("--------------------------------------");
	   System.out.println("Name\t\tSalary");
	   System.out.println("--------------------------------------");
	   for(Object obj: l)
	   {
		   System.out.println(obj);
	   }
	}
}
