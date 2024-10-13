import java.util.Scanner;

public class Evencapitalinstring {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        String st="";
        String str=x.nextLine();
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]%2==0){
                int n=ch[i];
                n=n-32;
                ch[i]=(char)n;
            }
            st+=ch[i];
        }
        System.out.println(st);
    }
}
