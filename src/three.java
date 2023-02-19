public class three {
    public static void main(String[] args) {
        int n = 50;

        int[] array = new int[n];

        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        for (int i = 3; i < n; i++) {
            array[i] = array[i - 1] + array[i - 2] - (2 * array[i - 3]);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}