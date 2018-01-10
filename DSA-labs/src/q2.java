import java.util.Scanner;
//q3
public class q2 {
	static boolean check(char[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]==' ')
					continue;
				if(arr[i]==arr[j])
				{
					return false;
				}
			}
		}
		return true;
	}
	static boolean check2(char[] arr,String[] str)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==' ')
				{
					if(arr[i+1]==' ')
						return false;
				}
		}
		for(int i=0;i<str.length-1;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].equals(str[j]))
				{
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			String str=s.nextLine();
			char[] arr=str.toCharArray();
//			System.out.println();
			System.out.println(check(arr));
			String[] strarr=str.split(" ");
			System.out.println(check2(arr,strarr));
	}

}
