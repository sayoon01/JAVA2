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

        // ÃÑÇÕ°ú Æò±Õ Ãâ·Â
        double avg = (double) sum / arr.length;
        System.out.println("³­¼ö ÃÑÇÕ: " + sum);
        System.out.println("³­¼ö Æò±Õ: " + avg);
    }
}