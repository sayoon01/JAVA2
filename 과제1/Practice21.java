import java.util.Random;

public class Practice21 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum = 0;

        Random rand = new Random();
    for (int num : arr) {
        num = rand.nextInt(101);
        sum += num;
    }

    for (int num : arr) {
        System.out.print(num + "  ");
    }
    System.out.println();

    for (int i = arr.length - 1; i >= 0; i--) {
        System.out.print(arr[i] + "  ");
    }
    System.out.println();

    // ���հ� ��� ���
    double avg = (double) sum / arr.length;
    System.out.println("���� ����: " + sum);
    System.out.println("���� ���: " + avg);
}
}