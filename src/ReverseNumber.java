import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please Enter 5 Digit number: ");
        int n1=scanner.nextInt();
        int temp, reverse=0;
        if(n1 >= 10000 && n1 < 100000)
        {
            while(n1!=0) // while entered number is not zero
            {
                temp=n1%10;
                reverse=reverse*10+temp;
                n1/=10; //n1=n1/10;
            }
            System.out.print("Reversed Number of the entered Number: "+reverse);
        }
        else
            System.out.print("Invalid Entry, Please enter 5 Digit Number.");
    }
}