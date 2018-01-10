package codechef;

import java.util.Scanner;

public class d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int q=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<q;i++)
		{
			int l=s.nextInt();
			if(l==1)
			{
				int x=s.nextInt();
				int y=s.nextInt();
				int max=0;

					for(int j=x-1;j<=y-1;j++)
					{
						for(int k=x-1;k<=y-1;k++)
						{
							int e=(arr[j]-arr[k]);
							if(e>max)
							{
								max=e;
							}
						}
					}

				System.out.println(max);
			}
			else if(l==2)
			{
				int x=s.nextInt();
				int y=s.nextInt();
				arr[x-1]=y;
			}
		}
	}

}
