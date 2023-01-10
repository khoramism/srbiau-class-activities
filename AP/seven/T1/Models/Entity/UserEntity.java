package seven.T1.Models.Entity;

public class UserEntity {
    private long id;
    private String Username;
    private String password;
    private double RDV;
    private double liab;

    public double getLiab() {
        return liab;
    }

    public void setLiab(double liability) {
        liab = liability;
    }

    public double getRDV() {
        return RDV;
    }

    public void setRDV(double RDV) {
        this.RDV = RDV;
    }


    public UserEntity(){

    }

    public long getId() {
        return id;
    }

    public UserEntity setId(long id) {
        this.id = id;
        return this;
    }


    public String getUsername() {
        return Username;
    }

    public UserEntity setUsername(String username) {
        Username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserEntity setPassword(String password) {
        this.password = password;
        return this;
    }
}



