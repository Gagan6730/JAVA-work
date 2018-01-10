import java.util.Scanner;
class stack
{	int stack1[]=new int[100000];
	    int top=-1;
	    void push(int ch)
		    {
		        
		        stack1[++top]=ch;
		    }
	    int pop()
		    {
		        int ch;
		        ch=stack1[top--];
		        
		        return ch;
		    }
	    void print()
	    {
	    	while(top!=-1)
	    	{
	    		System.out.println(pop());
	    	}
	    }
//	    void reverse()
//	    {
//	    	if(top==-1)
//	    	{
//	    		return;
//	    	}
//	    	int d=pop();
//	    	reverse();
//	    	push(d);
//	    	print();
//	    }
	    
}
public class reversestack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		stack stk=new stack();
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
			stk.push(arr[i]);
		}
//		stk.reverse();
		int[] a=new int[n];
		
	}

}
