import java.util.*;
public class Unicenk {
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        String s=x.nextLine();
        char ch[]=s.toCharArray();
        int n=ch.length;
        for(int i=0;i<n;i++){
            int c=0;
            if(ch[i]!='*'){
                for(int j=i+1;j<n;j++){
                    if(ch[i]==ch[j]){
                        c++;
                        ch[j]='*';
                    }
                }
            }
            else{
                c=1;
            }
            if(c==0){
                System.out.print(ch[i]+" ");
            }
        }
    }
}
