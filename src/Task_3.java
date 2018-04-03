import java.util.Random;

public class Task_3{

    public static void setTask3(){

        int arr[] = new int[8];
        System.out.println("Полученный массив");
        for (int i = 0; i < arr.length; i++) {
            Random random = new Random();
            arr[i] = random.nextInt(10);
            System.out.print(arr[i] + " ");

            for (int s : arr) {
                if (i%2==0) i=0;

            }
            System.out.print(arr[i]);
        }


    }
}
