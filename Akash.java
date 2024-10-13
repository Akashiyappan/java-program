import java.util.*;
public class Akash {
    public static void main(String[] args) {
        int a=3;
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                if(i==1||i==a||j=1||j==a){
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
    }
}