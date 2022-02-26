
import java.util.Arrays;
import java.lang.Math;
public class Shape {
    double mohit , masahat; 
    public static String circle(int r) {
        Shape cir = new Shape(); 
        cir.mohit = 2 * r * Math.PI; 
        cir.masahat = r * r * Math.PI;
        String cirs = String.format("masahat in dayere %f va mohit aan %f ast!", cir.mohit, cir.masahat); // String value  
        return cirs; 
    }
    public static String rectangle(int length , int width) {
        Shape rect = new Shape(); 
        rect.mohit = 2 * (length + width);
        rect.masahat = length * width;
        String recs = String.format("masahat in Mostatil ya Morabae %f va mohit aan %f ast!", rect.mohit, rect.masahat); // String value  
        return recs;
    }


    public static void main(String[] args) {
        System.out.println(circle(3));    
        System.out.println(rectangle(3, 10));    
    }    
}
