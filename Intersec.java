import java.util.*;
class Intersec {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int m=x.nextInt();
        int n=x.nextInt();
        int o=x.nextInt();
        int a[]=new int[m];
        int b[]=new int[n];
        int c[]=new int[o];
        HashSet<Integer> inter1=new HashSet<>();
        HashSet<Integer> inter2=new HashSet<>();
        for(int i=0;i<m;i++){
            a[i]=x.nextInt();
            inter1.add(a[i]);
        }
        for(int i=0;i<n;i++){
            b[i]=x.nextInt();
            if(inter1.contains(b[i])){
                inter2.add(b[i]);
            }
        }
        for(int i=0;i<o;i++){
            c[i]=x.nextInt();
            if(inter1.contains(c[i])&&inter2.contains(c[i])){
                System.out.print(c[i]+"     ");
            }
        }
        
    }
}