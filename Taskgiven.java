import java.util.*;
public class Taskgiven {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int c[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=x.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=x.nextInt();
        }
        for(int i=0;i<n;i++){
            int co=0,sum=0,div=0;
            for(int j=0;j<n;j++){
                if(a[i]==a[j]){
                    co++;
                    sum+=b[j];
                    div=sum/co;
                    
                }
                
            }
           c[i]=b[i]-div;
        }
        for(int i=0;i<n;i++){
            System.out.print(c[i]+" ");
        }
    }
}
