import java.util.Scanner;
public class table
{
    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number:");
        int num =scanner.nextInt();
        for(int i =1;i <=20;i++)
        {
            int a=num*i;
            System.out.println(num  + " * "+ i + " = " +a );
        }
    }
}