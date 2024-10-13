import java.util.*;
public class Apatt {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n;
        n=x.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+n;j++){
                if(i+j==n+1||i+n==j){
                    System.out.print("*");
                }
                else if(i==(n/2)+1&&i+j>=n+1&&i+n>=j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
