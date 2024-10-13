import java.util.*;
public class Duplicate_ElementString {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        String str=x.nextLine();
        char b[]=str.toCharArray();
        for(int i=0;i<str.length()-1;i++){
            int c=0;
            for(int j=i+1;j<str.length()-1;j++){
                if(b[i]==b[j]){
                    c++;
                    b[j]=1;
                    
                }
            }
            if(c>1&&b[i]!=1)
            System.out.print(b[i]);
            b[i]=1;
        }
    }
}
