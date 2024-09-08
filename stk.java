import java.util.*;
public class stk {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    Stack<String> st = new Stack<>();
    int n = 5;
    for(int i=0;i<n;i++){
    st.push(sc.nextLine());
  }
  System.out.println(st);
  st.pop();
  System.out.println(st);
  String str = new String();
  String str2 = " ";
  for(int i=0;i<n;i++){
    str2 = str2+sc.nextLine();
  }
  
  String s = " ";
  s = str2+Integer.parseInt(str);
  if(s==str2){
  int s1 = Integer.parseInt(s);
  System.out.println(s1);

}
}
}
