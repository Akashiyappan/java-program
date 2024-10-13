import java.util.*;
class Arm{
public static void main(String [] args)throws Exception{
int n,rem,arm=0,temp;
Scanner s=new Scanner(System.in);
n=s.nextInt();
temp=n;
while(n>0)
{
rem=n%10;
arm=(rem*rem*rem)+arm;
n=n/10;
}
if(arm==temp)
{
System.out.println("yes");

}
else{
System.out.println("not");
}
}
}