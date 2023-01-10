import java.util.Scanner;

public class Cal {
    public static float zarb(float x ,float y) {
        return x * y;
    }

    public static float taghsim(float x ,float y) {
        return x / y;
    }
    
    public static float jamea(float x ,float y) {
        return x + y;
    }
    
    public static float menha(float x ,float y) {
        return x - y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert the first number");
        float num1 = sc.nextFloat(); 
        System.out.println("Please insert the second number");
        float num2 = sc.nextFloat();
        System.out.println("the taghsim");
        System.out.println(taghsim(num1, num2));
        System.out.println("the zarb");
        System.out.println(zarb(num1, num2));
        System.out.println("the jamea");
        System.out.println(jamea(num1, num2));
        System.out.println("the menha");
        System.out.println(menha(num1, num2));
    }
}