package foobar;

import java.util.ArrayList;
import java.util.Scanner;

public class shahblah {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int q=0;q<t;q++)
		{
			int n=s.nextInt();
			int x=s.nextInt();
			int y=s.nextInt();
			int z=s.nextInt();
//			ArrayList<Integer> sum=new ArrayList<Integer>();
			int max=0;
			for(int i=0;i<=n;i++)
			{
				for(int j=0;j<=n;j++)
				{
					for(int k=0;k<=n;k++)
					{
						int ans=(i*x)+(j*y)+(k*z);
						if(ans==n)
						{
							if(ans>max)
							{
								max=ans;
							}
						}
					}
				}
			}
			System.out.println(max);
		}

	}

}
