import java.util.Scanner;
import java.lang.Math;
import java.math.BigInteger;

public class javaCalc {

    static Scanner numscan = new Scanner(System.in);

    public static void add(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
    }

    public static void subtract(int num1, int num2) {
        int result = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + result);
    }

    public static void multiply(int num1, int num2) {
        int result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result);
    }

    public static void divide(double num1, double num2) {
        double result = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + result);
    }

    public static void square(double num1, double num2) {
        double result = Math.pow(num1, num2);
        System.out.print(num1 + " to the power of " + num2 + " = ");
        System.out.printf("%.0f %n", result);
    }

    class magicCalc extends javaCalc {

        public static void sqrt(double num1, double num2) {
            System.out.printf("Square root of the first number is: %.3f %n", Math.sqrt(num1));
            System.out.printf("Square root of the second number is: %.3f %n", Math.sqrt(num2));
        }

        public static void sin(double num1, double num2) {
            num1 = Math.toRadians(num1);
            num2 = Math.toRadians(num2);
            System.out.printf("Sin of the first number is: %.2f %n", Math.sin(num1));
            System.out.printf("Sin of the second number is: %.2f %n", Math.sin(num2));
        }

        public static void cos(double num1, double num2) {
            num1 = Math.toRadians(num1);
            num2 = Math.toRadians(num2);
            System.out.printf("Cosine of the first number is: %.2f %n", Math.cos(num1));
            System.out.printf("Cosine of the second number is: %.2f %n", Math.cos(num2));
        }

        public static void tan(double num1, double num2) {
            num1 = Math.toRadians(num1);
            num2 = Math.toRadians(num2);
            System.out.printf("Tangent of the first number is: %.2f %n", Math.tan(num1));
            System.out.printf("Tangent of the second number is: %.2f %n", Math.tan(num2));
        }

        public static void fact(double num1, double num2) {
            int i = 1;
            int i2 = 1;
            long fact = 1;
            long fact2 = 1;
            BigInteger result1 = BigInteger.ONE;
            BigInteger result2 = BigInteger.ONE;

            if (num1<=20 && num2<=20){
                num1 = (int) num1;
                num2 = (int) num2;
                for (i = 1; i <= num1; i++) {
                fact = fact * i;
                }
                for (i2 = 1; i2 <= num2; i2++) {
                    fact2 = fact2 * i2;
                }
                System.out.println("Factorial of the first number is: " + fact);
                System.out.println("Factorial of the second number is: " + fact2);

            }else if(num1 <= 20 && num2 > 20){
                num1 = (int) num1;
                for (i = 1; i <= num1; i++) {
                    fact = fact * i;
                }
                for (i = 2; i <= num2; i++){
                result2 = result2.multiply(BigInteger.valueOf(i));
                }
                System.out.println("Factorial of the first number is: " + fact);
                System.out.println("Factorial of the second number is: " + result2);
            }else if(num1 > 20 && num2 <= 20){
                num2 = (int) num2;
                for (i = 1; i <= num2; i++) {
                    fact2 = fact2 * i;
                }
                for (i = 2; i <= num1; i++){
                result1 = result1.multiply(BigInteger.valueOf(i));
                }
                System.out.println("Factorial of the first number is: " + result1);
                System.out.println("Factorial of the second number is: " + fact2);
            }else{
                for (i = 2; i <= num1; i++){
                    result1 = result1.multiply(BigInteger.valueOf(i));
                }
                for (i = 2; i <= num2; i++){
                    result2 = result2.multiply(BigInteger.valueOf(i));
                }
                System.out.println("Factorial of the first number is: " + result1);
                System.out.println("Factorial of the second number is: " + result2);                    
            }
        }

    }

    public static void main(String[] args) throws Exception {
        double num1;
        double num2;
        int newNum1;
        int newNum2;
        int choice = 1;
        int redo = 1;
        boolean cont1 = true;
        boolean cont2 = true;

        while (cont1) {
            System.out.println("Enter number1: ");
            while (!numscan.hasNextDouble()) {
                System.out.println("That's not a number! Try again!");
                numscan.next();
            }
            num1 = numscan.nextDouble();

            System.out.println("");
            System.out.println("Enter number2: ");
            while (!numscan.hasNextDouble()) {
                System.out.println("That's not a number! Try again!");
                numscan.next();
            }
            num2 = numscan.nextDouble();
            cont2 = true;
        while (cont2) {
            System.out.println("");
            System.out.println("What would you like to do?: ");
            System.out.println("");
            System.out.println("(Options Menu)");
            System.out.println("Enter 1 to add the two numbers");
            System.out.println("Enter 2 to subtract the two numbers");
            System.out.println("Enter 3 to multiply the two numbers");
            System.out.println("Enter 4 to divide the two numbers");
            System.out.println("Enter 5 to find the exponent of the two numbers");
            System.out.println("Enter 6 to find the square root of the two numbers");
            System.out.println("Enter 7 to find the sin value the two numbers (in degrees)");
            System.out.println("Enter 8 to find the Cosine value the two numbers (in degrees)");
            System.out.println("Enter 9 to find the Tangent value the two numbers (in degrees)");
            System.out.println("Enter 0 to find the factorial of the two numbers");
            while (!numscan.hasNextInt()) {
                System.out.println("That's not a number! Try again!");
                numscan.next();
            }
            choice = numscan.nextInt();
            System.out.println("");
            switch (choice) {
                case 1:
                    newNum1 = (int) num1;
                    newNum2 = (int) num2;
                    javaCalc.add(newNum1, newNum2);
                    break;
                case 2:
                    newNum1 = (int) num1;
                    newNum2 = (int) num2;
                    javaCalc.subtract(newNum1, newNum2);
                    break;
                case 3:
                    newNum1 = (int) num1;
                    newNum2 = (int) num2;
                    javaCalc.multiply(newNum1, newNum2);
                    break;
                case 4:
                    newNum1 = (int) num1;
                    newNum2 = (int) num2;
                    javaCalc.divide(newNum1, newNum2);
                    break;
                case 5:
                    newNum1 = (int) num1;
                    newNum2 = (int) num2;
                    javaCalc.square(newNum1, newNum2);
                    break;
                case 6:
                    magicCalc.sqrt(num1, num2);
                    break;
                case 7:
                    magicCalc.sin(num1, num2);
                    break;
                case 8:
                    magicCalc.cos(num1, num2);
                    break;
                case 9:
                    magicCalc.tan(num1, num2);
                    break;
                case 0:
                    magicCalc.fact(num1, num2);
                    break;

                }

            System.out.println("");
            System.out.println("Would you like to calculate something else?");
            System.out.println("Enter 1 to go back to the beginning, 2 to use the same numbers, 3 to exit");
            while (!numscan.hasNextInt()) {
                System.out.println("That's not a number! Try again!");
                numscan.next();
            }
            redo = numscan.nextInt();

            if (redo == 1) {
                cont1 = true;
                cont2 = false;
            }else if (redo == 2) {
                cont1 = false;
                cont2 = true;
            }else {
                cont1 = false;
                cont2 = false;
            }

        }
    }
        System.out.println("");  
        System.out.println("Thank you for using my Java Calculator!");
    }

}
