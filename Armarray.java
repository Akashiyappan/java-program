import java.util.*;
class Armarray{
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=x.nextInt();
        }
        for(int i=0;i<n;i++){
            int rem=0,arm=0;
            int temp=arr[i];
            while(temp!=0){
                rem=temp%10;
                arm=(rem*rem*rem)+arm;
                temp/=10;
            }
            if(arm==arr[i]){
                System.out.println("armstrong"+arr[i]);
            }
        }
    }
}