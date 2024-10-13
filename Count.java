import java.util.*;
public class Count
{
public static void main(String[] args)
{
int a,rem=0,max=0,c=0;
Scanner s=new Scanner(System.in);
a=s.nextInt();
while(a!=0)
{
rem=a%10;
if(rem>max)
{
max=rem;
}
a=a/10;
if(max==rem)
{
c++;
}

}
System.out.println(c);
}
}