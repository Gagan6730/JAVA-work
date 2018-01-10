package codechef;



import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class chefsign
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
			int t=s.nextInt();
			for(int i=0;i<t;i++)
			{
				String str=s.next();
				str=str+s.nextLine();
                char[] arr=str.toCharArray();
                int[] a=new int[arr.length];
                for(int j=0;j<arr.length;j++)
                {
                    if(arr[j]!=' ')
                    {
                    	a[j]=arr[j]-'0';
                    }
                }
//                for(int j=0;j<arr.length;j++)
//                {
//                	System.out.print(arr[j]);                
//                }
//                System.out.println();
                int[] a1=new int[arr.length];int index=0;
                for(int j=0;j<arr.length;j++)
                {
                	if(a[j]!=0)
                	{
                		a1[index++]=a[j];
                	}
                }
                for(int j=0;j<index;j++)
                { 
                	System.out.print(a1[j]+" ");
                }
                System.out.println();
//                System.out.println(arr.length+" "+a.length);
                int c=0;
                for(int j=0;j<index;j++)
                { 
                	if((index-1)==a1[j])
                	{
                		c=j;
                	}
                }
//                System.out.println(c);
                int max=a1[0];
                for(int j=0;j<index;j++)
                { 
                	if(j!=c)
                	{
                		if(a1[j]>max)
                		{
                			max=a[j];
                		}
                	}
                }
                System.out.println(max);
			}
	}
}
