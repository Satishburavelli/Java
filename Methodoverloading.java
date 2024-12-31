class Calculator
{
    int add(int a, int b)
    {
        System.out.println("Add the numbers" );
        return a+b;
    } 
    double add(double a,double b)
    {
        System.out.println("Add the numbers");
        return a+b;
    }
}
public class Methodoverloading 
    {
        public static void main(String[] args)
        {
            Calculator calc =new Calculator();
                System.out.println(calc.add(5,10));
                System.out.println(calc.add(3.4,5.3));

        }
    }
    
