import java.util.*;
class Threeocc
{
	public static void main(String[] args) {
	    Scanner x=new Scanner(System.in);
	    int n=x.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<n;i++){
	        a[i]=x.nextInt();
	    }
	    for(int i=0;i<n-1;i++){
	        int c=1;
	        if(a[i]!=-1){
	        for(int j=i+1;j<n;j++){
	            if(a[i]==a[j]){
	                c++;
	                a[j]=-1;
	            }
	        }
	        if(c%2==1){
	            System.out.print(a[i]+" ");
	        }
	    }
	    }
	}
}