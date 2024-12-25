import java.util.*;
 
public class Cheackpair {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        String s=x.next();
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        int c=0;
        for(int i=0;i<ch.length-1;i++){
            if(ch[i]==ch[i+1]){
                c++;
                i++;
            }
        }
        System.out.println(c);
    }
}
