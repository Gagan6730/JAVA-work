import java.util.Scanner;

public class q3 {

	static void rotate(int[][] arr,int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		int mid=n/2;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<mid;j++)
			{
				int temp=arr[i][j];
				arr[i][j]=arr[i][n-j-1];
				arr[i][n-j-1]=temp;
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			int[][] arr=new int[n][n];
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					arr[i][j]=s.nextInt();
				}
			}
			
			rotate(arr,n);
	}

}
