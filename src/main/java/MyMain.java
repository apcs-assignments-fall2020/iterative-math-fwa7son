import java.util.Scanner;

public class MyMain {
    
    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        double a = x;
        double b = 1;
        while ((a-b) > 0.000001) {
            a = (a + b) / 2;
            b = x / a;
        }
        return a;
    }

    // Calculates the factorial of a number
    public static double factorial(int x) {
        int total = 1;
        for (int i = x; i > 1; i--) {
            total *= i;
        }
        return total;
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        double e = 1;
        int variable = 1;
        while ((Math.E - e) > 0.00001) {
            e += 1/factorial(variable);
            variable += 1;
        }
        return e;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double x = scan.nextDouble();
        System.out.println("The square root of your input is " + babylonian(x));
        System.out.println("The value of e is roughly " + calculateE());


        

        scan.close();
    }
}
