import java.util.Stack;

public class StackWithMin extends Stack<Integer>{
	
	/**
	 * 
	 */
	Stack<Integer> s;
	public StackWithMin()  {
		s = new Stack<Integer>() ;
	}
	public void push(int value) {
		if (value <= min() )  {
			s.push(value) ;
		}
		System.out.println("s is " + s.peek() + ", s.size is " + s.size());
		super.push(value) ;
		System.out.println("Super is " + super.peek() + ", Super.size is " + super.size());
	}
	public Integer pop(){
		int value = super.pop() ;
		if (value == min())  {
			s.pop() ;
		}
		return value;
	}
	public int min()  {
		if (s.isEmpty())  {
			return Integer.MAX_VALUE;
		} else {
			return s.peek();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackWithMin myStack = new StackWithMin();
		myStack.push(4);
		System.out.println("Min is " + myStack.min());	
		myStack.push(2);
		System.out.println("Min is " + myStack.min());	
		myStack.push(1);
		System.out.println("Min is " + myStack.min());	
		myStack.push(3);
		System.out.println("Min is " + myStack.min());	
		myStack.push(5);
		System.out.println("Min is " + myStack.min());	
		
		for(int i = 0; i<myStack.size(); i++){
			System.out.print(myStack.pop() + " ");
		}
		
	}

}
