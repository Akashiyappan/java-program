import java.util.*; 
public class Qea4 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int sum=0;
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=x.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=x.nextInt();
        }
        int h=0;
        for(int i=0;i<n;i++){
            sum+=a[i]-b[i];
            if(sum>h){
                h=sum;
            }
        }
        System.out.println(h);
    }
}
