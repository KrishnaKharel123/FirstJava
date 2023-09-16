public class Homeworkpractice1
{
static float results;
static float  a=38;
static float b=48;
static float c=58;
static float d=78;
static float e=99;
static float f=101;

   static Calculator calculator = new Calculator(); // object create
    static Marksheet marksheet = new Marksheet();

public static void main (String[]args)
{

add();
substact();
multiply();
division();
calculator.test();
marksheet.totalMarks(15,10,20);

}



public static void add()
{
        results=a+b+c+d+e+f;
        System.out.println(results);


}
public static void substact()
{
    results=a-b-c-d-e-f;
    System.out.println(results);
}


public static void multiply()
{
    results=a*b*c*d*e*f;
    System.out.println(results);
}



public static void division()
{
results=a/b/c/d/e/f;
System.out.println(results);


}



}





