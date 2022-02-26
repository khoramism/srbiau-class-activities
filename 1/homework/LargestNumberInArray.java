import java.util.Arrays;  
public class LargestNumberInArray {
    public static int getTheLargestNum(int[] arr) {
        /* 
        arr : An array containing just int data type
        this function returns the biggest number of an array
        */
        int lenarr = arr.length;
        Arrays.sort(arr); 
        return arr[lenarr - 1];
    }
    public static void main(String args[]) {
        // Define the length of the array 
        // eg 10 
        int ars[] = {10,262,248,23,69,2};
        getTheLargestNum(ars);  
        System.out.println("THE MAXIMUM NUMBER IS :");
        System.out.println(getTheLargestNum(ars));
    }
}
