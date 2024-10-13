import java.util.*;
class Trymap{
public static void main (String[] args)throws Exception{
int no=153,temp=0,rem,arm=0;
no=temp;
while(temp>0){
rem=temp%10;
arm=(rem*rem*rem)+temp;
temp=temp/10;
}
if(arm==no){
System.out.println("ni crt thala");

}
else{
System.out.println("wasted");
}
}
}