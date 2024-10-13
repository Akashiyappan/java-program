import java.util.*;
class Vowels{
public static void main(String [] args)throws Exception{
String a="sdfgh";
char ch;
int count=0;
for(int i=0;i<a.length();i++){
ch=a.charAt(i);
switch(ch)
{
case'a':
count++;
break;
case'e':
count++;
break;
case'i':
count++;
break;
case'o':
count++;
break;
case'u':
count++;
break;
}
}
if(count==0){
System.out.println("no");
}
else{
System.out.println("yes");
}
}
}