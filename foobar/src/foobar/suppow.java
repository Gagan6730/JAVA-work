package foobar;

import java.util.Scanner;

public class suppow {
	static long power(long a,long b)
	{
		if(b==0)
		{
			return 1;
		}
		long x=power(a,b/2);
		if(b%2==0)
		{
			return x*x;
		}
		else
		{
			return a*x*x;
		}
	}
	static int factors(int x)
	{
		int count=0;
		for(int i=1;i<=x;i++)
		{
			if(x%i==0)
			{
				count+=2;
			}
		}
		return count/2;
	}
	static void converttobinary(int a)
	{
		long p=power(2,10);
		int j=0;
		int[] arr=new int[1000000];
		int k=0;
		while(a>=2)
		{
			arr[k++]=a%2;
			a=a/2;
		}
		arr[k++]=a;
		long pow=0;
		for(int i=0;i<k;i++)
		{
//			System.out.print(arr[i]);
			pow+=arr[i]*power(10,i);
		}
		for(int i=0;i<k;i++)
		{
			if(arr[i]==1)
			{
				break;
			}
			j++;
		}
		pow=pow/power(10,j);
//		System.out.println();
//		System.out.println(pow);
		System.out.println(power(power(2,pow),power(10,j)*2)%1000000007);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			int t=s.nextInt();
			for(int i=0;i<t;i++)
			{
				int x=s.nextInt();
//				System.out.println(factors(x));
				converttobinary(factors(x));
			}
	}

}
