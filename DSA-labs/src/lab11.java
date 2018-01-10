import java.util.Scanner;
//class Node {
//
//	 int data;
//	 Node link;
//
//   int getData() {
//      return data;
//  }
//
//   void setData(int data) {
//      this.data = data;
//  }
//
//   Node getLink() {
//      return link;
//  }
//
//   void setLink(Node link) {
//      this.link = link;
//  }
//
//   Node(int data) {
//      this.data = data;
//      this.link = null;
//  }
//   Node(int n,Node s)
//	{
//		data=n;
//		link=s;
//	}
//   Node()
//	{
//		data=0;
//		link=null;
//	}
//}
//class linked
//	{
//		int count=-1;
//		Node Front;
//		void add(int n)
//			{
//				Node nptr = new Node (n, null); 
//				if (Front == null)
//					Front = nptr; 
//				else
//					nptr.setLink(Front); 
//				Front = nptr;
//				++count;
//			}
//		void delete(int d)
//			{
//				if (Front.getData() == d) 
//					Front = Front.getLink();
//				else 
//					{
//						Node prev = Front;
//						Node cur = Front.getLink();
//						while ( cur.getData() != d) 
//							{ 
//								prev = cur;
//								cur = cur.getLink();
//							}
//						prev.setLink(cur.getLink());
//					}
//				--count;
//			}
//		void print()
//			{
//				Node ptr=Front;
//				while(ptr!=null)
//					{
//						System.out.print(ptr.getData());
//						ptr=ptr.getLink();
//					}
//			}
//	}
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
    		for(int i=0;i<=top;i++)
    			{
    				System.out.print(stack1[i]);
    			}
    	}
}
class stacklol
{	int stack2[]=new int[100000];
    int top2=-1;
    void push2(int ch)
	    {
	        
	        stack2[++top2]=ch;
	    }
    int pop()
	    {
	        int ch;
	        ch=stack2[top2--];
	        
	        return ch;
	    }
    void print()
    	{
    		for(int i=0;i<=top2;i++)
    			{
    				System.out.print(stack2[i]);
    			}
    	}
}
public class lab11 {
	static stack stk=new stack();
	static stacklol stk1=new stacklol();
	private static Scanner s;
	static boolean check2(int arr)
		{
			
					for(int j=0;j<stk1.top2;j++)
					{
						if(arr==stk1.stack2[j])
							return false;
					}
			return true;
		}
	static boolean check(int index,int[][] arr,int k)
		{
			if(stk.top>-1)
				{
					for(int i=0;i<=stk.top;i++)
						{
							if(arr[index][k]==stk.stack1[i])
								return false;
						}
					return true;
				}
			else return true;
		}
	static void swap(int[][] arr,int index,int index1)
		{
			for(int i=0;i<3;i++)
				{
					int temp=arr[index][i];
					arr[index][i]=arr[index1][i];
					arr[index1][i]=temp;
				}
			
		}
//	static int[] bubble_sort( int A[ ], int n ) {
//	    int temp;
//	    for(int k = 0; k< n-1; k++) {
//	        // (n-k-1) is for ignoring comparisons of elements which have already been compared in earlier iterations
//
//	        for(int i = 0; i < n-k-1; i++) {
//	            if(A[ i ] > A[ i+1] ) {
//	                // here swapping of positions is being done.
//	                temp = A[ i ];
//	                A[ i ] = A[ i+1 ];
//	                A[ i + 1] = temp;
//	            }
//	        }
//	    }
//	    return A;
//	}
	public static void main(String[] args) {
		s = new Scanner(System.in);
			int v=s.nextInt();
			int e=s.nextInt();
			int[][] arr=new int[e][3];
			for(int i=0;i<e;i++)
				{
					for(int j=0;j<3;j++)
						{
							arr[i][j]=s.nextInt();
						}
				}
//			int[] a=new int[e];
//			for(int i=0;i<e;i++)
//				{
//					a[i]=arr[i][2];
//				}
//			a=bubble_sort(a,e);
//			for(int i=0;i<e;i++)
//			{
//				System.out.print(a[i]);
//			}
			System.out.println();
			int out=0;
			int k=0;
			while(stk.top!=v-1)
				{
					
					int min=arr[0][2];
					int index=0;
					for(int i=0;i<e-k;i++)
						{
							if(arr[i][2]<min)
								{
									min=arr[i][2];
									index=i;
								}
						}
					out+=min;
					stk1.push2(min);
					if(check(index,arr,0)==false && check(index,arr,1)==false)
						{
							out-=min;
							stk1.pop();
						}
					if(check(index,arr,0))
						{	
						stk.push(arr[index][0]);
						}
					if(check(index,arr,1))
						{
						stk.push(arr[index][1]);
						}
					while(index<e-k-1)
						{
							swap(arr,index,index+1);
							index++;
//							for(int l=0;l<arr.length;l++)
//								System.out.println(arr[l]);
						}
					k++;
//					System.out.println(out);

				}
			System.out.println(out);
//			System.out.println();
//			stk.print();
//			System.out.println();
//			stk1.print();
			
			
//			if(stk1.top2==e-1)
//				{
//					System.out.print("-1");
//				}
//			else
//				{
//					int[] b=new int[e-stk1.top2-1];
//					int l=-1;
//					for(int i=0;i<e;i++)
//						{
//							if(check2(arr[i][2]))
//								{
//									b[++l]=	arr[i][2];
//								}
//						}
//					int[] output=new int[e-stk1.top2-1];
//					for(int i=0;i<=l;i++)
//						{	int lol=0;
//							int index0=0;
//							stk1.push2(b[i]);
//							for(int j=0;j<e;j++)
//								{
//									if(b[i]==arr[j][2])
//										index0=j;
//								}
//							if(check(index0,arr,0)==false && check(index0,arr,1)==false)
//								{
//									int[] q1=new int[e];
//									int[] q2=new int[e];
//									int l1=-1,l2=-1;
//									for(int j=0;j<e;j++)
//										{
//											if(j!=index0)
//											{
//												if(arr[j][0]==arr[index0][0])
//													{
//														q1[++l1]=arr[j][1];
//													}
//												if(arr[j][1]==arr[index0][0])
//												{
//													q1[++l1]=arr[j][0];
//												}
//												
//											}
//											if(j!=index0)
//											{
//												if(arr[j][0]==arr[index0][1])
//													{
//														q2[++l2]=arr[j][1];
//													}
//												if(arr[j][1]==arr[index0][1])
//												{
//													q2[++l2]=arr[j][0];
//												}
//												
//											}
//											
//												
//										}
//									
//									for(int j=0;j<=l1;j++)
//									{
//										for(int k1=0;k1<=l2;k1++)
//											{
//												if(q2[k1]==q1[j])
//													{
//														lol=q2[k1];
//													}
//											}
//									}
//									int a1=0,a2=0;
//									for(int j=0;j<e;j++)
//										{
//											if(arr[j][arr[index0][0])
//										}
//								}
//						}
//						
//				}
	}

}

//5 5
//2 3 4
//1 2 1
//2 4 2
//2 5 3
//3 5 5

//6 7 
//1 2 6
//2 3 4
//2 4 3
//2 5 1
//1 5 5
//5 6 7
//4 5 2

