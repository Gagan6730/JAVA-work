package foobar;

import java.util.Scanner;

class stack
{	String stack1[]=new String[100000];
    int top=-1;
    void push(String string)
	    {
	        
	        stack1[++top]=string;
	    }
    String pop()
	    {
    	String ch;
	        ch=stack1[top--];
	        
	        return ch;
	    }
}
public class jrchw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			String str=s.next();
			char[] arr=str.toCharArray();
			stack stk=new stack();
			int sum=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]=='C')
				{
					stk.push("12");
				}
				else if(arr[i]=='H')
				{
					stk.push("1");
				}
				else if(arr[i]=='O')
				{
					stk.push("16");
				}
				else if(arr[i]=='(')
				{
					stk.push("(");
					i++;
					while(arr[i]!=')')
					{
						if((arr[i]=='0' || arr[i]=='1' || arr[i]=='2' || arr[i]=='3' || arr[i]=='4' || arr[i]=='5' || arr[i]=='6' || arr[i]=='7' || arr[i]=='8'||arr[i]=='9'))
						{
							int temp=Integer.parseInt(stk.pop())*(arr[i]-'0');
							String str1=Integer.toString(temp);
							stk.push(str1);
//							i++;
						}
						else
						{
							if(arr[i]=='C')
							{
								stk.push("12");
							}
							else if(arr[i]=='H')
							{
								stk.push("1");
							}
							else if(arr[i]=='O')
							{
								stk.push("16");
							}
						}
						i++;
					}
					i--;
				}
				else if(arr[i]=='0' || arr[i]=='1' || arr[i]=='2' || arr[i]=='3' || arr[i]=='4' || arr[i]=='5' || arr[i]=='6' || arr[i]=='7' || arr[i]=='8'||arr[i]=='9')
				{
					sum+=Integer.parseInt(stk.pop())*(arr[i]-'0');
				}
				else if(arr[i]==')')
				{
					if(arr[i+1]=='0' || arr[i+1]=='1' || arr[i+1]=='2' || arr[i+1]=='3' || arr[i+1]=='4' || arr[i+1]=='5' || arr[i+1]=='6' || arr[i+1]=='7' || arr[i+1]=='8'||arr[i+1]=='9')
					{
						while(stk.stack1[stk.top]!="(")
						{
							sum+=Integer.parseInt(stk.pop())*(arr[i+1]-'0');
						}
						String se=stk.pop();
					}
					i++;
				}
			}
			while(stk.top!=-1)
			{
				sum+=Integer.parseInt(stk.pop());
			}
			System.out.println(sum);
	}

}
