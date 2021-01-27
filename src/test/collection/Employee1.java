package test.collection;

public class Employee1
{
  String eName;
  int ExpYrs;
  double sal;

public String geteName() {
	return eName;
}

public void seteName(String eName) {
	this.eName = eName;
}

public int getExpYrs() {
	return ExpYrs;
}

public void setExpYrs(int expYrs) {
	this.ExpYrs = expYrs;
}

public double getSal() {
	return sal;
}

public void setSal(double sal)
{
	this.sal = sal;
}

public Employee1(String eName, int expYrs, double sal)
{
	super();
	this.eName = eName;
	ExpYrs = expYrs;
	this.sal = sal;
}

public String toString()
{
	return eName+"\t\t"+ExpYrs+"\t\t"+sal;
}

}
