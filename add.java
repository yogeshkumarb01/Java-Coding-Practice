import java.util.*;
public class add {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String y = " ";
    String rev = " ";
    String u = " ";
    int vowels = 0;
    int count = 0;
    s.toLowerCase();
    for(int i=0;i<=s.length()-1;i++){
      if(s.charAt(i)=='A'){
        y=y+'@';
        vowels++;
       }
       else if(s.charAt(i)=='E'){
        y=y+'#';
        vowels++;
       }
       else if(s.charAt(i)=='I'){
        y=y+'$';
        vowels++;
       }
       else if(s.charAt(i)=='O'){
        y=y+'%';
        vowels++;
       }
       else if(s.charAt(i)=='U'){
        y=y+'&';
        vowels++;
       }else{
        y=y+s.charAt(i);
        count++;
       }
    }
    for(int i = s.length()-1;i>=0;i--){
       rev = rev+s.charAt(i);
  }
  for(int i=0;i<=s.length()-1;i++){
    if(s.charAt(i)=='u'){
      u = u+s.charAt(i);
    }
    
  }
    
    System.out.println("vowels:"+vowels);
    System.out.println("non vowels:"+count);
    System.out.println(y);
    System.out.println(rev);
    System.out.println("the u:"+u);
  }
}
