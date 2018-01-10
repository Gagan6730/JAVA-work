import java.util.Scanner;
//class height
//{
//	int maxheight;
//}

class Node {

	 int data;
	 Node left,right;

    int getData() {
       return data;
   }

    void setData(int data) {
       this.data = data;
   }



    public Node(int data) {
       this.data = data;
       left= null;
       right= null;
   }
}

public class lab8 {

	public static Node insert(Node root,int value)
		{ 	if (root == null)
				root = new Node (value); 
			else 
				{
					if (value < root.data)
					root.left =insert (root.left, value);
					else
					root.right = insert (root.right, value);
				}
			return root; 
		}
	public static Node minNode(Node root)
		{
			if(root.left==null)
				return root;
			else
				return minNode(root.left);
		}
	public static int height(Node root)
		{
			if(root==null)return 0;
			else return 1+Math.max(height(root.left),height(root.right));
		}
//	static int heightleft(Node root)
//		{
//			return height(root.left);
//		}
//	static int heightright(Node root)
//	{
//		return height(root.right);
//	}
	public static Node delete(Node root,int value)
		{
			if(root==null)
				return null;
			if(root.data>value)
				root.left=delete(root.left,value);
			else if(root.data<value)
				root.right=delete(root.right,value);
			else
				{
					if(root.left!=null && root.right!=null)
						{
							Node temp=root;
							Node minRight=minNode(temp.right);
							root.data=minRight.data;
							root.right=delete(root.right,minRight.data);
						}
					else if(root.left!=null)
						{
							root=root.left;
						}
					else if(root.right!=null)
						{
							root=root.right;
						}
					else
						root=null;
				}
			return root;
		}
	
	static int h1=0;
	private static Scanner s;
	public static void printrightprofile(Node root,int level)
		{
			if(root==null)
				return;
			if(h1<level)
				{
					System.out.print(root.getData()+" ");
					h1=level;
				}
			printrightprofile(root.right,level+1);
			printrightprofile(root.left,level+1);
		}
public static void main(String[] args) {
		s = new Scanner(System.in);
			Node root = null;
			
			int n=s.nextInt();
			int q=s.nextInt();
			//int[] a=new int[n];
			for(int i=0;i<n;i++)
				{
					//a[i]=s.nextInt();
					int num=s.nextInt();
					root=insert(root, num);
				}
			for(int i=0;i<q;i++)
				{
					int q1=s.nextInt();
					if(q1==1)
						{	
							int val=s.nextInt();
							root=delete(root,val);
						}
					if(q1==2)
						{
							printrightprofile(root,1);
							h1=0;
							//System.out.println(root.left.getData());
						}
				}
	}
}





