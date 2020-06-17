import java.util.Scanner;

public class SumFirstLastDigit {
          public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("enter any numbers with 5 Digits: ");
            int n = scanner.nextInt();
            int a= n%10;
            int b=n/10000;
            int total=a+b;
            if(n >= 10000 && n < 100000)
            {
                System.out.println("Total of First and Last digit of given number: "+total);
            }
            else {
                System.out.println("invalid number");
            }
        }
}