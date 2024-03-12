import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Practice18 {
    
    public static void main(String[] args) {
        int[] randomArray = getRandomArray();
        printArray(randomArray);
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("ã�� ���� ���ڸ� �Է��ϼ���: ");
        int key = scanner.nextInt();
        
        int result = searchArray(randomArray, key);
        if (result == -1) {
            System.out.println("�Է��� ���� " + key + "�� �迭�������ϴ�.");
        } else {
            System.out.println("�Է��� ���� " + key + "�� �迭�� " + (result + 1) + "�� �ڸ��� �ֽ��ϴ�.");
        }
    }
    
    // 10���� �������� �迭�� �����ϴ� �Լ�
    public static int[] getRandomArray() {
        int[] randomArray = new int[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            randomArray[i] = rand.nextInt(100);
        }
        return randomArray;
    }
    
    // �迭�� ����ϴ� �Լ�
    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
    
    // �迭���� ã�� ���ڸ� �˻��ϰ� �ε����� ��ȯ�ϴ� �Լ�
    public static int searchArray(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
