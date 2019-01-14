import java.util.Scanner;

public class Task02
{
    public static void main(String[] args)
    {
        Scanner scr = new Scanner(System.in);
        System.out.print("Число = ");
        String a = scr.nextLine();
        System.out.print("Summ = ");
        int sum = Integer.parseInt(a.substring(0,1))
                + Integer.parseInt(a.substring(1,2))
                + Integer.parseInt(a.substring(2,3));
        System.out.println(sum);
    }
}
