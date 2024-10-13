import java.util.*;
class Stringpollindrom{
public static void main(String [] args)throws Exception{
String a="aka";
String b="";
char ch;
for(int i=0;i<a.length();i++)
{
ch=a.charAt(i);
b=ch+b;
}
if(a.equals(b)){
System.out.println("yes");
}
else{
System.out.println("nno");
}
}
}