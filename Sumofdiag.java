import java.util.*;
public class Sumofdiag {
    public static void main(String[] args) {
    Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int m=x.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
            a[i][j]=x.nextInt();
        }
        int ak=0;
        for(int i=0;i<n;i++){
            
            for(int j=0;j<m;j++){
                if(i==j){
                    ak+=a[i][j];
                }
                if(i+j==n-1){
                    ak+=a[i][j];
                }
            }   
        }
        System.out.print(ak);
        
    }
}
