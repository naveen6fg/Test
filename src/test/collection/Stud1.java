package test.collection;

public class Stud1
{
    String fName;
    String sName;
    long  mNo;
    String addr;
	public Stud1(String fName, String sName, long mNo, String addr)
	{
	
		this.fName = fName;
		this.sName = sName;
		this.mNo = mNo;
		this.addr = addr;
	}
	
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public long getmNo() {
		return mNo;
	}
	public void setmNo(long mNo) {
		this.mNo = mNo;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String toString()
	{
		return fName+"\t\t"+sName+"\t\t"+mNo+"\t\t"+addr;
	}
	
	
	
}
