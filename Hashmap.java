import java.util.*;
class Hashmap{
public static void main (String[] args)throws Exception{
int[] arr={2,3,4,4,4,5,6,7,7,8,7};
HashMap<Integer,Integer> map=new HashMap<>();
for(int i=0;i<arr.length-1;i++){
if(map.containsKey(arr[i])){
map.remove(arr[i]);

}
map.put(arr[i],i);
}
map.forEach((k,v) ->System.out.println(k+" "));
}
}