import java.util.Scanner;

public class Armstrong {
    public static void main (String[] Args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter Any Number: ");
        int i=scanner.nextInt();
        int n1=0;
        int temp=i;
        while(i>0){
            int n2=i%10;
            i=i/10;
            n1=n1+(n2*n2*n2);
        }
        if(temp==n1)
            System.out.println(temp+" is an Armstrong number.");
        else
            System.out.println(temp+" is not an Armstrong number.");
    }
}