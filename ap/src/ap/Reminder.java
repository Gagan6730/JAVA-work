package ap;

import java.util.*;
public class Reminder {

	static Long convert(String s)
    {
        char[] arr=s.toCharArray();
        Long inst=(long)0;
        for(int i=arr.length-1;i>=0;i--) {
            inst = (long) (inst + (arr[i] * Math.pow(2, arr.length - i)));
        }
        return  inst;
    }
    public static void main(String args[]) {
        Long instruction=convert("11100011101000000010000000001010");
        int opcode = (int) (instruction >> 22) & (0xF);
        System.out.println(opcode);
    } 
}
