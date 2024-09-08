// oops conscepts
class Preparation{
  public static void main(String arg[]){
    int n = 7;
     fib(n);
    }
  

  public static void fib(int n){
     int a = 0 , b = 1;
     System.out.println(a + " " + b);

     for(int i = 2; i < n; i++){
      int next = a + b;
      System.out.println(" "+ next);
      a = b;
      b = next;
         }

    //  int result = 1;
    //  for(int i = 2 ; i<=n ; i++){
    //   result *= i;
     }



  }
//    if(n<=1){
//     return false;
//    }
//    for(int i = 2 ; i<= n/2 ; i++){
//     if(n%i == 0){
//       return false;
//     }
//    }
// return true;
//   }
// }























// modifiers
// 1 public private default protected

//variables
// instance , local , static

  // 

  

//     public  abstract void m1();

//  }

//   abstract class pre extends Preparation{
// public abstract void m(){

// }
//  public void m1(){
//     System.out.println("abstract method");
//  }
// }
// class pr extends Preparation{
//     public void m1(){
//     System.out.println("multiple inheritance");
//     }
// }

// public static void main(String[] args){
//    pre pre = new pre();
//    pre.m1();
//    pr pr = new pr();
//    pr.m1();
// }















    // abstraction
    //  abstract public void demo();
    //  abstract public void demo1();
    //  abstract public void demo2();
    //  abstract public void demo3();
//   public void m1(){
//     System.out.println("final method");
//   }
// }

//  class pre extends Preparation{
//        public void m1(){
//         System.out.println("overridden");
//        }
// }
   



 