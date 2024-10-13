import java.util.*;
class RevArray {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=x.nextInt();
        }
            for(int j=n-1;j>=0;j--){
                System.out.println(arr[j]);
            }
        
    }
}