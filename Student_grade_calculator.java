package CodSoft_Task;
import java.util.Scanner;

public class Student_grade_calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER THE MARKS OF FIRST SUBJECT : ");
        double s1 = s.nextInt();
        System.out.println("ENTER THE MARKS OF SECOND SUBJECT : ");
        double s2 = s.nextInt();
        System.out.println("ENTER THE MARKS OF THIRD SUBJECT : ");
        double s3 = s.nextInt();
        System.out.println("ENTER THE MARKS OF FOURTH SUBJECT : ");
        double s4 = s.nextInt();
        System.out.println("ENTER THE MARKS OF FIVTH SUBJECT : ");
        double s5 = s.nextInt();
        CalculateGrad g = new CalculateGrad();
        g.calculate(s1, s2, s3, s4, s5);
        s.close();
    }

}

class CalculateGrad {
    int Firstsubject;
    int Secondsubject;
    int Thirdsubject;
    int Fourthsubject;
    int Fivthsubject;

    public void calculate(Double s1, Double s2, Double s3, Double s4, Double s5) {
        double percentage = (s1 + s2 + s3 + s4 + s5) / 5;
        double total = s1 + s2 + s3 + s4 + s5;
        System.out.println("YOUR TOTAL MARKS OUT OF 500 ARE ");
        System.out.println(total);
        System.out.println("YOUR PERCENTAGE  ");
        System.out.println(percentage + " %");
        System.out.println("YOUR GRADE IS  ");
        if (percentage > 90)
            System.out.println("GRADE A ");
        else if (percentage < 90 && percentage > 80)
            System.out.println("GRADE B ");
        else if (percentage < 80 && percentage > 70)
            System.out.println("GRADE C ");
        else if (percentage < 70 && percentage > 60)
            System.out.println("GRADE D ");
        else if (percentage < 60 && percentage > 50)
            System.out.println("GRADE D ");
        else {
            System.out.println("GRADE F/FAIL");
        }
    }
}
