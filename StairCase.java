// // // import java.util.*;
// // // public class StairCase {
// // //   public static void main(String[] args){
// // //     Scanner sc = new Scanner(System.in);
// // //     int c1 = sc.nextInt();
// // //     int c2 = sc.nextInt();
// // //     System.out.println(fib(c1,c2));
// // //   }

// // // public static int fib(int c1,int c2){
// // //   if(c1>c2){
// // //     System.out.println("c1 is greater");
// // //   }
// // //   try{
// // //   int y = fib(c1,c2-1);
// // //   int x = fib(c1-1,c2);

// // //   System.out.println(x+y);
  
// // //   }
// // // catch(Exception e){
// // //   e.getMessage();
// // // }
// // // return -1;
// // //   }

// // // }
// // //   // public static int fib(int n){
// // //   //   if(n==0 || n==1){
// // //   //     return 1;
// // //   //   }
// // //   //   int[] dp = new int[n+1];
// // //   //   dp[0] = 1;
// // //   //   dp[1] = 1;
// // //   //   dp[2] = 2;
// // //   //   for(int i = 3;i<=n;i++){
// // //   //     dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
// // //   //   }
// // //   //   return dp[n];
// // //   //   }
// // //   // }
// // public class StairCase{
// //   int inst;
// //   static int a,b;
  
// //   static void add(){
// //     System.out.println(a+b);
    
// //   }
// // public static void main(String args[]){
// //   StairCase.a=10;
// //   StairCase.b=20;

// //   a=10;
// //   b=2;
// //   add(); 
// // }
// // }
// public  class StairCase{
//   public static void main(String args[]){
//     int n = 5;
//     for(int i=0;i<n;i++){
//       for(int j=0;j<n;j++){
//         if(i==0 || i==(n-1)||j==0 || j==(n-1)){
//         System.out.print("*");

//       }else{
//         System.out.println(" ");
//       }
//       }
//       System.out.println();
//     }
//   }
// }
import java.util.Scanner;
public class StairCase{
  public static void main(String args[]){
    String alp = "";
    String num = "";
    String spl ="";
    int n1 = 0;
    Scanner sc  = new Scanner(System.in);
    String s = sc.nextLine();
    for(int i=0;i<s.length();i++){
      char ch = s.charAt(i);
      if(ch>='a' && ch<='z'){
           alp = alp+ch;
      }
      else if(ch>'1'&&ch<'9'){
        num = num+ch;
         

      }else if(ch>='#'&&ch<'&'){
        spl = spl+s.charAt(i);
      }else{
        System.out.println(s);
      }
    }
    System.out.println("alphabet:"+alp);
    System.out.println("num:"+num);
    System.out.println("spl:"+spl);

  }
}