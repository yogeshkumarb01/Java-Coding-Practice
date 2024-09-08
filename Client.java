import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.Collections;
public class Client {
  public static void main(String[] args) {
    MathOp add = (x,y)->{return x + y;};
    int a = add.operate(5, 4);
    System.out.println(a);

    MathOp sub = (x,y)->{return x - y;};
    System.out.println(sub.operate(5, 1));


    List<Integer> x1 = new ArrayList<>();
    x1.add(2);
    x1.add(4);
    x1.add(1);
    x1.add(8);
    x1.add(10);
    Collections.sort(x1, (x , y)->{
      if(x> y) return -1;
      else if (x< y) return 0;
      else return 1;
    });

    Stream<Integer> s = x1.stream();
    s.limit(3);
    System.out.println(s);
    System.out.println(s.count());
    }
    
  }
