public class Calculator
{

    static int results;
    static int a = 10;
    static int b = 20;


    public static void main(String[] args)//main method
    {

        add();
      //  test();
        multiply();


    }

    public static void add()//add method
    {
        results = a + b;
        System.out.println(results);


    }

     void test()
    {
        results = a - b;
        System.out.println(results);


    }

    public static void multiply()
    {
        results = a * b;
        System.out.println(results);
    }


}