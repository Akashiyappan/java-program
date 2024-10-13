import java.util.Scanner;

public class Repeat_elementArray {
    public static void main(String[] args) {
              Scanner x=new Scanner(System.in);
        System.out.println("enter size");
        int n=x.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=x.nextInt();
        }
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    c++;
                    a[j]=-1;
                }
            }
            if(c>=1 && a[i]>0){
            System.out.println(a[i]);
            }
        }
    }
}
