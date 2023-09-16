public class Sep9 {

    static float results;
    static float a = 8;
    static float b = 9;
    static float c = 9;
    static int age1 = 46;
    static int age2 = 48;
    static int age3 = 49;
    static int age4 = 50;


    public static void main(String[] args) {

        add();
        sub();
        multiply();
        divide();
        age1();
        age2();
        age3();
        age4();



    }


    public static void add() {

        results = a + b + c;

        System.out.println("The sum of " + a + "+" + b + "+" + c + "=" + results);

    }


    public static void sub() {

        results = a - b - c;

        System.out.println("The sub of " + a + "-" + b + "-" + c + "=" + results);
    }


    public static void multiply() {

        results = a + b + c;
        System.out.println("The multiply of " + a + "*" + b + "*" + c + "=" + results);
    }

    public static void divide() {
        results = a / b / c;
        System.out.println("The division of " + a + "/" + b + "/" + c + "=" + results);

    }


    public static void age1() {


        if (age1 <= 46) {

            System.out.println("The age is too young");
        } else {

            System.out.println("The age is too old ");
        }
    }

    public static void age2() {
        if (age2 >= 48) {
            System.out.println("The age is too old");

        } else {
            System.out.println("The age is too young");
        }
    }


    public static void age3() {
        if (age3 >= 49) {
            System.out.println("The age is too old");
        } else {

            System.out.println("The age is too young");

        }
    }

    public static void age4() {
        if (age4 == 50) {

            System.out.println("The age is too old");
        } else {
            if (age4 != 50)
                System.out.println("The age is too young");
        }
    }
}



























































































