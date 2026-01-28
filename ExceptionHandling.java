import java.util.Scanner;
import java.util.InputMismatchException;
public class ExceptionHandling {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();
        int result = num1 / num2;
        System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
        } 
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers!");
        } 
        finally {
            System.out.println("Program Execution Completed");
            sc.close();
        }
    }
}
