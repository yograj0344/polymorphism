class info
{
    String name;   // global variable
    int age;

    public void printinfo(String name) // method overloading
    {
        System.out.println(name);
    }
    public void printinfo(int age) //methods overloading 
    {
        System.out.println(age);
    }
    public static void printinfo(String name,int age) //methods overloading 
    {
        System.out.println(name+" "+ age);
    }
}
public class oop1
{
    public static void main(String[] args) // main methodmethods overloading 
    {
       info g=new info();  //object
       g.name="yograj";
       g.age=24;
       g.printinfo(g.age);  
    }
}