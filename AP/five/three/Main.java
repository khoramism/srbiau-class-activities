package tamrin3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("nam ra vard konid");
        String n=sc.nextLine();
        System.out.println("studentId ra vard konid");
        int s=sc.nextInt();
        System.out.println("nam pedar ra vard konid");
        String a=sc.nextLine();
        String f=sc.nextLine();
        Generic student1=new Generic<>();
        student1.setName(n);
        student1.setStudentId(s);
        student1.setFatherName(f);
        System.out.println(student1.getFatherName());   
        System.out.println(student1.getName());   
        System.out.println(student1.studentId());   
    }
}