import java.util.*;
public class Compliment {
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        String s="";
        while(n!=0){
            int rem=n%2;
            s=rem+s;
            n=n/2;
        }
        char ch[]=s.toCharArray();
        String com1="";
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='0'){
                com1+=1;
            }
            else{
                com1+=0;
            }
        }
        System.out.println(com1);
        char ch1[]=com1.toCharArray();
        int rem=0;
        for(int i=ch1.length-1;i>=0;i--){
            if(ch1[i]=='0'){
                ch1[i]='1';
                rem=0;
                break;
            }
            else{
                ch1[i]='0';
                rem=1;
            }
        }
        String st="";
        int k=0;
        if(rem==1){
            st+=1;
            k=1;
        }
        
        for(int i=0;i<ch1.length;i++){
            if(k==0&&ch1[i]=='0'){
                k=1;
            }
            else{
                st+=ch1[i];
            }
        }
        System.out.println(st);
    }
}
