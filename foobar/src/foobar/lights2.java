package foobar;

import java.util.Scanner;

public class lights2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			int t=s.nextInt();
			for(int i=0;i<t;i++)
			{
				int n=s.nextInt();
				int x=s.nextInt();
				char[] arr=new char[n];
				for(int j=0;j<n;j++)
				{
					arr[j]=s.next().charAt(0);
				}
				if(x==0)
				{
					for(int j=0;j<n;j++)
					{
						System.out.print(arr[i]);
					}
					continue;
				}
				char[] a=new char[n];
				for(int j=1;j<=x;j++)
				{
					for(int k=0;k<n;k++)
					{
						if(k==0)
						{
							if(arr[k+1]=='G')
							{
								a[k]='G';
							}
							else
							{
								a[k]='O';
							}
						}
						else if(k==n-1)
						{
							if(arr[k-1]=='G')
							{
								a[k]='G';
							}
							else
							{
								a[k]='O';
							}
						}
						else
						{
							if(arr[k+1]=='G' && arr[k-1]=='G')
							{
								a[k]='G';
							}
							else
							{
								a[k]='O';
							}
						}
					}
					for(int k=0;k<n;k++)
					{
						arr[k]=a[k];
					}
				}
				for(int j=0;j<n;j++)
				{
					System.out.print(a[j]);
				}
				System.out.println();
			}
			
	}

}
