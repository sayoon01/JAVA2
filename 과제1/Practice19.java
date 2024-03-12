import java.util.Random;

public class Practice19{
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numArr = new int[5];
        
        while(true) {
            for(int i = 0; i < numArr.length; i++) {
                numArr[i] = rand.nextInt(101);
            }
            printArray(numArr);
            if (searchArray(numArr, 100)) {
                break;
            }
        }
    }
    
    public static boolean searchArray(int[] arr, int target) {
        for(int num : arr) {
            if(num == target) {
                return true;
            }
        }
        return false;
    }
    
    public static void printArray(int[] arr) {
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
