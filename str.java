import java.util.Scanner;
public class str {
//   public static void main(String[] args) {


//     Scanner sc = new Scanner(System.in);
//     String s = sc.nextLine();
//     String str = "";
//     for(int i=s.length()-1;i>=0;i--){
//       str = str+s.charAt(i);
//     }
//     if(s.equals(str)){
//       System.out.println("palindrome");
//     }
//     else{
//       System.out.println("not a palindrome");
//     }
  
//   }
// }
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
   String str = sc.nextLine();
   String alphabet = "";
   String number = "";
   String splchr = "";
   String str2 = "";
   for(int i=0;i<str.length();i++){
    if(str.charAt(i)==97 && str.charAt(i)==122){  // lower case alphabets
      alphabet = alphabet+str.charAt(i);
    }
    else if(str.charAt(i)==48 && str.charAt(i)==57){  // numbers
      number = number+str.charAt(i);
    }
    else if(str.charAt(i)==91 || str.charAt(i)==96){ // special characters
      splchr = splchr+str.charAt(i);
    }
    else{
      str2 = str2+str.charAt(i);
      
    }
   }
   System.out.print("Alphabet:"+alphabet);
   System.out.print("number:"+number);
   System.out.print("special charecter:"+splchr);

}
}
//   String v = sc.nextLine();
//   String sy = "";
//   v =  v.toLowerCase();
//   for(int i=0;i<v.length();i++){
//         if(v.charAt(i)==' ' && v.charAt(i+1)==' '){

//         }
//         else{
//           sy = sy+v.charAt(i);
//         }

//   }
//   System.out.println(sy);
// }}
//   for(int i=0;i<v.length();i++){
//     if(v.charAt(i)=='a'){
//       sy = sy+'@'+" ";
//     }
//     else if(v.charAt(i)=='e'){
//       sy=sy+'#'+" ";
//     }
//     else if(v.charAt(i)=='i'){
//       sy=sy+'$'+" ";
//     }
//     else if(v.charAt(i)=='o'){
//       sy=sy+'%'+" ";
//     }
//     else if(v.charAt(i)=='u'){
//       sy=sy+'&'+" ";
//     }
//     else{
//       sy=sy+sy.charAt(i);
//     }
//   }
//   System.out.println(sy);

// }
// }

        

