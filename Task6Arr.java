import java.util.*;
class Task6Arr{
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int m=x.nextInt();
        int a[] =new int[n];
        int b[] =new int[m];
        l=n+m;
        int [] ab=new int[l];
        for(int i=0;i<n;i++){
            a[i]=x.nextInt();

        }
        for(int j=0;j<m;j++){
            b[j]=x.nextInt();
        }
        for(int k=0;k<l;k++){
            for(int i=0;i<n;i++){
                ab[k]=a[i];
            }
        }
        for(int k=0;k<l;k++){
            for(int i=0;i<n;i++){
                ab[n+i]=b[i];
            }
        }
        for(int k=0;k<l;k++){
            System.out.println(ab[k]);
        }

	}
}