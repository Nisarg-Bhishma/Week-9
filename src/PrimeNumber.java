import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter Any Number: ");
        int i=scanner.nextInt();
        int n1=1, n2=0;
        while(n1<=i)
        {
             if(i%n1==0)
                 n2=n2+1;
             n1++;
        }
        if(n2==2)
            System.out.print("Entered number " +i+" is a Prime Number.");
        else
            System.out.print("Entered number " +i+" is not a Prime Number.");
    }
}