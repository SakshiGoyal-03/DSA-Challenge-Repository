
import java.util.Scanner;

public class MeanAndMedian {
    public static void main(String[] args) {
        int n, i, j, median, temp;
        float mean, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        n = scanner.nextInt();
        int[] a = new int[20];
        System.out.println("Enter elements");
        for (i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        scanner.close();
        for (i = 0; i < n; i++) {
            sum += a[i];
        }
        mean = sum / n;
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array : ");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        median = a[n / 2];
        System.out.printf("\nMEAN = %.2f", mean);
        System.out.printf("\nMEDIAN = %d", median);
        
    }
}

