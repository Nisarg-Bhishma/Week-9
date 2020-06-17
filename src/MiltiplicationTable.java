import java.util.Scanner;

public class MiltiplicationTable {
    public static void main (String[] Args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a starting number for table to print: ");
        int first=scanner.nextInt();
        System.out.print("Please enter a last number for table to print: ");
        int last=scanner.nextInt();
        int i,j;
        do{
            /*switch(j) {
                case 1:{
                    System.out.println(" 1 x " + i + "= " + i);
                    //System.out.print(" "+i +" ");
                    break;
                }
                case 2:{
                    //System.out.println(" 2 x " + i + "= " + (i*2));
                    System.out.print(" "+(i*2)+" ");
                    break;
                }
                case 3:{
                    System.out.println(" 3 x " + i + "= " + (i*3));
                    //System.out.print(" "+(i*3)+" ");
                    break;
                }
                default:System.out.println("Please enter number from 1,2 & 3");
                break;
            System.out.print(" "+i +" ");
            System.out.print(" "+(i*2)+" ");
            System.out.println(" "+(i*3)+" ");*/
            for(i=first;i<=last;i++)
            {
                System.out.println();
                for (j = 1; j <= 10; j++)
                    System.out.print(" " + (i * j) + " ");
                //System.out.print(" " + (i * 2) + " ");
                //System.out.println(" " + (i * 3) + " ");
            }
            i++;
        }while(i<=last);
    }
}
