
public class MiniProject {

	public static void main(String[] args) {
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		
		d1.roll();
		int num1 = d1.getValue();
		d2.roll();
		int num2 = d2.getValue();
		
		int count=1;
		while(num1!=num2)
		{
			System.out.println("�ֻ���1 = " + num1 + "  �ֻ���2 = " + num2);
			d1.roll();
			d2.roll();
			num1 = d1.getValue();
			num2 = d2.getValue();
			count++;
		}
		System.out.println("�ֻ���1 = " + num1 + "  �ֻ���2 = " + num2);
		System.out.println("( "+ num1 + ", " +num2+" )�� �����µ� �ɸ� Ƚ�� = " + count);
	}

}