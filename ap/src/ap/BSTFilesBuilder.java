package ap;
//lab6
import java.io.PrintWriter;
import java.util.Random;

public class BSTFilesBuilder {

	public void createBSTFiles(int num_Knights) {
		Random rand = new Random();
		for (int i = 1; i <= num_Knights; i++) {
		    try {
				PrintWriter w = new PrintWriter("./src/" + i + ".txt", "UTF-8");
				String alphabet = "abcdefghijklmnopqrstuvwxyz";
				
					int len1 = rand.nextInt(10)+1;
					for (int k = 0; k < len1; k++)
						w.print(alphabet.charAt(rand.nextInt(alphabet.length())));
					w.println(" ");
				
				w.print(rand.nextInt(100));
				w.print(" ");
				w.print(rand.nextInt(100));
				w.println();
				int count = rand.nextInt(10) + 1;
				w.println(count);
				for(int h=0;h<count;h++)
				{
					int type = rand.nextInt(4) + 1;
					
					if(type == 4) {
						w.print("Integer ");
						w.println(rand.nextInt(1000));
//						w.print(" ");
					}
					else if(type == 3) {
						w.print("Float ");
						w.println(rand.nextFloat()*1000);
//						w.print(" ");
					}
					else if(type==2)
					{
						w.print("String ");
						String alphabet1 = "abcdefghijklmnopqrstuvwxyz";
							int len = rand.nextInt(10)+1;
							for (int k = 0; k < len; k++)
								w.print(alphabet1.charAt(rand.nextInt(alphabet1.length())));
							w.println();
					}
					else
					{
						w.print("Coordinate ");
						w.print(rand.nextInt(100));
						w.print(" ");
						w.println(rand.nextInt(100));
//						w.print(" ");
					}
					
				}
				w.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		    
		}
	}

}


//lab5
//import java.io.PrintWriter;
//import java.util.Random;
//
//public class BSTFilesBuilder {
//
//	public void createBSTFiles(int numStudents, int numTrees) {
//		Random rand = new Random();
//		for (int i = 1; i <= numTrees; i++) {
//		    try {
//				PrintWriter w = new PrintWriter("./src/" + i + ".txt", "UTF-8");
//				int type = rand.nextInt(3) + 1;
//				if(type == 1) {
//					w.println("Integer");
//					w.println(numStudents);
//					for (int j = 1; j <= numStudents; j++) {
//						w.print(rand.nextInt(1000));
//						w.print(" ");
//					}
//				}
//				else if(type == 2) {
//					w.println("Float");
//					w.println(numStudents);
//					for (int j = 1; j <= numStudents; j++) {
//						w.print(rand.nextFloat()*1000);
//						w.print(" ");
//					}
//				}
//				else {
//					w.println("String");
//					w.println(numStudents);
//					String alphabet = "abcdefghijklmnopqrstuvwxyz";
//					for (int j = 1; j <= numStudents; j++) {
//						int len = rand.nextInt(10)+1;
//						for (int k = 0; k < len; k++)
//							w.print(alphabet.charAt(rand.nextInt(alphabet.length())));
//						w.print(" ");
//					}
//				}
//				w.close();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}
