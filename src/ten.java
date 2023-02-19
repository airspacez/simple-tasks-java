public class ten {

    static String S = "hello";

    static String S0 = "hello";

    public static void main(String[] args) {
        if (S.contains(S0)) {
            S = S.replaceAll(S0, "");
            System.out.println(S);
        } else {
            System.out.println(S);
        }
    }
}
