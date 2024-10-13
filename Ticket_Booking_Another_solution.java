import java.util.*;
public class Ticket_Booking_Another_solution {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("WELCOME TO EGS CINEMAS");
        int t=2;
        int n=3;
        int m=3;
        int a[][][]={{{1,2,3},{4,5,6},{7,8,9}},{{1,2,3},{4,5,6},{7,8,9}}};
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
        System.out.println("SCREEN NUMBER:");
        int screen=x.nextInt();
        System.out.println("SEAT NUMBER:");
        int row=x.nextInt();
        for(int k=0;k<t;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(k==screen-1&&a[k][i][j]==row-1){
                        mul+=pr[k][i];
                    }
                }
            }
        }
        System.out.println("your price is"+mul);
    }
}
