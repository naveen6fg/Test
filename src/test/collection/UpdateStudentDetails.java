package test.collection;

import java.util.*;


public class UpdateStudentDetails
{
   //  static List<Stud> l = null;

	public static void main(String[] args)
    {
		List<Stud1> l = new LinkedList<Stud1>(); 
    	l.add(new Stud1("Naveen   ","Kumar   ", 965028677, "Kalyan nagar"));
    	l.add(new Stud1("YashPal  ","Vashnav " , 875028677,"Turkpati    ")); 
    	l.add(new Stud1("Ratnesh  ","Tiwari  ", 995643345, "Rajaji Nagar"));
    	l.add(new Stud1("pankaj   ","kushwaha", 757844534, "Kamanhalli  "));
    	l.add(new Stud1("Deepesh  ","Kulkarni", 925028677, "Chelekare   "));
    	l.add(new Stud1("Raju     ","Rampal  ", 875623386, "Whitefield  "));
    	
    	/*for(Object obj: l)
    	{
    		System.out.println(obj.toString());	
    	}*/
    	
    	while(true)
    	{
    		
	    	
		   Scanner sc =new Scanner(System.in);
		   System.out.println("|-------------------------|");
		   System.out.println("|   1.Update First Name   |");
		   System.out.println("|   2.Update Second Name  |");
		   System.out.println("|   3.Update Mob No       |");
		   System.out.println("|   4.Update address      |");
		   System.out.println("|   5.Exit                |");
		   System.out.println("|-------------------------|");
		   
		   System.out.println("Enter ur choice which u want to update:");
		   int ch=sc.nextInt();
		   
		   //Object creationN
		   
		   StudOperation std = new StudOperation();
		   
		   switch(ch)
		   {
		      case 1: std.UpdateFirstName(l);
		              break;
		      case 2: std.UpdateSecondName(l);
		              break;
		      case 3: std.UpdateMobName(l);
		              break;
		      case 4: std.UpdateAddrName(l);
		              break;
		      default: System.exit(0);
		               
		   }
	   
    	}
	}
}
