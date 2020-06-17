import java.util.Scanner;

public class NumbersPositiveNegativeZero {
    public static void main (String[] Args)
    {
        Scanner scanner = new Scanner(System.in);

        int n1, positive=0, negative=0, zero=0;
        char ch;
        do{
            System.out.print("Please enter any numbers: ");
            n1=scanner.nextInt();

            if(n1>0)
            {
                positive++;
            }
            else if(n1<0)
            {
                negative++;
            }
            else
            {
                zero++;
            }
            System.out.println("Do you wish to enter more numbers. Please select Y/N: ");
            ch=scanner.next().charAt(0);
        }while (ch=='y'||ch=='Y');
        {
            System.out.println("Total Positive numbers from entered numbers: "+positive);
            System.out.println("Total Negative numbers from entered numbers: "+negative);
            System.out.println("Total Zeros from entered numbers: "+zero);
        }
    }
}
