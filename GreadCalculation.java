import java.util.*;
public class GreadCalculation {
    public static void main(String [] args){
        Scanner x=new Scanner(System.in);
        System.out.println("enter number of Subject");
        int subcount=x.nextInt();
        int a[]=new int[subcount];
        double sum=0;
        for(int i=1;i<=subcount;i++){
            System.out.println("enter "+i+"st subject marks");
            a[i-1]=x.nextInt();
            sum+=a[i-1];
        }
        double avg=sum/subcount;
        System.out.println("total mark is  "+sum);
        System.out.println("avg mark is  "+avg);
        if(avg>90){
            System.out.println("Grade is -->A+");
        }
        else if(avg>80){
            System.out.println("Grade is -->A");
        }
        else if(avg>70){
            System.out.println("Grade is -->B+");
        }
        else if(avg>60){
            System.out.println("Grade is -->B");
        }
        else if(avg>50){
            System.out.println("Grade is -->C+");
        }
        else{
            System.out.println("Fail");
        }
    }
}