import java.util.*;
public class CGPA {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("enter number of 4 creatid  course");
        int n4=x.nextInt();
        System.out.println("enter number of 3 creatid  course");
        int n3=x.nextInt();
        System.out.println("enter number of 2 creatid  course");
        int n2=x.nextInt();
        System.out.println("enter number of 2 creatid  course");
        int n1=x.nextInt();
        double all=(n4*4)+(n3*3)+(n2*2)+(n1*1);
        double fin=0.00;
        for(int i=1;i<=n4;i++){
            System.out.println("enter 4 creadit  subject "+i+"th creatid");
            String s=x.next();
            if(s.equals("O")){
                fin+=4*10;
            }
            else if(s.equals("A+")){
                fin+=4*9;
            }
            else if(s.equals("A")){
                fin+=4*8;
            }
            else if(s.equals("B+")){
                fin+=4*7;
            }
            else if(s.equals("B")){
                fin+=4*6;
            }
            else if(s.equals("C+")){
                fin+=4*5;
            }
        }
        for(int i=1;i<=n3;i++){
            System.out.println("enter 3 creadit  subject "+i+" th creatid");
            String s=x.next();
            if(s.equals("O")){
                fin+=3*10;
            }
            else if(s.equals("A+")){
                fin+=3*9;
            }
            else if(s.equals("A")){
                fin+=3*8;
            }
            else if(s.equals("B+")){
                fin+=3*7;
            }
            else if(s.equals("B")){
                fin+=3*6;
            }
            else if(s.equals("C+")){
                fin+=3*5;
            }
        }
        for(int i=1;i<=n2;i++){
            System.out.println("enter 2 creadit  subject "+i+" th creatid");
            String s=x.next();
            if(s.equals("O")){
                fin+=2*10;
            }
            else if(s.equals("A+")){
                fin+=2*9;
            }
            else if(s.equals("A")){
                fin+=2*8;
            }
            else if(s.equals("B+")){
                fin+=2*7;
            }
            else if(s.equals("B")){
                fin+=2*6;
            }
            else if(s.equals("C+")){
                fin+=2*5;
            }
        }
        for(int i=1;i<=n1;i++){
            System.out.println("enter 1 creadit  subject "+i+" th creatid");
            String s=x.next();
            if(s.equals("O")){
                fin+=1*10;
            }
            else if(s.equals("A+")){
                fin+=1*9;
            }
            else if(s.equals("A")){
                fin+=1*8;
            }
            else if(s.equals("B+")){
                fin+=1*7;
            }
            else if(s.equals("B")){
                fin+=1*6;
            }
            else if(s.equals("C+")){
                fin+=1*5;
            }
        }
        double ans=fin/all;
        System.out.printf("%.2f",ans);
    }
}
