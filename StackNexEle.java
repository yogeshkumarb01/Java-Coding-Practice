import java.util.*;
public class StackNexEle {
  public static void main(String args[]){
      int[] arr = {3,2,4,5,7,9,23,56,78,1,23};
      int[] ans = NextElement(arr);
      for(int a : ans){
        System.out.print(a+" ");
      }
      System.out.println();
  }

  public static int[] NextElement(int[] arr){
    Stack<Integer> st = new Stack<>();
    int[] ans = new int[arr.length];
    for(int i = arr.length-1;i>=0;i--){

      // pop element in stack
      while(st.size()>0 && st.peek()<arr[i]){
        st.pop();
      }


      // update ans
      if(st.size()==0){    // stack is 0
        ans[i] = -1;
      } else{
        ans[i] = st.peek();
      }

      // push element in stack
      st.push(arr[i]);
    }
  return ans;
}
}
