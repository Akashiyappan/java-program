import java.util.*;
class Main {
    char a;
    String b;
    Main(char a,String b)
    {
        this.a=a;
        this.b=b;
    }
    void display()
    {
        System.out.println("a="+a+"b="+b);
    }
    public static void main(String[] args) {
        Main obj=new Main('A',"terv");
        obj.display();
    }
}
