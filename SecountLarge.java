import java.util.*;
public class SecountLarge {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=x.nextInt();
        }
        Arrays.sort(a);
        for(int i=n-1;i>=0;i--){
            if(a[n-1]!=a[i]){
                System.out.println(a[i]);
                break;
            }
            
        }
    }
}
