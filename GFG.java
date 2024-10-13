
import java.io.*;
import java.util.Scanner;

class GFG {
	public static void main (String[] args)throws Exception {
	
		String str, nstr="";
		char ch;
	
	System.out.print("Original word: ");
	Scanner x=new Scanner(System.in);
	str=x.nextLine();
	
	for (int i=0; i<str.length(); i++)
	{
		ch= str.charAt(i); //extracts each character
		nstr= ch+nstr; //adds each character in front of the existing string
	}
	System.out.println("Reversed word: "+ nstr);
	}
}