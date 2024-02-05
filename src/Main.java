import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double fahrenheitDegree = 0;
        while (fahrenheitDegree >= -460) {
            fahrenheitDegree = promptforFahrenheit();
            double celsiusDegree = fahrtoCelcCon(fahrenheitDegree);
            celOutput(celsiusDegree);
        }
        System.out.println("You have put something less than absolute zero.");
    }

    static double promptforFahrenheit() {
        Scanner takeInDegree = new Scanner(System.in);
        System.out.println("Enter Degree value: ");
        return takeInDegree.nextDouble();
    }
     static double fahrtoCelcCon(double a){
        return a* 5/9 - 32;
    }
    static void celOutput(double a){
        System.out.println(a);
    }
}