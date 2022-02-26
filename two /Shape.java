
import java.util.Arrays;
import java.lang.Math;
public class Shape {
    public static  String circle(int r) {
        double mohit , masahat; 
        mohit = 2 * r * Math.PI; 
        masahat = r * r * Math.PI;
        double[] answers = {mohit, masahat};
        return Arrays.toString(answers);
    }
    public static void main(String[] args) {
        System.out.println(circle(3));    }    
}
