import java.util.*;
public class TicketBooking {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int t=2;
        int n=3;
        int m=3;
        int a[][][]=new int [t][n][m]; 
        double pr[][]=new double[t][n];
        double price=100.00;
        for(int i=0;i<t;i++){
            for(int j=0;j<n;j++){
                pr[i][j]=price+40;
                price+=40;
            }
            price=200;
        }
        double mul=0;
        System.out.println("which screen u want");
        int screen=x.nextInt();
        System.out.println("which row u want");
        int row=x.nextInt();
        for(int k=0;k<t;k++){
            for(int i=0;i<n;i++){
                    if(k==screen-1&&i==row-1){
                        mul+=pr[k][i];
                    }
                }
        
        }
        System.out.println("your price is"+mul);

    }
}
