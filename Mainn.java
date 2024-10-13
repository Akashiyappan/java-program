import java.util.*;
public class Mainn
{
	public static void main(String[] args) {
	    Scanner x=new Scanner(System.in);
	    int n=x.nextInt();
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=n-i+1;j++){
	            for(int k=1;k<=i;k++)
	            System.out.print("*");
	        }
	        System.out.println("");
	    }
		System.out.println("");
	}
}