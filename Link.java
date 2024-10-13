import java.util.*;
class Link{
public static void main(String [] args){
ArrayList<Integer> a=new ArrayList<Integer>(1,2,3,4,4,5);
for(int i=1;i<a.length;i++){
for(int j=0;j<a.length;j++){
if(a[i]==a[j]){
System.out.println(a[j]);
}
}
}

}
}