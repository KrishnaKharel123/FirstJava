public class HomeWorkPractice2 //ALWAYS START WITH CLASS NAME
{
        static float answers; // DECLARE VARIABLES AS PER REQUIREMENTS
        static float a = 8;
        static float b = 9;
        static float c = 10;
        static float d = 11;
        static String name;
        static String lastName;

      public static void main (String[]args) //MAIN METHOD WHERE LITERALLY EXECUTIONS HAPPENS IT IS MUST TO HAVE 1 MAIN METHOD
{

        add(); // CALLING ALREADY CREATED METHODS
        sub();
        multiply();
        division();
        name1();
        name2();

}



public static void add()// CREATE METHOD NAME FOR EG 'add()' is a method name 1
{
    answers=a+b+c+d; //THIS IS WHERE ALL THE CODES RELATING TO THIS ADD MEHOD ARE WRITTEN 2
   System.out.println(answers); //THIS IS TO PRINT ON CONSOLE
}
public static void sub()
{
      answers=a-b-c-d;
      System.out.println(answers);
}

public static void multiply()
{
    answers=a*b*c*d;
    System.out.println(answers);
}

public static void division()
{
        answers=a/b/c/d;
        System.out.println(answers);

}

public static void name1() // name1 is name of the method
{
    name = "Krishna";
    lastName = "Kharel";
    System.out.println("The First Full Name is " + name + "  " + lastName);
}

public static void name2()
{
 name= "Archana";// string must be declared within ""
 lastName="Satyal";

 System.out.println("The second Full Name is " +name+ " " +lastName); // concatenate means join strings with +
}










}






















