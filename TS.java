import java.util.*;
public class TS{
  public static void main(String args[]){
    
    int[] arr = {11,3,7,9,14,2};
    int target = 17;
    
    HashMap<Integer,Integer>map = new HashMap<>();
    int[] ans = new int[2];
        for(int i=0;i<arr.length;i++){
      int sno = target-arr[i];
      if(map.containsKey(sno)){
        ans[0] = map.get(sno);
        ans[1] =  i;
        break;

      }
        map.put(arr[i],i);
    }
    System.out.println(ans[0]+" "+ans[1]);
  }

  
}

