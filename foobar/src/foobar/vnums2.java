package foobar;

import java.util.Scanner;

public class vnums2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			int t=s.nextInt();
			for(int i=0;i<t;i++)
			{
				int x=s.nextInt();
				int prev=0;
				int cur=1;
				while(cur<x)
				{
					int temp=cur;
					cur=prev+cur;
					prev=temp;
				}
				if(prev==x || cur==x)
				{
					System.out.println("YES");
				}
				else
				{
					System.out.println("NO");
				}
			}
	}

}
