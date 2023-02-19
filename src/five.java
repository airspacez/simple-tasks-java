import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class five {
    public static void main(String[] args) {
        int N = 10;
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            int m = ThreadLocalRandom.current().nextInt(1, 100);
            int v = ThreadLocalRandom.current().nextInt(1, 100);
            // System.out.print("m: " + m + "\nv: " + v);
            int P = m / v;
            array[i] = P;
        }
        int max = Arrays.stream(array).max().getAsInt();

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length; i++) {
            if (max == array[i]) {
                System.out.print("\n" + (i + 1));
                break;
            }
            // System.out.print(array[i]+" ");
        }

    }
}
