import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("a(X^2) + bX + c = 0");
        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();
        Eqs eq = new Eqs(a,b,c);
        try {
            eq.calculate();
            if (eq.getAlfa() == eq.getBeta()){
                System.out.println("This eq just have one root: " + eq.getAlfa());
            }
            else {
                System.out.println("Alfa: " + eq.getAlfa());
                System.out.println("Beta: " + eq.getBeta());
            }
        }catch (NoRisheException | TaghsimBarSefrException e){
            System.out.println(e.getMessage());
        }
    }
}
