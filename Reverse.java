public class Reverse {
  public static void main(String args[]){
    String str = "I Can Do It";
    System.out.print(funReverse(str));
  }
  public static String funReverse(String str){
    String s1 ="";
    String s2="";
    String ans = " ";
    for(int i=0;i<str.length();i++){
      char ch = str.charAt(i);
       if(ch>='a' && ch<='z'){
        ans = ans+Character.toUpperCase(ch);
      }
      else if(ch>='A' && ch<='Z'){
       ans=ans+Character.toLowerCase(ch);
      }
      
      
      }
    return ans;

  }
  
  
}
