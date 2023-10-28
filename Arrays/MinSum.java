import java.util.Scanner;

public class  MinSum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] a = new int[4];
        int temp = num;
        int i = 0;
        while (temp != 0) {
            int r = temp % 10;
            a[i] = r;
            temp = temp / 10;
            i++;
        }
        for (int j = 0; j < 4; j++) {
            System.out.println(a[j]);
        }
        for (int j = 0; j < 4; j++) {
            for (int k = 0; k < 4 - j - 1; k++) {
                if (a[k] > a[k + 1]) {
                    int p = a[k];
                    a[k] = a[k + 1];
                    a[k + 1] = p;
                }
            }
        }
        for (int j = 0; j < 4; j++) {
            System.out.println(a[j]);
        }
        int num1 = a[0] * 10 + a[3];
        int num2 = a[1] * 10 + a[2];
        System.out.println(num1 + " " + num2);
        int sum = num1 + num2;
        System.out.println(sum);
        scanner.close();
    }
}

