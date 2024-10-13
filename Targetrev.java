import java.util.*;
public class Targetrev {
    public static void main(String [] args){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int a[]=new int[n];
        int tar=x.nextInt();
        for(int i=0;i<n;i++){
            a[i]=x.nextInt();
        }
        int h=tar-1;
        for(int i=0;i<tar/2;i++){
            int temp=a[i];
            a[i]=a[h];
            a[h]=temp;
            h--;
        }
        int h1=n-1;
        int n1=n-tar;
        for(int i=tar;i<(n1/2)+tar;i++){
            int temp=a[i];
            a[i]=a[h1];
            a[h1]=temp;
            h1--;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+"  ");
        }
    }
}
