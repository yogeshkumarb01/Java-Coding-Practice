import java.util.*;
class MyThread extends Thread{
  static Thread mt;
  public void run(){
    
    try{
      mt.join();
    }
    catch(InterruptedException e){

    }
    for(int i = 0 ; i < 5;i++){
      System.out.println("child method");
    }
  }

}
class MathOp{
  public static void main(String[] args) throws InterruptedException {
  MyThread.mt= Thread.currentThread();
    MyThread t = new MyThread();
    t.start();
   
    for(int i = 0 ;i < 5 ; i++){
    System.out.println("parent method");
    
    }

  }
}
