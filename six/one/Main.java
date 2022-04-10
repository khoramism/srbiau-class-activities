package one;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName;
        String name;
        String passWord;
        byte age;
        String address;
        int phoneNumber;
        String academics;
    
        System.out.println("Please Enter your username:");
        userName = sc.nextLine();
        System.out.println("Please Enter you Name:");
        name = sc.nextLine();
        System.out.println("Please Enter Password:");
        passWord = sc.nextLine();
        System.out.println("Please Enter your Age:");
        age = sc.nextByte();
        System.out.println("Please Enter your Address:");
        address = sc.nextLine();
        System.out.println("Please Enter your phone number:");
        phoneNumber = sc.nextInt();
        System.out.println("Please Enter your academisc:");
        academics = sc.nextLine();

        User user = new Builder().setUsername(userName).setName(name).setPassWord(passWord).setAge(age).setAddress(address).setPhoneNumber(phoneNumber).setAcademics(academics).makeUser();
        System.out.println(user.getUserName());
        System.out.println(user.getName());
        System.out.println(user.getPassWord());
        System.out.println(user.getAge());
        System.out.println(user.getAddress());
        System.out.println(user.getPhoneNumber());
        System.out.println(user.getAcademics());
    }

} 