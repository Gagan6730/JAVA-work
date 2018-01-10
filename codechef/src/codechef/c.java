package codechef;

import java.util.Scanner;

public class c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=s.nextInt();
			}
			int q=s.nextInt();
			int index=-1;
			int[] a=new int[10000000];
			int c=0;
				for(int j=0;j<n;j++)
					{
						int count=0;
						int temp=arr[j];
						while(temp%10==0)
						{
							count++;
							temp=temp/10;
							c++;
						}
						for(int u=0;u<count;u++)
						{
							a[++index]=j;
						}
					}
//				System.out.println(c);
//				for(int i=0;i<=index;i++)
//				{
//					System.out.print(a[i]+" ");
//				}
//				System.out.println();
			for(int i=0;i<q;i++)
			{
				int x=s.nextInt();
				
					if(x==1)
						{
							int k=s.nextInt();
							if(k>c)
								System.out.println("-1");
							else
							{
								System.out.println(a[k-1]);
							}
						}
					else if(x==0)
					{
						int in=s.nextInt();
						int v=s.nextInt();
						arr[in]=v;
						index=-1;
						c=0;
						for(int j=0;j<n;j++)
						{
							int count=0;
							int temp=arr[j];
							while(temp%10==0)
							{
								count++;
								temp=temp/10;
								c++;
							}
							for(int u=0;u<count;u++)
							{
								a[++index]=j;
							}
						}
//						for(int o=0;o<=index;o++)
//						{
//							System.out.print(a[o]+" ");
//						}
//						System.out.println();
					}
			}
	}

}
