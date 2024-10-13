import java.util.*;
public class Kpatt {
    public static void main(String [] args){
        Scanner x=new Scanner(System.in);
    int n;
    n=x.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(j==1||i+j==n+1){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
        for(int k=1;k<=n;k++){
            for(int j=1;j<=n;j++){
                if(j==1||k==j){
                    System.out.print("* ");;
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
