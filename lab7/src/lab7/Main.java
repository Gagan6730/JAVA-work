package lab7;
 import java.io.*;
class Manager implements Serializable {
	      private String name;
	      public static final long serialVersionUID = 42L;
	      private transient int z=0;
	      public int getZ() {
			return z;
		}
		public void setZ(int z) {
			this.z = z;
		}
		public Manager(String n) { 
	    	  this.name=n;
	      }
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	      
	  }
public class Main {


public static void serialize() throws IOException 
	{
//		Music s1 = new Music("Something Just Like This","Coldplay",400); 
//		Music s2 = new Music("Shape of You","Ed Sheeran",350); 
//		Music s3 = new Music("Despacito","Luis Fonsi",370);
//		Music s4=new Music("Wild Thoughts","Rihanna",380);
//		String s=Integer.toString(x);
//		ObjectOutputStream out = null; 
//		try {
//              out = new ObjectOutputStream (
//                    new FileOutputStream("./src/playlist"+s));
//              out.writeObject(s1);
//              out.writeObject(s2);
//              out.writeObject(s3);
//              out.writeObject(s4);
//           	} finally {
//              out.close();
//           	}
	
		Manager s1 = new Manager("Amy"); 
		ObjectOutputStream out = null;
		try {
		              out = new ObjectOutputStream (
		                    new FileOutputStream("./src/out.txt"));
		              out.writeObject(s1);
		           } finally {
		              out.close();
		}
	
	}

	public static void deserialize() throws IOException, ClassNotFoundException 
	{
//		ObjectInputStream in = null;
//		try 
//		{
//		    in =  new ObjectInputStream (
//		           new FileInputStream("./src/playlist0"));
//		    Music s1 = (Music) in.readObject();
//		    
//		    System.out.println(s1.getName());
//
//		} 
//		finally {
//		    in.close();
//		}
		ObjectInputStream in = null;
	    try {
	        in =  new ObjectInputStream (
	               new FileInputStream("./src/out.txt"));
	        Manager s1 = (Manager) in.readObject();
	        System.out.println(s1.getName()+" "+s1.getZ());
	        
	    } finally {
	        in.close();
	    }
	}
	public static void main(String[] args) throws IOException,ClassNotFoundException {
//		final long serialVersionUID = 42L;
		serialize();
		deserialize();
		

	}
	
}