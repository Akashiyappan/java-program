import java.util.Scanner;

public class PrimeArray {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("enter size");
        int n=x.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=x.nextInt();
        }
        for (int i = 0; i < n; i++)         
        { 		  	  
           int c=0; 	  
           for(int j=2;j<=a[i]/2;j++)
       {
          if(a[i]%j==0)
          {
          c++;
          break;
          }
       }
       if (c==0)
       {
         System.out.println(a[i]);
       }	
        }	
    }
}
