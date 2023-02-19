public class nine {
    
    static int M = 3;
    static int N = 3;

    static int[][] array = new int[M][N];

    public static void main(String[] args) {
        
        //движение по строчное !!!
        array[0][0] = 3;        array[0][1] = 5;        array[0][2] = 8;
        array[1][0] = 13;       array[1][1] = 3;        array[1][2] = 4;
        array[2][0] = 123;      array[2][1] = 7;        array[2][2] = 10;               
                        
                        

        for(int i = 0; i < M; i++) {
            int iter = 0;
            for(int j = 0; j < N; j++){
                if(array[j][i] % 2 != 0){
                    iter += 1;
                    if(iter == N) {
                        System.out.print("Столбец №" + i);
                    }
                }
            }
        }
    }



}
