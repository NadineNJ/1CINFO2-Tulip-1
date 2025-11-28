public class WejdeneChroud {

    public static long factorielle(int n) {
        long resultat = 1;

        for (int i = 1; i <= n; i++) {
            resultat *= i;
        }

        return resultat;
    }

    public static boolean estPair(int n) {
        return n % 2 == 0;
    }
}
