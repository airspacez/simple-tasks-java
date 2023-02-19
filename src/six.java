import java.util.Scanner;

public class six {

    static int extrema(int a[], int n) {
        int min = Integer.MAX_VALUE;
        if (a[0] > a[1]) {
            min = a[0];
        }
        if (a[a.length - 1] > a[a.length - 2]) {
            if (min > a[a.length - 1]) {
                min = a[a.length - 1];
            }
        }
        for (int i = 1; i < n - 1; i++) {
            if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
                if (min > a[i]) {
                    min = a[i];
                }
            }
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int N = sc.nextInt();

        int[] array = new int[N];

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

        System.out.println("\n\n" + extrema(array, N));

    }
}
