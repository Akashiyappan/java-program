import java.util.*;
class Wpatt{
    public static void main(String [] args){
        int n;
        Scanner x=new Scanner(System.in);
n=x.nextInt();
for(int i=1;i<=n;i++){
            for(int j=1;j<=n*2;j++){
                if(i==j||i+j==(n*2)+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
		for(int j=1;j<=n*2;j++){
                if(i==j||i+j==(n*2)+1){
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