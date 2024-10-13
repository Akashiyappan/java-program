import java.util.*;
public class Repeat_elementSortOrder {
public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("enter size");
        int max=0;
        int n=x.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=x.nextInt();
            if(a[i]>max){
                max=a[i];
            }
        }
        int b[] =new int[max+1];
        for(int i=0;i<n;i++){
            b[a[i]]++;
            for(int j=0;j<=max;j++){
                if(b[j]>1){
                    System.out.println(j+" ");
                }
            }
        }
}
    
}