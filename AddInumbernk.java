import java.util.*;
public class AddInumbernk {
    public static void main(String [] srgd){
        Scanner x=new Scanner(System.in);
        String s1=x.nextLine();
        String s2=x.nextLine();
        int n1=0;
        int n2=0;
        char ch1[]=s1.toCharArray();
        char ch2[]=s2.toCharArray();
        int i=0;
        int j=0;
        while(ch1[i]!='+'){
            n1=(n1*10)+(ch1[i]-48);
            i++;
        }
        while(ch1[j]!='+'){
            n2=(n2*10)+(ch2[j]-48);
            j++;
        }
        i+=2;
        j+=2;
        int n3=0;
        int n4=0;
        for(int k=i;k<ch1.length;k++){
            n3=(n3*10)+(ch1[k]-48);
            
        }
        for(int k=j;k<ch2.length;k++){
            n4=(n4*10)+(ch2[k]-48);
        }
        
        int ans1=n1+n2;
        int ans2=n3+n4;
        System.out.println(ans1+"+i"+ans2);
    }
}
