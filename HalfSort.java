
import java.util.*;
class HalfSort {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=x.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n/2;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
            for(int j=n/2;j<n-1;j++){
                if(a[j]<a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
}
        
       for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        } 
    }
}