//GAGANDEEP SINGH
//2016037
package ap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
class OverlapException extends Exception
{
	OverlapException(String s)
	{
		super(s);
	}
}
class QueenFoundException extends Exception
{
	QueenFoundException(String s)
	{
		super(s);
	}
}
class StackEmptyException extends Exception
{
	StackEmptyException(String s)
	{
		super(s);
	}
}
class NonCoordinateException extends Exception
{
	NonCoordinateException(String s)
	{
		super(s);
	}
}
class Coordinate
{
	private int cor_x;
	private int cor_y;
	public Coordinate(int cor_x, int cor_y) {
		super();
		this.cor_x = cor_x;
		this.cor_y = cor_y;
	}
	public int getCor_x() {
		return cor_x;
	}
	public void setCor_x(int cor_x) {
		this.cor_x = cor_x;
	}
	public int getCor_y() {
		return cor_y;
	}
	public void setCor_y(int cor_y) {
		this.cor_y = cor_y;
	}
	
}
class Knight
{
	private Stack< Pair <String,Pair<String,Integer>> > st;
	private Coordinate cor;
	private String name;
	private int iteration_num;
	

	
	public Knight(Stack<Pair<String, Pair<String, Integer>>> st, Coordinate cor, String name, int iteration_num) {
		super();
		this.st = st;
		this.cor = cor;
		this.name = name;
		this.iteration_num = iteration_num;
	}

	public Stack<Pair<String, Pair<String, Integer>>> getSt() {
		return st;
	}

	public void setSt(Stack<Pair<String, Pair<String, Integer>>> st) {
		this.st = st;
	}

	public int getIteration_num() {
		return iteration_num;
	}

	public void setIteration_num(int iteration_num) {
		this.iteration_num = iteration_num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Coordinate getCor() {
		return cor;
	}
	public void setCor(Coordinate cor) {
		this.cor = cor;
	}
}
class SortbyName implements Comparator<Knight>
{

    public int compare(Knight a, Knight b)
    {
    	return a.getName().compareTo(b.getName());
    }
}
public class lab6 {
	public static boolean check(int x,int y,ArrayList<Knight> arr1)
	{
		Knight[]arr=new Knight[arr1.size()];
		arr1.toArray(arr);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].getCor().getCor_x()==x && arr[i].getCor().getCor_y()==y)
			{
				return true;
			}
		}
		return false;
	}
	public static void play(ArrayList<Knight> arr,int qx,int qy,int num_of_iter) throws IOException,NonCoordinateException,OverlapException,StackEmptyException,QueenFoundException
	{
		int i=0;
		PrintWriter w = new PrintWriter("./src/"+"answer" + ".txt");

		
		int count=0;
		while(count<=num_of_iter)
		{
			Knight k=arr.get(i);
			k.setIteration_num(k.getIteration_num()+1);
			w.write(k.getIteration_num()+" "+k.getName()+" "+k.getCor().getCor_x()+" "+k.getCor().getCor_y()+"\n");
			System.out.println(k.getIteration_num()+" "+k.getName()+" "+k.getCor().getCor_x()+" "+k.getCor().getCor_y());
			Stack<Pair<String, Pair<String, Integer>>> st=k.getSt();
			if(st.isEmpty())
			{
				try{
					throw new StackEmptyException("StackEmptyException:Stack Empty exception\n");
				}
				catch(StackEmptyException e){
				w.println("StackEmptyException:Stack Empty exception\n");
				System.out.println("StackEmptyException:Stack Empty exception\n");
				}
				arr.remove(k);
				count++;
				if(i>=arr.size()-1)
				{
					i=0;
				}
				else
				{
					i++;
				}
				if(arr.size()==0)
				{
					w.close();
					return;
				}
				continue;
			}
			Pair<String, Pair<String, Integer>> p=st.pop();
			if(p.getLeft().equals("Coordinate"))
			{
				
				Pair<String, Integer> p1=p.getRight();
				int x=Integer.parseInt(p1.getLeft());
				int y=p1.getRight();
				if(check(x,y,arr))//if there exist a knight at the pos (x,y)
				{
					Knight[] arr1=new Knight[arr.size()];
					arr.toArray(arr1);
					for(int j=0;j<arr1.length;j++)
					{
						if(arr1[j].getCor().getCor_x()==x && arr1[j].getCor().getCor_y()==y)
						{
							
							Coordinate c=new Coordinate(x,y);
							k.setCor(c);
							try{
								throw new OverlapException("OverlapException: Knights Overlap Exception "+arr1[j].getName()+"\n");
							}
							catch(OverlapException e)
							{
							w.print("OverlapException: Knights Overlap Exception "+arr1[j].getName()+"\n");
							System.out.println("OverlapException: Knights Overlap Exception "+arr1[j].getName()+"\n");
							}
							arr.remove(j);
							
							break;
						}
					}
				}
				else if(x==qx &&y==qy)
				{
					try{
						throw new QueenFoundException("QueenFoundException:Queen has been Found. Abort!\n");
					}
					catch(QueenFoundException e)
					{
						w.print("QueenFoundException:Queen has been Found. Abort!\n");
						w.close();
						System.out.println("QueenFoundException:Queen has been Found. Abort!\n");
					}
					
					return;
//					break;
				}
				else
				{
					Coordinate c=new Coordinate(x,y);
					k.setCor(c);
					w.print("No exception "+x+" "+y+"\n");
					System.out.println("No exception "+x+" "+y);
				}
				
			}
			else
			{
				try
				{
					throw new NonCoordinateException("NonCoordinateException:Not a coordinate Exception ");
				}
				catch(NonCoordinateException e)
				{
				w.print("NonCoordinateException:Not a coordinate Exception ");
				Pair<String, Integer> p1=p.getRight();
				w.print(p1.getLeft()+"\n");
				System.out.println("NonCoordinateException:Not a coordinate Exception "+p1.getLeft());
				}
				
			}
			count++;
			if(i>=arr.size()-1)
			{
				i=0;
			}
			else
			{
				i++;
			}
			if(arr.size()==0)
			{
				w.close();
				return;
			}
//			System.out.println(arr.size());
		}
		w.close();
	}
	public static void main(String[] args) throws IOException, NonCoordinateException, OverlapException, StackEmptyException, QueenFoundException {
		// TODO Auto-generated method stub
			int num_of_knights=0;
			int num_of_iter=0,queen_xpos=0,queen_ypos=0;
			Scanner s=new Scanner(System.in);
			boolean done=false;
			while(!done)
			{
				try{
				num_of_knights=s.nextInt();
				num_of_iter=s.nextInt();
				queen_xpos=s.nextInt();
				queen_ypos=s.nextInt();
				done=true;
				}
				catch(InputMismatchException e)
				{
					System.out.println("Wrong input");
					System.out.println("Try Again");
				}
			}
			Stack<Knight> stack=new Stack<Knight>();
			Knight[] arr=new Knight[num_of_knights];
			ArrayList<Knight> arraylist=new ArrayList<Knight>();
			int index=0;
			BSTFilesBuilder b=new BSTFilesBuilder();
//			b.createBSTFiles(num_of_knights);
			for(int i=1;i<=num_of_knights;i++)
			{
				String line1= Files.readAllLines(Paths.get("/Users/gagan/Downloads/Lab 6/Test Case/Input/"+i+".txt")).get(0);//Name
//				"/Users/gagan/Documents/workspace/ap/src/"+i+".txt"
//"/Users/gagan/Downloads/Lab 6/Test Case/Input/"+i+".txt"
				String line2= Files.readAllLines(Paths.get("/Users/gagan/Downloads/Lab 6/Test Case/Input/"+i+".txt")).get(1);//Coordinates
				String line3= Files.readAllLines(Paths.get("/Users/gagan/Downloads/Lab 6/Test Case/Input/"+i+".txt")).get(2);
				int count=Integer.parseInt(line3);//Number of values 
				int cor_x=0,cor_y=0;
				String[] split=line2.split("[\\s]+");//for the initial coordinated of the knight;
				cor_x=Integer.parseInt(split[0]);
				cor_y=Integer.parseInt(split[1]);
				Coordinate c=new Coordinate(cor_x,cor_y);
				Stack< Pair <String,Pair<String,Integer>> > st=new Stack< Pair <String,Pair<String,Integer>> >();
				for(int j=0;j<count;j++)
				{
					String line= Files.readAllLines(Paths.get("/Users/gagan/Downloads/Lab 6/Test Case/Input/"+i+".txt")).get(3+j);
					String[] split1=line.split("[\\s]+");
//					for(int q=0;q<split1.)
					if(split1[0].equals("String"))
					{
						Pair <String,Pair<String,Integer>> p=new Pair <String,Pair<String,Integer>>(split1[0],new Pair<String,Integer>(split1[1],-1));
						st.add(p);
					}
					else if(split1[0].equals("Integer"))
					{
						Pair <String,Pair<String,Integer>> p=new Pair <String,Pair<String,Integer>>(split1[0],new Pair<String,Integer>(split1[1],-1));
						st.add(p);
					}
					else if( split1[0].equals("Float"))
					{
						Pair <String,Pair<String,Integer>> p=new Pair <String,Pair<String,Integer>>(split1[0],new Pair<String,Integer>(split1[1],-1));
						st.add(p);
					}
					else
					{
						Pair <String,Pair<String,Integer>> p=new Pair <String,Pair<String,Integer>>(split1[0],new Pair<String,Integer>(split1[1],Integer.parseInt(split1[2])));
						st.add(p);
					}
				}
				Knight k=new Knight(st,c,line1,0);
				arr[index++]=k;
			}
			Arrays.sort(arr,new SortbyName());
			for(int i=0;i<arr.length;i++)
			{
//				System.out.println(arr[i].getName());
				arraylist.add(arr[i]);
			}
//			System.out.println(arraylist.size());
//			for(int i=0;i<arraylist.size();i++)
//			{
////				System.out.println(arr[i].getName());
//				Knight k=arraylist.get(i);
//				System.out.println(k.getName());
//				Stack<Pair<String, Pair<String, Integer>>> st=k.getSt();
//				while(!st.isEmpty())
//				{
//				Pair<String, Pair<String, Integer>> p=st.pop();
//				Pair<String, Integer> p1=p.getRight();
//				System.out.println(p.getLeft()+" "+p1.getLeft()+" "+p1.getRight());
//				}
//			}
//			System.out.println();
			play(arraylist,queen_xpos,queen_ypos,num_of_iter);
			
	}

}
//Grid grid=new Grid();
//if(!(grid.checkWin() && grid.getFlag()!=0 && grid.noAnimation()))
//{
//    GamePage gamePage=new GamePage();
//    gamePage.serialize();
//}



