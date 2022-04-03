import java.util.Scanner;


interface MyIntegar {
    public boolean isNegative(int x);
    public boolean isPosetive(int x);
    public boolean isOdd(int x);
    public boolean isZero(int x);
    public boolean isEven(int x);

}

class MyNum implements MyIntegar {
    public boolean isNegative(int x) {
        if (x > 0) {
            return false;
        }
        else {
            return false;
        }
    }
    public boolean isPosetive(int x) {
        if (x > 0) {
            return true;
        }

        else {
            return false;
        }
    }
    public boolean isOdd(int x) {
        if (x % 2 == 1 ) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isZero(int x) {
        if (x == 0) {
            return true;
        }

        else {
            return false;
        }
    }
    public boolean isEven(int x) {
        if (x % 2 == 0 ) {
            return true;
        }

        else {
            return false;
        }
    }

}


public class MyThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please entet your number");
        int x = sc.nextInt();
        MyNum num = new MyNum();
        System.out.println("is your number odd?");
        System.out.println(num.isOdd(x));
        System.out.println("is your number even?");
        System.out.println(num.isEven(x));
        System.out.println("is your number manfi?");
        System.out.println(num.isNegative(x));
        System.out.println("is your number mosbat?");
        System.out.println(num.isPosetive(x));
        System.out.println("is your number Zero?");
        System.out.println(num.isZero(x));
        
    }
} 