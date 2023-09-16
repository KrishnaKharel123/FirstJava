

public class Marksheet
{

int total;

static  Marksheet marksheet =new Marksheet();


public static void main (String [] args)
{

    marksheet.totalMarks(45,67,89);
    



}

    void totalMarks (int maths,int computer,int english)
    {

        total = maths + computer + english;
        System.out.println ( "The total value ="+total);
    }


}
