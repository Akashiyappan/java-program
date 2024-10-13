import java.util.*;
public class Jagged {
    public static void main(String[] args) {
       Scanner x =new Scanner(System.in);
       int n=x.nextInt();
       int a[][]=new int[n][];
       for(int i=0;i<n;i++){
        int m=x.nextInt();
        a[i]=new int[m];
        for(int j=0;j<m;j++){
            a[i][j]=x.nextInt();
        }
       }
       x.close();
       for(int i=0;i<n;i++){
        for(int j=0;j<a[i].length;j++){
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
       } 
    }
}
