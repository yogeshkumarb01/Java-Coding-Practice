public class sortedRotated{
  public static void main(String args[]){
    int[] arr = {6,8,11,10,12,3,4,5};
    System.out.println(minele(arr));
    
  }
  public static int minele(int[] arr){
      //find middle element
     int low=0,high=arr.length-1;
     while(low<high){
      int mid = (low+high)/2;
      if(arr[mid]<arr[high]){
        high = mid;

      }else{
        low=mid+1;
      }
     }

    return arr[low];
  }
}