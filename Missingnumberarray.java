import java.util.*;
class Missingnumberarray{
public static void main(String [] args)throws Exception
{
int n=5,cheack,ans;
int sum=0;
int[] a=new int[]{1,2,3,5};
for ( int i=0;i<4;i++){
System.out.println(a[i]);
sum=a[i]+sum;
}
cheack=(n*(n+1))/2;

ans=cheack-sum;
System.out.println("missing element is--->"+ans);
}
}