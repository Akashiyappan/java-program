import java.util.*;
public class A11B21 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        String s=x.next();
        char ch[]=s.toCharArray();
        int n=0;
        char ch1='\0';
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='0'&&ch[i]<='9'){
                n=(ch[i]-48)+n*10;
            }
            else{
                for(int j=0;j<n;j++){
                    System.out.print(ch1+" ");
                }
                ch1=ch[i];
                if(n!=ch.length-1){
                    n=0;
                }
            }
        }
        for(int j=0;j<n;j++){
            System.out.print(ch1+" ");
        }
    }
}
