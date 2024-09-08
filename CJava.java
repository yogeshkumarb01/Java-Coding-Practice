abstract class person{
  String name;
  int age;
  person(String name, int age){
    this.name = name;
    this.age = age;
  }
}
class student extends person{
  int rollno;
  int marks;
  student(String name,int age,int rollno,int marks){
    super(name,age);
    this.rollno=rollno;
    this.marks=marks;
  }
}
class teacher extends person{
  double salary;
  String subject;
  teacher(String name,int age,double salary,String subject){
    super(name,age);
    this.salary = salary;
    this.subject = subject;
  }
}
public class CJava{
  public static void main(String[] args) {
    student s = new student("yogesh",24,01,90);
    teacher t = new teacher("durga",48,25000,"Java");
    System.out.println(s.hashCode());
    System.out.println(t.hashCode());
    System.out.println(s.name+" "+s.age+" "+s.rollno+" "+s.marks);
    System.out.println(t.name+" "+t.age+" "+t.salary+" "+t.subject);

  }
}
  //   byte a = 10;
  //   // String s1 = new String("yogesh");
  //   // String s2 = new String("yogesh");
  //   // System.out.println(s1==s2);
  //   // System.out.println(s1.equals(s2));
  //   String s2 = "yogeshKB";
  //   String s3 = "yogesh";
  //   String s4 = "KB";
  //   // System.out.println(s4.equals(s3));
  //   System.out.println(s4.equals(s2)+s3);
  //   System.out.println(s3+s4);

  //  Thread t1 = new Thread();
  //  System.out.println();
    // byte b = 20;
    // byte c = (byte)(a+b);
    // long l = 214748364788487582l;
    // System.out.println(l);
    // // int y = 10;
    // //  int x = ++y;
    // //  System.out.println(y);
    // short s = -32768;
    // b = 127;
    // float h = -10/0f;
    // System.out.println(h);
//   }
// }

// -128->127
// -32768  --> 32767
// -2147483648 --> 2147483647












// class CJava
// {
// public static void main(String[] args){
// sum(new int []{10,20,30});
// }
//  static void sum(int[] x){
//   System.out.println(x[2]);








// String[] s = {"a","aa","Aaa"};
// String s1 = "yogesh";
// s[0]="yogesh" ;
// s[1]="pallavi";
// s[2]="manasvi";
// System.out.println(s[0]+s[1]+s[2]);
// System.out.println(s.length);
// System.out.println(s1.length());

// System.out.println(s1.toUpperCase());
// String[] s2 = {"y","o","g","e","s","h"};// String ans = "";

// System.out.println(s2[2].toUpperCase());
// for(int i=s1.length()-1;i>=0;i--){
//    ans = ans+s1.charAt(i);
     

//    }
  //  System.out.println(ans.toUpperCase());



  // int[] x = new int[6];
  
  // System.out.println(x[0]);
  // System.out.println(x[1]);
  // System.out.println(x[2]);
// int[][] y = new int[2][2];
// y[0][0]=20;
// y[0] = new int[2];
// y[1] = new int[1];
// System.out.println(y[1][1]);
// int[][][] z = {{{10,20,30},{40,50,60}},{{70,80},{90,1000,110}}};
// System.out.println(z[0][1][2]);
// System.out.println(z[1][0][1]);
// System.out.println(z[1][1][1]);
// System.out.println(x.length);




















//INTERFACES
// Service requirement specification / 100% pure abstraction / contract between
// client and service provider is an interface
//1. achieves 100% abstraction
//2. every methods inside the interface by default abstract
// 3. for every method implementation is mandatory from child class
//4--.> if failed then child class should be specified with abstract class 
// and the sub child class is responsible to implement
//5--> multiple inheritance is posible
//6--> CLASS > EXTENDS, INTERFACE > IMPLEMENTS 
// interface client{
//   void userDeposit();
//   void passBookEntry();
//   void balanceInqiry();
// }
// abstract class ServiceProvider implements client{
//  public void userDeposit(){
//      System.out.println("Availble");
//   }
//   public void passBookEntry(){
//      System.out.println("Available");
//   }
// }
// class ThirdVendors extends  ServiceProvider{
//   public void balanceInqiry(){
//     System.out.println("Available");
//   }
// }

// extends and implements
//1> class can extends only one class simulteneously
// class CJava{

// }
// class r {

// }
// class pthon extends CJava{

// }
//2> interface can extends any number of interfaces 
// interface c{

// }
// interface python{

// }
// interface Java extends c,python{

// } 

//3> Class can implement any number of interface
// interface A{

// }
// interface B{

// }
// interface C{

// }
// class D implements A,B,C{

// }
// interface K{

// }
// interface G{

// }
// interface F{

// }
// //4> class can extends another class and implent an interfaces
// class E extends D implements K,G,F{

// }
// //5> INTERFACE CAN IMPLEMETN ANY NUM BE OR INTERFACES
// interface H extends  K,G,F {

// }

// //6> 
// interface L extends K,G,F{

// }
// class Y{

// }
// interface Z{

// }
// class X implements Z extends Y{

// }


//1> one class can extend only one class
// class b{

// }
// class c{

// }
// class d extends c,b //--> error{
  
// }
//2> one class can extend any number of interfaces
// interface a{

// }
// interface b{

// }
// interface d{}
// class c implements a,b,d{

// }

//3> a interface can extend any number of interfaces
// interface A{

// }
// interface B{

// }
// interface C extends A,B{

//INTERFACE METHODS


// }
// import java.util.*;
// interface calculator{
//   void add();
//   void sub();
//   void mul();
//   void div();
// }
// class perform implements calculator{
//   Scanner sc = new Scanner(System.in);
 
// public void add(){
//   int n1 = sc.nextInt();
//   int n2 = sc.nextInt();
//   System.out.println("the addition result");
//   System.out.println(n1+n2); 
// }
// public void sub(){
//   int n1 = sc.nextInt();
//   int n2 = sc.nextInt();
//   System.out.println("the sub result");
//   System.out.println(n1-n2);
// }
// public void mul(){
//   int n1 = sc.nextInt();
//   int n2 = sc.nextInt();
//   System.out.println("the mul result");
//   System.out.println(n1*n2);
// }
// public void div(){
//   int n1 = sc.nextInt();
//   int n2 = sc.nextInt();
//   System.out.println("the div result");
//   System.out.println(n1/n2);
// }
// }
// class CJava extends perform{
//   public static void main(String[] args){
//     perform p = new perform();
//     p.add();
//     p.sub();
//     p.mul();
//     p.div();
//   }
// }

//  interface a{
//    abstract public void b();
// }

// INTERFACE VARIABLES
// interface Left{
//  int x = 20;
// }
// interface Right{
//    int y=10;
 
// }
// class CJava implements Left,Right{
//   public static void main(String[] args) {
//     int x=200;   //local variable
//     System.out.println(x);
//   }
 
// }

// NAMING CONFLICT
//1> METHODS
// interface A{
// public void m1();
// }
// interface B{
// public void m1();

// }
// class CJava implements A,B{
//   public void m1(){
//     System.out.println("Accepted");
//   }

// }

//2>
// interface A{
//   public void m1();
//   }
//   interface B{
//   public void m1(int A, int B);
  
//   }
//   class C implements A,B{
//     public void m1(){
//       System.out.println("Accepted");
//     }
//     public void m1(int a,int b){
//       System.out.println(a+b);
//     }
  
//   }
//   class CJava extends C{
//     public static void main(String[] args) {
//       C c = new C();
//       c.m1(10,20);
//     }
//   }

//3> 
// interface A{
//   int a = 20;
// public int m1();
// }
// interface B{
//   int b = 30;
// public int m2();
   
// }
// abstract class C implements A{
//   public int m1(){
//     int a = 10;
//     System.out.println(a);
//     return 1;
//   }
// }
//   class D  implements B{
  
//     public int m2(){
      
//       return m2();
//     }
//   }
//   // public int m2(){
//   //   // System.out.println("Accepted");
//   //   return m1();
//   // }


// class CJava extends D{
//   public static void main(String[] args) {
//     System.out.println(A.a);
//     System.out.println(B.b);
    
//   }
// }

// variable naming conflicts
// interface A{
//   int a = 10;
// }
// interface B{
//   int a = 20;
// }
// class CJava implements A,B{
//   public static void main(String[] args) {
//     System.out.println(A.a);
    
//   }
// }

// MARKER INTERFACE
// the marker interface is the interface which doesnt contain any methods 
// and provides some ability to the objects
// list  1> serializable(I)  2> clonable(I)  3> RandomAccess 4>SingleThreadedModel
// JVM IS RESPONSIBLE 
// TO RECUDE THE COMPLEXITY AND MAKE JAVA PROGRAME VERY SIMPLE
  
// ADAPTER CLASSES
// A simple java class that implements the empty implementation
// interface Bank{
//   void balance();
//   void withdraw();
//   void greenpin();
//   void deposit();
// }
//  class Adapter implements Bank{
//   public void balance(){}
//   public void withdraw(){}
//  public  void greenpin(){}
//  public void deposit(){} 
// }
// class customer1 extends Adapter{
//   public void withdraw(){
// System.out.println("30000");
//   }
// }
// class customer2 extends Adapter{
// public void deposit(){
//   System.out.println("10000");
// }
// }
// class customer3 extends Adapter{
//   public void withdraw(){
//     System.out.println("25000");
//   }
// }
  
// class ATM extends customer1 {

// }
// class CJava extends ATM{
//   public static void main(String[] args) {
//     customer1 c1 = new customer1();
//     c1.withdraw();
//     customer3 c2 =  new customer3();
//     c2.withdraw();
//     customer2 c3 = new customer2();
//     c3.deposit();
//   }
// }
// import java.util.*;
// interface CricHeroes{
//    void home();
//    void bookGround();
//    void myCricket();
//    void more();
// }
// interface Mycricket{
//   void Matches();
//   void Tournaments();
//   void Teams();
//   void Highlights();
// }
// class Adapter implements Mycricket,CricHeroes{
//   public void home(){};
//   public void bookGround(){};
//   public void myCricket(){};
//   public void more(){};
//   public void Matches(){};
//   public void Tournaments(){};
//   public void Teams(){};
//   public void Highlights(){};
//   public void toss(){};
  

// }
// class match extends Adapter{
//   public void Matches(){
//     Scanner sc = new Scanner(System.in);
    
//     System.out.println("enter name of team1");
//       String team1 = sc.nextLine();
//       System.out.println("enter name of team2");
//       String team2 = sc.nextLine();
//       System.out.println("enter ground");
//       String ground = sc.nextLine();
//       System.out.println("How many overs match");
//       int overs=sc.nextInt();
//       System.out.println("THE MATCH BETWEEN " +team1+ " vs " +team2+ " at ground "+ground+ " is scheduled of " +overs+" overes ");
//       System.out.println("go for toss");
      
//   }
//   public void toss(){
//     Scanner sc = new Scanner(System.in);
//     System.out.println("toss won by");
//     String won = sc.nextLine();
//     System.out.println("choose to");
//     String choose = sc.nextLine();
//     System.out.println(won+ " won the toss and choose to " +choose);

//   }
// }
//   public class CJava extends match{
//     public static void main(String[] args) {
//       match m = new match();
//       m.Matches();
//       m.toss();

//     }

//   }

// abstract class Tournament{
//   String team1;
//   String team2;
//   String venue;
//   int overs;
//   abstract void show();
//   Tournament(String team1,String team2,String venue,int overs){
//     this.team1 = team1;
//     this.team2 = team2;
//     this.venue = venue;
//     this.overs = overs;
//   }
// }
// class match1 extends Tournament{
//   match1(String team1,String team2,String venue,int overs){
//     super("mavericks","howks","IAF",20);
//   }
//   void show(){
  
//   System.out.println(team1+" vs "+team2+" played at "+venue+" of overs "+overs);
//   }
// }
// class match2 extends Tournament{
//   match2(String team1,String team2,String venue,int overs){
//     super(" Cavaliers "," minerva "," HAL ",50);
//   }
//   void show(){
  
//   System.out.println(team1+" vs "+team2+" played at "+venue+" of overs "+overs);
//   }
// }
// class CJava{
//   public static void main(String[] args) {
//     match1 m1 = new match1("Mavaricks","howks","IAF",20);
//     m1.show();
//     match2 m2 = new match2("Cavaliers","minerva"," HAL",50);
//     m2.show();

//   }
// }





//volatile 
// only for variable
//1--> RAM , the value will be changing frequently
//2--> alll the threas will perform on single variable 
// this leads to data inconsistency 
// 4> for every thread single copy ewill be created and maintained 
//advantage --> overcomes data inconsistency
// disadvantages is increases complexity
// class CJava{
//   final volatile int mobilenumber;
//   final transient String password;
// }







//transient keyword
///1-> only used for variables
// 2--> used for sirialization
//3--> to hide some members before saving in harddisk such as password
//4--> advantages -> meets security constraints
// 5 at the time if serialization the default value will be saves 
// class CJava{
//   String uname="yogesh";
//   transient String pass="kbyog";
// public static void main(String[] args) {
//   // serializaation
//   CJava c = new CJava();
//   System.out.println(c.uname);
//   System.out.println(c.pass);
// }














//native modifier
//1--> only for methods
//2--> ends with semicolon
//3--> objective are 1.achieves memory level /machine level communication (c/c++)
//                   2.improves performance/
//                   3.uses already existing legacy non-java code 
//4--> in programs 1.load native library  , declare the native method, invoke the native method



// class Native{

//   static {
//     System.loadLibrary("native library path");   //--> load native library
//   }
//     native void m1();                  // -->declare a native method // pre-built implementation
// }
// class CJava{
//   public static void main(String[] args) {
//     Native n = new Native();   // -->invoke a native method
//     n.m1();
//   }
// }





// synchronized void m1(){
  // data incosistency and race condition problem 
  // multiple threads simultenously operate on object --> race consition
  // to overcome race condition and data inconsistency synchronized is used for methods and blocks
  // not for classes and variables
  // threads will perfi=orm one by one
  // disadvantages --> waiting time will increase and permormance decrease


//static modifier
  // int rollno;
  // String Cname;
  // static int marks;

  // int getStudenInfo(){   // instamnnce method
  //   return rollno;
  // }
  // String CollegeInfo(){  // static method
  //   return Cname;
  // }
  // int calculateMarks(int a, int b){
  //    return a+b;       //static method
  // }
  





// public static void main(String[] args) {
//   System.out.println("hello");
// }
// }
// class pythn extends CJava{
//   public static void main(String[] args) {
//     System.out.println("hi");
//   }

// }








// public static void main(String[] args) {
//   System.out.println("String []");
// }
// public static void main(int[] arg) {
//   System.out.println("Int []");
  
// }






// int x = 10;
// static int y = 20;
// static {
//   System.out.println(y);
//   // System.out.println(x);
// }
// {
//   System.out.println(x);
//   System.out.println(y);
// }







  // int a = 10;
  // static int b = 20;
  // public static void main(String[] args) {
  //   CJava t1 = new CJava();
  //   t1.a=20;

  //   b=30;
  //   System.out.println(t1.a+" "+b);
  //   CJava t2 = new CJava();
  //   System.out.println(t2.a+" "+t2.b);
  // }


























//formal and actual parameter
// public class CJava {
  
//   public static void main(String[] args) {
//      m1(30,20);   //actual parameter
  
//   }
//   public static void m1(final int x,int y){//formal parameter{
//     //x=20;
//     y=40;
//     System.out.println(x+y);
//   }
//   }
















// final local variable
// public class CJava {
  
// public static void main(String[] args) {
//    final int a;
//   // int b=20;
//   // int c=30;
// //  b=30;

// //  a+=35;
//  System.out.println("hello");

// }
// }














//final static variable
// import java.util.*;
// class C{
//     final static int a;  // final instance
//     final  int b ;
//     {
//       b=200;
//      }
//     static {
//       a=100;
//     }
    
//     C(){
//      int c=300;
//      System.out.println(c);
//     }
    
//     // C(){
//     // a =40;
//     // }

// //   final static int b = 20;
// //   void m1(){
  
   
// //     final int c  =10;
  
// // }
// }
// public class CJava {
  
// public static void main(String[] args) {
//   C cj = new C();
//   System.out.println(C.a);
//   System.out.println(cj.b);
//   C cj1 = new C();
//   System.out.println(C.a);
//   System.out.println(cj1.b);
 
//  C cj2 = new C();
//  System.out.println( C.a);
//  System.out.println(cj2.b);

// }
// }








//final instance variable
// import java.util.*;
// class C{
//    final int a;  // final instance
//     C(){
//     a =40;
//     }

//   final static int b = 20;
//   void m1(){
//     final int c  =10;
  
// }
// }
// public class CJava {
// public static void main(String[] args) {
//   C cj = new C();
//   System.out.println(cj.a+""+cj.b+"");

// }
// }





// abstract  class C{
//   void m(){
//     double n = 2.3456565;
//     double m = 3.456753;
//     System.out.println(n*m);
//   }
//   final public void m1(){
//     System.out.println("security");
//   }
//   abstract public void m2();
// }
// class D extends C{      //-> Inheritance

//   public void m2(){ //--> polymorphism
//     System.out.println("override");
//   }

//   }
// class all{
//    void allow(C c){
//     c.m();
//     c.m1();
//     c.m2();
//   }
// }
// public class CJava{
//   public static void main(String[] args) {
//     all a = new all();
//     D d = new D();
//     a.allow(d);
//   }
// }


  // class CJava{
    
  //   public static int fibo(){
  //     Scanner sc = new Scanner(System.in);
  //     int[] arr = new int[5];
  //     for(int i=0;i<arr.length-1;i++){
  //       arr[i] = sc.nextInt();
  //     }
      
  //     for(int i=0;i<arr.length-1;i++){
  //       if(arr.length>1){
  //       arr[i] = arr[i+1]+arr[i];
  //     }
  //   }
  //     for(int i=0;i<arr.length-1;i++){
  //         System.out.println(arr[i]);
  //     }
  //     return fibo();
  //   }

  //   public static void main(String[] args){
       
  //      int arr = fibo();
  //      System.out.println(arr);
  //   }
  // }











// abstract class CJava{
//   public abstract void m1();
//   public abstract void m2();
//   }
//   abstract class C extends CJava{
//     abstract public void m1();

//   }
//   abstract class D extends C{
//     public void m1(){
//       System.out.println("hi");
//     } 
//     abstract public void m2();
//   }

//   class E extends D{

//     public void m1(){
//       System.out.println("overrirden");
//     }
//     public void m2(){
//       System.out.println("hello");
//     }
//   }
//   public static void main(String... a){
//     m1(10,20);
//     m2(15,25);
//   }
//   public static void m1(final int a,int b){
    
//     b=23;

//     System.out.println(a+""+b);
//   }
//   public static void m1(a,b){
//     a=10;
//     b=20;
//   }
// }








//member level modifier
//Final variable
//1>>> final instance variable
// public class CJava{
//   //2.. inside a declaration
//   final int a;
//   final int b;
  //1.. inside a bloack
// {
//   // a = 20;
// }
//3 .. inside cosntructor
// CJava(){
//   b=30;
//   a=20;
// }
//   public static void main(String[] args) {
//     CJava c = new CJava();
//     System.out.println(c.a);
//     System.out.println(c.b);
//   }
// }

//2>> final static variable
// class CJava{
//   // final static int a;
//   // final  int b;
//   void m1(){
//      int a;
//     System.out.println("hi");
//   }
 
//   // CJava(){
//   //   b=10;
//   // }
//   // {
//   //   a=20;
//   //  }
//   public static void main(String[] args){
//    CJava c = new CJava();
//    c.m1();
//   //  System.out.println(c.a);
//   }
// }
  // }










// class CJava{
// // void m1(){
// //   int a = 10;
// //   int b = 20;
// //   int c = a*b;
// //   System.out.println(c);
// // }
// package pack3;  
// ---> used in empty.java
//   class java{
//   private int a = 10;
//    int m2(){
//     System.out.println("hy");
//     return a;
//    }
//    void m1(){
//     System.out.println(a);
//    }
//    int m3(){
//     System.out.println("m3");
//     return 1;
//    }
//   }
//   class C extends java{
//     int m2(){
//        return m4();
//     }
//     void m1(){
//       System.out.println("A");
//     }
//     int m4(){
//       System.out.println("m4");
//       return 1;
//     }
//   }
// public class CJava{
//   public static void main(String[] args) {
//     java j = new java();
//     C c = new C();
//     c.m2();
    
//   }
// }


// //   public static void main(String... args){
// //     CJava cj = new CJava();
// //     cj.m1();
// //   }
// // }




// package pack3;  
// ---> used in empty.java
//  class Java{
//   protected void m1(){
//     System.out.println("protected");
//   }

//  }
//  class A extends Java{
//    public void m1(){
//     System.out.println("overriding");
//   }
//  }
//  public class CJava{
//   public static void main(String[] args) {
//     A a = new A();
//     a.m1();
//   }
//  }

















// abstract class Vehicle{
//   final void money(){
//     System.out.println("1lakh");
//   }
//   abstract  void Twowheeler();
//   abstract void Fourwheeler();
//   abstract void Sixwheeler();
// }
// class bike extends Vehicle{
//  public  void Twowheeler(){
//  }
//   public void Fourwheeler(){
//    System.out.println("zen");
//   }
//   void Sixwheeler(){
//     System.out.println("tempo");

//   }
// }
// class market{
//   void sale(Vehicle c){
//     c.Twowheeler();
//     c.Fourwheeler();
//     c.Sixwheeler();
//     c.money();
//   }
// }
// public class CJava{
//   public static void main(String[] args) {
//     bike b = new bike();
//     market m = new market();
//     m.sale(b);
//   }
// }




//1) --> child class creation is posible  ---> finish
//  
//2) --> object creation is posible or not
//3)  --> class can be accesedd from anywhere
//1)
//  class Reservebank{
//   final  void Revenew(){
//     System.out.println("150000");
//   }
//    void totalamount(){
//     System.out.println("20000");
//   }
// }
// class union extends Reservebank{
//    void totalamount(){
//     System.out.println("30000");
//   }
//   final void insentive(){
//     System.out.println("20000");
//   }

// }
// public class CJava{
//   public static void main(String[] args) {
//     Reservebank r = new Reservebank();
//     union u = new union();
//     r.Revenew();
//     u.totalamount();
//     u.insentive();
    
//   }
// }




//2) ex- adapter class and httpservlets(doget,dopost)
// abstract class A{
//   abstract public void m1();

// }
// class B extends A{
//   public void m1(){
//     System.out.println("Overriden");
//   }
//   public void m2(){
//     System.out.println("Specialized");
//   }
// }
// class C{
//   void allow(A a){
//     a.m1();
//   }
// }
// public class CJava{
// public static void main(String[] args){
//   A a = new A();  --> CANNOT CALL DIRECTLY
//   B b =  new B();
//   C c = new C();
//   b.m2();
//   c.allow(b);
// }
// }







//  class animal{
//   public void bark(){
//     System.out.println("bark");
//   }
//   final public void roar(){
//     System.out.println("king");
//   }
//  }
//  class lion extends animal{
//   public void bark(){
//     System.out.println("Not a king");
//   }
//  }
//  abstract class gov{
//   abstract int free();
//   abstract  int fre();
//   void  pay(){
//     System.out.println("money");
//   }

//  }
//  abstract class pri extends gov{
 
   
//   public int free(){
//     return 2000;
//   }

//  }
//  abstract class sec extends gov{
//   public int pay(){
//     return 2;
//   }
//   public int free(){
//     return 2001;
//   }
//  }
//  public class CJava{
//   public static void main(String[] args){
  
//   }
//   }






// class subject{
//  public void f(){
//   System.out.println("final");
//  }
// }
//  class maths extends subject{
//   public void g(){
//     System.out.println("public");
//   }
//  }
//  public class CoreJava{
//   public static void main(String[] args) {
//     maths m = new maths();
//     m.f();
//   }
//  }




// class Bank{
//      void m1(){
//       System.out.println("Bank");
//     }
//   }
//  class union extends Bank{
//    void m2(){
//      System.out.println("Union Bank");
//    }
 
//  }
//  public class CoreJava{
//    public static void main(String[] args) {
//      union u = new union();
//     u.m2();
//     u.m1();
//    }
//  }
 
 




// import java.util.regex.*;
// import java.text.DateFormat;
// import static java.lang.Math.sqrt;



// import java.io.PrintStream;

// import javax.print.event.PrintEvent;
// public class CJava{
//   static PrintStream out;
//   // static String s = "java";
//   // public static void main(String[] args) {
//   //   System.out.println(CoreJava.s.length());
//   public static void main(String[] args) {
//     System.out.println();

    





//    int num = 9;
//    float num1 = 9.2f;
//    int[] arr = {10,20,30,40};
//    System.out.println(Math.sqrt(num));
//    System.out.println(Math.max(num,num1));
//    System.out.println(Math.round(num1));
//    System.out.println(Math.ceil(num1));
//    System.out.println(sqrt(9));
// double b = sqrt(num);
// double b1 = b*3;
// System.out.println(b1-5);





    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
   
    
    // List<String> l = new ArrayList<>();

  
    // for(int i=1;i<=n;i++){
    //   String s = sc.nextLine();
    //   l.add(s);
    // }
    // System.out.println(l);
    // System.out.println(l.get(0));
   




  
    // long millis = System.currentTimeMillis();
    // Date d = new Date(millis);
    // System.out.println(d);
    
 












// public class CoreJava {
// public static void main(String[] args) {
// //   System.out.println("java class");
// // }
// // }
// // class NodeJS{
// //   public static void main(String[] args) {
// //     System.out.println("nodejs class");
// //   }

// // }
// //  class python{
// //   public static void main(String[] args) {
    
// //     System.out.println("python class");
// //   }

// // }

    //Iterable
    // for(eachitem x : target)
    //1.5v 1 method iterator()
//do-while and continue
//  int x=0;
//  do{
//   x++;
//   System.out.println(x);
//   if(++x < 5)
//     continue;
//   x++;
//   System.out.println(x);
//  }
//  while(++x<10);



//continue


// l1:
// for(int i=0;i<3;i++){
//   for(int j=0;j<3;j++){
//     if(i==j)
//     continue l1;
//     System.out.println(i+" ...."+j);
//   }
// }
// int[] x = {10,20,30};
// for(int x1 : x){
//    if(x1==20){
//     continue;
//    }
//    System.out.println(x1);
//   }





   //break
//LABELLED BLOCK --> cannot use
  //  int x = 5;
  //  l1:
  //  {
  //   System.out.println("begin");
  //    if(x==5)
  //      continue;
     
  //      System.out.println("end");
  //  }
  
  //  System.out.println("hello");

  

//LOOP
  //  for(int i=0;i<5;i++){
  //  if(i==3)
  //  break;
  //  System.out.println(i);
  //  }
  //  System.out.println("iam broke");

    // int x = sc.nextInt();
    // switch(x){
    //   case 0:
    //         System.out.println("hi");
    //   case 1:
    //         System.out.println("hello");
    //         break;
    // }






    //  int a [][][] = {{{1,2,3,4,5},{9,3,4,5}},{{1,2,3,4},{3,2,3,4,5}}};
    //  for(int[][] x1 : a){
    //   for(int[] x2:x1){
    //     for(int x3:x2){
    //       System.out.println(a[0][1][2]);
    //     }
    //   }

    //  }

    //  for(int[][] x : ){
    //   for(int[] x1:x){
    //     for(int x2:x1){
    //   System.out.println(x2);
    //  }
   


//ITERATIVE STATEMENTS



//unreachability
// int a=10,b=20;
// boolean c = false;
// for(c=true;c;a++){
//   System.out.println("hello");
// }
// System.out.println("hi");

// for(int i=0;i<5;System.out.println("hi")){
//   i++;
//   }



//for loop
// int x=3;
// for(int[] d ={10,20,30};x>0;x--){
//   System.out.println(d[x]);
  






// for(int i=0;i<5;i++)
//    for(int j=0;j<i;j++)
//    System.out.println(i+" "+j);
// System.out.println(1);




// int[] n = {10,20,40,50};
// for(int i=n.length-1;i>=0;i--){
//   System.out.print(n[i]+" ");
  

// }

//do while
// final int a=10,b=20;
// do{
//   System.out.println("hello");
// }
// while(a<b);
// System.out.println("hi");




// switch(true){
//   System.out.println("hello");
// }
// System.out.println("hi");




// do 
//   while(true){
//   System.out.println("hello");
// }
// while(false);



// do
// while(true);


// while(false){
// System.out.println();
// }
// final int a=10,b=20;
// int c = 10;
// System.out.println(a+c);
// System.out.println("hi");

// while(true){
// int x = 10;
// System.out.println(x);
// }
  









  //  while(rs.next()){

  //  }
  // while(itr.hasNext()){

  // }
  // while(e.hasmoreelements()){

  // }

     
    // String day = sc.nextLine();
    // switch(day){
    //   case  "monday":
    //   System.out.println("Visit shiva temple");
    //   break;
    //   case "tuesday":
    //   case "wednesday":
    //   System.out.println("Visit ganesha and rama temple");
    //   break;
    //   case "thursday":
    //   case "friday":
    //   case " saturday":
    //   System.out.println("visit Temples");
    //   break;
    //   default:
    //   System.out.println("invalid day");
    // }

    // byte x = 10;
    // switch(x+1){  // (type of data)(x+1)-->max(int,bool,int)-->int
    //  case 10 :
    //  case 100:
    //  case 1000:
    //  System.out.println("valid");
    // }

    // int x = 20;
    // final int y = 10;
    // switch(y){
    //   case 20:
    //       System.out.println("20");
    //   case y:
    //       System.out.println("10");
    // }
    //selection statement
// System.out.println("The available details are");
// System.out.println("1.Name");
// System.out.println("2.age");
// System.out.println("3.gender");
// System.out.println("4.college");
// System.out.println("select any one");
// int x = sc.nextInt();
// switch(x){
//   case 1:
//     System.out.println("Yogesh");
//     System.out.println("do you want to know more select");
//     sc.nextInt();
//   case 2:
//     System.out.println("24");
//     System.out.println("know more select");
//     sc.nextInt();
//   case 3:
//     System.out.println("male");
//     System.out.println("know more select");
//      sc.nextInt();
//   case 4:
//     System.out.println("presidency");
//     System.out.println("know more select");
//      sc.nextInt();  
//   default:
//   System.out.println("Not available thanks for you time");
// }




//switch statement
// String s = sc.nextLine();
// switch(s){
  
//   case "name":
//         System.out.println("yogesh");
//         System.out.println("want to know more details");
//         String s1 = sc.nextLine();

//   case "age":
//         System.out.println("24");
//         System.out.println("want to know more details");
//         String s2 = sc.nextLine();
        
//   case "gender":
//         System.out.println("male");
//         System.out.println("want to know more details");
//         String s3 = sc.nextLine();
//   default:
//         System.out.println("Not available");
//         break;

//    }
     

 

    // flow controll
//if else statement
    //no dangling else problem(strong compiler)
    //  if(false)
    //   if(false)
    //   System.out.println("hello");
    //   else
    //     System.out.println("hi");
      
    //   else
    //   System.out.println("main if");
  



    // boolean b = true;
    // if(b==true){
    //   System.out.println(b);
    // }else{
    //   System.out.println(20);
    // }
    // int x = sc.nextInt();
    // if(x==0);
    // int y =10;
    // System.out.println(y);

      //isInstance()
  //   Thread t = new Thread();
  //   System.out.println(t instanceof Runnable);
  //  System.out.println(Class.forName(args[0]).isInstance(t));

  // }



  // public void add(int a,int b){
  //   int c = a+b;
  //   System.out.println(c);

  // }
  // // new vs newinstance()
  // public static void main(String[] args) {
  //   int n =10;
  //   CoreJava c = new CoreJava();
  //   c.add(10,20);
    
  
  //prescedence
  // public static void main(String... args){
  //    System.out.print(ope(1)+ope(2)*ope(3)/ope(4)*ope(5)+ope(6));
  //                              //1+2*3/4*5+6
  //                              //1+6/4*5+6
  //                              //1+0+5+6
  //                              //12
  // }
  //   //Evalution order of java operands
  //   public static int ope(int n){
  //     System.out.println(n);
  //     return n;
  //   }
  // }

    //[]operator -> create and declare array int[] arr = new int[10];
    // //simple assignement
    // int x = 10;

    // //chained assignement
    // int a,b,c,d;
    // a=b=c=d=4;
    // System.out.println(a+" "+b+" "+c);
    // a+=b-=c*=d/=2;
    // System.out.println(a+" "+b+" "+c+" "+d);
    // // int y=z=2;  --> error
    // int r=2;   //10
    // int e = 3;
    // r&=e;      //11 --> 10
    // int num = 16;
    // int result = num>>>=4;
    // System.out.println(result);

    // //Ternary operator
    // int q = (10>20)?20:10;
    // System.out.println(q);
    // int res = (r<e)?r:e;
    // System.out.println(res);

    // //nesting 
    // int re = (10>20)?((10>5)?'a':10):((13%2));
    // System.out.println(re);

    //TypeCasting operator
    //implecit typecast--> uptypecasting/widening --> compiler
    // int a = 'a';
    // System.out.println(a);
    // double d = 20;
    // System.out.println(d);
    // //explicit typecast   --> down typecasting/narrowing-->programmer
    // byte b = (byte)170;  //170/2 = 85-0,42-1,21-0,10-1,5-0,2-1,1-0 -->0 10101010
    // //   1st com  ->1 01010101 2ns comp--> 01010110--> 2+4+16+64-->80+6-->-86
    // System.out.println(b);
    // double db = 250.879654; 
    // int f= (int)db;
    // System.out.println(f);
    // byte by = (byte)db;
    // System.out.println(by);



   

   //short circuit operator
  //  int a = 10;
  //  int b = 20;
  //  if(a>b & b==20/0){
  //   System.out.println("error");
  //  }
  //  else{
  //  System.out.println("no error");
  //  }
  // if(a<b | b==20/0){
  //   System.out.println("no error");
  //  }
  //  else{
  //  System.out.println(" error");
  //  }



//bitwise compliment(integral)
  //  System.out.println(~4);  //-->(+) 0000...0100 --> (-)1111...1011 --> 101 -->-5
  //  System.out.println(~6);  //--> (+) 0000...0110 --> (-)1001--> 111 --> 1+2+4
  //  System.out.println(~9); //--> (+) 0000...1001 --> (-)0110--> 1010--> 10
  //  // boolean complement(boolean)
  //  System.out.println(!true);
  //  System.out.println(!false);

    // Boolean
    // System.out.println(true&false);
    // System.out.println(true|false);
    // System.out.println(true^true);

    // //Integral
    // System.out.println(8&5);   //1000    0101  -->  0000
    // System.out.println(8|5);   // 1101  8+4+0+1 --> 13
    // System.out.println(7|5);  //  111  101 --> 111--> 7
    // System.out.println(7&5);  // 5
    // System.out.println(2^5); // 010  101 --> 111-->7
    // // SSC Staff selection commission
    
    // Thread t1 = new Thread();
    // System.out.println(t1 instanceof Thread);
    // System.out.println(t1 instanceof String);
    // System.out.println(t1 instanceof Runnable);
    // System.out.println(null instanceof Runnable);
    // System.out.println(null instanceof Thread);
  
// String s1 = new String("durga");
//     String s2 = new String("durga");
//     System.out.println(s1==s2);
    
    // System.out.println(s1.equals(s2));
    // System.out.println(s1==null);


// String s2 = "yogesh";
// String s1 = "yogesh";
// System.out.println(s1==s2);

  //  Thread t1 = new Thread();
  //  Object o = new Object();
  //  String s1 = new String ("durga");
  //  System.out.println(t1==o);
  //  System.out.println(o==t1);
  //  System.out.println(s1==t1);





  //  Thread t1 = new Thread();
  //  Thread t2 = new Thread();
  //  Thread t3 = t1;
  //  System.out.println(t1==t2);
  //  System.out.println(t1==t3);




  // equality operators(==,!=)  --> universal operators
  // System.out.println(10==20);
  // System.out.println('a'=='b');
  // System.out.println('a'!=20.65);
  // System.out.println(false==false);







   //relational operator(<,>,<=,>=)
  //  System.out.println(10<20);
  //  System.out.println(10>20);
  //  System.out.println('a'>'A');
  //  System.out.println('A'>69);
  // //  System.out.println(true>false);  error  - BOOLEAN
  // // System.out.println("yogesh">"pallavi"); error - STRING
  // System.out.println(10<20>20);  // true>20  error
   





  //  String a = "yogesh";
  //  int b = 10,c=20,d=30;
  //  a = a+b+c;// string
  //  System.out.println(a);
  //  b = c+d; // integral
  //  System.out.println(b);




  //  System.out.println(a+b+c);
  //  System.out.println(b+c+a);
  //  System.out.println(b+c+d+a);
  //  System.out.println(b+a+c+d);



    // System.out.println(10%0.0);
  



    // System.out.println('a'+'b');
    // System.out.println('a'+2.6576);

    // int a = 10;
    // System.out.println(a/0);  // infinite integer cannot handle
    // System.out.println(a/0.0); // can handle
    // double d = 10.76;
    // System.out.println(d/0);

    // System.out.println(10/0.0);
    // System.out.println(-10/0.0);// infinite
    // System.out.println(0.0/0);  // undifine 
    // System.out.println(0/0.0);

    // System.out.println(10>Float.NaN);
    // System.out.println(10>=Float.NaN);
    // System.out.println(10<=Float.NaN);
    // System.out.println(10==Float.NaN);
    // System.out.println(Float.NaN==Float.NaN);
    // System.out.println(10>Float.NaN);

    // System.out.println(10!=Float.NaN);
    // System.out.println(Float.NaN != Float.NaN);

    // byte b = 10;
    // b = b+1;  //max(int,byte,int)  error
    // System.out.println(b);


  // byte a = 10;
  // byte b = 20;
  // byte c = (byte)(a+b);
  // System.out.println(c);


  // boolean b = true;
  // b++; //error bad operand
  // System.out.println(b);


  // double d = 2.745;
  // int i = (int)++d;
  // System.out.println(i);



  // long l = 1234553342;
  // int i =(int) ++l;
  // System.out.println(i);


  // char ch = 'a';
  // int c = ++ch;
  // System.out.println(c);


  // final int x = 10;
  // x++; // error
  // System.out.println(x);


    //inc or dec operators
    // byte x = 10;
    // byte y = 11;
    // byte z = (byte)(x+y);  //(int,type of a,type of b)
    // System.out.println(z);
    // int x = 10;
    // int y = ++10;

    // int y = ++(++x);  // listing not posible
    
    
 
//     StudentBean st = new StudentBean();
//     String s1 = st.name = "latha";
//     System.out.println(s1);
//    System.out.println(st.isEmpty());
   
//   }
 


// }
// final class StudentBean extends CoreJava{
//   public String name;
//   public boolean empty;
//   public boolean isEmpty(){
//     return empty;
//   }

//   public  void setName(String name){
//     this.name = name;
//   }
//   public String getName(){
//     return name;
//   }

// }


  //   int n1 =10;
  //   int n2=20;
  //   CoreJava cj = new CoreJava();
  //  int fun =  cj.add(n1,n2);
  //  System.out.println(fun);

  // }


  // public static int add(int num1,int num2){
    
  //   return num1*num2;
  // }


    // int i = Integer.parseInt(args[0]);
    // int j = Integer.parseInt(args[1]);
    // System.out.println(args[0]);
    // int[] x = new int[3];
    // CoreJava cj = new CoreJava();
    // System.out.println(x[0]);


  //  final int x;
  //  if(args.length>0){
  //   x=10;
  //  }else{
  //   x=20;
  //  }
  //  if(args.length>0){
  //   x=10;
  //  System.out.println(x);
  
  // int a,b;
  // static float c;

  // static{
  //   float i =8;
  //   float j =3;
  //   System.out.println("static block");
  //    c = i/j;
  // }
  // static public synchronized final void main(String ... yogs){
  //   CoreJava cj = new CoreJava();
  //  System.out.println(cj.a); 
  //  System.out.println(cj.b); 
  //  System.out.println(cj.c);
  //  System.out.println(CoreJava.c);
  //  System.out.println(c);
  // m1("yogesh","yogesh");
   
  // }
  // public static void m1(String... s){
  //   if(s[0]==s[1]){
  //     System.out.println("equal");
  //   }else{
  //     System.out.println("not equal");
  //   }

  //   }
    
  // }
  //   int[] a={10,20,30};
  //   int[] b ={30,40,50};
  //   m1(a,b);
  // }
  // public static void m1(int[]... x){
  //   int total=0;
  //   int total1=0;
  //   int total2=0;
  //   for(int[] x1:x){
  //     total = total+x1[0];
  //     total1 = total1+x1[1];
  //     total2 = total2+x1[2];
      
  //   }
//     System.out.println(+total+"\n"+total1+"\n"+total2);
//   }
// }

    // m1("The String");
    // m1("first" ,10);
    // m1("Second", 10,20);
    // m1("Third" ,10,20,30,40);
//   public static void m1(String s , int     ... y)
//     int total =0;
//     for(int x1:y){
//       total = total+x1;
//     }
// System.out.println(s+"\t"+total);
//   }


    // int x =0;
    // while(true){
    //   System.out.println("eerror");
      
//     }
//   }
// }
// double b = 0123.456; 
// float f = 23.43f;

// System.out.print(b+f);
//   }
// }
// char ch ='\u0065';
// char ch1 = '\ubeef';
// char bi = 0B0011;
// char c1 = 97;
// char c = '\n';
// double l = 2_34_43_5.3_4_5;
// System.out.println(l);
// System.out.println("add'\b'number'\b'");
// System.out.println("this is \'sybol,");
// System.out.println("this is '\"'talaiva");
// System.out.println("this is '\\'talaiva");
// System.out.println("this is "+'\f'+"talaiva");

// int[][] x = new int[2][];
// System.out.println(x);
// System.out.println(x[0]);
// int[] x1 = new int[98];
// System.out.println(x1[0]);
// x1[0]=10;
// System.out.println(x1[0]);
// x1[2] = 20;
// System.out.println(x1[2]/x1[0]);
// x1[97] = 'a';
// System.out.println(x1[97]);
// int[] x2;
// x2 = new int[5];
// x2[1]=0;
// x2[2]=0;
// System.out.println(x2[1]+x2[2]);
// int[] i = {10,20,30,'a'};
// System.out.println(i[3]);
// char[] ch ={'a','e' ,'i','o','u'};
// System.out.println(ch.length);
// String[] s = {"yogesh","kumar","b"};
// System.out.println(s.length);
// String s1 ="yogesh";
// System.out.println(s1.length());
// int[][]x3={{1,2,3},{2,3}};
// System.out.println(x3[1][1]);
// int[][][] x4 = {{{2,3,4},{3,4,5}},{{2,3,4},{4,5,6}}};
// System.out.println(x4[0][1][1]);
// System.out.println(x4[1][1][2]);

// System.out.println(x4[0][0][1]);
// int[][]x5 = new int[6][3]; 
// System.out.println(x5.length);
// System.out.println(x5[0].length+x5[1].length+x5[2].length); 
// sum(new int[]{10,20,30});
// Object[] a = new Object[10];
// a[0] = new Object();
// a[1] = new String("kb");
// a[2] = new CoreJava();
// System.out.println(a[2]);
// Number[] n = new Number[10];
// Runnable[] r = new Runnable[10];
// r[0] = new Thread();
// System.out.println(n[0]);


// int[] a = {10,20,30};
// char[] ch = {'a','b','c'};
// String[] s = {"a","aa","aaa"};
// Object[] o = s;
// System.out.println(s);
// int[] a1 = {20,40,60};
// int[] b = a1;
// int[][] d = new int[3][];
// d[0]=new int[2];
// d[0][1] = 10;
// d[0][0] = 20;
// System.out.println(d[0][1]+d[0][0]);
// for(int i=0;i<=args.length;i++){
//   System.out.println(args[i]);

// }
// int[] b ={1,2,3};
// sum(b);
// String[] argh ={"yogesh","Kumar","B"};
// args = argh;
// for(String s:args){
//   System.out.println(s);
// int[][] a = new int[4][3];  //5
// a[0] = new int[4];    // 1
// a[1] = new int[2];//1
// a = new int[3][2];  //4   --> 11 garbage -> 7
// int[] i1 = {10,20};
// char[] ch = {'a','b','c'};
// int[] b = {'a','b','c'};
// char[] c1 = {'9','1'};
// int c = 0XBeef;
// char ch1 = 'a';
// int[] a ={10,20,30,40,50};
// int[] a1 = {80,90};
// int[] b1 = a1;
// System.out.println(b1[0]+"\t"+b1[1]);

// System.out.println( "the number is :\n"+ch1 +"\n"+ch1);
// System.out.println(b);
// String[] argh = {"A","B","C"};
// int[] arh = {1,2,3,4};
// args = argh;
// System.out.println(args.length);
// for(int i=0;i<args.length;i++){
//   System.out.println(args[i]);

// }
// for(String s:args){
//   System.out.print(s);
// }
// System.out.println("\n");
// for(int I : arh){
//   System.out.print(I);

// }
// }
// public static void sum (int[] a){
//   int total = 0;
//   for(int x9:a){
//     total = total+x9;
//   }
//   System.out.println("sum:"+total);
// }
// }
