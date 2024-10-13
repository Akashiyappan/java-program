import java.util.*;
class Removeduplicate{
public static void main(String [] args)throws Exception{
int[] arr=new int[]{1,2,3,4,4,5};
int j=0;
for(int i=1;i<arr.length;i++){

if(arr[i]==arr[j]){
j++;
arr[j]=arr[i];
System.out.println(arr[j]);

}

}
}
}