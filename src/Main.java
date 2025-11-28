//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                HaddoudiKarima hk = new HaddoudiKarima();

                // Tester la racine carrée
                double resultatRacine = hk.calculRacineCarreeX(25);
                System.out.println("Racine carrée de 25 = " + resultatRacine);

                // Tester la conversion en majuscules
                String resultatMaj = hk.convertirEnMajuscules("bonjour karima");
                System.out.println("En majuscules : " + resultatMaj);
            }
        }
