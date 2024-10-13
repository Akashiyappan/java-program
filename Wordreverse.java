import java.util.*;
public class Wordreverse {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        String str1=x.nextLine();
        String sarr[]=str1.split(" ");
        for(int i=0;i<sarr.length;i++){
            char ch[]=sarr[i].toCharArray();
            String str2="";
            for(int j=0;j<ch.length;j++){
                str2=ch+str2;
            }

        }
        System.out.println(str2);
    }
}
