import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("[");
            }
            if (i == array.length - 1) {
                System.out.println(array[i] + "]");
            } else {
                System.out.print(array[i] + ", ");
            }
        }

        System.out.println("Max = " + Arrays.stream(array).min());
        System.out.println("Min = " + Arrays.stream(array).max());

    }

}
