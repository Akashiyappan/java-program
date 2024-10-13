import java.util.*;
public class Amicable {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int a=x.nextInt();
        int b=x.nextInt();
        int sum1=0,sum2=0;
        for(int i=1;i<a;i++){
            if(a%i==0){
                sum1+=i;
            }
        }
        for(int i=1;i<b;i++){
            if(b%i==0){
                sum2+=i;
            }
        }
        if(a==sum2&&b==sum1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
