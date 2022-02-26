import java.util.Scanner;

public class NumArray {
    public static void getTheNumAndArray(int[] ars, int xc) {
        int[] diffs;
        diffs = new int[ars.length];
        int z = 0 ;
        for (int i:ars) {
            if (i == xc) {
                System.out.println(i);
                diffs[z] = i;
                z++;
            }
        }
        System.out.println(diffs.length);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the number of elements you want to store: ");  
        //reading the number of elements from the that we want to enter  
        int n = sc.nextInt();  
        //creates an array in the memory of length 10  
        int[] ars = new int[n];  
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++) {  
            ars[i]=sc.nextInt();
        }
        System.out.println("Now enter your number");
        int your_num = sc.nextInt();
        getTheNumAndArray(ars, your_num);
    }
}
