import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Practice18 {
    
    public static void main(String[] args) {
        int[] randomArray = getRandomArray();
        printArray(randomArray);
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("찾고 싶은 숫자를 입력하세요: ");
        int key = scanner.nextInt();
        
        int result = searchArray(randomArray, key);
        if (result == -1) {
            System.out.println("입력한 숫자 " + key + "는 배열에없습니다.");
        } else {
            System.out.println("입력한 숫자 " + key + "는 배열의 " + (result + 1) + "번 자리에 있습니다.");
        }
    }
    
    // 10개의 난수값을 배열에 저장하는 함수
    public static int[] getRandomArray() {
        int[] randomArray = new int[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            randomArray[i] = rand.nextInt(100);
        }
        return randomArray;
    }
    
    // 배열을 출력하는 함수
    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
    
    // 배열에서 찾는 숫자를 검색하고 인덱스를 반환하는 함수
    public static int searchArray(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
