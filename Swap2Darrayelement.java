import java.util.*;
public class Swap2Darrayelement {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int m=x.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=x.nextInt();
            }
            
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(j==0){
                    int temp=a[i][j];
                    a[i][j]=a[i][m-1];
                    a[i][m-1]=temp;
                }
                System.out.print(a[i][j]);
            }
            System.out.println();
        }

    }
}
