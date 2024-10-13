import java.util.*;
class Large_Prime_factor{
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int b=0;
        for(int i=1;i<=n;i++)
        { 
            int c=0;
            if(n%i==0){
                for(int k=1;k<=n;k++){
                    if(i%k==0){
                        c++;
                    }
                }
            }
            if(c==2){
                b=i;
            }
        }
        System.out.println(b);
    }
}