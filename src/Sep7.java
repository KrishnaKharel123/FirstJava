

public class Sep7
{


    static float Results;
    static float a = 71;
    static float b = 2;
    static float c = 81;

    static float d = 100;
    static int age =47;
    static int number=51;

    static String Name;
    static String lastname;

    static String Homeaddress;
    static String postcode;


    public static void main(String[] args)
    {

        add();
        sub();
        multiply();
        divide();
        name1();
        name2();
        Homeaddress();
        number();

    }

    public static void add()
    {
        Results = a + b + c + d;
        System.out.println(Results);

    }


    public static void sub()
    {
        Results = a - b - c - d;
        System.out.println(Results);

    }


    public static void multiply()

    {
        Results = a * b * c * d;
        System.out.println(Results);
    }


    public static void divide()
    {

        Results = a / b / c / d;
        System.out.println(Results);
    }


    public static void name1()
    {

        Name = "Krishna";
        lastname = "Kharel";
        System.out.println("The first full name is " + Name + " " + lastname);

    }


    public static void name2()
    {
        Name = "Mrs";
        lastname = "kharel";
        System.out.println("The Second full name is " + Name + " " + lastname);
    }


    public static void Homeaddress()
    {

        Homeaddress = "1 paddock Road";
        postcode= "ha1 4Ud";

        System.out.println("The Home address is " + Homeaddress + "  " + postcode);

    }
    public static void age()
    {



        if(age<=46)
        {

            System.out.println("The age is too young");
        }
        else{
            System.out.println("The age is too old");
        }


    }

    public static void number(){  ////if else statement
        if (number >=50) {
            System.out.println("The number is too big");
        }

        else{
             System.out.println("The number is too small");
        }

    }


}
