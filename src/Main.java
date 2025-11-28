import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Partie Wejdene
        int nombre = 6;
        System.out.println("Factorielle : " + WejdeneChroud.factorielle(nombre));
        System.out.println("Est pair ? " + WejdeneChroud.estPair(nombre));

        // Partie Soumaya
        AnibaSoumaya s = new AnibaSoumaya();

        int[] t1 = {1, 2, 3};
        int[] t2 = {4, 5, 6};

        int len = s.longueur("Soumaya");
        int[] t3 = s.concat(t1, t2);

        System.out.println("Longueur = " + len);
        System.out.println("Concat = " + Arrays.toString(t3));

        // Partie Eyatollah
        KochbatiEyatollah k = new KochbatiEyatollah();
        k.reverseString("eyatollah");

        // Partie Karima
        HaddoudiKarima hk = new HaddoudiKarima();

        double resultatRacine = hk.calculRacineCarreeX(25);
        System.out.println("Racine carrée de 25 = " + resultatRacine);

        String resultatMaj = hk.convertirEnMajuscules("bonjour karima");
        System.out.println("En majuscules : " + resultatMaj);

        // Partie Nadine
        int[] myArray = {1, 2, 3, 4, 5};

        int sum = JemaaNadine.calculateSum(myArray);
        double avg = JemaaNadine.calculateAverage(myArray);

        System.out.println("La somme du tableau est : " + sum);
        System.out.println("La moyenne du tableau est : " + avg);
    }
}
