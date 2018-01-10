package codeforces;

import java.util.Scanner;

public class cardgame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			int k=s.nextInt();
			int[] arr=new int[n];
			int count=0;
			for(int i=0;i<n;i++)
			{
				arr[i]=s.nextInt();
				
			}
			for(int x=0;x<=n-1;x++)
			{
				for(int y=0;y<=n-x-1;y++)
				{
					long mx=1;
					for(int j=x;j<n-y;j++)
					{
//						System.out.print(" *"+arr[j]+"* ");
						mx=mx*arr[j];
//						System.out.print(mx+" ");
					}
//					System.out.println();
//					System.out.println(mx);
					if(mx!=0)
					{
						if(mx%k==0)
						{
							count++;
						}
					}
				}
			}
			System.out.print(count);
	}

}
