package foobar;

import java.util.Scanner;

public class vnums {
//	static int k=0;
	static void convert(int a)
	{	//convert to int array
		int k=0;
		int[] arr=new int[10000000];
		while(a>10)
		{
			arr[k++]=a%10;
			a=a/10;
		}
		arr[k++]=a;
//		for(int i=0;i<k;i++)
//		{
//			System.out.print(arr[i]+" ");
//		}
		int i=0;
		while(i<k)
		{
			if(arr[i]==1)
			{
				i+=1;
			}
			if(arr[i]==1 && arr[i+1]==4)
			{
				i+=2;
			}
			if(arr[i]==1 && arr[i+1]==4 && arr[i+2]==4)
			{
				i+=3;
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			int t=s.nextInt();
			for(int i=0;i<t;i++)
			{
				int x=s.nextInt();
				convert(x);
			}
	}

}
