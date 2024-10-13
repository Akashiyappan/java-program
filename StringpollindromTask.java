import java.util.*;
public class StringpollindromTask {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        String str=x.next();
        char ch;
        String b="";
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            b=ch+b;
        } 
        if(str.equals(b)){
            System.out.println("polindrom");
        }
        else{
            System.out.println("polindrom");
        }
    }
}
