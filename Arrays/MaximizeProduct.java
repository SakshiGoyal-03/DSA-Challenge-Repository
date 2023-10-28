 import java.util.Scanner;

public class MaximizeProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];
        int n;
        System.out.print("Enter n : ");
        n = scanner.nextInt();
        System.out.print("Enter array: ");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        scanner.close();
        int max1 = 0;
        int m = -1;
        int p = 0;
        int max2 = 0;
        int min1 = a[0];
        int min2 = 9999999;
        for (int i = 0; i < n; i++) {
            if (max1 < a[i]) {
                max1 = a[i];
                m = i;
            }
            if (min1 > a[i]) {
                min1 = a[i];
                p = i;
            }
        }
        for (int i = 0; i < n; i++) {
            if (max2 < a[i] && i != m) {
                max2 = a[i];
            }
            if (min2 > a[i] && i != p) {
                min2 = a[i];
            }
        }
        System.out.println(max1 + " " + max2 + " " + min1 + " " + min2);
        int product = (max1 * max2) - (min1 * min2);
        System.out.print(product + " ");
    }
}
 