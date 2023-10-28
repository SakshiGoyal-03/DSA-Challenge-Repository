import java.util.Scanner;

public class ValidPalindrome{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        int flag = 0;
        System.out.print("Enter s : ");
        s = scanner.nextLine();
        scanner.close();
        int len = s.length();
        int i = 0;
        int j = len - 1;
        if (len == 1) {
            System.out.println("true");
            return;
        }
        while (i <= j) {
            if (s.charAt(i) == ' ') {
                i++;
            }
            if (s.charAt(j) == ' ') {
                j--;
            }
            if (s.charAt(i) != s.charAt(j)) {
                System.out.println("false");
                return;
            }
            i++;
            j--;
        }
        if (flag == 0) {
            System.out.println("true");
        }
        
    }
}
