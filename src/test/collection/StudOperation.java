package test.collection;

import java.util.*;



public class StudOperation
{
	static Scanner sc =new Scanner(System.in);
	 
   static void UpdateFirstName(List<Stud1> l)
   {
	  
	   if(!l.isEmpty())
	   {
		   display(l);
		  
		   System.out.print("Enter the First Name which u want to update: ");
		   //sc.next();
		   String newName=sc.nextLine();
		   for(int i = 0 ; i < l.size(); i++)
			{
				Stud1 s = l.get(i);
				if(s.getfName().contains(newName))
				{
					System.out.print("Enter the new Name =");
					String s1=sc.next();
					s.setfName(s1);
					System.out.println("Name Updated!!");
					display(l);
					return;
				}
				
			}
		   System.out.println("Name not found !!");
		
		   
	   }
	   
	
   }
   
   static void UpdateSecondName(List<Stud1> l)
   {
	   if(!l.isEmpty())
	   {
		   display(l);
		  
		   System.out.print("Enter the Last Name which u want to update: ");
		  
		   String newName=sc.nextLine();
		   for(int i = 0 ; i < l.size(); i++)
			{
				Stud1 s = l.get(i);
				if(s.getfName().contains(newName))
				{
					System.out.print("Enter the new last Name =");
					String s1=sc.next();
					s.setsName(s1);
					System.out.println("Name Updated!!");
					display(l);
					return;
				}
				
			}
		   System.out.println("Name not found !!");
		
		   
	   }
	  
   }
   
   static void UpdateMobName(List<Stud1> l)
   {
	   if(!l.isEmpty())
	   {
		   display(l);
		  
		   System.out.print("Enter the name which for which u want to update mob  no: ");
		  
		   String newName=sc.nextLine();
		   
		   for(int i = 0 ; i < l.size(); i++)
			{
				Stud1 s = l.get(i);
				if(s.getfName().contains(newName))
				{
					System.out.print("Enter the new mob no =");
					long s1=sc.nextLong();
					s.setmNo(s1);
					System.out.println("Name Updated!!");
					display(l);
					return;
				}
				
			}
		   System.out.println("Name not found !!");
		
		   
	   }  
   }
   
   static void UpdateAddrName(List<Stud1> l)
   {
	   if(!l.isEmpty())
	   {
		   display(l);
		  
		   System.out.print("Enter the Name for which u want to change address: ");
		  
		   String newName=sc.nextLine();
		   for(int i = 0 ; i < l.size(); i++)
			{
				Stud1 s = l.get(i);
				if(s.getfName().contains(newName))
				{
					System.out.print("Enter the new address =");
					String s1=sc.next();
					s.setAddr(s1);
					System.out.println("Name Updated!!");
					display(l);
					return;
				}
				
			}
		   System.out.println("Name not found !!");
		
		   
	   }
   }
   
   
   static void display(List<Stud1> l)
   {
	   System.out.println("-----------------------------------------------------------------------------------------------");
	   System.out.println("First_NAME\t\tLAST_Name\t\tMobNo\t\t\tAddress");
	   System.out.println("--------------------------------------------------------------------------------------------------");
	   for(Object obj: l)
    	{
  		   System.out.println(obj.toString());	
  	    }
   }
}
