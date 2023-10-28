
import java.util.Scanner;

public class SumOfUniqueElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.print("Enter elements : ");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + (sum ^ a[i]);
            System.out.println(sum);
        }
        System.out.println("sum - " + sum);
        scanner.close();
    }
}
