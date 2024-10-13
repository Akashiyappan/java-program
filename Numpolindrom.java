import java.util.*;
class Numpolindrom{
public static void main(String [] args)throws Exception{
int n,rem,rev=0,temp;
Scanner s=new Scanner(System.in);
n=s.nextInt();
temp=n;
while(n>0)
{
rem=n%10;
rev=(rev*10)+rem;
n=n/10;
}
if(rev==temp)
{
System.out.println("polimdrom");

}
else{
System.out.println("not");
}
}
}