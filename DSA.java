import java.util.*;



public class DSA {
  public static void main(String[] args) {
    int[] arr1 = {1, 2, 2,3, 3,4, 4, 5};
    int[] arr2 = {4, 5, 6, 7, 8};
    System.out.println("Intersection: " + findIntersection(arr1, arr2));
}

public static HashSet<Integer>  findIntersection(int[] arr1, int[] arr2){
  
  HashSet<Integer> set = new HashSet<>();
  HashSet<Integer> intersectans = new HashSet<>();
  for(int n : arr1){
       set.add(n);     //set = [1,2,3,4,5]
    }
  
    for(int n1 : arr2){
      if(set.contains(n1)){    //n1 - [ 4,5,6,7,8]   
        intersectans.add(n1);    //intersectans - [4,5]
      }
    }
    return intersectans;   // [4,5]
}
}

  //  public static void main(String[] args){
  //    int[] arr = {1,2,3,4,3,6,5,2};
  //    System.out.println(firstrepeat(arr));
  //  }
  // public static int firstrepeat(int[] arr){
  // HashSet<Integer> set = new HashSet<>() ;
  
  // for(int i = arr.length-1 ; i >=0 ; i--){
  //   if(set.contains(arr[i])){
  //     return arr[i];
  //   }

  //   set.add(arr[i]);   //[1,2,3,4,5,6]
  // }
  
  


  //   return -1;
  // }




  // }
  //   // find repeating elements in array
  //   int[] arr1 = {10, 5, 3, 4, 3, 5, 6};
  //   int[] arr2 = {5,3,10,1,9,11};
  //       System.out.println("intesection = : " + inter(arr1,arr2));
  //  }
  //  public static HashSet<Integer> inter(int[] num1, int[] num2){
  //  HashSet<Integer> set = new HashSet<>();
  //  HashSet<Integer> intersect = new HashSet<>();

  //  for(int n : num1){
  //   set.add(n);
  //  }

  //  for(int n1 : num2){
  //   if(set.contains(n1)){
  //     intersect.add(n1);
  //   }
  //  }

  //   return intersect;
  //  }
  // }









  //  public static int findFirstRepeating(int[] arr){
    
    
  //   HashSet<Integer> map = new HashSet<>();
  //   for(int i = arr.length - 1; i >= 0 ; i--){
  //      if(map.contains(arr[i])){
  //       return arr[i];
  //      }
  //      map.add(arr[i]);
        
  //      }
  //   return -1;

  //  }
  // }
  
    //  String s = "MOM";
    //  String s1 = "";
    //  for(int i = s.length()-1 ; i >= 0  ; i--){
    //     s1 = s1 + s.charAt(i);
    //  }
    //  System.out.println(s1);
    //     if(s.equals(s1)){
    //       System.out.println("Palindrom");
    //     }
    //     else{
    //       System.out.println("Not a palindrome");
    //     }
    //   }
    //  }

   
  
     // palindrom
// String s = "yogesh";
// System.out.println(s);
// char[] c = s.toCharArray();
// System.out.println(c);

  //  }
  // }
//      int[] nums = {0,3,4,6,5};
//      int target = 7;
//       System.out.println(Arrays.toString(twoSum(nums,target)));
//     }
//  public static int[] twoSum(int[] nums, int target){
//    HashMap <Integer, Integer> map = new HashMap<>();
//    for(int i = 0 ; i < nums.length; i++){
//     //main
//     int ans = nums[i] - target;
//     if(map.containsKey(ans)){
//       return new int[]{map.get(ans), i};
//     }
//     map.put(nums[i], i);
//    }
//    throw new IllegalArgumentException("no two sum solution");

//   }




// }
    // arr[] = {1,4,2,10,23,3,1,0,20}
  //   k=4 
        
  // public static void main(String[] args){
  //    //fibonacci
  //    int n = 7;
  //    fib(n);
  // }
  // public static void fib(int n){
  //    int a = 0 , b = 1;
  //    System.out.print(a +" "+ b);
  //    for(int i = 2; i < n ; i++){
  //    int next = a + b;
  //    System.out.print(next);
  //    a = b;
  //    b = next; 
//   }
// }
// }
      //factorial
  //     int n = 5;
  //     System.out.println(fact(n));

  // }

  // public static int fact(int n){
  //   int result = 1;
  //   for(int i = 2 ; i <= n ; i++){
  //     result *= i;
      
  //   }
  //   return result;
  // }


  
// }









  //   int n = 6;
  //   // for(int i = 1 ; i < n ; i++){
  //     if(isPrime(n)){
  //       System.out.println(true);
  //     } 
  //     else{
  //       System.out.println(false);
  //     }  
  //   }
  
  // public static boolean isPrime(int n){

  //  for(int i = 2 ; i < n / 2 ; i++){
  //   if(n % i == 0){
  //     return false;
  //   }
  //  }

  //   return true;
  // }



// }
