import java.util.*;
public class cricketmatch {
  
  public static void main(String args[]){
    String s1 = "";
    String s2 = "";
    int teama = 0;
    int teamb = 0;
    Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  String str = sc.next();
   
    
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)=='a'){
        s1 = s1+'a';
        teama++;
      }
      else if(str.charAt(i)=='b'){
        s2=s2+'b';
        teamb++;
      }else{
        System.out.println("enter only a and b sequence");
        break;
      }
    }
    if(teama>n){
      System.out.println("team A is winner");
    }
    else if(teamb>n){
      System.out.println("team B is winner");
    }else if(teama==n && teamb==n){
      System.out.println("Draw Match");
    }else{
      System.out.println("Match is abounded");
    }


   }
    }
  
