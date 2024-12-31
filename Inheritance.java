class animal
{
    void eat()
    {
        System.out.println("The animal eats food: ");
    }
}
class Rabbit extends animal{
    void eat()
    {
        System.out.println("It is a herbivore:");
    }
}
class Tiger extends animal 
{
    void eat()
    {
        System.out.println("It is a carnivore:");
    }
}
class Dog extends animal
{
    void eat()
    {
        System.out.println("It is a omnivore");
    }
}

public class Inheritance 
{
    public static void main(String[] args)
    {
        animal My_animal;
        My_animal =new Rabbit();
        My_animal.eat();
        My_animal =new Tiger();
        My_animal.eat();
        My_animal=new Dog();
        My_animal.eat();
    }
    
}
