import java.util.Scanner;

public class q1 {
	static int haha(char[] arr)
	{
		int c=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]-'0'==1)
				break;
			c++;
		}
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			String str=s.nextLine();
			char[] arr=str.toCharArray();
			int ans=haha(arr);
			System.out.print(ans);
	}

}
