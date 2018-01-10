 package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static int count_banana(char[] arr)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='b')
			{
				count++;
			}
		}
		return count;
	}
	public static int count_apple(char[] arr)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='a')
			{
				count++;
			}
		}
		return count;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{
			String str=s.next();
			char[] arr=str.toCharArray();
//			char[] output=new char[10000000];
			String output="";
			int x=s.nextInt();
			int y=s.nextInt();
			int banana=count_banana(arr);
			int apple=count_apple(arr);
//			output+=arr[0];
//			if(arr[0]=='a')
//			{
//				apple--;
//			}
//			else
//			{
//				banana--;
//			}
//			int index=1;
			int j=0;
//			System.out.println(output);
			while(apple>0 || banana>0)
			{
				if(arr[j]=='a')
				{
//					System.out.println(arr[j]);
					int c=0;
					char[] o=output.toCharArray();
//					System.out.println(output);
					for(int k=o.length-1;k>=0;k--)
					{ 
						if(o[k]=='a')
						{
							c++;
						}
						else
						{
							break;
						}
					}
//					System.out.println(c);
					if(c<x)
					{
						output+=arr[j];
						apple--;
						j++;
					}
					else if(c==x && banana>0)
					{
						output+='b';
						banana--;
//						j--;
					}
					else if(apple>0 || banana>0)
					{
						output+='*';
//						j--;
					}
				}
				else if(arr[j]=='b')
				{
					int c=0;
					char[] o=output.toCharArray();
					for(int k=o.length-1;k>=0;k--)
					{
						if(o[k]=='b')
						{
							c++;
						}
						else
						{
							break;
						}
					}
					if(c<y)
					{
						output+=arr[j];
						banana--;
						j++;
					}
					else if(c==y && apple>0)
					{
						output+='a';
						apple--;
//						j--;
					}
					else if(apple>0 || banana>0)
					{
						output+='*';
//						j--;
					}
				}
//				j++;
//				System.out.println(output);
			}
			System.out.println(output);
		}
	}
}
// package codechef; // don't place package name! */
//
//import java.util.*;
//import java.lang.*;
//import java.io.*;
//
///* Name of the class has to be "Main" only if the class is public. */
//class Codechef
//{
//	public static void main (String[] args) throws java.lang.Exception
//	{
//		// your code goes here
//		Scanner s=new Scanner(System.in);
//		int t=s.nextInt();
//		for(int i=0;i<t;i++)
//		{
//			int m=s.nextInt();
//			int n=s.nextInt();
//				for(int j=m;j<=n;j++)
//				{
//					int flag=0;
//					int x=(int)Math.sqrt(j);
//					for(int k=2;k<=x;k++)
//					{
//						if(j%k==0)
//						{
//							flag=1;
//							break;
//						}
//						
//					}
//					if(flag==0 && j>1)
//					{
//						System.out.println(j);
//					}
//				}
//			
//		}
//	}
//}
