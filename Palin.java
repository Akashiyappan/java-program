import java.util.*;
public class Palin
{
public static void main(String[] args)
{
int a,sum=0,rem=0,temp;
Scanner s=new Scanner(System.in);
a=s.nextInt();
temp=a;
while(a!=0)
{
rem=a%10;
sum=(sum*10)+rem;
a=a/10;
}
if(temp==sum)
System.out.println("palindrome");
else
System.out.println("not palindrome");

}
}
