package ap;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

class fruit
{
	public String name;
	public int price;
	fruit()
	{
		this.name="a";
		this.price=10;
	}
}
public class random {
	public static void main(String[] args) throws IOException {

		  int[] empid = {1, 2, 3};
		    String[] name = {"John", "Joe", "Amy"};
		    DataOutputStream out = null;
		    try {
		        out = new DataOutputStream(new
		                BufferedOutputStream(new
		                FileOutputStream("./src/output.txt")));
		        for (int i = 0; i < empid.length; i++) {
//		        	out.writeInt(1);
		           out.writeChars(Integer.toString(empid[i]));
		           out.writeUTF("-"+name[i]+"\n");
		        }
		        
		    }finally {
		        if (out != null) {
		        	out.close();
		}
	}
}
}

	
