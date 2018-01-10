package codechef;

import java.util.Scanner;

public class chefrout {
static boolean check_c(int c,char[] arr)
	{
			for(int i=0;i<c;i++)
				{
					if(arr[i]!='c')
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
				if(arr[i]!='e')
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
				if(arr[i]!='s')
					{
						return false;
					}
			}
		return true;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			int t=s.nextInt();
			for(int i=0;i<t;i++)
				{
					String str=s.next();
					char[] arr=str.toCharArray();
					int c=0,e=0,s1=0;
					for(int j=0;j<arr.length;j++)
						{
							if(arr[j]=='c')c++;
							else if(arr[j]=='e')e++;
							else if(arr[j]=='s')s1++;
						}
//					System.out.print(c+" "+e+" "+s1);
					if(check_c(c,arr) && check_e(c,arr,e) && check_s(c,arr,e,s1))
						System.out.println("YES");
					else System.out.println("NO"); 
				}
	}

}
