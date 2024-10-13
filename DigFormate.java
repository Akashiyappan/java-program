import java.util.*;
import java.text.DecimalFormat;
class Digformate{
public static void main (String[] args)throws Exception{
Scanner x=new Scanner(System.in);
int n=x.nextInt();
int v=x.nextInt();
double a=n/v;
DecimalFormat f=new DecimalFormat("0.00");
System.out.println(f.format(a));
}
}