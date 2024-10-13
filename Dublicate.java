import java.util.*; 
public class Dublicate {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=x.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=i+1;j<n;j++){
                if(a[i]%a[j]==0)
                c++;
            }
            if(c==0){
                System.out.print(a[i]);
            }
        }

    }
}
