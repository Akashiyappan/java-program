import java.util.*;
public class Acc1 {
    public static void main(String [] args){
        Scanner x=new Scanner(System.in);
        String s=x.nextLine();
        char ch[]=s.toCharArray();
        int ans=ch[0]-48;
        for(int i=1;i<s.length()-1;i+=2){
            if(ch[i]=='A'){
                ans=ans&(ch[i+1]-48);
            }
            else if(ch[i]=='B'){
                ans=ans|(ch[i+1]-48);
            }
            else if(ch[i]=='C'){
                ans=ans^(ch[i+1]-48);
            }
        }
        System.out.println(ans);
    }
}
