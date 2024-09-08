import java.util.*;
// binary search 
public class binarysearch{
public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int target = sc.nextInt();
  int n = 7;
  int[] arr= new int[n];
  // int[] arr = new int[sc.nextInt()];
  for(int i=0;i<=n-1;i++){
    arr[i]=sc.nextInt();
  }
 

 bs(arr,target);
}
public static void bs(int[] arr,int target){
  // first
  int low = 0,high=arr.length-1;
  int first = -1;
  while(low<=high){
    int mid = (low+high)/2;
    if(arr[mid]==target){
      first = mid;
      
      high = mid-1;
    }
    else if(arr[mid]<target){
      high = mid-=1; //first left first half  so movie high mid-1
    }else{
      low = mid+=1;
    }
  }
  low = 0;
  high=arr.length-1;
  int last=-1;
  while(low<=high){
    int mid = low+high/2;
    if(arr[mid]==target){
      last = mid;
      low = mid+1;
    }
    else if(arr[mid]<target){
      low=mid+=1;  // first right second half so ,ove low = mid+1
    }
    else{
      high=mid-=1;
    }
  }
 System.out.println(first+" "+last);

  // second
}

}