import java.util.Scanner;

public class two {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n ");
        int n = sc.nextInt();
        int hf = 1;
        sc.close();
        for (int i = n - 1; i >= 1; i--) {
            if (n % i == 0) {
                hf = i;
                break;
            }
        }
        System.out.println(hf);
    }
}
