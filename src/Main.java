import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
public class Main {
    public static void main(String[] args) {

        AnibaSoumaya s = new AnibaSoumaya();

        int[] t1 = {1, 2, 3};
        int[] t2 = {4, 5, 6};

        int len = s.longueur("Soumaya");
        int[] t3 = s.concat(t1,t2);

        System.out.println("Longueur = " + len);
        System.out.println("Concat = " + Arrays.toString(t3));
    }

}