import java.util.Scanner;

public class Gdps {
    public static boolean isMashroot(float avg){
        if (avg >= 12) {
            return false;
        }
        else {
            return true; 
        }
    }
    public static float avgBegir(float jamea , float jameazarib) {
        float avg =   jamea / jameazarib;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("lotfan teadad doros ra benevisisd");
        int teadadDars = sc.nextInt();
        float[] score = new float[teadadDars];
        float[] zarib = new float[teadadDars];
        float jamea = 0;
        int jameazarib = 0;
        int a , b;
        for ( int i = 0; i < teadadDars; i ++){
            System.out.println("Enter the Score kindly \n");
            score[i] = sc.nextFloat();
            System.out.println("Enter the zarib");
            zarib[i] = sc.nextFloat();
            jamea += score[i] * zarib[i];
            jameazarib += zarib[i];
        }
        
        float yourAvg = avgBegir(jamea, jameazarib);
        boolean amIMashroot = isMashroot(yourAvg);
        System.out.println(String.format("Your average is %f and your mashroot state is %b", yourAvg, amIMashroot));
    }
}
