public class majorityele {
     public static void main(String args[]){
      int[] arr = {5,7,4,7,4,3,4,4,7,4,4,7,4,4};
      System.out.println(majoele(arr,arr.length));
     }
     public static int majoele(int[] arr,int n){
      int candidate = arr[0];
      int votes = 1;
      for(int i=0;i<n;i++){
        if(candidate ==arr[i]){
          votes++;
        }else{
          votes--;
        }
        if(votes==0){
          candidate = arr[i];
          votes=1;
        }
      }
      int vote =0;
      for(int val : arr){
        if(val == candidate){
          vote++;
        }
      }


       if(vote>n/2){
        return candidate;
       } 
       else{
        return -1;
       }
      }
     }

