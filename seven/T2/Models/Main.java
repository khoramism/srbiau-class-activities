package seven.T1;


import T1.Models.entity.UserEntity;
import T1.Models.service.UserService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        UserEntity Thisuser=null;
        System.out.println("username: ");
        try {
            for(UserEntity user: UserService.getInstance().report()){
                if(Sc.next().equals(user.getUsername())){
                    System.out.println("password: ");
                    if (Sc.next().equals(user.getPassword())){
                        System.out.println("you have been logged in");
                        Thisuser=user;
                        break;
                    }
                    else{
                        System.exit(0);
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("some thing was wrong ");
            e.printStackTrace();
        }
        System.out.println("prices are very high");
        switch(Sc.nextInt()) {
            case 1:
                try {
                    Thisuser.setLiab(Thisuser.getLiab()+1000);
                    Thisuser.setRDV(Thisuser.getRDV()+2);
                    UserService.getInstance().edit(Thisuser);

                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case 2:
                try {
                    Thisuser.setLiab(Thisuser.getLiab()+2000);
                    Thisuser.setRDV(Thisuser.getLiab()+4);
                    UserService.getInstance().edit(Thisuser);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case 3:
                try {
                    Thisuser.setLiab(Thisuser.getLiab()+5000);
                    Thisuser.setRDV(Thisuser.getLiab()+10);
                    UserService.getInstance().edit(Thisuser);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case 4:
                try {
                    Thisuser.setLiab(Thisuser.getLiab()+10000);
                    Thisuser.setRDV(Thisuser.getLiab()+25);
                    UserService.getInstance().edit(Thisuser);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            default:
                // code block
        }



    }
}
