import java.util.*;
public class Sqrtsum {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        while(n!=0){
            int m=(int)Math.sqrt(n);
            System.out.print(m+" ");
            n-=m*m;
        }

    }
}
