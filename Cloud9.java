import java.util.HashMap;

public class Cloud9 {
    //Given an array arr of size n which contains elements in range from 
// 0 to n-1, 
// you need to
// find all the elements occurring more than once in the given array. 
// Return the answer in ascending order.

// If no such element is found, return list containing [-1].

// Input: n = 5, 
// arr[] = [2,3,1,2,3]
// Output: 2 3 

public static void main(String[] args){
    HashMap<Integer,Integer> map = new HashMap<>();
    int n = 5;
    
    int arr[] = {2,3,1,2,3};
    int count = 0;
    for(int i = 0 ; i < n ; i++){
     if(map.containsKey(arr[i])){
        count ++;
     }
     map.put(arr[i],i);

}
System.out.println(count);
}
}
