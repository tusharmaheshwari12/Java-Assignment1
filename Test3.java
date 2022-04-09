interface Transport {
    public void deliver();
}

abstract class Animal
{
    String item;
    abstract void deliver();
}
class Tiger extends Animal
{
    public void deliver()
    {
    }
}
class Camel extends Animal implements Transport
{
    Camel(String s)
    {
        item = s;
    }
    public void deliver()
    {
        System.out.println("\tCamels are used in deserts to carry " + item + ".");
    }
}
class Deer extends Animal
{
public void deliver()
}
}
class Donkey extends Animal implements Transport
Donkey (String s)
{
item=s;

{

}

    public void deliver()

    {

        System.out.println("\tDonkeys can carry " + item + ".");

    }

}

class Test3

{

    public static void main(String args[]) throws NullPointerException

    {

        Transport[] t = new Transport[4];

        t[1] = new Camel("goods and people");

        t[2] = new Donkey("heavy load");

        System.out.println("Transport interface is implemented by following animals...");

        t[1].deliver();

        t[2].deliver();

    }

}