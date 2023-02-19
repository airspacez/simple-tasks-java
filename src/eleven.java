public class eleven {
    public static void main(String[] args) {
        String rusString = "Привет, мир. Я проснулся.";
        int counterWords = 0;
        for(int i = 0; i < rusString.length(); i++) {
            if(rusString.charAt(i) == ' ') {
                counterWords += 1;
            }
        }
        System.out.println("Кол-во слов в строке: " + (counterWords+1));
    }
}
