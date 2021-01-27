package test.collection;

import java.util.Comparator;

public class Student implements  Comparator<Student>
{
   int id;
   String name;
public Student(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

public Student()
{
	
}
@Override
public int compare(Student o1, Student o2)
{
 if(o1.name==o2.name)
 {
	 return  ((Integer)o2.id).compareTo(o1.id);
 }
 else
 {
    return  o1.name.compareTo(o2.name);	
 }
	
}



public String toString()
{
 return id+"\t\t"+name;	
}
}