class Overriding 
{
        public void eat() 
        {
            System.out.println("Human is eating");
        }
}
class Boy extends Overriding
{
    public void eat()
    {
        System.out.println("Boy is Eating");
    }
    public static void main(String[] args) 
    {
        Boy obj= new Boy();
        obj.eat();
    }
}