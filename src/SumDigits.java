import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter any numbers with 5 Digits: ");
        int n = scanner.nextInt();
        int temp, total = 0;
        //if(n>=0)
        if(n >= 10000 && n < 100000)
        {
            while (n >= 1) {
                temp = n % 10;
                total = total + temp;
                n = n / 10;
            }
            System.out.println("total of given digit =" + total);
        } else {
            System.out.println("invalid number");
        }
    }
}