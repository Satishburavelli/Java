class Vehicle
{
    void travel()
    {
        System.out.println("Vehicle travels on:");
    }
}
class Car extends Vehicle
{
    @Override
    void travel()
    {
        System.out.println("It can be travelled on road:");
    }
}
class Ship extends Vehicle 
{
    @Override
    void travel()
    {
        System.out.println("It can be travelled on water:");
    }
}
class Plane extends Vehicle
{
    @Override
    void travel()
    {
        System.out.println("It will be travelled on air:");
    }
}
public class Polymorphism
{
    public static void main(String[] args)
    {
        Vehicle vehicle;
        vehicle =new Car();
        vehicle.travel();
        vehicle = new Ship();
        vehicle.travel();
        vehicle=new Plane();
        vehicle.travel();
    }
}