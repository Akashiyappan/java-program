import java.util.Scanner;

public class Array3D {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int t=x.nextInt();
        int n=x.nextInt();
        int m=x.nextInt();
        int a[][][]=new int [t][n][m]; 
        for(int k=0;k<t;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    a[k][i][j]=x.nextInt();
                }
            }
        }
        int sum[]=new int[t];
        for(int k=0;k<t;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    
                    sum[k]+=a[k][i][j];
                }
            }
        }
        for(int i=0;i<t;i++){
            System.out.print(sum[i]+" ");
        }

    }
}
