import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary ratio (more than 1 and less than 5): ");
        float salaryRatio = input.nextFloat();
        if (salaryRatio < 1 || salaryRatio > 5)
            System.out.println("You entered wrong salary ratio.");
        else {
            System.out.println("Enter your years of service: ");
            byte year = input.nextByte();
            double monthlySalary = salaryRatio * 4000000 + year * 500000;
            System.out.format("Your monthly salary is: %f", monthlySalary);
        }
    }
}
