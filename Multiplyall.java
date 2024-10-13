import java.util.*;
public class Multiplyall {
    public static void main(String [] args){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=x.nextInt();
        }
        int mul=1;
        for(int i=0;i<n;i++){
            mul*=a[i];
        }
        for(int i=0;i<n;i++){
            a[i]=mul/a[i];
            System.out.print(a[i]+"  ");
        }
    }
}
