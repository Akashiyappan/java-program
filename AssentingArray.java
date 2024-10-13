import java.util.*;
public class AssentingArray {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=x.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }  
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
