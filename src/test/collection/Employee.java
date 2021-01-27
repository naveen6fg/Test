package test.collection;

import java.util.Comparator;

public class Employee implements Comparator<Employee>
{
   String name;
   double sal;
   public String getName() {
	return name;
}
   public Employee()
   {
	   
   }


public Employee(String name, double sal) {
	super();
	this.name = name;
	this.sal = sal;
}
@Override
public int compare(Employee o1, Employee o2) {
	
	return  ((Double)o2.sal).compareTo(o1.sal);
}

public String toString()
{
	return name+ "\t\t" +sal;
}

}
