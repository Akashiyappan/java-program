import java.util.*;
public class Digit
{
public static void main(String[] args)
{
int a;
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int c=0;
while(n!=0)
{
c++;
n/=10;
}
System.out.println(c);
}
}