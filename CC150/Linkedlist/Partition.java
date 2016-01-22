
public class Partition {
	
	public static LinkedListNode partition(LinkedListNode node, int x) {
		LinkedListNode beforeStart = null;
		LinkedListNode afterStart = null;
		
		 /* Partition list */
		while (node != null) {
			LinkedListNode next = node.next;
			if (node.data < x)  {
			/* Insert node into start of before list */
				node.next = beforeStart;
				beforeStart = node;
			} else {
			/* Insert node into front of after list */
				node.next = afterStart;
				afterStart = node;
				//System.out.println("afterStart.data is: "+ afterStart.data);
			}
			node = next;
		 }
		
		if (beforeStart == null) {
			return afterStart;
		}
		/* Find end of before list, and merge the lists */
		LinkedListNode head = beforeStart;
		while (beforeStart.next != null) {
			beforeStart = beforeStart.next;
		}
		beforeStart.next = afterStart;
		return head;
}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode myList = new LinkedListNode(3);
		myList.appendToTail(1);
		myList.appendToTail(6);
		myList.appendToTail(2);
		myList.appendToTail(5);
		
		LinkedListNode newList = partition(myList, 4);
		while(newList != null){
			System.out.println(newList.data);
			newList = newList.next;
		}
		
	}

}
