import java.util.*;
class Numbertostring {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        String[] one = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"}; 
        String[] eleven = new String[] {"", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] two = new String[] {"",  "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        int n=x.nextInt();
        String s1="";
        int c=0;
        int temp=n;
        int rem=0;
        int rem2=0;
        int len=0;
        int temp1=n;
        while(temp1!=0){
            temp1=temp1/10;
            len++;
        }
        
        while(n!=0){
            rem=n%10;
            c++;
            if(c==1){
                s1=s1+one[rem];
            }
            else if(c==2){
                rem2=temp%10;
                if(rem==1&&len!=3){
                    s1=eleven[rem+1];
                }
                else if(rem2==0){
                    s1=two[rem];
                }
                else{
                    s1=two[rem]+' '+s1;
                }
                
            }
            else if(c==3){
                s1=one[rem]+" Hundred "+s1;
            }
            n=n/10;
        }
        System.out.println(s1);
    }
}