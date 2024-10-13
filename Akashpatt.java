import java.util.*;
class AkashPatt{
    public static void main(String [] args){
        int n;
        Scanner x=new Scanner(System.in);
	  System.out.println("enter any number");
        n=x.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1||i==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
for(int j=0;j<=n*2;j++){
if(j==1||i+j==n+1)
System.out.println("* ");
else
System.out.println("  ");
}
            System.out.println("");
        }
}
}