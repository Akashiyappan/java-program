import java.util.*;
class SeetArr {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int m=x.nextInt();
        int n=x.nextInt();
int c=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=x.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]==0){
                if(i==0&&a[i+1]==0){
                    a[i]=1;
                    c++;
                }
                else if(i==n-1&&a[i-1]==0){
                    a[i]=1;
                    c++;
                }
                else{
                    if(a[i-1]==0&&a[i+1]==0){
                        a[i]=1;
                        c++;
                    }
                }
            }
        }
System.out.print(c);
        if(m<=c){
        System.out.println("Try programiz.pro");
}
        else{
        System.out.println(c);
}
    }
}