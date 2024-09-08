import java.util.*;
public class TwoSum {
  public static void main(String args[]){
    
    int[] arr = {11,3,7,9,14,2};
    int target = 14;
    int[] ans = new int[2];
    HashMap<Integer,Integer>map = new HashMap<>();
    
        for(int i=0;i<arr.length;i++){
      int sno = target-arr[i];
      if(map.containsKey(sno)){
        ans[0] = map.get(sno);
        ans[1] =  i;
        break;

      }
        map.put(arr[i],i);
    }
    System.out.print(ans[0]+" "+ans[1]);
  }

  
}
