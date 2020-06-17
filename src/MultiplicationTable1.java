import java.util.Scanner;

public class MultiplicationTable1 {
    public static void main(String[] Args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a Positive number to print Table: ");
        int num = scanner.nextInt();
        int i=0;
        if(num>0) {
            do {

                for (i = 1; i <= 10; i++) {
                    System.out.println();
                    System.out.print(num + " x " + i + " = " + (num * i) + " ");
                    //System.out.print(" " + (i * 2) + " ");
                    //System.out.println(" " + (i * 3) + " ");
                }
                i++;
            } while (i <= 10);
        }else
            System.out.println("Please enter valid Positive number.");
    }
}