//import java.util.Scanner;
//class stack
//{	int stack1[]=new int[100000];
//    int top=-1;
//    void push(int ch)
//	    {
//	        
//	        stack1[++top]=ch;
//	    }
//    int pop()
//	    {
//	        int ch;
//	        ch=stack1[top--];
//	        
//	        return ch;
//	    }
//    void print()
//    	{
//    		for(int i=0;i<=top;i++)
//    			{
//    				System.out.print(stack1[i]+" ");
//    			}
//    	}
//    int minimum()
//    	{
//    		int min=stack1[0];
//    		int minindex=0;
//    		for(int i=0;i<=top;i++)
//    			{
//    				if(stack1[i]<min)
//    					{
//    						min=stack1[i];
//    						minindex=i;
//    					}
//    				
//    			}
//    		return minindex;
//    	}
//}
//public class v1 {
//	static int manhattan(int x1,int y1,int x2,int y2)
//		{
//			return Math.abs(x1-x2)+Math.abs(y1-y2);
//		}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//			Scanner s=new Scanner(System.in);
//			int n=s.nextInt();
//			int[][] arr=new int[n][2];
//			String[] a=new String[n];
//			for(int i=0;i<n;i++)
//				{
//					for(int j=0;j<2;j++)
//						{
//							arr[i][j]=s.nextInt();
//						}
//					a[i]=s.next();
//				}
//			stack stk=new stack();
//			int k=0;
//			
//			while(k<n-1)
//			{
//				int count=1;
//				while(k+count<n)
//					{
//						int b=manhattan(arr[k][0],arr[k][1],arr[k+count][0],arr[k+count][1]);
//						stk.push(b);
//						count++;
//					}
//				k++;
//			}
//			stk.print();
//			int min=stk.minimum();
//			
//	}
//
//}
