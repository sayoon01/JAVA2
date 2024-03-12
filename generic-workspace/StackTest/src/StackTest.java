import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> myStack = new Stack<String>(); // <- 문자열 요소만 받겠다고 구체화
		
		System.out.println("myStack.empty()--> " + myStack.empty());//Boolean empty() 타입
		System.out.println();
		
		// E push(E item) : data 삽입 , 제일 먼저 들어오는 것이 제일 나중에 나감
		myStack.push("1st"); System.out.println(myStack);
		myStack.push("2nd"); System.out.println(myStack);
		myStack.push("3rd"); System.out.println(myStack);
		myStack.push("4th"); System.out.println(myStack);
		System.out.println();
		
		System.out.println("myStack.peek()--> " + myStack.peek()); //E peek() 위에 있는것 return
		System.out.println();
		
		String element;
		System.out.println(myStack);
		element = myStack.pop(); // E pop() , 제일 위에 있는 요소 나감(제거)
		System.out.println("myStack.pop()--> " + element);
		System.out.println();
		
		System.out.println(myStack);
		element = myStack.pop();
		System.out.println("myStack.pop()--> " + element);
		System.out.println();
		
		myStack.push("5th"); System.out.println(myStack);
		
	}

}
