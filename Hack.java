import java.math.BigInteger;
import java.util.*;

public class Hack {
  public static void main(String []argh)
  {
      byte maxB = Byte.MAX_VALUE;
      short maxS = Short.MAX_VALUE;
      int maxI = Integer.MAX_VALUE;
      long maxL = Long.MAX_VALUE;
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String[] arr = new String[n];
      for(int i=0;i<arr.length;i++){
          arr[i] = sc.next();
      }
      for(int i=0;i<n;i++){
         BigInteger type = new BigInteger(arr[i]);
          if(type.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0){
            System.out.println(arr[i]+"can be fitted in:\n *byte \n *short \n *int \n *long");   
          }
              else if(type.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0){
              System.out.println(arr[i]+"can be fitted in:\n *short *int \n *long");
              }
              else if(type.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0){
              System.out.println(arr[i]+"can be fitted in:\n *int \n *long");
              }
              else if(type.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0){
                System.out.println(arr[i]+"can be fitted in:\n *long");
                }
              
              else{
                      System.out.println(arr[i]+"can't be fitted anywhere.");
              }
          
              
          }
      }
  }
      
        
        
  // -150
  // 150000
  // 1500000000
  // 213333333333333333333333333333333333
  // -100000000000000
        

