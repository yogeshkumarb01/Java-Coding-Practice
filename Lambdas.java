import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;
public class Lambdas {
  
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = 5;
    ArrayList<Integer> a = new ArrayList<>();
    ArrayList<Integer> b = new ArrayList<>();
    System.out.println("enter the a element");
    for(int i=0;i<n;i++){
    a.add(sc.nextInt());
    }
    System.out.println("enter the b element");
    for(int i=0;i<n;i++){
      b.add(sc.nextInt());
    }
    System.out.println("the final output");
    
    Collections.sort(b);
    System.out.println(a.get(2));
    System.out.println(b.get(4));

    }
  }
