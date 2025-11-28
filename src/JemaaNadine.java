public class JemaaNadine {
    // the sum of an integer array
    public static int calculateSum(int[] numbersS) {
        int sum = 0;
        for (int n : numbersS) {
            sum += n;
        }
        return sum;
    }
    // the average of an integer array
    public static double calculateAverage(int[] numbersAvg) {
        int sum = 0;

        for (int n : numbersAvg) {
            sum += n;
        }

        return (double) sum / numbersAvg.length;
    }

}
