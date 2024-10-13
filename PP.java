import java.util.*;
class PP{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}

class GfG
{
	public static int palinArray(int[] a, int n)
           {
               int rem=0,sum=0,temp=0,count=0;
               for(int i=0;i<n;i++){
                   temp=a[i];
                   while(a[i]>0){
                       rem=n%10;
                       sum=(sum*10)+rem;
                       n=n/10;
                   }
                   if(temp==sum){
                       count++;
                   }
                   if(n==count){
                       return 1;
                   }
               }
               return 0;
           }
}