import java.util.*;
class Cpattern{
public static void main (String[] args)throws Exception{
int n=6;
for(int i=1;i<=n;i++){
for(int j=1;j<=n;j++){
if(i==1||i==n||j==1){
System.out.print("*");
}
else{
System.out.print(" ");
}

}
System.out.println("");
}
}
}