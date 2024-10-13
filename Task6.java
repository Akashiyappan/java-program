import java.util.*;
class Task6{
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int m=x.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        int a[] =new int[n];
        int b[] =new int[m];
        for(int i=0;i<n;i++){
            a[i]=x.nextInt();
        }
        for(int j=0;j<m;j++){
            b[j]=x.nextInt();
        }
        for(int i=0;i<n;i++){
            al.add(a[i]);
        }
        for(int j=0;j<m;j++){
            al.add(b[j]);
        }
        Collections.sort(al); 
         int size = al.size(); 
        for(int i=0;i<size;i++){
            int num1=al.get(i);
            int c=0;
            for(int j=i+1;j<size;j++){
                
                int num2=al.get(j);
                if(num1==num2){
                    c++;
                }
            }
            if(c==0){
                System.out.print(num1+" ");
            }
            
        }
    }
}