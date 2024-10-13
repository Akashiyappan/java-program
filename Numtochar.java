import java.util.Scanner;

public class Numtochar {
    public static void main(String [] args){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        char ch[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','x','y','z'};
        while(n!=0){
            int temp=n%10;
            Str+=ch[temp-1];
            n=n/10;
        }
    }    
}
