import java.util.*;
public class SumofCollem2D {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int m=x.nextInt();
        int a[][]=new int[n][m];
        int sum[]=new int [m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
            a[i][j]=x.nextInt();
        }
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                sum[i]+=a[i][j];
                }
            }
        
        for(int i=0;i<m;i++){
            System.out.print(sum[i]+" ");
        }
    }
}
