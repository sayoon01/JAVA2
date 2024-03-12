iimport java.util.Scanner;

public class Practice20 {

   public static int searchArray(int[] array, int key) {
      int time = 0;

      for (int n : array) {
         time++;
         if (n == key)
            return (time - 1);
      }
      return -1;
   }

   public static void printArray(int[] array) {
      for (int n : array)
         System.out.print(n + "\t");
      System.out.println();
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int same1 = 0; 
      int same2 = 0; // 자리는 다르고 값만 같은 숫자
      int[] array = new int[3];
      for (int i = 0; i < array.length; i++)
         array[i] = (int) (Math.random() * 9) + 1;
      printArray(array);
      int[] array2 = new int[3];
      for (int i = 0; i < 3; i++) {
         System.out.print(i + "번째 숫자 입력: ");
         array2[i] = sc.nextInt();
         if (searchArray(array, array2[i]) == i)
            same1++;
         else if (searchArray(array, array2[i]) != -1)
            same2++;
      }
      System.out.println("자리와 값이 모두 같은 숫자: " + same1 + "개");
      System.out.println("자리는 다르고 값만 같은 숫자: " + same2 + "개");
   }
}