package codeforces;

import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			long n=s.nextLong();
			long k=s.nextLong();
			long j=0;
			for(long i=n/2;i>=0;i--)
			{
				if(i%(k+1)==0)
				{
					j=i/(k+1);
					break;
				}
			}
			System.out.print(j+" "+(k*j)+" "+(n-((k+1)*j)));
	}

}
