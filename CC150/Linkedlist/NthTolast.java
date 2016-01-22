
public class NthTolast {

	public static int nthToLast(LinkedListNode head, int k){
		if(head == null)return 0;
		int i = nthToLast(head.next, k) + 1;
		System.out.println(">" + i + " head data: " + head.data);
		if(i == k)System.out.println("Find it! it is: " + head.data);
		return i;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode myList = new LinkedListNode(1);
		myList.appendToTail(2);
		myList.appendToTail(3);
		myList.appendToTail(4);
		myList.appendToTail(5);
		myList.appendToTail(6);
		
		int data = nthToLast(myList, 3);
		System.out.println(data);
	}

}
