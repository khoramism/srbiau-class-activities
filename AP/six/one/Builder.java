package one;

public class Builder {
    private String userName;
    private String name;
    private String passWord;
    private byte age;
    private String address;
    private int phoneNumber;
    private String academics;

    public Builder setUsername(String userName) {
        this.userName = userName;
        return this;
    }

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public Builder setPassWord(String passWord) {
        this.passWord = passWord;
        return this;
    }

    public Builder setAge(byte age) {
        this.age = age;
        return this;
    }

    public Builder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Builder setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public Builder setAcademics(String academics) {
        this.academics = academics;
        return this;
    }

    public User makeUser() {
        return new User(userName, name, passWord, age, address, phoneNumber, academics);
    }
}