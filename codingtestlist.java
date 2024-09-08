// /**

// Reverse Linked List
// Problem Description
// You are given a singly linked list having head node A. You have to reverse the linked list and return the head node of that reversed list.

// NOTE: You have to do it in-place and in one-pass.



// Problem Constraints
// 1 <= Length of linked list <= 105

// Value of each node is within the range of a 32-bit integer.



// Input Format
// First and only argument is a linked-list node A.



// Output Format
// Return a linked-list node denoting the head of the reversed linked list.



// Example Input
// Input 1:

//  A = 1 -> 2 -> 3 -> 4 -> 5 -> NULL 
// Input 2:

//  A = 3 -> NULL 


// Example Output
// Output 1:

//  5 -> 4 -> 3 -> 2 -> 1 -> NULL 
// Output 2:

//  3 -> NULL 


// Example Explanation
// Explanation 1:

//  The linked list has 5 nodes. After reversing them, the list becomes : 5 -> 4 -> 3 -> 2 -> 1 -> NULL 
// Expalantion 2:

//  The linked list consists of only a single node. After reversing it, the list becomes : 3 -> NULL 



//  * Definition for singly-linked list.
//  * class ListNode {
//  *     public int val;
//  *     public ListNode next;
//  *     ListNode(int x) { val = x; next = null; }
//  * }
//  */
// public class Solution {
// 	public static ListNode detectCycle(ListNode a) {
//         if(a==null || a.next==null){
//             return null;
//         }
//         ListNode fast=a;
//         ListNode slow=a;
//         while(fast!=null && fast.next!=null){
//             slow = slow.next;
//             fast = fast.next.next;
//             if(slow==fast){
//                 break;
//             }
//         }
//             if(slow!=fast){
//                 return null;
//             }
        
//             slow = a;
//             while(slow!=fast){
//                 slow=slow.next;
//                 fast=fast.next;
//             }

//          return slow;
//         }

// 	}



/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */



//
// Delete middle of the linked list
// Problem Description
// Given a Linked List, delete the middle node of the list and return the new head of the list.

// For example, if the given list is 1->2->3->4->5, the returned linked list should be 1->2->4->5.

// Note: If the given list contains 1 node, it should be deleted and new head must be returned. If the given list contains even number of nodes, delete the second middle node among both the middle nodes. For example, 1->2->3->4 shoud return 1->2->4.

//



// public class Solution {
//   public ListNode solve(ListNode A) {
//       if(A == null || A.next==null){
//           return null;
//       }
//       ListNode fast = A;
//       ListNode slow = A;
//       ListNode prev = null;
//       while(fast!=null && fast.next!=null){
//           prev=slow;
//           slow = slow.next;
//           fast = fast.next.next;
//       }
//        deletenode(prev);
//        return A;
     
//   }
//   public static void deletenode(ListNode middle){
//       if(middle==null || middle.next==null){
//           return; 
//       }
//      middle.next = middle.next.next;

//   }
// }


/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */










//  Reverse Linked List
// Problem Description
// You are given a singly linked list having head node A. You have to reverse the linked list and return the head node of that reversed list.

// NOTE: You have to do it in-place and in one-pass.



// Problem Constraints
// 1 <= Length of linked list <= 105

// Value of each node is within the range of a 32-bit integer.



// Input Format
// First and only argument is a linked-list node A.



// Output Format
// Return a linked-list node denoting the head of the reversed linked list.



// Example Input
// Input 1:

//  A = 1 -> 2 -> 3 -> 4 -> 5 -> NULL 
// Input 2:

//  A = 3 -> NULL 


// Example Output
// Output 1:

//  5 -> 4 -> 3 -> 2 -> 1 -> NULL 
// Output 2:

//  3 -> NULL 


// Example Explanation
// Explanation 1:

//  The linked list has 5 nodes. After reversing them, the list becomes : 5 -> 4 -> 3 -> 2 -> 1 -> NULL 
// Expalantion 2:

//  The linked list consists of only a single node. After reversing it, the list becomes : 3 -> NULL 
// public class Solution {
//   public ListNode reverseList(ListNode A) {
      
//       ListNode prev = null;
//       ListNode curr = A;
//        if(curr==null){
//           return prev;
//       }
//        while(curr!=null){
//           ListNode next = curr.next;
//           curr.next = prev;
//            prev = curr;
//            curr = next;
//       }

     
     
     
//       return prev;
//   }

// }
