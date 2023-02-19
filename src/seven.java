import java.util.Arrays;
import java.util.Scanner;

public class seven {

    public static int[] sort(int[] arrayName) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int maxIdx = 0, minIdx = 0;

        for (int i = 0; i < arrayName.length; i++) {
            if (arrayName[i] > max) {
                max = arrayName[i];
                maxIdx = i;
                // System.out.println("max "+maxIdx);
            }
            if (arrayName[i] < min) {
                min = arrayName[i];
                minIdx = i;
                // System.out.println("min "+ minIdx);
            }
        }

        if (minIdx < maxIdx) {
            for (int i = minIdx; i <= maxIdx / 2 + 1; i++) {
                int temp = arrayName[i];
                System.out.println("arrayName[i] " + arrayName[i]);
                System.out.println("arrayName[maxIdx - (i - minIdx)] " + arrayName[maxIdx - (i - minIdx)]);
                arrayName[i] = arrayName[maxIdx - (i - minIdx)];
                arrayName[maxIdx - (i - minIdx)] = temp;
            }
        } else if (minIdx > maxIdx) {
            for (int i = maxIdx; i <= minIdx / 2 + 1; i++) {
                int temp = arrayName[i];
                arrayName[i] = arrayName[minIdx - (i - maxIdx)];
                arrayName[minIdx - (i - maxIdx)] = temp;
            }
        }

        return arrayName;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        // int N = sc.nextInt();
        int N = 10;

        int[] array = new int[N];
        int[] array1 = new int[N];

        for (int i = 0; i < array.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите " + (i + 1) + "-й элемент массива: ");
            int element = sc.nextInt();
            array[i] = element;
        }
        System.out.print("\n");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
        array1 = sort(array);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

    }
}
