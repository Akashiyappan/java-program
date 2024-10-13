import java.util.*;
class T6{
public static void main (String[] args)throws Exception{
Scanner x=new Scanner(System.in);
int n=x.nextInt();
int m=x.nextInt();
int l=n+m;
int a[]=new int[n];
int b[]=new int[m];
int ab[]=new int[l];
for(int i=0;i<n;i++){
a[i]=x.nextInt();
}
for(int i=0;i<m;i++){
b[i]=x.nextInt();
}
for(int i=0;i<n;i++){
ab[i]=a[i];
}
for(int j=0;j<m;j++){
ab[j+n]=b[j];
}
Arrays.sort(ab);
for(int i=0;i<l;i++){
int c=0;
for(int j=i+1;j<l;j++){
if(ab[i]==ab[j])
c++;
}
if(c==0)
System.out.print(ab[i]+" ");
}
}
}