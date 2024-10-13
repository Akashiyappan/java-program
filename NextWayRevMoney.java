import java.util.*;
public class NextWayRevMoney {
    public static void main(String [] args){
        Scanner x=new Scanner(System.in);
        float mon=x.nextFloat();
        mon=mon*100;
        int money=(int)mon;
        int a[]={0,0,0,0,0,0};
        while(money>0){
            if(money-1000 >=0){
                a[5]+=1;
                money-=1000;
            }
            else if(money-500>=0){
                a[4]+=1;
                money-=500;
            }
            else if(money-200>=0){
                a[3]+=1;
                money-=200;
            }
            else if(money-100>=0){
                a[2]+=1;
                money-=100;
            }
            else if(money-40>=0){
                a[1]+=1;
                money-=40;
            }
            else if(money-20>=0){
                a[0]+=1;
                money-=20;
             }
            if(money==0){
                break;
            }
         }
        for(int i=0;i<6;i++){
            System.out.print(a[i]+" ");
        }
    }
}

