import java.util.*;
public class Qes3 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){ 
            a[i]=x.nextInt();
        }
        int k=a[0];
        int c=1;
        for(int i=1;i<n;i++){
            if(a[i]>k){
                c++;
            }
        }
        System.out.println(c);
        
    }
}
