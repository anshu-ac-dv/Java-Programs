public class MethodOv 
{
    public void disp(char c)
{
    System.out.println(c);
}
 public void disp(int c)
{   
    System.out.println(c );
}
}
    class Sample2 {
    public static void
    main(String args[]) 
    {
    MethodOv obj = new MethodOv();
    obj.disp('a');
    obj.disp(5);
    }
}
