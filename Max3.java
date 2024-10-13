import java.util.Scanner;
public class Max3 {
    public static void main(String [] args){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int a[]=new int[n];
        int k=x.nextInt();
        for(int i=0;i<n;i++){
            a[i]=x.nextInt();
        }
        for(int i=0;i<=n-k;i++){
            int temp=a[i];
            for(int j=i+1;j<i+k;j++){
                if(a[j]>temp){
                    temp=a[j];
                }
            }
            System.out.print(temp+" ");
        }
    }
}
