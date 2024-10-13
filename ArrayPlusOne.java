import java.util.*;
public class ArrayPlusOne {
    public static void main(String [] args){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=x.nextInt();
        }
        int c=0;
        int sum=0;
        for(int i=0;i<n;i++){
            if(c==n-1){
                sum=(sum*10)+(a[i]+1);
            }
            else{
                sum=(sum*10)+a[i];
                c++;
            }
        }
        System.out.print(sum);
    }
}
