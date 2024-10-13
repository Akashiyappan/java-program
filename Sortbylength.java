import java.util.Scanner;
public class Sortbylength {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        String str[]=new String[n];
        for(int i=0;i<n;i++){
            str[i]=x.nextLine();
        }
        
        for(int i=0;i<n;i++){
            System.out.println(str[i]);
        }
        
    }
}
