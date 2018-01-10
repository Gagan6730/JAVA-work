import java.util.Scanner;

class stack1
{	
	int l=0;
    int[] intoarr(int a)
    	{
    		int arr[]=new int[100000];
    		int div=a,k=0;
    		while(div>=10)
    			{
    				int c=div%10;
    				div=div/10;
    				arr[k++]=c;
    			}
    		arr[k]=div;
    		l=k+1;
    		return arr;
    	}
    int j=-1;
    int[] mult(int[] q1,int a2,int l1)
    	{
    		int[] q2=new int[100000];
    		
    		int d1=0;
    		for(int i=0;i<l1;i++)
    			{
    				int d=(q1[i]*a2)+d1;
    				
    				if(d>=10)
    					{
    						int c=d%10;
    						q2[++j]=c;
    						d1=d/10;	
    					}
    				else q2[++j]=d;
    			}
    		
    		return q2;
    	}
   
    void fact(int n)
    	{	
    		int[] q=new int[1000000];
    		int[] out=new int[1000000];
    		out[0]=1;
    		for(int i=1;i<n;i++)
    			{
    				q=intoarr(i);
    				
    				int[] q2=mult(out,i+1,l);
    				out=q2;
    				System.out.println(q);
    			}
    		for(int i=j;i>=0;i--)
    			{
    				System.out.print(out[i]);
    			}
    	}
}
public class lab7_1 {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		int a1=s.nextInt();
		stack1 stck=new stack1();
		stck.fact(a1);
		
		
	}

}
