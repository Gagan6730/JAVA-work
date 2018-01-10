package refresher;

import java.io.*;

 class Manager implements Serializable {
     private String name;
     public Manager(String n) {
this.name=n; 
}
 }
 public class A {

public static void serialize()
throws IOException {
Manager s1 = new Manager("Amy"); ObjectOutputStream out = null; try {
              out = new ObjectOutputStream (
                    new FileOutputStream("/Users/gagan/Documents/workspace/ap/src/out.txt"));
              out.writeObject(s1);
           } finally {
              out.close();
}
/* Continued on RHS window */
/* Continued from LHS window */
}
public static void deserialize()
throws IOException, ClassNotFoundException {
    ObjectInputStream in = null;
    try {
        in =  new ObjectInputStream (
               new FileInputStream("/Users/gagan/Documents/workspace/ap/src/out.txt"));
        Manager s1 = (Manager) in.readObject();
    } finally {
        in.close();
    }
}
public static void main(String[] args) throws IOException,ClassNotFoundException {
serialize();
deserialize();
}
}