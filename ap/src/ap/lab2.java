//GAGANDEEP SINGH
//2016037
package ap;
import java.util.Scanner;
class mess
{
	private double favail,fnutri,hygiene,fdel;
	private int index;

	public mess(double favail, double fnutri, double hygiene, double fdel,int i) {
//		super();
		this.favail = favail;
		this.fnutri = fnutri;
		this.hygiene = hygiene;
		this.fdel = fdel;
		this.index=i;
	}
	public mess() {
//		super();
		this.favail =-1;
		this.fnutri = -1;
		this.hygiene =-1;
		this.fdel =-1;
		this.index=-1;
	}
	public double getFavail() {
		return favail;
	}
	public void setFavail(double favail) {
		this.favail = favail;
	}
	public double getFnutri() {
		return fnutri;
	}
	public void setFnutri(double fnutri) {
		this.fnutri = fnutri;
	}
	public double getHygiene() {
		return hygiene;
	}
	public void setHygiene(double hygiene) {
		this.hygiene = hygiene;
	}
	public double getFdel() {
		return fdel;
	}
	public void setFdel(double fdel) {
		this.fdel = fdel;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}

	
}
class hostel
{
	private double room_cond,studf,clean,refac;
	private int index;

	public hostel(double room_cond, double studf, double clean, double refac,int i) {
		this.room_cond = room_cond;
		this.studf = studf;
		this.clean = clean;
		this.refac = refac;
		this.index=i;
	}
	public hostel() {
		this.room_cond =-1;
		this.studf = -1;
		this.clean =-1;
		this.refac = -1;
		this.index=-1;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public double getRoom_cond() {
		return room_cond;
	}
	public void setRoom_cond(int room_cond) {
		this.room_cond = room_cond;
	}
	public double getStudf() {
		return studf;
	}
	public void setStudf(int studf) {
		this.studf = studf;
	}
	public double getClean() {
		return clean;
	}
	public void setClean(int clean) {
		this.clean = clean;
	}
	public double getRefac() {
		return refac;
	}
	public void setRefac(int refac) {
		this.refac = refac;
	}
	
}
class library
{
	private double avail,digfac,syseff;
	private int index;
	public library(double avail, double digfac, double syseff,int i) {

		this.avail = avail;
		this.digfac = digfac;
		this.syseff = syseff;
		this.index=i;
	}

	public library() {
		this.avail =-1;
		this.digfac =-1;
		this.syseff =-1;
		this.index=-1;
	}

	public double getAvail() {
		return avail;
	}

	public void setAvail(double avail) {
		this.avail = avail;
	}

	public double getDigfac() {
		return digfac;
	}

	public void setDigfac(double digfac) {
		this.digfac = digfac;
	}

	public double getSyseff() {
		return syseff;
	}

	public void setSyseff(double syseff) {
		this.syseff = syseff;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

}
class academics
{
	private double know,domcov,cseff;
	private int index;

	public academics(double know, double domcov, double cseff,int i) {
		super();
		this.know = know;
		this.domcov = domcov;
		this.cseff = cseff;
		this.index=i;
	}
	public academics() {
		super();
		this.know = -1;
		this.domcov =-1;
		this.cseff =-1;
		this.index=-1;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public double getKnow() {
		return know;
	}
	public void setKnow(int know) {
		this.know = know;
	}
	public double getDomcov() {
		return domcov;
	}
	public void setDomcov(int domcov) {
		this.domcov = domcov;
	}
	public double getCseff() {
		return cseff;
	}
	public void setCseff(int cseff) {
		this.cseff = cseff;
	}
}
class college
{
	private int fees;
	private char naac;
	private String name;
	private int index;
	
	private mess m;
	private hostel h;
	private library l;
	private academics a;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public char getNaac() {
		return naac;
	}
	public void setNaac(char naac) {
		this.naac = naac;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public college() {
		super();
		this.fees =-1;
		this.naac =' ';
		this.m=new mess();
		this.h=new hostel();
		this.l=new library();
		this.a=new academics();
		this.index=-1;
	}
	public college(int fees, char naac, String name, mess m, hostel h, library l, academics a,int i) {
		super();
		this.fees = fees;
		this.naac = naac;
		this.name = name;
		this.m=m;
		this.h=h;
		this.l=l;
		this.a=a;
		this.index=i;
	}
	void print()
	{
		System.out.println(name);
		System.out.println("Mess "+m.getFavail()+" "+m.getFnutri()+" "+m.getHygiene()+" "+m.getFdel());
		System.out.println("Hostel "+h.getRoom_cond()+" "+h.getStudf()+" "+h.getClean()+" "+h.getRefac());;
		System.out.println("Library "+l.getAvail()+" "+l.getDigfac()+" "+l.getSyseff());
		System.out.println("Academics "+a.getKnow()+" "+a.getDomcov()+" "+a.getCseff());
		System.out.println(fees);
		System.out.println(naac);
		
	}
}
class sums
{
	private double sum;
	private int index;
	public sums(int index)
	{
		super();
		this.index = index;
		this.sum=0;
	}
	public sums(int index,double sum)
	{
		super();
		this.index = index;
		this.sum=sum;
	}
	public double getSum() {
		return sum;
	}
	public void setSum(double d) {
		this.sum = d;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	
}
public class lab2 {
	private static Scanner s;
	public static mess[] sortmess(mess m[],int t)
	{
		for(int i=0;i<t-1;i++)
		{
			for(int j=0;j<t-i-1;j++)
			{
				if(m[j].getFavail()<m[j+1].getFavail())
				{
					mess temp=m[j];
					m[j]=m[j+1];
					m[j+1]=temp;
				}
				else if(m[j].getFavail()==m[j+1].getFavail())
				{
					if(m[j].getFnutri()<m[j+1].getFnutri())
					{
						mess temp=m[j];
						m[j]=m[j+1];
						m[j+1]=temp;
					}
					else if(m[j].getFnutri()==m[j+1].getFnutri())
					{
						if(m[j].getHygiene()<m[j+1].getHygiene())
						{
							mess temp=m[j];
							m[j]=m[j+1];
							m[j+1]=temp;
						}
						else if(m[j].getHygiene()==m[j+1].getHygiene())
						{
							if(m[j].getFdel()>m[j+1].getFdel())
							{
								mess temp=m[j];
								m[j]=m[j+1];
								m[j+1]=temp;
							}
						}
					}
				}
			}
		}
		return m;
	}
	public static hostel[] sorthostel(hostel h[],int t)
	{
		for(int i=0;i<t-1;i++)
		{
			for(int j=0;j<t-i-1;j++)
			{
				if(h[j].getRoom_cond()<h[j+1].getRoom_cond())
				{
					hostel temp=h[j];
					h[j]=h[j+1];
					h[j+1]=temp;
				}
				else if(h[j].getRoom_cond()==h[j+1].getRoom_cond())
				{
					if(h[j].getClean()<h[j+1].getClean())
					{
						hostel temp=h[j];
						h[j]=h[j+1];
						h[j+1]=temp;
					}
					else if(h[j].getClean()==h[j+1].getClean())
					{
						if(h[j].getRefac()<h[j+1].getRefac())
						{
							hostel temp=h[j];
							h[j]=h[j+1];
							h[j+1]=temp;
						}
					}
				}
			}
		}
		return h;
	}
	public static library[] sortlib(library l[],int t)
	{
		for(int i=0;i<t-1;i++)
		{
			for(int j=0;j<t-i-1;j++)
			{
				double a1=(l[j].getAvail()+l[j].getDigfac()+l[j].getSyseff())/3;
				double a2=(l[j+1].getAvail()+l[j+1].getDigfac()+l[j+1].getSyseff())/3;
				if(a1<a2)
				{
					library temp=l[j];
					l[j]=l[j+1];
					l[j+1]=temp;
				}
			}
		}
		return l;
	}
	public static academics[] sortacad(academics a[],int t)
	{
		for(int i=0;i<t-1;i++)
		{
			for(int j=0;j<t-i-1;j++)
			{
				double x1=a[j].getKnow()+a[j].getDomcov()+2*a[j].getCseff();
				double x2=a[j+1].getKnow()+a[j+1].getDomcov()+2*a[j+1].getCseff();
				if(x1<x2)
				{
					academics temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a;
	}

	public static void main(String[] args) {
		s = new Scanner(System.in);
			int t=s.nextInt();
			college[] c=new college[t];
			mess[] m=new mess[t];
			hostel[] h=new hostel[t];
			library[] l=new library[t];
			academics[] a=new academics[t];
			for(int i=0;i<t;i++)
			{
				String name=s.next();
//				System.out.print("Mess ");
				double m1=s.nextDouble();
				double m2=s.nextDouble();
				double m3=s.nextDouble();
				double m4=s.nextDouble();
				m[i]=new mess(m1,m2,m3,m4,i);
				System.out.println();
//				System.out.print("Hostel ");
				double h1=s.nextDouble();
				double h2=s.nextDouble();
				double h3=s.nextDouble();
				double h4=s.nextDouble();
				h[i]=new hostel(h1,h2,h3,h4,i);
				System.out.println();
//				System.out.print("Library ");
				double l1=s.nextDouble();
				double l2=s.nextDouble();
				double l3=s.nextDouble();
				l[i]=new library(l1,l2,l3,i);
				System.out.println();
//				System.out.print("Academics ");
				double a1=s.nextDouble();
				double a2=s.nextDouble();
				double a3=s.nextDouble();
				a[i]=new academics(a1,a2,a3,i);
				System.out.println();
				int fees=s.nextInt();
				char naac=s.next().charAt(0);
				c[i]=new college(fees,naac,name,m[i],h[i],l[i],a[i],i);
			}
			sums[] arr=new sums[t];
			m=sortmess(m,t);
			h=sorthostel(h,t);
			a=sortacad(a,t);
			l=sortlib(l,t);
			for(int i=0;i<t;i++)
			{
//				c[i].print();
				arr[i]=new sums(i);
				for(int j=0;j<t;j++)
				{
					if(m[j].getIndex()==i)
					{
						arr[i].setSum(arr[i].getSum()+((j+1)*0.25));
						break;
					}
				}
			}
			for(int i=0;i<t;i++)
			{
//				c[i].print();
				arr[i]=new sums(i,arr[i].getSum());
				for(int j=0;j<t;j++)
				{
					if(h[j].getIndex()==i)
					{
						arr[i].setSum(arr[i].getSum()+((j+1)*0.20));
						break;
					}
				}
			}
			for(int i=0;i<t;i++)
			{
//				c[i].print();
				arr[i]=new sums(i,arr[i].getSum());
				for(int j=0;j<t;j++)
				{
					if(l[j].getIndex()==i)
					{
						arr[i].setSum(arr[i].getSum()+((j+1)*0.25));
						break;
					}
				}
			}
			for(int i=0;i<t;i++)
			{
//				c[i].print();
				arr[i]=new sums(i,arr[i].getSum());
				for(int j=0;j<t;j++)
				{
					if(a[j].getIndex()==i)
					{
						arr[i].setSum(arr[i].getSum()+((j+1)*0.30));
						break;
					}
				}
			}
			for(int i=0;i<t-1;i++)
			{
				for(int j=0;j<t-i-1;j++)
				{
					if(arr[j].getSum()>arr[j+1].getSum())
					{
						sums temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
					else if(arr[j].getSum()==arr[j+1].getSum())
					{
						if(c[j].getFees()>c[j+1].getFees())
						{
							sums temp=arr[j];
							arr[j]=arr[j+1];
							arr[j+1]=temp;
						}
						else if(c[j].getFees()==c[j+1].getFees())
						{
							if(c[j].getNaac()>c[j+1].getNaac())
							{
								sums temp=arr[j];
								arr[j]=arr[j+1];
								arr[j+1]=temp;
							}
						}
					}
				}
			}
			for(int i=0;i<t;i++)
			{
				System.out.println(c[arr[i].getIndex()].getName());
//				System.out.println(+" "+arr[i].getSum());
				
			}
	}

}
