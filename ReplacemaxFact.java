import java.util.*;
public class ReplacemaxFact {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int m=x.nextInt();
        int a[][]=new int[n][m];
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=x.nextInt();
                if(max<a[i][j]){
                    max=a[i][j];
                }
            }
            
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(max%a[i][j]==0){
                    a[i][j]=max;
                    
                }
                System.out.print(a[i][j]+" ");
            }
            System.out.println();

        }
    }
}
