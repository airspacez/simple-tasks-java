import java.util.Scanner;

public class eight {
    //Массив А. Пример: array[] = {1,3,4,5,6,2,3,10,32}
    //Размерность массива N. Из примера выше: N = 9.

    public static void bubbleSort(int[] array, int[] array1){
        for (int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - i - 1; j++) {
                if(array[j + 1] < array[j]) {
                    int temp = array1[j];
                    array1[j] = array1[j + 1];
                    array1[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива. N = ");
        int N = scanner.nextInt();

        int[] A = new int[N];
        
        for(int i = 0; i < A.length; i++){
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите " + (i+1) + "-й " + "элемент массива А");
            int element = scan.nextInt();
            A[i] = element;
        }
        System.out.println("\n");
        //Создание массива дополнительного массива с элементами I
        int[] I = new int[N];

        //В массив I вводим значения от 0 до N
        for(int i = 0; i < I.length; i++){
            I[i] = i;
        }

        bubbleSort(A, I);

        for(int i = 0; i < I.length; i++){
            System.out.print(I[i] + " ");
        }
    }
}
