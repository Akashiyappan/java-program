import java.util.*;
public class SumArray {
    public static void main(String [] args){
        Scanner x=new Scanner(System.in);
        int sum=0;
        System.out.println("enter size");
        int n=x.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=x.nextInt();
        }
        for(int i=0;i<n;i++){
            sum=sum+a[i];
        }
        System.out.println(sum);

    }
}
