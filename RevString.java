import java.util.*;
public class RevString {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        String str=x.next();
        /*char ch;
        String b="";
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            b=ch+b;
        } */
        for(int i=str.length()-1;i>=0;i--){
            char b=str.charAt(i);
            System.out.print(b+"");

        }
        
    }
}
