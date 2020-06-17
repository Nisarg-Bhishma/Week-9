import java.util.Scanner;

public class Factorial {
    public static void main (String[] Args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please Enter Any Number: ");
    int j=scanner.nextInt();
    int temp=1;
    for(int i=1;i<=j;i++)
    {
        temp=temp*i;
    }
        System.out.println("Factorial value of the entered number is "+temp);
}
}
