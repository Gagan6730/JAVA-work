package co;

import java.math.BigInteger;

public class StringToHex{

	  public String convertStringToHex(String str){

		  char[] chars = str.toCharArray();

		  StringBuffer hex = new StringBuffer();
		  for(int i = 0; i < chars.length; i++){
		    hex.append(Integer.toHexString((int)chars[i]));
		  }

		  return hex.toString();
	  }

	  public String convertHexToString(String hex){

		  StringBuilder sb = new StringBuilder();
		  StringBuilder temp = new StringBuilder();

		  //49204c6f7665204a617661 split into two characters 49, 20, 4c...
		  for( int i=0; i<hex.length()-1; i+=2 ){

		      //grab the hex in pairs
		      String output = hex.substring(i, (i + 2));
		      //convert hex to decimal
		      int decimal = Integer.parseInt(output, 16);
		      //convert the decimal to character
		      sb.append((char)decimal);

		      temp.append(decimal);
		  }
		  System.out.println("Decimal : " + temp.toString());

		  return sb.toString();
	  }
	  private static String hexToBin(String hex){
		    String bin = "";
		    String binFragment = "";
		    int iHex;
		    hex = hex.trim();
		    hex = hex.replaceFirst("0x", "");

		    for(int i = 0; i < hex.length(); i++){
		        iHex = Integer.parseInt(""+hex.charAt(i),16);
		        binFragment = Integer.toBinaryString(iHex);

		        while(binFragment.length() < 4){
		            binFragment = "0" + binFragment;
		        }
		        bin += binFragment;
		    }
		    return bin;
		}
//	  static String hexToBin(String s) {
//		  return new BigInteger(s, 17).toString(2);
//		}
	  public static void main(String[] args) {

		  StringToHex strToHex = new StringToHex();
		  System.out.println("\n***** Convert ASCII to Hex *****");
		  String str = "AAAABBBBCCCC";
		  System.out.println("Original input : " + str);

//		  String hex = strToHex.convertStringToHex(str);
		  String hex="0xE3A0200A";
		  System.out.println("Hex : " + hex);
		  

		  System.out.println("\n***** Convert Hex to ASCII *****");
		  System.out.println("Hex : " + hex);
		  System.out.println("Binary : " + hexToBin(hex));
		  System.out.println("ASCII : " + strToHex.convertHexToString(hex));
	  }
	}
