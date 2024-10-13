import java.util.*;
public class Decimaltooctal {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int rem=0,octal=0,i=1;
        while(n!=0){
            rem=n%8;
            octal+=rem*i;
            i=i*10;
            n=n/8;

        }
        System.out.println(octal);
    }
}
