import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any numbers with 5 Digits: ");
        int n = scanner.nextInt();
        int even = 0, odd = 0, totalEven = 0, totalOdd = 0;
        //if(n>=0)
        if (n >= 10000 && n < 100000) {
            while (n >= 1) {
                int a = n % 10;
                int b = n % 2;
                if (b == 0) {
                    even = even + a;
                    totalEven++;
                } else {
                    odd = odd + a;
                    totalOdd++;
                }
                n = n / 10;
            }
            System.out.println("Total Even Digits: " + totalEven);
            System.out.println("Total Odd Digits: " + totalOdd);
            System.out.println("Total of even Digits: " + even);
            System.out.println("Total of odd Digits : " + odd);
        }
        else
            System.out.println("Invalid Entry, Please enter 5 digit number.");
}
}