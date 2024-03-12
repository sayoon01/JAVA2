import java.util.Scanner;

public class Practice63 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("MyBox에 저장할 내용을 입력하세요: ");
		MyBox<String> b1 = new MyBox<String>(sc.next());
		System.out.println("MyBox에 저장된 내용: " + b1.get());
		
		System.out.print("MyBox에 저장할 내용을 입력하세요: ");
		b1.set(sc.next());
		System.out.println("MyBox에 저장된 내용: " + b1.get());
		
		System.out.print("MyBox에 저장할 내용을 입력하세요: ");
		MyBox<Integer> b2 = new MyBox<Integer>(sc.nextInt());
		System.out.println("MyBox에 저장된 내용: " + b2.get());
		
		System.out.print("MyBox에 저장할 내용을 입력하세요: ");
		MyBox<Integer> b3 = new MyBox<Integer>(sc.nextInt());
		System.out.println("MyBox에 저장된 내용: " + b3.get());
		
		System.out.println(b2.get() + " + " + b3.get() + " = " + (b2.get() + b3.get()));

	}

}