package codechef;

import java.util.Scanner;

public class segm01 {
private static Scanner s;
static int count(char arr[])
{int k=0;
	for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='1')k++;
		}
	return k;
}
static int index(char arr[])
{int k=0;
	for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='1'){k=i;
			break;
			}
		}
	return k;
}
static boolean check(char arr[])
{
	int k=count(arr);
	int k1=index(arr);
	for(int i=k1;i<k1+k;i++)
		{
			if(arr[i]=='0')
				return false;
		}
	return true;
}

	public static void main(String[] args) {
		s = new Scanner(System.in);
			int t=s.nextInt();
			for(int i=0;i<t;i++)
			{
				String str=s.next();
				char[] arr=str.toCharArray();
				if(check(arr))
					System.out.print("YES");
				else System.out.print("NO");
				
			}
			
	}

}
