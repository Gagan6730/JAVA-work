import java.util.Scanner;

//class node
//{
//		int data,fre;
//		node left;
//		node right;
//		node(int x,int y)
//		{
//			data=x;
//			fre=y;
//			left=null;
//			right=null;
//		}
//}
class heap{
	private int[] Heap;
	private int size;
	private int maxsize;
	 private static final int FRONT = 1;
	 public heap(int maxsize)
	    {
	        this.maxsize = maxsize;
	        this.size = 0;
	        Heap = new int[this.maxsize + 1];
	        Heap[0] = Integer.MIN_VALUE;
	    }
//	private int parent(int pos)
//		{
//			return pos/2;
//		}
//	private int lchild(int pos)
//		{
//			return 2*pos;
//		}
//	private int rchild(int pos)
//		{
//			return (2*pos)+1;
//		}
	private boolean isLeaf(int pos)
	    {
	        if (pos >=  (size / 2)  &&  pos <= size)
	        { 
	            return true;
	        }
	        return false;
	    }
    private void swap(int fpos, int spos)
    {
        int tmp;
        tmp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    }
 
    private void minHeapify(int pos)
	    {
	        if (!isLeaf(pos))
	        { 
	            if ( Heap[pos] > Heap[2*pos]  || Heap[pos] > Heap[(2*pos)+1])
	            {
	                if (Heap[2*pos] < Heap[(2*pos)+1])
	                {
	                    swap(pos, 2*pos);
	                    minHeapify(2*pos);
	                }else
	                {
	                    swap(pos, (2*pos)+1);
	                    minHeapify((2*pos)+1);
	                }
	            }
	        }
	    }
    public void insert(int element)
	    {
	        Heap[++size] = element;
	        int current = size;
	 
	        while (Heap[current] < Heap[(int) Math.floor(current/2)])
	        {
	            swap(current,(int) Math.floor(current/2));
	            current = (int) Math.floor(current/2);
	        }	
	    }
    public void minHeap()
	    {
	        for (int pos = (size / 2); pos >= 1 ; pos--)
	        {
	            minHeapify(pos);
	        }
    }
 
    public int remove()
	    {
	        int popped = Heap[FRONT];
	        Heap[FRONT] = Heap[size--]; 
	        minHeapify(FRONT);
	        return popped;
	    }
    public void print()
    {
        for (int i = 1; i <= size; i++ )
        {
            System.out.print(Heap[i-1]);
            System.out.println();
        } 
    }
}
public class lab9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			int x=s.nextInt();
			int y=s.nextInt();
			int[][] arr=new int[x][y];
			heap Heap = new heap(x*y);
			for(int i=0;i<y;i++)
				{
					for(int j=0;j<x;j++)
						{
							arr[i][j]=s.nextInt();
							Heap.insert(arr[i][j]);
						}
				}
			Heap.print();
			
//			for(int i=0;i<y;i++)
//			{
//				for(int j=0;j<x;j++)
//					{
//						Heap.insert(arr[i][j]);
//					}
//			}
	}

}
