import java.util.*;
class Arraypair{
public static void main(String [] args)throws Exception{
int n,a,c,d;
Scanner s=new Scanner(System.in);
System.out.println("enter array size");
n=s.nextInt();

int[] arr=new int[n];


System.out.println("enter element");

for (int i=0;i<n;i++){
arr[i]=s.nextInt();
}
for (int i=0;i<n;i++){
System.out.println("Elements are-"+arr[i]);
}
System.out.println("enter 1st target");
a=s.nextInt();
System.out.println("enter 2nd target");
c=s.nextInt();
System.out.println("enter 3rd target");
d=s.nextInt();
for (int i=0;i<n;i++){
for (int j=i+1;j<n;i++){
int b=arr[i]+arr[j];
if(b==a){
System.out.println(i+"   "+j);
}
if(b==c){
System.out.println(i+"   "+j);
}
if(b==d){
System.out.println(i+"   "+j);
}
}
}

}
}