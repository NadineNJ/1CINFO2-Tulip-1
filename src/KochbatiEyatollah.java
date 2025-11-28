public class KochbatiEyatollah {


    public void reverseString(String s){
        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println(reversed);
    }

    public static boolean estPremier(int n) {
        if (n <= 1) return false;    // 0, 1 et négatifs ne sont pas premiers
        if (n <= 3) return true;     // 2 et 3 sont premiers
        if (n % 2 == 0 || n % 3 == 0) return false; // élimine multiples de 2 et 3

        // test uniquement jusqu'à √n
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }

        return true;
    }
}
