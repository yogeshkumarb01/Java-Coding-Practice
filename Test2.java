// Level 1: Auto-generate and fill an array of 100 integers based on the below rules.
//   Each number has to be a multiple of 9 starting from 9 (9, 18, 27, 36,….)
// Take the last two digits of each number. If the difference between the last two digits 
//is  3, make the number a negative value.
  
// Example:
// 36. The difference between 3 and 6 is 3. Hence it should be stored as -36
//   63. The difference between 6 and 3 is 3. Hence it should be stored as -63.
// Another example is 225. The last two digits are 2 and 5. The difference is 3. 
// The number should be stored as -225.
// Display all the 100 such numbers.
// has context menu


// has context menu


// import java.util.*;
// public class Test2 {
//    public static void main(String[] args){
//   String str = " ";
//     int[] arr = new int[10];
    
//    for(int i=1;i<arr.length;i++){
//     arr[i] = 9*i;
//    }
//    for(int i=1;i<arr.length;i++){
//     if((i+1)-i==3){
//       System.out.print(arr[i]+""+arr[i+1]);
//     }
//     else{
//       System.out.print(arr[i]+" ");
//     }
//    }
//   }
// }
import java.util.*;
class Test2{
     public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int[] arr = new int[100];
      for(int i=1;i<10;i++){
       arr[i] = i*9;
      }
      
       for(int i=0;i<arr[i];i++){
           if(arr[i]-arr[i+1]==3 && arr[i+1]-arr[i]==-3){
            System.out.print(arr[i]);
           }
           
          }
      for(int i=1;i<10;i++){
        System.out.print(arr[i]+" ");
      }
       }
     

    //   Random r = new Random();
    //   int[] arr = new int[100];

    //   for(int i=0;i<100;i++){
    //     int num = r.nextInt(90)+10;
    //     if(isDiff(num)){
    //       arr[i]=-num;
    //     }else{
    //       arr[i]=num;
    //     }
    //   }
    //   for(int num : arr){
    //     System.out.print(num+" ");
    //   }
    //  }




  public static boolean isDiff(int num){
    int  lastdigit = num%10;
    int seconddigit = (num/10)%10;
    return Math.abs(lastdigit-seconddigit)==3;
  }
}