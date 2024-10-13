import java.util.*;
public class Wordreverce {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        String str=x.nextLine();
        String b="";
        char ch;
        String c="";
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            b=b+ch;
            if(ch==' '){
                c=b+c;
                b="";
            }
            
        }
        c=b+" "+c;
        System.out.println(c);
    }
}
