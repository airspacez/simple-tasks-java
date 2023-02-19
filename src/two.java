public class two {
    public static void main(String[] args) throws Exception {

        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 31) - 15);
            System.out.println(array[i]);
        }
        System.out.print("\n");
        int countPositive = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                countPositive += 1;
            }
        }
        var countMinus = array.length - countPositive;
        System.out.println("+: " + countPositive + "\n-: " + countMinus);
    }
}
