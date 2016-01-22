import java.util.Stack;

public class Palindrome {
	
	static boolean isPalindrome(LinkedListNode head){
		LinkedListNode fast = head;
		LinkedListNode slow = head;
		
		Stack<Integer> stack = new Stack<Integer>();
		
		while(fast!=null && fast.next!=null){
			System.out.println("fast is"+fast.data+", slow is"+slow.data);
			stack.push(slow.data);
			slow = slow.next;
			fast = fast.next.next;
		}
		
		System.out.println("slow is" + slow.data);
		if(fast != null){
			slow = slow.next;
		}
		
		while(slow!=null){
			int top = stack.pop().intValue();
			System.out.println("top is"+ top );
			if(top != slow.data){
				return false;
			}
			slow = slow.next;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode myList1 = new LinkedListNode(0);
		myList1.appendToTail(1);
		myList1.appendToTail(2);
		myList1.appendToTail(2);
		myList1.appendToTail(1);
		myList1.appendToTail(0);
		
		LinkedListNode myList2 = new LinkedListNode(0);
		myList2.appendToTail(1);
		myList2.appendToTail(2);
		myList2.appendToTail(1);
		myList2.appendToTail(0);
		
//		boolean is1 = isPalindrome(myList1);
		boolean is2 = isPalindrome(myList2);
//		if(is1==true){
//			System.out.println("list1 is palindrome");
//		}
		if(is2==true){
			System.out.println("list2 is palindrome");
		}
	}

}
