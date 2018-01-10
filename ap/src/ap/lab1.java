//GAGANDEEP SINGH
//2016037
package ap;

import java.util.Scanner;

class insaan
{
	private String insaan_name;//name
	private String insaan_rno;//roll number
	private String insaan_course;//
	private int insaan_dist;//distance
	private int index;//storing the index for further use
	//constructor
	insaan(String iname,String icourse,String rno,int dist,int ind)
	{
		this.insaan_course=icourse;
		this.insaan_name=iname;
		this.insaan_dist=dist;
		this.insaan_rno=rno;
		this.index=ind;
	}
	//constructor2
	insaan()
	{
		this.insaan_course="";
		this.insaan_name="";
		this.insaan_dist=-1;
		this.insaan_rno="";
		this.index=-1;
	}
	public String getInsaan_name() {
		return insaan_name;
	}
	public void setInsaan_name(String insaan_name) {
		this.insaan_name = insaan_name;
	}
	public String getInsaan_rno() {
		return insaan_rno;
	}
	public void setInsaan_rno(String insaan_rno) {
		this.insaan_rno = insaan_rno;
	}
	public String getInsaan_course() {
		return insaan_course;
	}
	public void setInsaan_course(String insaan_course) {
		this.insaan_course = insaan_course;
	}
	public int getInsaan_dist() {
		return insaan_dist;
	}
	public void setInsaan_dist(int insaan_dist) {
		this.insaan_dist = insaan_dist;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	
	
}
public class lab1 {
	//sorting in terms of distance
		public static insaan[] sort(insaan[] insaans,int n)
		{
//			int min=insaans[0].getInsaan_dist();
//			int index=0;
			for(int i=0;i<n-1;i++)
			{
				for(int j=0;j<n-i-1;j++)
				{
					if(insaans[j].getInsaan_dist()<insaans[j+1].getInsaan_dist())
					{
						insaan temp=insaans[j];
						insaans[j]=insaans[j+1];
						insaans[j+1]=temp;
						
					}
					else if(insaans[j].getInsaan_dist()==insaans[j+1].getInsaan_dist())
					{
						if(insaans[j].getIndex()>insaans[j+1].getIndex())
						{
							insaan temp=insaans[j];
							insaans[j]=insaans[j+1];
							insaans[j+1]=temp;
						}
					}
				}
			}
			return insaans;
		}
		// sorting innterms of index
		public static insaan[] sort2(insaan[] insaans,int n)
		{
			for(int i=0;i<n-1;i++)
			{
				for(int j=0;j<n-i-1;j++)
				{
					if(insaans[j].getIndex()>insaans[j+1].getIndex())
					{
						insaan temp=insaans[j];
						insaans[j]=insaans[j+1];
						insaans[j+1]=temp;
						
					}
				}
			}
			return insaans;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			int m=s.nextInt();
			insaan[] insaans=new insaan[n];
			insaan[] phd=new insaan[n];
			insaan[] pg=new insaan[n];
			insaan[] ug=new insaan[n];
			insaan[] print=new insaan[m];
			for(int i=0;i<n;i++)
			{
				String name=s.next();
				String rno=s.next();
				String course=s.next();
				int dist=s.nextInt();
				insaans[i]=new insaan(name,course,rno,dist,i);
			}
			int cphd=0,cpg=0,cug=0;//counting the number of phd, pg ang ug students
			for(int i=0;i<n;i++)
			{
				//adding students to the arrays according to their course  
				if(insaans[i].getInsaan_course().equals("PhD"))
				{
					phd[cphd]=new insaan();
					phd[cphd]=insaans[i];
					cphd++;
				}
				else if(insaans[i].getInsaan_course().equals("PG"))
				{
					pg[cpg]=new insaan();
					pg[cpg]=insaans[i];
					cpg++;
				}
				else if(insaans[i].getInsaan_course().equals("UG"))
				{
					ug[cug]=new insaan();
					ug[cug]=insaans[i];
					cug++;
				}
				
				
			}
			phd=sort(phd,cphd);

			pg=sort(pg,cpg);

			ug=sort(ug,cug);
			int count=0;
			//students who get the hostel(phd)
			if(m%2==1)
			{
				if(cphd>=(m/2)+1)
				{
					for(int i=0;i<m/2+1;i++)
					{
						
						print[count]=new insaan();
						print[count++]=phd[i];
					}
				}
				else if(cphd<(m/2)+1)
				{
					for(int i=0;i<cphd;i++)
					{
						print[count]=new insaan();
						print[count++]=phd[i];
					}
				}
				
			}
			else
			{
				if(cphd>=(m/2))
				{
					for(int i=0;i<m/2;i++)
					{
						print[count]=new insaan();
						print[count++]=phd[i];
					}
				}
				else if(cphd<(m/2))
				{
					for(int i=0;i<cphd;i++)
					{
						print[count]=new insaan();
						print[count++]=phd[i];
					}
				}
			}
			//students who get the hostel(pg)
			if((m-count)>=cpg)
			{
				for(int i=0;i<cpg;i++)
				{
					print[count]=new insaan();
					print[count++]=pg[i];
				}
			}
			else
			{
				for(int i=0;i<m-count;i++)
				{
					print[count]=new insaan();
					print[count++]=pg[i];
				}
			}
			
			//students who get the hostel(ug)
			if(count<m)
			{
				for(int i=0;i<m-count;i++)
				{
					print[count]=new insaan();
					print[count++]=ug[i];
				}
			}
			print=sort2(print,count);//sorting according to whose name come first in the allotment list.
			for(int i=0;i<count;i++)
			{
				System.out.print(print[i].getInsaan_name()+" "+print[i].getInsaan_rno()+" "+print[i].getInsaan_course()+" "+print[i].getInsaan_dist());;
				System.out.println();
			}
			
	}

}
//7 4
//Madhur MT1454 PG 28 Shabad MT1754 PG 28 Rani 1454 PhD 28 Megha MT1554 PG 28
//Jay 2015054 UG 28 Seema MT1704 PG 28 Ajay 2015031 UG 28
