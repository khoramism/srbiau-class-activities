package classw;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String equation;
        System.out.println("Enter the equation");
        equation = sc.nextLine();
        int a , b;
        a = equation.charAt(0) - '0';
        b = equation.charAt(2) - '0';
        calculate equal = calFactory.getCal(equation.charAt(1));
        System.out.println(equal.calc(a , b));
    }
}