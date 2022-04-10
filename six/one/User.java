package one;

public class User {
    private String userName;
    private String name;
    private String passWord;
    private byte age;
    private String address;
    private int phoneNumber;
    private String academics;

    public String getUserName() {
        return userName;
    }

    public String getName() {
        return name;
    }

    public String getPassWord() {
        return passWord;
    }

    public byte getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getAcademics() {
        return academics;
    }

    public User(String fusername, String fname, String fpassword, byte fage, String faddress, int fphoneNumber, String facademics) {
        userName = fusername;
        name = fname;
        passWord = fpassword;
        age = fage;
        address = faddress;
        phoneNumber = fphoneNumber;
        academics = facademics;
    }
    public User(){}
}