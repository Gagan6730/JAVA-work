package codechef;

import java.util.Scanner;

public class Main {
	private static Scanner s;
	static boolean check_c(int c,char[] arr)
		{
				for(int i=0;i<c;i++)
					{
						if(arr[i]!='C')
							{
								return false;
							}
					}
				return true;
		}

	static boolean check_e(int c,char[] arr,int e)
		{
				for(int i=c;i<c+e;i++)
					{
						if(arr[i]!='E')
							{
								return false;
							}
					}
				return true;
		}

	static boolean check_s(int c,char[] arr,int e,int s)
		{
				for(int i=c+e;i<c+e+s;i++)
					{
						if(arr[i]!='S')
							{
								return false;
							}
					}
				return true;
		}
	public static void main(String[] args) {
		s = new Scanner(System.in);
			int t=s.nextInt();
			for(int i=0;i<t;i++)
				{	int flag=0;
					String str=s.next();
					char[] arr=str.toCharArray();
					int c=0,e=0,s1=0;
					for(int j=0;j<arr.length;j++)
						{
							if(/*arr[j]=='c' ||*/ arr[j]=='C') c++;
							else if(/*arr[j]=='e' ||*/ arr[j]=='E')e++;
							else if(/*arr[j]=='s' ||*/ arr[j]=='S')s1++;
							else {flag=1; break;}
						}
					if(flag==1)
						System.out.println("no");
//					System.out.print(c+" "+e+" "+s1);
					else if((check_c(c,arr) && check_e(c,arr,e)) && check_s(c,arr,e,s1))
						System.out.println("yes");
					else System.out.println("no"); 
				}
	}

}
