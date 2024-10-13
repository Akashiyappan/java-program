import java.util.*;
class Loveyou{
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
            System.out.println("");
        }
System.out.println();
	for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1||i==n||i==1||j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");

        }
System.out.println();
	for(int i=1;i<=n;i++){
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
System.out.println("");
	for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||j==1||i==n||i==n/2+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");

        }
System.out.println("");
	for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==n||j==1||j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
System.out.println();
	for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==n||j==1||j==n||i==1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println("");
        }
          for(int i=1;i<=n-1;i++){
            for(int j=1;j<=n;j++){
                if(j==1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println("");
        }
System.out.println();
	for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||j==n||j==1||i==(n/2)+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
System.out.println();
	for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1||j==n||i==j){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
System.out.println();
for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==n||j==1||j==n||i==1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println("");
        }
          for(int i=1;i<=n-1;i++){
            for(int j=1;j<=n;j++){
                if(j==n||i==n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println("");
        }
System.out.println("");
	for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==n||j==1||j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}