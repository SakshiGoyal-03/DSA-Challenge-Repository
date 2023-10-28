import java.util.Scanner;

public class RomanToInteger{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        int l = n.length() - 1;
        int temp = 0;
        int sum = 0;
        int value;
        for (int i = l; i >= 0; i--) {
            int p = n.charAt(i);
            switch (p) {
                case 'I':
                    value = 1;
                    break;
                case 'V':
                    value = 5;
                    break;
                case 'X':
                    value = 10;
                    break;
                case 'L':
                    value = 50;
                    break;
                case 'C':
                    value = 100;
                    break;
                case 'D':
                    value = 500;
                    break;
                case 'M':
                    value = 1000;
                    break;
                default:
                    value = 0;
                    break;
            }
            if (temp > value) {
                sum = sum - value;
            } else {
                sum = sum + value;
            }
            temp = value;
        }
        scanner.close();
        System.out.println(sum);
    }
}

