import java.util.*;
public class Targetrevloop {
    public static void main(String [] args){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int a[]=new int[n];
        int tar=x.nextInt();
        for(int i=0;i<n;i++){
            a[i]=x.nextInt();
        }
        int loop;
        if(n%tar==0){
            loop=n/tar;
        }
        else{
            loop=(n/tar)+1;
        }
        int y=0;
        for(int j=0;j<loop;j++){
        int h=tar-1;
        int tar1=tar-y;
        for(int i=y;i<(tar1/2)+y;i++){
            int temp=a[i];
            a[i]=a[h];
            a[h]=temp;
            h--;
        }
        tar+=tar;
        y=y+tar;
    }
        /*int h1=n-1;
        int n1=n-tar;
        for(int i=tar;i<(n1/2)+tar;i++){
            int temp=a[i];
            a[i]=a[h1];
            a[h1]=temp;
            h1--;
        }*/
        for(int i=0;i<n;i++){
            System.out.print(a[i]+"  ");
        }
    }
}
