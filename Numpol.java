import java.util.*;
class Numpol{
public static void main(String [] args)throws Exception 
{
int temp=0,sum=0,n,r;
Scanner x=new Scanner(System.in);
System.out.println("enter the number");
n=x.nextInt();
temp=n;
while(n>0){
r=n%10;
sum=(sum*10)+r;
n=n/10;

}
if(temp==sum)
{
System.out.println("polindrom");
}
else{
System.out.println("not");
}
}
}