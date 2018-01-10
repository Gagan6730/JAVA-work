package refresher;
class student
{
	String name,bname;
	int age,rno;
	static int lrno=0;
	student()
	{
		name="";
		bname="";
		age=-1;
		rno=-1;
		lrno++;
	}
	student(String name, int age, int roll, String branch)
	{
		this.name=name;
		this.age=age;
		this.rno=roll;
		this.bname=branch;
		lrno++;

	}
	public String getname() {
		return this.name;
	}

	public void setname(String name) {
		this.name=name;
	}

	public String getbranch() {
		return this.bname;
	}

	public void setbranch(String branch) {
		this.bname=branch;
	}

	public int getage() {
		return this.age;
	}

	public void setage(int age) {
		this.age=age;
	}

	public int getroll() {
		return this.rno;
	}

	public void setroll(int roll) {
		this.rno=roll;
	}

	public int getlatestroll() {
		return lrno;
	}
	public String toString()
	{
		return "Name: "+ this.name + ", Age: "+ this.age + ", Roll Number: " + this.rno + ", Branch: "+ this.bname ;
	}
}
public class lab2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner s=new Scanner(System.in);
		boolean c='A'>'B';
		System.out.println(c);
	}

}
