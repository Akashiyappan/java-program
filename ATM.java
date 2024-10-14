import java.util.*;
public class ATM {
    public static void main(String [] args){
        Scanner x=new Scanner(System.in);
        System.out.println("Welcome to the akash ATM✌️😍");
        System.out.println("enter initial balance");
        int balance=x.nextInt();
        int ch=9;
        while(ch!=4){
            System.out.println("1-->deposite 2-->withdraw 3-->check balance 4-->Exit");
            ch=x.nextInt();
            switch(ch){
                case 1:
                    Deposite dep=new Deposite();
                    balance=dep.depos(balance);
                    break;
                case 2:
                    Withdraw wi=new Withdraw();
                    balance=wi.wdraw(balance);
                    break;
                case 3:
                    Checkbal cb=new Checkbal();
                    cb.check(balance);
                    break;
                case 4:
                    System.out.println("Thanks for visiting akash ATM");
            }
        }
    }
}
class Deposite{
    public static int depos(int balance){
        Scanner x=new Scanner(System.in);
        System.out.println("Enter amount");
        int amount=x.nextInt();
        return amount+balance;
    }
}
class Withdraw{
    public static int wdraw(int balance){
        Scanner x=new Scanner(System.in);
        System.out.println("Enter amount");
        int amount=x.nextInt();
        return balance-amount;
    }
}
class Checkbal{
    public static void check(int balance){
        System.out.println("your balance is :"+balance);
        
    }
}
