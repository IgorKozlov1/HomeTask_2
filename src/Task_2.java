import java.util.Random;

public class Task_2 {

    public static void setTask2() {
        int nums[] = new int[15];
        System.out.println("Полученный массив");
        for (int i = 0; i < nums.length; i++) {
            Random random = new Random();
            nums[i] = random.nextInt(10);
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println("Четные элементы массива");
        for (int k : nums) {
            if (k % 2 == 0) {
                System.out.print(k + " ");

            }
        }
    }
}