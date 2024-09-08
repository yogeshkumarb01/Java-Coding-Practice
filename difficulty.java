import java.util.Scanner;

public class difficulty{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Number of problems
            int k = scanner.nextInt(); // Minimum rating difference
            int[] ratings = new int[n];

            // Input ratings of problems
            for (int i = 0; i < n; i++) {
                ratings[i] = scanner.nextInt();
            }

            int days = 1; // Minimum days required
            int currentRating = ratings[0]; // Rating of the current problem

            for (int i = 1; i < n; i++) {
                if (ratings[i] - currentRating >= k) {
                    // Move to the next day if rating difference is at least k
                    currentRating = ratings[i];
                    days++;
                }
            }

            System.out.println(days);
        }

        scanner.close();
    }
}
