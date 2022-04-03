package two;
import java.util.Scanner;


public class mainClass {
    public static void main(String[] args) {
        
        Coor coordinate=new Coor<>();
        Scanner sc=new Scanner(System.in);
    
        coordinate.name=sc.nextLine();
        coordinate.age=sc.nextInt();
        coordinate.Id=sc.nextInt();

        System.out.println(coordinate.name);
        System.out.println(coordinate.age);
        System.out.println(coordinate.Id);

        Coor obj=null;
        try {
            obj=(Coordinate) coordinate.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("clone not supported");
        }
        if (!coordinate.equals(obj)){
            System.out.println(obj.Id);
            System.out.println(coordinate.Id);
            System.out.println(obj);
            System.out.println(coordinate);
        }


    }
}
