import java.util.Random;

public class Practice17 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum = 0;

        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(101);
            sum += arr[i]; 
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ "  ");
        }
        System.out.println();
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]+ "  ");
        }
        System.out.println();

        // ���հ� ��� ���
        double avg = (double) sum / arr.length;
        System.out.println("���� ����: " + sum);
        System.out.println("���� ���: " + avg);
    }
}