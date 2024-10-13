import java.util.*;
public class Rotate {
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
        int c=x.nextInt();
        while(c!=0){
            for(int i=0;i<n;i++){
                for(int j=0;j<m-1;j++){
                    int temp=a[i][j];
                    a[i][j]=a[i][j+1];
                    a[i][j+1]=temp;
                }
            }
            c--;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(a[i][j]+" ");
            }  
            System.out.println(" ");
        }

    }
}
