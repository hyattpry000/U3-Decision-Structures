import java.util.Scanner;

public class Grades {

    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        String grade = "";

        System.out.print("Please enter your percentage grade:");
        double percentage = read.nextDouble();

        if(percentage < 60){
            System.out.println("Your grade is F");
        }

        if(percentage >= 60){
            System.out.println("Your grade is D");
        }

        if(percentage >= 70){
            System.out.println("Your grade is C");
        }

        if(percentage >= 80){
            System.out.println("Your grade is B");
        }

        if(percentage >= 90){
            System.out.println("Your grade is A");
        }
    }
}