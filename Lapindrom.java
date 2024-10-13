import java.util.*;
public class Lapindrom {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        String str=x.nextLine();
        char ch[]=str.toCharArray();
        int k=ch.length-1;
        int c=0;
        for(int i=(ch.length/2)-1;i>=0;i--){
            if(ch[i]!=ch[k]){
                System.out.println("no");
                c++;
                break;
            }
            k--;
        }
        if(c==0){
            System.out.print("yes");
        }
        
    }
}
