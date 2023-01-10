package four.three; 
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("lotfan text khod ra vard konid: \n ");
        String myStr = scanner.nextLine();
        try {
            searchForNumber(myStr);
            System.out.println("tool text shoma: "+myString.length());
        }catch (NotValidTextException e){
            System.out.println(e.getMessage());
        }
    }

    public static void searchForNumber(String content) throws NaDorostTextException {
        for(int i=0;i<=9;i++) if (content.contains(""+i))
        throw new NaDorostTextException("text shoma doros nis chon tosh adad dare");
    }
}