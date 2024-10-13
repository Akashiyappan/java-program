import java.util.*;
public class Rev
{
public static void main(String[] args)
{
int a,sum=0,rem=0;
Scanner s=new Scanner(System.in);
a=s.nextInt();
while(a!=0)
{
rem=a%10;
sum=(sum*10)+rem;
a=a/10;
}
System.out.println(sum);
}
}
