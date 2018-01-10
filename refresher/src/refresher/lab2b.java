package refresher;

import java.util.Scanner;

class ACMdigitallibrary
{
	String aname,ptitle,venue;
	int year;
	ACMdigitallibrary()
	{
		aname="";
		ptitle="";
		venue="";
		year=-1;
	}
	public String getname()
	{
		return aname;
	}
	public void setname(String name)
	{
		this.aname=name;
	}
	public String gettitle()
	{
		return ptitle;
	}
	public void settitle(String title)
	{
		this.ptitle=title;
	}
	
	public String getvenue()
	{
		return venue;
	}
	public void setvenue(String venue)
	{
		this.venue=venue;
	}
	
	public int getyear()
	{
		return year;
	}
	public void setyear(int year)
	{
		this.year=year;
	}
	
}
public class lab2b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		ACMdigitallibrary[] a=new ACMdigitallibrary[10];
		String[] stu={"Gagan", "Vyshakh", "Meet", "Suraj", "Aakash"};
		String[] str={"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
		String[] venue={"OOPSLA", "PLDI", "SC", "ICPP", "EuroPar"};
		int index=0;
		for(int i=0;i<10;i++) {
			a[i]=new ACMdigitallibrary();
			a[i].setname(stu[index]);
			a[i].setyear(i+2000);
			a[i].settitle(str[i]);
			a[i].setvenue(venue[index]);
			if(i%2!=0 && i>0)
				index++;
			// System.out.println(a[i].toString());
		}
	
		System.out.println("MENU");
		System.out.println("1. List papers based on venue");
		System.out.println("2. List papers based on author name");
		System.out.println("3. List papers based on year");
		System.out.println("4. Exit");
		int f=1;
		while(f==1)
		{
//			System.out.print("Select Option number: ");
			int n=s.nextInt();
			if(n==1)
			{
				System.out.print("Enter venue:");
				String ven=s.nextLine();
				for(int i=0;i<10;i++) {
					if(a[i].getvenue().equals(ven)) {
						System.out.println(a[i].gettitle() +", "+ a[i].getname() +", "+ a[i].getyear());
					}
				}
			}
			else if(n==2) {
				System.out.print("Enter author name: ");
				String author=s.next();
				for(int i=0;i<10;i++) {
					if(a[i].getname().equals(author)) {
						System.out.println(a[i].gettitle() +", "+ a[i].getname() +", "+ a[i].getyear());
					}
				}
			}
			else if(n==3) {
				System.out.print("Enter year: ");
				int y=s.nextInt();
				for(int i=0;i<10;i++) {
					if(a[i].getyear()<y) {
						System.out.println(a[i].gettitle() +", "+ a[i].getname() +", "+ a[i].getyear());
					}
				}
			}
			else if(n==4) {
				f=0;
			}
			else{
				System.out.println("Wrong option");
			}
		}
	}

}
