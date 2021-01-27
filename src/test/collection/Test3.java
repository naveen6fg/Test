package test.collection;

import java.util.*;

public class Test3
{
   public static void main(String[] args)
   {
	   Set<Employee1> l =new LinkedHashSet<Employee1>();	
	   
	   double hike1=0.2;
	   double hike2=0.15;
	   
	   l.add(new Employee1("Rajan",13,21000));
	   l.add(new Employee1("Manju",7,54000));
	   l.add(new Employee1("sawan",10,9000));
	   l.add(new Employee1("Pankaj",8,12000));
	   l.add(new Employee1("Deepak",14,30000));
	   l.add(new Employee1("sanay",9,14000));
	   
	   Iterator<Employee1> itr=l.iterator();
	   
	   
	   
	   System.out.println("Before increment salary");
	   System.out.println("---------------------------------------------------------");
	   System.out.println("NAME\t\tYEARExp\t\tSALARY");
	   System.out.println("----------------------------------------------------------");
	   while (itr.hasNext()) 
	   {
		Employee1 emp =  itr.next();
		
		//if(emp.getExpYrs()>10 && emp.getExpYrs()<15)
		//{
			
			
			System.out.println(emp);	
		//}
		
		
	  }
	   
	   itr=l.iterator();
	   System.out.println();
	   System.out.println("After 20% increment in salary whose experience b/w 10 to 15");
	   System.out.println("---------------------------------------------------------");
	   System.out.println("NAME\t\tYEARExp\t\tSALARY");
	   System.out.println("---------------------------------------------------------");
	   
	   while (itr.hasNext()) 
	   {
		   Employee1 emp = (Employee1) itr.next();
		   
		   if(emp.getExpYrs()>10 && emp.getExpYrs()<15)
		   {
			   emp.setSal(hike1*emp.getSal()+(emp.getSal()));
			   
			   System.out.println(emp);	
		   }
		   
		   
	   }
	   
	   itr=l.iterator();
	   System.out.println();
	   System.out.println("After 15% increment in salary whose experience b/w 5 to 10");
	   System.out.println("---------------------------------------------------------");
	   System.out.println("NAME\t\tYEARExp\t\tSALARY");
	   System.out.println("---------------------------------------------------------");
	   
	   while (itr.hasNext()) 
	   {
		   Employee1 emp = (Employee1) itr.next();
		   
		   if(emp.getExpYrs()>5 && emp.getExpYrs()<10)
		   {
			   emp.setSal(hike1*emp.getSal()+(emp.getSal()));
			   
			   System.out.println(emp);	
		   }
		   
		   
	   }
	   
	   
	   
	   
   }
}
