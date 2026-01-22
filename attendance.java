import java.util.Scanner;

public class Attendance {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter attendance percentage:");
        double attendance = obj.nextDouble();

        if (attendance > 75) {
            System.out.println("Eligible for exam");

            if (attendance > 90) {
                System.out.println("+5 grace mark");
            }
        } else {
            System.out.println("Not eligible");
        }

        obj.close();
    }
}
